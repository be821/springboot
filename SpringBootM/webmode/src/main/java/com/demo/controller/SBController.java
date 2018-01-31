/**
 * 文 件 名:  SBController
 * 版    权:  Quanten Teams. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  chenJian
 * 修改时间:  2018/1/9
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.demo.controller;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * <一句话功能简述> <功能详细描述>
 *
 * @author chenJian
 * @version 2018/1/9
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
//@Controller
@Component
public class SBController implements Methodse
{
	@Override
	public ResponseInfo doMethod ()
	{
		ResponseInfo result = new ResponseInfo();
		Map<String,Object> map = new HashMap<String,Object> ();
		map.put("name","Ryan");
		map.put("age","18");
		map.put("sex","man");
		return result;
	}

	@Override
	public ResponseInfo postMethod (RequestInfo request)
	{
		ResponseInfo result = new ResponseInfo();
		result.setXx (request.getParam2 ());
		return result;
	}

	 /*	@RequestMapping("/index2")
	public String index(Model model){

		model.addAttribute("name","Ryan");

		return "index";
	}

	@RequestMapping("/json")
	@ResponseBody
	public Map<String,Object> json(){
		Map<String,Object> map = new HashMap<String,Object> ();
		map.put("name","Ryan");
		map.put("age","18");
		map.put("sex","man");
		return map;
	}*/
}