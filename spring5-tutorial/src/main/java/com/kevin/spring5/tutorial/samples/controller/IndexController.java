package com.kevin.spring5.tutorial.samples.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * 首页
 * @author: wangyong
 * @date: 2019/11/24 0:08
 */
@RestController
@Slf4j
public class IndexController {


	@GetMapping("/")
	public Mono<String> index() {
		return Mono.just("hello,spring webflux...");
	}


}
