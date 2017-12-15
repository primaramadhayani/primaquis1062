/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quiz.quiz1062.service;

import com.quiz.quiz1062.entity.aksesoris_1062Entity;
import com.quiz.quiz1062.repo.aksesoris_1062Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC-320-09
 */
@Service("aksesoris_1062Service")
@Transactional
public class aksesoris_1062Service {

    @Autowired
    private aksesoris_1062Repo repo;
    public aksesoris_1062Entity insert(aksesoris_1062Entity aksesoris_1062Controller) {
        return repo.save(aksesoris_1062Controller);
    }

    public aksesoris_1062Entity update(aksesoris_1062Entity aksesoris_1062Controller) {
       return repo.save(aksesoris_1062Controller);
    }

    public aksesoris_1062Entity getById(Long id_aksesoris) {
        return repo.findOne(id_aksesoris);
    }

    public List<aksesoris_1062Entity> getAll() {
          return repo.findAllCategory();
    }

    public boolean delete(Long id_aksesoris) {
          repo.delete(id_aksesoris);
        return true;
    }
    
}
