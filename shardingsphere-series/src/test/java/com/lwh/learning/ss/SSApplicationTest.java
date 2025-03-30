package com.lwh.learning.ss;

import com.lwh.learning.ss.mapper.OrderInfoMapper;
import com.lwh.learning.ss.mapper.OrderMapper;
import com.lwh.learning.ss.mapper.ShopingMapper;
import com.lwh.learning.ss.mapper.UserInfoMapper;
import com.lwh.learning.ss.model.Order;
import com.lwh.learning.ss.model.OrderInfo;
import com.lwh.learning.ss.model.Shoping;
import com.lwh.learning.ss.model.UserInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author lwh
 * @date 2025-03-30 19:03:26
 * @describe -
 */
@Slf4j
@SpringBootTest
class SSApplicationTest {

    @Autowired
    private ShopingMapper shopingMapper;

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Test
    void shopingMapperInsertTest() {

        Shoping shoping = new Shoping();
        shoping.setShopingId(11111111L);
        shoping.setShopingName("黄金零号竹子");
        shoping.setShopingPrice(8888);
        shopingMapper.insertSelective(shoping);
    }

    /**
     * 测试分库策略是否有效
     **/
    @Test
    void databaseStrategyInsert() {
        for (int i = 1; i <= 20; i++) {
            Shoping shoping = new Shoping();
            shoping.setShopingId((long) i);
            shoping.setShopingName("黄金" + i + "号竹子");
            shoping.setShopingPrice(1111 * i);
            shopingMapper.insertSelective(shoping);
        }
    }

    @Test
    void findShopingByShopingIdTest() {
        List<Shoping> shopings = shopingMapper.selectByShopingId(1L);
        System.out.println(shopings);
    }

    @Test
    void selectAllTest() {
        List<Shoping> shopings = shopingMapper.selectAll();
        log.info("result:{}", shopings);
    }

    @Test
    void insertSnowflakeTest() {
        for (int i = 1; i <= 10; i++) {
            Shoping shoping = new Shoping();
            shoping.setShopingName("黄金"+ i +"号竹子");
            shoping.setShopingPrice(8888);
            shopingMapper.insertSelective(shoping);
        }
    }

    /**
     * 测试绑定表的效果
     * **/
    @Test
    void orderOrOrderInfoInsert() {
        // 插入一条订单数据
        Order order = new Order();
        order.setUserId(111111L);
        order.setOrderPrice(100000);
        orderMapper.insertSelective(order);

        // 对同一笔订单插入三条订单详情数据
        for (int i = 1; i <= 3; i++) {
            OrderInfo orderInfo = new OrderInfo();
            // 前面插入订单的方法执行完成后会返回orderID
            orderInfo.setOrderId(order.getOrderId());
            orderInfo.setShopingName("黄金1号竹子");
            orderInfo.setShopingPrice(8888);

            orderInfoMapper.insertSelective(orderInfo);
        }
    }

    @Test
    void insertSelective() {
        // 插入三条性别为男的用户数据
        for (int i = 1; i <= 3; i++){
            UserInfo userInfo = new UserInfo();
            userInfo.setUserName("竹子" + i + "号");
            userInfo.setUserAge(18 + i);
            userInfo.setUserSex("男");
            userInfoMapper.insertSelective(userInfo);
        }

        // 插入两条性别为女的用户数据
        for (int i = 1; i <= 2; i++){
            UserInfo userInfo = new UserInfo();
            userInfo.setUserName("熊猫" + i + "号");
            userInfo.setUserAge(18 + i);
            userInfo.setUserSex("女");
            userInfoMapper.insertSelective(userInfo);
        }
    }
}