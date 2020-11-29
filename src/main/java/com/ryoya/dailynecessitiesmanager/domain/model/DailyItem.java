package com.ryoya.dailynecessitiesmanager.domain.model;

import lombok.Data;

@Data
public class DailyItem {

    private String id;
    private String name;
    private String category;

    public DailyItem(String name, String category) {
        this.name = name;
        this.category = category;
    }

}
