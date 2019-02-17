package pers.illiant.yummy.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.illiant.yummy.dao.AddressMapper;
import pers.illiant.yummy.dao.MemberMapper;
import pers.illiant.yummy.dao.OrderInfoMapper;
import pers.illiant.yummy.dao.RestaurantMapper;
import pers.illiant.yummy.entity.Address;
import pers.illiant.yummy.entity.Member;
import pers.illiant.yummy.entity.OrderInfo;
import pers.illiant.yummy.entity.Restaurant;
import pers.illiant.yummy.model.BusinessSummaryVO;
import pers.illiant.yummy.model.MemberSummaryVO;
import pers.illiant.yummy.model.RestaurantSummaryVO;
import pers.illiant.yummy.service.SummaryService;
import pers.illiant.yummy.util.Result;
import pers.illiant.yummy.util.ResultUtils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.joda.time.LocalDate;
import org.joda.time.DateTime;

@Service("summaryService")
public class SummaryServiceImpl implements SummaryService {

    String[] cityNames = {"徐州市", "连云港市", "宿迁市", "淮安市", "盐城市", "泰州市", "扬州市", "南京市", "镇江市", "南通市",
                            "常州市", "无锡市", "苏州市"};

    String[] restaurantClass = {"美食", "快餐便当", "特色菜系", "异国料理", "小吃夜宵", "甜品饮品"};

    String[] levels = {"Level1", "Level2", "Level3", "Level4"};

    @Autowired
    RestaurantMapper restaurantMapper;

    @Autowired
    MemberMapper memberMapper;

    @Autowired
    AddressMapper addressMapper;

    @Autowired
    OrderInfoMapper orderInfoMapper;

    @Override
    public Result restaurantPositionSummary() {
        List<Restaurant> restaurantList = restaurantMapper.selectAll();
        List<RestaurantSummaryVO> result = new ArrayList<>();

        for (String city : cityNames) {
            RestaurantSummaryVO vo = new RestaurantSummaryVO();
            vo.setSummaryItem(city);
            int number = 0;

            for (Restaurant restaurant : restaurantList) {
                if (restaurant.getAddress().contains(city))
                    number++;
            }

            vo.setRestaurantNumber(number);
            result.add(vo);
        }



        return ResultUtils.success(result);
    }

    @Override
    public Result restaurantClassSummary() {
        List<Restaurant> restaurants = restaurantMapper.selectAll();
        List<RestaurantSummaryVO> result = new ArrayList<>();

        for (String item : restaurantClass) {
            RestaurantSummaryVO vo = new RestaurantSummaryVO();
            vo.setSummaryItem(item);

            int number = 0;
            for (Restaurant restaurant : restaurants) {
                if (restaurant.getType().contains(item))
                    number++;
            }
            vo.setRestaurantNumber(number);

            result.add(vo);
        }

        return ResultUtils.success(result);
    }

    @Override
    public Result memberPositionSummary() {
        List<Address> addresses = addressMapper.selectAll();
        List<MemberSummaryVO> result = new ArrayList<>();

        for (String city : cityNames) {
            MemberSummaryVO vo = new MemberSummaryVO();
            vo.setSummaryItem(city);
            int number = 0;
            for (Address address : addresses) {
                if (address.getAddress().contains(city))
                    number++;
            }

            vo.setMemberNumber(number);
            result.add(vo);
        }

        return ResultUtils.success(result);
    }

    @Override
    public Result memberLevelSummary() {
        List<Member> members = memberMapper.selectAll();
        List<MemberSummaryVO> result = new ArrayList<>();

        int level_num = 1;
        for (String level : levels) {
            MemberSummaryVO vo = new MemberSummaryVO();
            vo.setSummaryItem(level);
            int number = 0;
            for (Member member : members) {
                if (member.getLevel() == level_num)
                    number++;
            }
            level_num++;

            vo.setMemberNumber(number);
            result.add(vo);
        }
        return ResultUtils.success(result);
    }

    @Override
    public Result businessSummary(String restaurantId) {
        Date current_date = new Date();
        List<BusinessSummaryVO> list = new ArrayList<>();
        List<OrderInfo> infos = orderInfoMapper.selectByRestaurantId(restaurantId);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(current_date);
        //之前一天
        for (int i = 0;i < 7;i++) { //一周之内
            calendar.add(Calendar.DAY_OF_MONTH, -1);
            Date date = calendar.getTime();
            double total = 0;
            BusinessSummaryVO vo = new BusinessSummaryVO();
            int month = calendar.get(Calendar.MONTH) + 1;
            int day = calendar.get(Calendar.DAY_OF_MONTH) + 1;
            vo.setDate(month + "/" + day);

            for (OrderInfo item : infos) {
                Date temp = item.getOrderTime();
                LocalDate ld1 = new LocalDate(new DateTime(date));
                LocalDate ld2 = new LocalDate(new DateTime(temp));
                if (ld1.equals(ld2)) {
                    total += item.getPrice(); //营收额不算运费
                }
            }

            vo.setTotal(total);
            list.add(vo);
        }
        return ResultUtils.success(list);
    }


    /**
     * 计算两个date之间的天数差距
     * @param currentDate 现在的时间
     * @param beforeDate 过去的时间
     * @return 相差天数
     */
    private int getDateGap(Date currentDate, Date beforeDate) {
        long nd = 1000* 24* 60* 60;
        long nh = 1000* 60* 60;
        long nm = 1000* 60;
        long diff = currentDate.getTime() - beforeDate.getTime();
        int day = (int) (diff / nd);

        return day;
    }


}
