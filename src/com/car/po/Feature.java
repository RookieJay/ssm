package com.car.po;

public class Feature {
    private Integer featureId;

    private String window;

    private String abs;

    private String esp;

    public Integer getFeatureId() {
        return featureId;
    }

    public void setFeatureId(Integer featureId) {
        this.featureId = featureId;
    }

    public String getWindow() {
        return window;
    }

    public void setWindow(String window) {
        this.window = window == null ? null : window.trim();
    }

    public String getAbs() {
        return abs;
    }

    public void setAbs(String abs) {
        this.abs = abs == null ? null : abs.trim();
    }

    public String getEsp() {
        return esp;
    }

    public void setEsp(String esp) {
        this.esp = esp == null ? null : esp.trim();
    }
}