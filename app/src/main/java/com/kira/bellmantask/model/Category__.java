package com.kira.bellmantask.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Category__ {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("order")
    @Expose
    private Object order;
    @SerializedName("ar_name")
    @Expose
    private Object arName;

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

    public Object getOrder() {
        return order;
    }

    public void setOrder(Object order) {
        this.order = order;
    }

    public Object getArName() {
        return arName;
    }

    public void setArName(Object arName) {
        this.arName = arName;
    }

}
