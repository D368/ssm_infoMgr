package com.itheima.ssm.domain;

import com.itheima.ssm.utils.Date2Utils;

import java.util.Date;
import java.util.List;

/**
 * 配置订单实体类
 */
public class Order {
    private String id;      //无意义、主键uuid
    private String orderNum;        //订单编号 不为空 唯一
    private Date orderTime;     //下单时间
    private String orderTimeStr;     //下单时间字符串格式
    private Integer peopleCount;        //出行人数
    private String orderDesc;       //订单描述(其它信息)
    private Integer payType;        //支付方式(0 支付宝 1 微信 2其它)
    private String payTypeStr;        //支付方式字符串(0 支付宝 1 微信 2其它)
    private Integer orderStatus;        //订单状态(0 未支付 1 已支付
    private String orderStatusStr;        //订单状态(0 未支付 1 已支付
    private Product product;       //产品
    private List<Traveller> travellers;       //旅客信息
    private Member member;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderTimeStr() {
        if (orderTime!=null){
            orderTimeStr = Date2Utils.Date2String(orderTime,"yyyy-MM-dd HH:mm");
        }
        return orderTimeStr;
    }

    public void setOrderTimeStr(String orderTimeStr) {
        this.orderTimeStr = orderTimeStr;
    }

    public Integer getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(Integer peopleCount) {
        this.peopleCount = peopleCount;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getPayTypeStr() {
        //支付方式字符串(0 支付宝 1 微信 2其它)
        if (payType!=null){
            if (payType==0){
                payTypeStr="支付宝";
            }else if (payType==1){
                payTypeStr="微信";
            }else if (payType==1){
                payTypeStr="其他";
            }
        }
        return payTypeStr;
    }

    public void setPayTypeStr(String payTypeStr) {
        this.payTypeStr = payTypeStr;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderStatusStr() {

            if (orderStatus==0){
                orderStatusStr = "未支付";
            }else if (orderStatus==1){
                orderStatusStr = "已支付";
            }

        return orderStatusStr;
    }

    public void setOrderStatusStr(String orderStatusStr) {
        this.orderStatusStr = orderStatusStr;
    }

    public Product getProducts() {
        return product;
    }

    public void setProducts(Product products) {
        this.product = products;
    }

    public List<Traveller> getTravellers() {
        return travellers;
    }

    public void setTravellers(List<Traveller> travellers) {
        this.travellers = travellers;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", orderNum='" + orderNum + '\'' +
                ", orderTime=" + orderTime +
                ", orderTimeStr='" + orderTimeStr + '\'' +
                ", peopleCount=" + peopleCount +
                ", orderDesc='" + orderDesc + '\'' +
                ", payType=" + payType +
                ", payTypeStr='" + payTypeStr + '\'' +
                ", orderStatus=" + orderStatus +
                ", orderStatusStr='" + orderStatusStr + '\'' +
                ", products=" + product +
                ", travellers=" + travellers +
                ", member=" + member +
                '}';
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
