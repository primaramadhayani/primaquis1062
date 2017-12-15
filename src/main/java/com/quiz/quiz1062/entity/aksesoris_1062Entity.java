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
@Table(name = "tbl_aksesoris_1062")
public class aksesoris_1062Entity implements Serializable {

 @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_aksesoris;
    @Column(length = 255, nullable = false)
    private String nama;
 
    private String jumlah;

    private String merk;

  

    /**
     * @return the id_cv
     */
    public Long getId_aksesoris() {
        return id_aksesoris;
    }

    /**
     * @param id_aksesoris the id_cv to set
     */
    public void setId_aksesoris(Long id_aksesoris) {
        this.id_aksesoris = id_aksesoris;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the 
     */
    public String getjumlah() {
        return jumlah;
    }

    /**
     * @param 
     */
    public void setjumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    /**
     * @return the alamat
     */
    public String getmerk() {
        return merk;
    }

    /**
     * @param 
     */
    public void setmerk(String merk) {
        this.merk = merk;
    }


   
}
   

