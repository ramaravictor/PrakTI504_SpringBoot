package com.prkSpring.entity;

//class objek yg akan ditampilkan di view
public class Exam {
    // deklarasikan variabel
    private long id;
    private String name;
    private String time;
    private String total_question;
    private String start;
    private String end;

    // contructor using all fields
    public Exam(long id, String name, String time, String total_question, String start, String end) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.total_question = total_question;
        this.start = start;
        this.end = end;
    }
    
    //method setters & getters
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTotal_question() {
        return this.total_question;
    }

    public void setTotal_question(String total_question) {
        this.total_question = total_question;
    }

    public String getStart() {
        return this.start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return this.end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

}
