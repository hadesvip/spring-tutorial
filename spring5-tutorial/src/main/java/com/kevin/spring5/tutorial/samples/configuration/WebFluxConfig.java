package com.kevin.spring5.tutorial.samples.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.codec.ServerCodecConfigurer;
import org.springframework.http.codec.json.Jackson2JsonDecoder;
import org.springframework.http.codec.json.Jackson2JsonEncoder;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;

/**
 * webFlux配置
 * @author: wangyong
 * @date: 2019/11/23 13:47
 */
@Configuration
@EnableWebFlux
@ComponentScan(basePackages = {"com.kevin.spring5.tutorial.samples"})
public class WebFluxConfig implements WebFluxConfigurer {

	@Override
	public void configureHttpMessageCodecs(ServerCodecConfigurer configurer) {
		configurer.defaultCodecs().jackson2JsonEncoder(new Jackson2JsonEncoder());
		configurer.defaultCodecs().jackson2JsonDecoder(new Jackson2JsonDecoder());
	}
}
