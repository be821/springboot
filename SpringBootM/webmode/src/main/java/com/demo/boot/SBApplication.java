/**
 * 文 件 名:  SpringBootApllication
 * 版    权:  Quanten Teams. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  chenJian
 * 修改时间:  2018/1/9
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.demo.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * <一句话功能简述> <功能详细描述>
 *
 * @author chenJian
 * @version 2018/1/9
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */

@SpringBootApplication
@ComponentScan ("com.demo")
public class SBApplication
{

	/*@Bean
	public ServletRegistrationBean registResource ()
	{
		ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean (new ServletContainer (),
				"/gcms/portal*//*");
		servletRegistrationBean
				.addInitParameter (ServletProperties.JAXRS_APPLICATION_CLASS, GcmsConfig.class.getName ());
		return servletRegistrationBean;
	}
*/
	public static void main (String[] args)
	{
		SpringApplication.run (SBApplication.class, args);
	}
}