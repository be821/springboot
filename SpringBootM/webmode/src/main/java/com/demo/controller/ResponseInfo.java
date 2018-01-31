/**
 * 文 件 名:  ResponseInfo
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
public class ResponseInfo implements Serializable
{
	private String x = "hello world";
	private String xx = "";

	public String getX ()
	{
		return x;
	}

	public void setX (String x)
	{
		this.x = x;
	}

	public String getXx ()
	{
		return xx;
	}

	public void setXx (String xx)
	{
		this.xx = xx;
	}

	@Override
	public String toString ()
	{
		final StringBuffer sb = new StringBuffer ("ResponseInfo{");
		sb.append ("x='").append (x).append ('\'');
		sb.append (", xx='").append (xx).append ('\'');
		sb.append ('}');
		return sb.toString ();
	}
}
