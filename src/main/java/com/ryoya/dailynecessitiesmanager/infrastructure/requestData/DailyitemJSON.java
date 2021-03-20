package com.ryoya.dailynecessitiesmanager.infrastructure.requestData;

/**
 * APIが呼び出された時のリクエストをJSONクラスにマッピングするクラス
 */
public class DailyitemJSON {

    private String name;
    private String category;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
