package pers.illiant.yummy.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;
import pers.illiant.yummy.annotation.LoginRequired;
import pers.illiant.yummy.entity.Food;
import pers.illiant.yummy.entity.Restaurant;
import pers.illiant.yummy.model.*;
import pers.illiant.yummy.service.FoodService;
import pers.illiant.yummy.service.RestaurantService;
import pers.illiant.yummy.util.Result;
import pers.illiant.yummy.util.ResultUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@RestController
@EnableAutoConfiguration
public class RestaurantController {
    @Resource(name = "restaurantService")
    private RestaurantService restaurantService;

    @Resource(name = "foodService")
    private FoodService foodService;

    @RequestMapping("/signupForRestaurant")
    public boolean signupForRestaurant(@RequestBody RestaurantVO_register restaurant) {
        return restaurantService.register(restaurant);
    }

    @RequestMapping("/getAllShops")
    public Result getAllShops() {
        List<RestaurantVO_post> restList = restaurantService.getAll();

        return ResultUtils.success(restList);
    }

    @LoginRequired
    @RequestMapping("/releaseFood")
    public Result releaseFood(@RequestBody FoodVO_release food) {
        return restaurantService.releaseFood(food);
    }


    //todo 研究下怎么不用requestbody实现
    @RequestMapping("/loginForRestaurant")
    public Result login(@RequestBody RestaurantVO restaurant) {
        return restaurantService.login(restaurant.getRestaurantId(), restaurant.getPassword());
    }

    @RequestMapping("/getFoods")
    public Result getFoods(@RequestParam String restaurantId) {
        List<Food> list = foodService.getFoodOfRestaurant(restaurantId);
        List<FoodVO_post> retList = new ArrayList<>();
        for (Food food : list) {
            retList.add(new FoodVO_post(food));
        }
        return ResultUtils.success(retList);
    }

    @RequestMapping("/getRestaurant")
    public Result getRestaurant(@RequestParam String restaurantId) {
        Restaurant restaurant = restaurantService.findById(restaurantId);
        RestaurantVO_post vo = new RestaurantVO_post(restaurant);
        return ResultUtils.success(vo);
    }
}
