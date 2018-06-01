package com.car.form;

public class BasicForm {

	private String id;

    private String name;

    private String category;

    private String price;

    private String description;

    private String swept;

    private String brandId;

    private String featureId;

    private String imageId;

    private String reviewId;

    private String saleId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getBrandId() {
		return brandId;
	}

	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getFeatureId() {
		return featureId;
	}

	public void setFeatureId(String featureId) {
		this.featureId = featureId;
	}

	public String getImageId() {
		return imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
	}

	public String getReviewId() {
		return reviewId;
	}

	public void setReviewId(String reviewId) {
		this.reviewId = reviewId;
	}

	public String getSaleId() {
		return saleId;
	}

	public void setSaleId(String saleId) {
		this.saleId = saleId;
	}

	@Override
	public String toString() {
		return "BasicForm [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price
				+ ", description=" + description + ", swept=" + swept + ", brandId=" + brandId + ", featureId="
				+ featureId + ", imageId=" + imageId + ", reviewId=" + reviewId + ", saleId=" + saleId + "]";
	}
    
    
}
