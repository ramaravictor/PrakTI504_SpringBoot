package com.prkSpring.dto;

//class yg akan meng-enkapsulasi keyword yg dikirim dari form pencarian
public class SearchFormData {
    private String keyword;

    //constructor
    public SearchFormData() {
        
    }

    public SearchFormData(String keyword) {
        this.keyword = keyword;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
    

    

}
