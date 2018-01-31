/**
 * 文 件 名:  Methodse
 * 版    权:  Quanten Teams. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  chenJian
 * 修改时间:  2018/1/9
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.demo.controller;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * <一句话功能简述> <功能详细描述>
 *
 * @author chenJian
 * @version 2018/1/9
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@Path ("/do")
public interface Methodse
{
	@GET
	@Path (value = "/test")
	@Produces (value = { "application/json" })
	ResponseInfo doMethod();

	@POST
	@Path (value = "/test2")
	@Produces (value = { "application/json" })
	ResponseInfo postMethod(RequestInfo request);
}