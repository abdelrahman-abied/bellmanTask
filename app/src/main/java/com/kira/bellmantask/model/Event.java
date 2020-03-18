package com.kira.bellmantask.model;


import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Event {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("short_description")
    @Expose
    private String shortDescription;
    @SerializedName("arabic_name")
    @Expose
    private String arabicName;
    @SerializedName("arabic_short_description")
    @Expose
    private String arabicShortDescription;
    @SerializedName("arabic_description")
    @Expose
    private String arabicDescription;
    @SerializedName("city_id")
    @Expose
    private Integer cityId;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("lat")
    @Expose
    private Object lat;
    @SerializedName("lng")
    @Expose
    private Object lng;
    @SerializedName("facebook")
    @Expose
    private String facebook;
    @SerializedName("twitter")
    @Expose
    private String twitter;
    @SerializedName("instagram")
    @Expose
    private String instagram;
    @SerializedName("website")
    @Expose
    private Object website;
    @SerializedName("views")
    @Expose
    private Integer views;
    @SerializedName("start_date")
    @Expose
    private String startDate;
    @SerializedName("end_date")
    @Expose
    private String endDate;
    @SerializedName("price_per_day")
    @Expose
    private String pricePerDay;
    @SerializedName("whole_price")
    @Expose
    private String wholePrice;
    @SerializedName("ticket_price")
    @Expose
    private String ticketPrice;
    @SerializedName("video_preview")
    @Expose
    private Object videoPreview;
    @SerializedName("photos")
    @Expose
    private List<Object> photos = null;
    @SerializedName("city")
    @Expose
    private City_ city;
    @SerializedName("categories")
    @Expose
    private List<Category_> categories = null;
    @SerializedName("features")
    @Expose
    private List<Feature_> features = null;
    @SerializedName("offers")
    @Expose
    private List<Object> offers = null;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getArabicName() {
        return arabicName;
    }

    public void setArabicName(String arabicName) {
        this.arabicName = arabicName;
    }

    public String getArabicShortDescription() {
        return arabicShortDescription;
    }

    public void setArabicShortDescription(String arabicShortDescription) {
        this.arabicShortDescription = arabicShortDescription;
    }

    public String getArabicDescription() {
        return arabicDescription;
    }

    public void setArabicDescription(String arabicDescription) {
        this.arabicDescription = arabicDescription;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Object getLat() {
        return lat;
    }

    public void setLat(Object lat) {
        this.lat = lat;
    }

    public Object getLng() {
        return lng;
    }

    public void setLng(Object lng) {
        this.lng = lng;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    public Object getWebsite() {
        return website;
    }

    public void setWebsite(Object website) {
        this.website = website;
    }

    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(String pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public String getWholePrice() {
        return wholePrice;
    }

    public void setWholePrice(String wholePrice) {
        this.wholePrice = wholePrice;
    }

    public String getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(String ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public Object getVideoPreview() {
        return videoPreview;
    }

    public void setVideoPreview(Object videoPreview) {
        this.videoPreview = videoPreview;
    }

    public List<Object> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Object> photos) {
        this.photos = photos;
    }

    public City_ getCity() {
        return city;
    }

    public void setCity(City_ city) {
        this.city = city;
    }

    public List<Category_> getCategories() {
        return categories;
    }

    public void setCategories(List<Category_> categories) {
        this.categories = categories;
    }

    public List<Feature_> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature_> features) {
        this.features = features;
    }

    public List<Object> getOffers() {
        return offers;
    }

    public void setOffers(List<Object> offers) {
        this.offers = offers;
    }

}
