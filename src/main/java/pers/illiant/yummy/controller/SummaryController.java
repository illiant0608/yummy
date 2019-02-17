package pers.illiant.yummy.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.illiant.yummy.service.SummaryService;
import pers.illiant.yummy.util.Result;

import javax.annotation.Resource;

@RestController
@EnableAutoConfiguration
public class SummaryController {

    @Resource
    SummaryService summaryService;

    @RequestMapping("/getRestaurantSummary")
    public Result getRestaurantSummary() {
        return summaryService.restaurantPositionSummary();
    }

    @RequestMapping("/getRestaurantClassSummary")
    public Result getRestaurantClassSummary() {
        return summaryService.restaurantClassSummary();
    }

    @RequestMapping("/getMemberPositionSummary")
    public Result getMemberPositionSummary() {
        return summaryService.memberPositionSummary();
    }

    @RequestMapping("/getMemberLevelSummary")
    public Result getMemberLevelSummary() {
        return summaryService.memberLevelSummary();
    }

    @RequestMapping("/getBusinessSummary")
    public Result getBusinessSummary(String restaurantId) {
        return summaryService.businessSummary(restaurantId);
    }
}
