package cn.appsys.service.developer;

import cn.appsys.pojo.DevUser;

/**
 * 开发者用户业务层
 * @author Administrator
 *
 */
public interface DevUserService {
	/**
	 * 根据用户编码验证用户登录信息
	 * @param devCode
	 * @param devPassword
	 * @return
	 * @throws Exception
	 */
	DevUser login(String devCode,String devPassword) throws Exception;
}
