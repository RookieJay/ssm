package com.car.po;

public class Basic {
	
    private Integer id;

    private String name;

    private String category;
    
    private String color;

    private String price;

    private String description;

    private String swept;

    private Integer brandId;

    private Integer featureId;

    private String appearance;
    
    private String trim;

    private Integer reviewId;

    private Integer saleId;

    private String date;
    
    private String launchdate;

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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSwept() {
		return swept;
	}

	public void setSwept(String swept) {
		this.swept = swept;
	}

	public Integer getBrandId() {
		return brandId;
	}

	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	public Integer getFeatureId() {
		return featureId;
	}

	public void setFeatureId(Integer featureId) {
		this.featureId = featureId;
	}

	public String getAppearance() {
		return appearance;
	}

	public void setAppearance(String appearance) {
		this.appearance = appearance;
	}

	public String getTrim() {
		return trim;
	}

	public void setTrim(String trim) {
		this.trim = trim;
	}

	public Integer getReviewId() {
		return reviewId;
	}

	public void setReviewId(Integer reviewId) {
		this.reviewId = reviewId;
	}

	public Integer getSaleId() {
		return saleId;
	}

	public void setSaleId(Integer saleId) {
		this.saleId = saleId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getLaunchdate() {
		return launchdate;
	}

	public void setLaunchdate(String launchdate) {
		this.launchdate = launchdate;
	}

	@Override
	public String toString() {
		return "Basic [id=" + id + ", name=" + name + ", category=" + category + ", color=" + color + ", price=" + price
				+ ", description=" + description + ", swept=" + swept + ", brandId=" + brandId + ", featureId="
				+ featureId + ", appearance=" + appearance + ", trim=" + trim + ", reviewId=" + reviewId + ", saleId="
				+ saleId + ", date=" + date + ", launchdate=" + launchdate + "]";
	}


    
    
    
}