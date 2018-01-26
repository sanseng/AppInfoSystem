package cn.appsys.service.backenduser;

import cn.appsys.pojo.BackendUser;

/**
 * 后台管理用户业务层  对应数据库中的 backend_user 表
 * @author Administrator
 *
 */
public interface BackenduserService {
	/**
	 * 验证后台管理用户 是否登录
	 * @param userCode
	 * @param userPassword
	 * @return
	 * @throws Exception
	 */
	BackendUser login(String userCode,String userPassword) throws Exception;
}
