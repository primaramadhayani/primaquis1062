/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quiz.quiz1062.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author PC-320-09
 */
@Entity
@Table(name = "tbl_mobil_1062")
public class mobil_1062Entity implements Serializable {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     
     
      @OneToMany
    @JoinColumn(name="id")
    private Set<aksesoris_1062Entity> id_aksesoris;
    
   
     @Column(length = 255, nullable = true)
    private String merk;
      private String jenis;
    private String harga;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }
    public String getmerk() {
        return merk;
    }

    /**
     * @param nama the nama to set
     */
    public void setmekr(String merk) {
        this.merk = merk;
    }

    /**
     * @return the nilai
     */
    public String getjenis() {
        return jenis;
    }

    /**
     * @param nilai the nilai to set
     */
    public void setjenis(String harga) {
        this.harga = harga;
    }

    /**
     * @return the matakuliah
     */
    public String getharga() {
        return harga;
    }

    /**
     * @param matakuliah the matakuliah to set
     */
    public void setharga(String harga) {
        this.harga = harga;
    }
    
}
  

