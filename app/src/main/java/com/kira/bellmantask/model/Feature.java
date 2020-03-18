package com.kira.bellmantask.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Feature {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("arabic_name")
    @Expose
    private Object arabicName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getArabicName() {
        return arabicName;
    }

    public void setArabicName(Object arabicName) {
        this.arabicName = arabicName;
    }

}
