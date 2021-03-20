package com.ryoya.dailynecessitiesmanager.interfaces.api;

import com.ryoya.dailynecessitiesmanager.domain.model.DailyItem;
import com.ryoya.dailynecessitiesmanager.infrastructure.requestData.DailyitemJSON;
import com.ryoya.dailynecessitiesmanager.mapper.DailyItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/")
public class DailyItemsController {

    // MyBatisのMapperクラス
    @Autowired
    DailyItemMapper dailyItemMapper;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "Hello SpringBoot!!";
    }

    @RequestMapping(value = "/sample", method = RequestMethod.GET)
    public String sample() { return "sample get."; }

    @RequestMapping(value = "/items", method = RequestMethod.GET)
    public ArrayList<DailyItem> getAllItems() {
        return dailyItemMapper.selectAllDailyItems();
    }

    @RequestMapping(value = "/insert/item", method = RequestMethod.POST)
    public DailyItem insertItem(@RequestBody DailyitemJSON dailyitemJSON) {
        DailyItem dailyItem = new DailyItem(dailyitemJSON.getName(), dailyitemJSON.getCategory());
        dailyItemMapper.insert(dailyItem);
        return dailyItemMapper.findDailyItem(dailyItem);
    }

}
