/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quiz.quiz1062.service;

import com.quiz.quiz1062.entity.mobil_1062Entity;
import com.quiz.quiz1062.repo.mobil_1062Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC-320-09
 */
@Service("mobil_1062Service")
@Transactional
public class mobil_1062Service {

     @Autowired
    private mobil_1062Repo repo;

    public mobil_1062Entity insertOrUpdate(mobil_1062Entity mobil_1062Controller) {
       return repo.save(mobil_1062Controller);
    }
    public boolean delete(Long id) {
        repo.delete(id);
        return true;
    }

    public List<mobil_1062Entity> findAll() {
        return repo.findAllProduct();
    }
    
}
