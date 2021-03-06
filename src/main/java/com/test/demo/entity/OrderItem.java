package com.test.demo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="items")
public class OrderItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="items_id")
	private int id;
	
	@ManyToOne
	private Product product;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="order_id", referencedColumnName ="order_id")
	private Order order;
	
	@Column(name = "quantity")
	private int qty;
	
	public OrderItem(){}
	
	public OrderItem(Product product, int qty, Order order){
		this.product=product;
		this.qty=qty;
		this.order = order;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}	
}
