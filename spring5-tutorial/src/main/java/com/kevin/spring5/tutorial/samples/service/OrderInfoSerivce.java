package com.kevin.spring5.tutorial.samples.service;

import com.kevin.spring5.tutorial.samples.bean.OrderInfo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * 订单服务
 * @author: wangyong
 * @date: 2019/11/23 0:01
 */
public interface OrderInfoSerivce {

	Flux<OrderInfo> getOrderInfoList();

	Mono<OrderInfo> getOrderInfo(String orderNo);
}
