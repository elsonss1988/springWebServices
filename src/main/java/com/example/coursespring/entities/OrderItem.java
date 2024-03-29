package com.example.coursespring.entities;

import com.example.coursespring.entities.pk.OrderItemPK;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="tb_order_item")
public class OrderItem implements Serializable {

    public static final Long serialVersionUID=1L;

    //Id Gerado na Juncao dos dois IDs
    @EmbeddedId
    private OrderItemPK id= new OrderItemPK();
    private Integer quantity;
    private Double price;

    public OrderItem(){}

    public OrderItem(Order order,Product product,Integer quantity, Double price) {
        id.setOrder(order); //Baseado na Order do Objetos associado
        id.setProduct(product); //Baseado no produto do Objetos associado
        this.quantity = quantity;
        this.price = price;
    }

    @JsonIgnore
    public Order getOrder(){
        return id.getOrder();
    }
    public void setOrder(Order order){
        id.setOrder(order);
    }

    //@JsonIgnore
    public Product getProduct(){
        return id.getProduct();
    }
    public void setProduct(Product product){
        id.setProduct(product);
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return Objects.equals(id, orderItem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Double getSubTotal(){
        return getPrice()*getQuantity();
    }
}
