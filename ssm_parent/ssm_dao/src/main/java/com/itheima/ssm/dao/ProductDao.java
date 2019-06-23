package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProductDao {
    @Insert("insert into product (productnum, productname, cityname, departuretime, productprice, productdesc, productstatus)" +
            " values(#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    public void save(Product product);

    @Select("select * from product")
    public List<Product> findAll();


    @Select("select * from product where id = #{id}")
    public Product findById(String id);

}
