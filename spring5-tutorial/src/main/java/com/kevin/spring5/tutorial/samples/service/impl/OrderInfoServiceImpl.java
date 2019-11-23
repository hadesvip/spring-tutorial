package com.kevin.spring5.tutorial.samples.service.impl;

import com.kevin.spring5.tutorial.samples.bean.OrderInfo;
import com.kevin.spring5.tutorial.samples.repository.OrderInfoRepository;
import com.kevin.spring5.tutorial.samples.service.OrderInfoSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 * 订单服务具体实现
 * @author: wangyong
 * @date: 2019/11/23 0:02
 */
@Service
public class OrderInfoServiceImpl implements OrderInfoSerivce {

	@Autowired
	private OrderInfoRepository orderInfoRepository;

	@Override
	public Flux<OrderInfo> getOrderInfoList() {
		return null;
	}

	@Override
	public Mono<OrderInfo> getOrderInfo(String orderNo) {
		return Mono.just(new OrderInfo(orderNo, "1", "10.00", new Date()));
	}
}
