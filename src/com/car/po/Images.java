package com.car.po;

public class Images {
    private Integer imageId;

    private String appearance;

    private String trim;

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance == null ? null : appearance.trim();
    }

    public String getTrim() {
        return trim;
    }

    public void setTrim(String trim) {
        this.trim = trim == null ? null : trim.trim();
    }
}