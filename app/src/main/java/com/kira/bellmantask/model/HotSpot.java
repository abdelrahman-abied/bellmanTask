package com.kira.bellmantask.model;


import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HotSpot {

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
    @SerializedName("price_of_two")
    @Expose
    private String priceOfTwo;
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
    private CityId cityId;
    @SerializedName("neighborhood")
    @Expose
    private Neighborhood neighborhood;
    @SerializedName("address")
    @Expose
    private Object address;
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
    @SerializedName("facebook_id")
    @Expose
    private Object facebookId;
    @SerializedName("facebook_image")
    @Expose
    private Object facebookImage;
    @SerializedName("phone")
    @Expose
    private Object phone;
    @SerializedName("photos")
    @Expose
    private List<String> photos = null;
    @SerializedName("profile_photo")
    @Expose
    private String profilePhoto;
    @SerializedName("city")
    @Expose
    private City__ city;
    @SerializedName("categories")
    @Expose
    private List<Category__> categories = null;
    @SerializedName("features")
    @Expose
    private List<Feature__> features = null;
    @SerializedName("cuisineTypes")
    @Expose
    private List<CuisineType> cuisineTypes = null;
    @SerializedName("offers")
    @Expose
    private List<Object> offers = null;
    @SerializedName("external_rating")
    @Expose
    private List<Object> externalRating = null;
    @SerializedName("video")
    @Expose
    private String video;
    @SerializedName("menus")
    @Expose
    private List<String> menus = null;

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

    public String getPriceOfTwo() {
        return priceOfTwo;
    }

    public void setPriceOfTwo(String priceOfTwo) {
        this.priceOfTwo = priceOfTwo;
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

    public CityId getCityId() {
        return cityId;
    }

    public void setCityId(CityId cityId) {
        this.cityId = cityId;
    }

    public Neighborhood getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(Neighborhood neighborhood) {
        this.neighborhood = neighborhood;
    }

    public Object getAddress() {
        return address;
    }

    public void setAddress(Object address) {
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

    public Object getFacebookId() {
        return facebookId;
    }

    public void setFacebookId(Object facebookId) {
        this.facebookId = facebookId;
    }

    public Object getFacebookImage() {
        return facebookImage;
    }

    public void setFacebookImage(Object facebookImage) {
        this.facebookImage = facebookImage;
    }

    public Object getPhone() {
        return phone;
    }

    public void setPhone(Object phone) {
        this.phone = phone;
    }

    public List<String> getPhotos() {
        return photos;
    }

    public void setPhotos(List<String> photos) {
        this.photos = photos;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public City__ getCity() {
        return city;
    }

    public void setCity(City__ city) {
        this.city = city;
    }

    public List<Category__> getCategories() {
        return categories;
    }

    public void setCategories(List<Category__> categories) {
        this.categories = categories;
    }

    public List<Feature__> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature__> features) {
        this.features = features;
    }

    public List<CuisineType> getCuisineTypes() {
        return cuisineTypes;
    }

    public void setCuisineTypes(List<CuisineType> cuisineTypes) {
        this.cuisineTypes = cuisineTypes;
    }

    public List<Object> getOffers() {
        return offers;
    }

    public void setOffers(List<Object> offers) {
        this.offers = offers;
    }

    public List<Object> getExternalRating() {
        return externalRating;
    }

    public void setExternalRating(List<Object> externalRating) {
        this.externalRating = externalRating;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public List<String> getMenus() {
        return menus;
    }

    public void setMenus(List<String> menus) {
        this.menus = menus;
    }

}