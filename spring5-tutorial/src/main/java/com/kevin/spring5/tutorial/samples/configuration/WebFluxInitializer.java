package com.kevin.spring5.tutorial.samples.configuration;

import org.springframework.web.server.adapter.AbstractReactiveWebInitializer;

/**
 * webFlux入口
 * @author: wangyong
 * @date: 2019/11/23 13:53
 */
public class WebFluxInitializer extends AbstractReactiveWebInitializer {

	@Override
	protected Class<?>[] getConfigClasses() {
		return new Class[]{WebFluxConfig.class};
	}
}
