package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Member;
import com.itheima.ssm.domain.Order;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface OrdersDao {

    /**
     * 查询所有order信息
     * @return
     */
    @Select("select * from orders")
    @Results({
            @Result(id = true,column = "id",property = "id"),
            @Result(column = "orderNum",property = "orderNum"),
            @Result(column = "orderTime",property = "orderTime"),
            @Result(column = "peopleCount",property = "peopleCount"),
            @Result(column = "orderDesc",property = "orderDesc"),
            @Result(column = "payType",property = "payType"),
            @Result(column = "orderStatus",property = "orderStatus"),
            @Result(column = "productId",property = "product",one = @One(select = "com.itheima.ssm.dao.ProductDao.findById"))
    })
    public List<Order> findAll();

    /**
     * 根据ID查询单条order信息的详情
     * @param id
     * @return
     */
    @Select("select * from orders where id = #{id}")
    @Results({
            @Result(id = true,property = "id",column = "id"),
            @Result(property = "orderNum",column ="orderNum" ),
            @Result(property = "orderTime",column ="orderTime" ),
            @Result(property = "peopleCount",column ="peopleCount" ),
            @Result(property = "orderDesc",column ="orderDesc" ),
            @Result(property = "payType",column ="payType" ),
            @Result(property = "orderStatus",column ="orderStatus" ),
            @Result(column = "productId",property = "product",one = @One(select = "com.itheima.ssm.dao.ProductDao.findById")),
            @Result(property = "member",column ="memberId",javaType = Member.class ,one = @One(select = "com.itheima.ssm.dao.MemberDao.findByMemberId")),
            @Result(property = "travellers",column ="id",javaType = List.class,many = @Many(select = "com.itheima.ssm.dao.TravellerDao.findByOrderId"))

    })
    public Order findById(String id);
}
