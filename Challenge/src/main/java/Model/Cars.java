package Model;

import java.util.Date;

public class Cars {

    private Integer id;
    private String name;
    private String description;
    private Double dailyRate;
    private Boolean avaliable;
    private String LicensePlate;
    private Integer brandId;
    private Integer categoryId;
    private String Color;
    private Date createdAt;

    public Cars(Integer id, String name, String description, Double dailyRate, Boolean avaliable, String LicensePlate, Integer brandId, Integer categoryId, String Color, Date createdAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.dailyRate = dailyRate;
        this.avaliable = avaliable;
        this.LicensePlate = LicensePlate;
        this.brandId = brandId;
        this.categoryId = categoryId;
        this.Color = Color;
        this.createdAt = createdAt;
    }

    public Cars() {
    }
    
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

    public Double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(Double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public Boolean getAvaliable() {
        return avaliable;
    }

    public void setAvaliable(Boolean avaliable) {
        this.avaliable = avaliable;
    }

    public String getLicensePlate() {
        return LicensePlate;
    }

    public void setLicensePlate(String LicensePlate) {
        this.LicensePlate = LicensePlate;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }   
}
