
package com.prkSpring.entity;


//class objek yg akan ditampilkan di view
public class Course {
    //deklarasikan variabel
    private long id;
    private String Judul;
    private String Isi;
    
    //contructor using all fields
    public Course(long id, String Judul, String Isi) {
        this.id = id;
        this.Judul = Judul;
        this.Isi = Isi;
    }

    //setters dan getters method
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getJudul() {
        return this.Judul;
    }

    public void setJudul(String Judul) {
        this.Judul = Judul;
    }

    public String getIsi() {
        return this.Isi;
    }

    public void setIsi(String Isi) {
        this.Isi = Isi;
    }
}
