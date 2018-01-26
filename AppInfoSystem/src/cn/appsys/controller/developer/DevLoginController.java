package cn.appsys.controller.developer;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.appsys.pojo.DevUser;
import cn.appsys.service.developer.DevUserService;
import cn.appsys.tools.Constants;

@RequestMapping(value="/dev")
@Controller
public class DevLoginController {
	private Logger logger = Logger.getLogger(DevLoginController.class);
	@Resource
	private DevUserService devUserService;
	/**
	 * 用户登录
	 * @return
	 */
	@RequestMapping(value="/login")
	public String login(){
		logger.info("loggin====>");
		return "devlogin";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * 验证用户登录
	 * @return
	 */
	@RequestMapping(value="/dologin",method=RequestMethod.POST)
	public String doLogin(@RequestParam("devCode") String devCode,
						@RequestParam("devPassword") String devPassword,
						HttpServletRequest request,HttpSession session){
		logger.info("DevLogginController =dologgin====>");
		DevUser user = null;
		try {
			user = devUserService.login(devCode, devPassword);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(null != user){//登录成功
			//将用户信息存入session中
			session.setAttribute(Constants.DEV_USER_SESSION, user);
			//页面跳转到主页面
			return "redirect:/dev/flatform/main";
		}else{
			request.setAttribute("error", "用户名或者密码有误!!");
			return "devlogin";
		}
	}
	/**
	 * 注销开发者用户信息
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/logout")
	public String logout(HttpSession session){
		logger.info("dev Logout===>");
		session.removeAttribute(Constants.DEV_USER_SESSION);
		return "devlogin";
	}
	
	/**
	 * 开发者平台主页面
	 * @param session
	 * @return
	 */
	
	@RequestMapping(value="/flatform/main")
	public String main(HttpSession session){
		logger.info("DevLoginController:main==>");
		if(null == session.getAttribute(Constants.DEV_USER_SESSION)){
			return "redirect:/dev/login";
		}
		return "developer/main";
	}
	

}
