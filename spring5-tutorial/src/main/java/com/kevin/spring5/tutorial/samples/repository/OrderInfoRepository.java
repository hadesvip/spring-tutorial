package com.kevin.spring5.tutorial.samples.repository;

import com.kevin.spring5.tutorial.samples.bean.OrderInfo;

import java.util.List;

/**
 * 订单
 * @author: wangyong
 * @date: 2019/11/22 23:59
 */
public interface OrderInfoRepository {

	/**
	 * 订单列表
	 */
	List<OrderInfo> getOrderInfoList();
}
