/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uts.uts.entity;

/**
 *
 * @author ramar
 */
public class mahasiswa {
    private Long id;
    private String Nama;
    private String NIM;
    private String Alamat;
    

    public mahasiswa() {
    }

    public mahasiswa(Long id, String Nama, String NIM, String Alamat) {
        this.id = id;
        this.Nama = Nama;
        this.NIM = NIM;
        this.Alamat = Alamat;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNama() {
        return this.Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getNIM() {
        return this.NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getAlamat() {
        return this.Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }
    
}
