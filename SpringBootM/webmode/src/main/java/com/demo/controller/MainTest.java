/**
 * 文 件 名:  MainTest
 * 版    权:  Quanten Teams. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  chenJian
 * 修改时间:  2018/1/22
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.demo.controller;

import java.util.*;

/**
 * <一句话功能简述> <功能详细描述>
 *
 * @author chenJian
 * @version 2018/1/22
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class MainTest
{
	/**
	*  main
	**/
	public static void main(String[] args)
	{
		/*HashSet xx = new HashSet ();
		xx.add (1);
		xx.add ("1");
		xx.add (2);
		xx.add (3);
		Iterator iterator= xx.iterator ();
		 while(iterator.hasNext ()){
		 	System.out.println(iterator.next ());
		 }
*/
	/*	HashMap xxx= new HashMap ();
		 xxx.put ("1","2");
		 xxx.put ("2","22");

		 xxx.keySet ();
		 xxx.values ();
		 Set<Map.Entry<String,Object>> tt = xxx.entrySet ();
		 Iterator xa =tt.iterator ();
		while(xa.hasNext ())
		{
			System.out.println(xa.next ());
		}*/

		Hashtable xas = new Hashtable ();
		xas.put ("1",22);
		xas.put ("222",34);
		Set<Map.Entry<String,Object>> xbb = xas.entrySet ();
		Enumeration xaf = xas.keys ();
		while(xaf.hasMoreElements ())
		{
			System.out.println(xas.get (xaf.nextElement ()));
		}

	}
}