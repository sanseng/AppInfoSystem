package cn.appsys.dao.backenduser;

import org.apache.ibatis.annotations.Param;

import cn.appsys.pojo.BackendUser;

public interface BackenduserMapper {
	/**
	 * 根据后台管理用户的编码得到用户信息
	 * @param userCode
	 * @return
	 * @throws Exception
	 */	
	BackendUser getLoginUser(@Param("userCode")String userCode) throws Exception;
}
