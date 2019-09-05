package com.example.config;/**
 * @Auther: SuperWang
 * @Date: 2018/8/3 18:47
 * @Description:
 */

import org.apache.axis.transport.http.AxisServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @ClassName: ServerConfig
 * @Description: 自定义servlet, filter, listern组件注册
 * @Auther: SuperWang
 * @Date: 2018/8/3 18:47
 * @Vsersion: 0.0.1
 * @Copyright 中国电信集团系统集成有限责任公司
 */
@Configuration
public class ServerConfig {

	/**
	 * Description: 注册axis servlet
	 * 				配置后 不需要 com.example.web.wsdd.WebServlet
	 * 					  不需要 com.example.DemoApplication 中的 @ServletComponentScan(value={"com.example.*"}) 注解
	 * @param: []
	 * @return: org.springframework.boot.web.servlet.ServletRegistrationBean
	 * @auther: SuperWang
	 * @date: 2018/8/3 18:48
	 */
	@Bean
	public ServletRegistrationBean axisServlet(){
		ServletRegistrationBean registrationBean = new ServletRegistrationBean(new AxisServlet(),"/services/*");
		registrationBean.setLoadOnStartup(1);
		/*ArrayList<String> urlList = new ArrayList<>();
		urlList.add("/servlet/AxisServlet");
		urlList.add("/services/*");
		registrationBean.setUrlMappings(urlList);*/
		registrationBean.setName("AxisServlet");
		return registrationBean;
	}
}
