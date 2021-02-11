package com.ryoya.dailynecessitiesmanager.mapper;

import com.ryoya.dailynecessitiesmanager.domain.model.DailyItem;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

@Mapper
public interface DailyItemMapper {

    @Select("SELECT id, name, category FROM daily_items")
    ArrayList<DailyItem> selectAllDailyItems();

    @Insert("INSERT INTO daily_items (name, category) VALUES (#{name}, #{category})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(DailyItem dailyItem);

    @Select("SELECT id, name, category FROM daily_items WHERE name = #{name} AND category = #{category}")
    DailyItem findDailyItem(DailyItem dailyItem);
}
