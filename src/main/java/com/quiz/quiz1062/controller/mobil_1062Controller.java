/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quiz.quiz1062.controller;

   import com.quiz.quiz1062.entity.mobil_1062Entity;
import com.quiz.quiz1062.repo.mobil_1062Repo;
import com.quiz.quiz1062.service.mobil_1062Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**

/**
 *
 * @author PC-320-09
 */
@RestController
@RequestMapping("/aksesoris_1062Entity")
public class mobil_1062Controller {

     @Autowired
    private mobil_1062Service mobil_1062Service;
    
    @RequestMapping(method = RequestMethod.POST)
    public mobil_1062Entity insertOrUpdate(@RequestBody mobil_1062Entity aksesoris_1062Controller){
        return mobil_1062Service.insertOrUpdate(aksesoris_1062Controller);
    }
} 

