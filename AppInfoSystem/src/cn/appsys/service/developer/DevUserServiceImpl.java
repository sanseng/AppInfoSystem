package cn.appsys.service.developer;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.appsys.dao.devuser.DevUserMapper;
import cn.appsys.pojo.DevUser;
import cn.appsys.service.developer.DevUserService;

@Service
public class DevUserServiceImpl implements DevUserService {
	@Resource
	private DevUserMapper devUserMapper;
	@Override
	public DevUser login(String devCode, String devPassword) throws Exception {
		DevUser user = null;
		user = devUserMapper.getLoginUser(devCode);
		if(null != user){//登录成功
			
			//验证密码
			if(!devPassword.equals(user.getDevPassword())){
				user = null;
			}
		}
		return user;
	}

}
