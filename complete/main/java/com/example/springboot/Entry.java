package com.example.springboot;

public class Entry {
    private String date;
    private String title;
    private String contents;

    public String getDate(){
        return date;
    }
    public String getTitle(){
        return title;
    }
    public String getContents(){
        return contents;
    }
    public void setDate(String date){
        this.date = date;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setContents(String contents){
        this.contents = contents;
    }
}
