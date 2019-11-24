package com.kevin.spring5.tutorial.samples.controller;

import com.kevin.spring5.tutorial.samples.bean.OrderInfo;
import com.kevin.spring5.tutorial.samples.service.OrderInfoSerivce;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.BodyExtractor;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * 订单
 * @author: wangyong
 * @date: 2019/11/23 0:21
 */
@RestController
@RequestMapping("/orderInfo")
@Slf4j
public class OrderInfoController {

	@Autowired
	private OrderInfoSerivce orderInfoSerivce;


	@GetMapping("/getOrderInfoList")
	public Flux<OrderInfo> getOrderInfoList(ServerRequest request, ServerResponse response) {

		return orderInfoSerivce.getOrderInfoList();
	}

	@GetMapping("/getOrderInfo/{orderNo}")
	public Mono<OrderInfo> getOrderInfo(@PathVariable("orderNo") String orderNo, ServerRequest request) {
		log.info("获取订单信息,订单号:{}", orderNo);

		Mono<String> stringMono = request.bodyToMono(String.class);
		return orderInfoSerivce.getOrderInfo(orderNo);

	}

}
