package com.test.promotion.price;

import java.math.BigDecimal;
import java.util.List;

/**
 * 主订单
 * @author admin
 *
 */
public class Order {
	
	private int id; //订单ID
	private String orderNo; //订单号
	private BigDecimal totalPayMoney; //总支付金额
	private List<OrderDetail> list; //详细订单列表
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public BigDecimal getTotalPayMoney() {
		return totalPayMoney;
	}
	public void setTotalPayMoney(BigDecimal totalPayMoney) {
		this.totalPayMoney = totalPayMoney;
	}
	public List<OrderDetail> getList() {
		return list;
	}
	public void setList(List<OrderDetail> list) {
		this.list = list;
	}
	

}
