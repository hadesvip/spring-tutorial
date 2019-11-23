package com.kevin.spring5.tutorial.samples.repository.impl;

import com.kevin.spring5.tutorial.samples.bean.OrderInfo;
import com.kevin.spring5.tutorial.samples.repository.OrderInfoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 大哥写点注释吧！
 * @author: wangyong
 * @date: 2019/11/23 0:03
 */
@Repository
public class OrderInfoRepositoryImpl implements OrderInfoRepository {
	@Override
	public List<OrderInfo> getOrderInfoList() {
		return null;
	}
}
