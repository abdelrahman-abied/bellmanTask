package com.kira.bellmantask.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WorkingHour {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("from")
    @Expose
    private String from;
    @SerializedName("to")
    @Expose
    private String to;
    @SerializedName("date")
    @Expose
    private Object date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

}