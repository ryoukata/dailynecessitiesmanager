package com.ryoya.dailynecessitiesmanager.domain.model;

import java.util.List;

public interface DailyItemRepository {

    public void createItem(DailyItem dailyItem);

    public List<DailyItem> getItemList();

    public void deleteItem(String id);

}
