package cn.appsys.dao.appinfo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.appsys.pojo.AppInfo;

/**
 * 关于app维护的映射接口
 * 
 * @author hasee
 * 
 */
public interface AppinfoMapper {
	/**
	 * 根据软件名称,APP状态,所属平台,一级分类,二级分类,三级分类,开发者id,进行模糊查询
	 * 
	 * @param querySoftwareName
	 *            : 软件名称
	 * @param queryStatus
	 *            : App状态
	 * @param queryCategoryLevel1
	 *            :一级分类
	 * @param queryCategoryLevel2
	 *            :二级分类
	 * @param queryCategoryLevel3
	 *            :三级分类
	 * @param queryFlatformId
	 *            : app所属平台id
	 * @param devId
	 *            :开发者id
	 * @param currentPageNo
	 *            :当前页码
	 * @param pageSize
	 *            :页面显示的记录数
	 * @return
	 * @throws Exception
	 */
	List<AppInfo> getInfoList(
			@Param(value = "softwareName") String querySoftwareName,
			@Param(value = "status") Integer queryStatus,
			@Param(value = "categoryLevel1") Integer queryCategoryLevel1,
			@Param(value = "categoryLevel2") Integer queryCategoryLevel2,
			@Param(value = "categoryLevel3") Integer queryCategoryLevel3,
			@Param(value = "flatformId") Integer queryFlatformId,
			@Param(value = "devId") Integer devId,
			@Param(value = "from") Integer currentPageNo,
			@Param(value = "pageSize") Integer pageSize) throws Exception;

	/**
	 * 根据软件名称,app状态,一级分类,二级分类,三级分类,app所属平台,开发者id 获取总记录数
	 * 
	 * @param querySoftwareName
	 *            :软件名称
	 * @param queryStatus
	 *            :app状态
	 * @param queryCategoryLevel1
	 *            :一级分类
	 * @param queryCategoryLevel2
	 *            :二级分类
	 * @param queryCategoryLevel3
	 *            :三级分类
	 * @param queryFlatformId
	 *            :app所属平台
	 * @param devId
	 *            :开发者id
	 * @return
	 * @throws Exception
	 */
	int getAppInfoCount(
			@Param(value = "softwareName") String querySoftwareName,
			@Param(value = "status") Integer queryStatus,
			@Param(value = "categoryLevel1") Integer queryCategoryLevel1,
			@Param(value = "categoryLevel2") Integer queryCategoryLevel2,
			@Param(value = "categoryLevel3") Integer queryCategoryLevel3,
			@Param(value = "flatformId") Integer queryFlatformId,
			@Param(value = "devId") Integer devId) throws Exception;

	/**
	 * 根据AppInfo id 已经APK名称获取 appinfo
	 * 
	 * @param id
	 * @param APKName
	 * @return
	 * @throws Exception
	 */
	AppInfo getAppInfo(@Param("id") Integer id, @Param("APKName") String APKName)
			throws Exception;

	/**
	 * 新增app基础信息
	 * 
	 * @param appInfo
	 * @return
	 */

	int add(AppInfo appInfo) throws Exception;

	/**
	 * 根据id删除appInfo logo图片以及图片路径
	 * 
	 * @param id
	 * @return
	 */

	int deleteAppLogo(@Param("id") int id) throws Exception;

	/**
	 * 根据id修改AppInfo 信息
	 * 
	 * @param appInfo
	 * @return modify
	 * @throws Exception
	 */

	int modify(AppInfo appInfo) throws Exception;

	/**
	 * 根据appId，更新最新versionId
	 * 
	 * @param versionId
	 * @param appId
	 *            updateVersionId
	 * @return
	 * @throws Exception
	 */

	int updateVersionId(@Param("versionId") Integer versionId,
			@Param("id") Integer appId) throws Exception;
	
	/**
	 * 根据id删除appinfo信息
	 * @param id
	 * @return
	 */
	
	int deleteAppinfoById(@Param("id") int id)throws Exception;
	
	/**
	 * 根据id更新appInfo的status
	 * @param status
	 * @param id
	 * @return
	 * @throws Exception
	 */
	
	int updateStatus(@Param("status") Integer status,
					@Param("id") Integer id) throws Exception;

}
