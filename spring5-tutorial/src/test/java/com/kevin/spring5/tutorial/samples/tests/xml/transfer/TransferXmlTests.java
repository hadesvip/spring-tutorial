package com.kevin.spring5.tutorial.samples.tests.xml.transfer;

import com.kevin.spring5.tutorial.samples.tests.xml.bean.Settings;
import org.junit.Test;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;

/**
 * 大哥写点注释吧！
 * @author: wangyong
 * @date: 2019/11/24 21:44
 */
public class TransferXmlTests {

	private static final String XML_FILE = "settings.xml";

	private Settings settings = new Settings();

	private Marshaller marshaller;

	private Unmarshaller unmarshaller;


	@Test
	public void saveSettingsTest() {

	}


	@Test
	public void loadSettingsTest() {



	}


}
