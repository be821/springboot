/**
 * 文 件 名:  ApplictaionPath
 * 版    权:  Quanten Teams. Copyright YYYY-YYYY,  All rights reserved
 * 描    述:  <描述>
 * 修 改 人:  chenJian
 * 修改时间:  2018/1/9
 * 跟踪单号:  <跟踪单号>
 * 修改单号:  <修改单号>
 * 修改内容:  <修改内容>
 */
package com.demo.conifg;

import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * <一句话功能简述> <功能详细描述>
 *
 * @author chenJian
 * @version 2018/1/9
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@Component
@ApplicationPath ("/v1")
public class ApplicationRootPath extends Application{}
//ResourceConfig