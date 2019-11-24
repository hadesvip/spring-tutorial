package com.kevin.spring5.tutorial.samples.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单信息
 * @author: wangyong
 * @date: 2019/11/22 23:56
 */
@Data
@AllArgsConstructor
@ToString
public class OrderInfo implements Serializable {

	private String orderNo;

	private String type;

	private String amount;

	private Date createDatetime;

}
