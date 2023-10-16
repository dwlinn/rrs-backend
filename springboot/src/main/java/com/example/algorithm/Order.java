package com.example.algorithm;

class Order {
    String orderId;
    Product product;  // 订单中的产品
    int quantity;     // 订单中产品的数量
    int deadline;      // 截至日期

    public Order(String orderId, Product product, int quantity, int deadline) {
        this.orderId = orderId;
        this.product = product;
        this.quantity = quantity;
        this.deadline = deadline;
    }
}