package cn.appsys.service.backenduser;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.appsys.dao.backenduser.BackenduserMapper;
import cn.appsys.pojo.BackendUser;

@Service
public class BackenduserServiceImpl implements BackenduserService {

	@Resource
	private BackenduserMapper backendUserMapper;

	@Override
	public BackendUser login(String userCode, String userPassword)
			throws Exception {
		// TODO Auto-generated method stub
		BackendUser user = null;
		user = backendUserMapper.getLoginUser(userCode);
		if (null != user) {// 登录成功
			if (!userPassword.equals(user.getUserPassword())) {
				user = null;
			}
		}
		return user;
	}

}
