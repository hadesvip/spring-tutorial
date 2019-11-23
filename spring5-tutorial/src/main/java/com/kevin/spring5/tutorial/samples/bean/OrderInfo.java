package com.kevin.spring5.tutorial.samples.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单信息
 * @author: wangyong
 * @date: 2019/11/22 23:56
 */
@Data
public class OrderInfo implements Serializable {

	private String orderNo;

	private String type;

	private String amount;

	private Date createDatetime;

	public OrderInfo(String orderNo, String type, String amount, Date createDatetime) {
		this.orderNo = orderNo;
		this.type = type;
		this.amount = amount;
		this.createDatetime = createDatetime;
	}
}
