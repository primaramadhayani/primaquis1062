/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quiz.quiz1062.repo;

import com.quiz.quiz1062.entity.mobil_1062Entity;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author PC-320-09
 */
public interface mobil_1062Repo extends CrudRepository<mobil_1062Entity, Long>{
   
    @Query("select p from mobil_1062Entity p")
    public List<mobil_1062Entity> findAllProduct();  
}
