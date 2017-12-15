/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quiz.quiz1062.controller;

import com.quiz.quiz1062.entity.aksesoris_1062Entity;
import com.quiz.quiz1062.service.aksesoris_1062Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PC-320-09
 */
@RestController
@RequestMapping("/aksesoris_1062Entity")
public class aksesoris_1062Controller {

   @Autowired 
    private aksesoris_1062Service aksesoris_1062Service;
   
    @RequestMapping(method = RequestMethod.POST)
    public aksesoris_1062Entity insert(@RequestBody aksesoris_1062Entity aksesoris_1062Controller) {
        return aksesoris_1062Service.insert(aksesoris_1062Controller);
    }
     @RequestMapping(method = RequestMethod.PUT)
    public aksesoris_1062Entity update(@RequestBody aksesoris_1062Entity aksesoris_1062Controller) {
        return aksesoris_1062Service.update(aksesoris_1062Controller);
    }
      @RequestMapping(method = RequestMethod.DELETE, value = "/{id_aksesoris}")
    public boolean delete(@PathVariable("id_aksesoris") Long id_aksesoris) {
        return aksesoris_1062Service.delete(id_aksesoris);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id_aksesoris}")
    public aksesoris_1062Entity getById(@PathVariable("id_aksesoris") Long id_aksesoris){
        return aksesoris_1062Service.getById(id_aksesoris);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<aksesoris_1062Entity> getAll(){
        return aksesoris_1062Service.getAll();
    }
  
}
