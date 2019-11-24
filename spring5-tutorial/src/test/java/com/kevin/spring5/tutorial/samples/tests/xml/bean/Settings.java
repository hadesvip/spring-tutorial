package com.kevin.spring5.tutorial.samples.tests.xml.bean;

/**
 * xml对应的bean
 * @author: wangyong
 * @date: 2019/11/24 21:42
 */
public class Settings {

	private boolean fooEnable;

	public boolean isFooEnable() {
		return fooEnable;
	}

	public Settings setFooEnable(boolean fooEnable) {
		this.fooEnable = fooEnable;
		return this;
	}
}
