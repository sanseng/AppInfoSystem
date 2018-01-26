package cn.appsys.dao.appversion;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.appsys.pojo.AppVersion;

/**
 * App版本信息映射接口 对应数据库中的 app_version 表
 * 
 * @author Administrator
 * 
 */

public interface AppVersionMapper {
	/**
	 * 根据appId查询相应的app版本列表
	 * 
	 * @param appId
	 * @return
	 */
	List<AppVersion> getAppversionListByAppId(@Param("appId") Integer appId)
			throws Exception;

	/**
	 * 新增app版本信息
	 * 
	 * @param appVersion
	 * @return
	 * @throws Exception
	 */
	int add(AppVersion appversion) throws Exception;

	/**
	 * 根据appversionId 查找AppVersion信息
	 * 
	 * @param appVersionId
	 * @return getAppVersionById AppVersion
	 * @throws Exception
	 */
	AppVersion getAppVersionById(@Param("id") int appVersionId)
			throws Exception;

	/**
	 * 修改appVersion版本信息
	 * 
	 * @param appVersion
	 * @return
	 * @throws Exception
	 */

	int modify(AppVersion appyVersion) throws Exception;

	/**
	 * 根据id删除apkfile
	 * 
	 * @param id
	 * @return
	 */

	int deleteApkFile(@Param("id") int id) throws Exception;

	/**
	 * 根据app id 查询是否有app版本信息
	 * 
	 * @param id
	 * @return
	 */
	int getVersionCountByAppId(@Param("appId") int appId) throws Exception;

	/**
	 * 根据appId 删除appVersion信息
	 * 
	 * @param id
	 * @return
	 */
	int deleteAppVersionByAppId(@Param("appId") int appId) throws Exception;

}
