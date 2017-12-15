/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quiz.quiz1062.repo;

import com.quiz.quiz1062.entity.aksesoris_1062Entity;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author PC-320-09
 */
public interface aksesoris_1062Repo extends CrudRepository<aksesoris_1062Entity, Long> {


 @Query("select c from aksesoris_1062Entity c")
    public List<aksesoris_1062Entity> findAllCategory();
    
}  

