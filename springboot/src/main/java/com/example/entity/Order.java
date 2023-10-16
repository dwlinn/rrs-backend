package com.example.entity;


import javax.persistence.*;


//@Data
//public class Order {
//
//    public String id;
//    public String base_name;
//    public String order_center_name;
//    public String product;  // 订单中的产品
//    public String brand;
//    public int num;     // 订单中产品的数量
//    public Integer weight;
//    public Integer volume;
//    public int deadline;      // 截至日期
//
//}
@Entity
@Table(name = "record") // 指定实体类对应的数据库表名
public class Order {
    @Id
    private Long id;

    private String base_name;
    private String order_center_name;
    private String product;
    private String brand;
    private int num;
    private Integer weight;
    private Integer volume;
    private int deadline;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBase_name() {
        return base_name;
    }

    public void setBase_name(String base_name) {
        this.base_name = base_name;
    }

    public String getOrder_center_name() {
        return order_center_name;
    }

    public void setOrder_center_name(String order_center_name) {
        this.order_center_name = order_center_name;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public int getDeadline() {
        return deadline;
    }

    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }
}