package com.ryoya.dailynecessitiesmanager.domain.model;

public class DailyItem {

    private String id;
    private String name;
    private String category;

    public DailyItem(String id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

}
