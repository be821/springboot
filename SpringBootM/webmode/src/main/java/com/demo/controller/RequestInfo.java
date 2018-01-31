/**
 * 文 件 名:  RequestInfo
 * 版    权:  Quanten Teams. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  chenJian
 * 修改时间:  2018/1/31
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.demo.controller;

import java.io.Serializable;

/**
 * <一句话功能简述> <功能详细描述>
 *
 * @author chenJian
 * @version 2018/1/31
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class RequestInfo implements Serializable
{
	private String param1 = "11";
	private String param2 = "22";

	@Override
	public String toString ()
	{
		final StringBuffer sb = new StringBuffer ("RequestInfo{");
		sb.append ("param1='").append (param1).append ('\'');
		sb.append (", param2='").append (param2).append ('\'');
		sb.append ('}');
		return sb.toString ();
	}

	public String getParam1 ()
	{
		return param1;
	}

	public void setParam1 (String param1)
	{
		this.param1 = param1;
	}

	public String getParam2 ()
	{
		return param2;
	}

	public void setParam2 (String param2)
	{
		this.param2 = param2;
	}
}