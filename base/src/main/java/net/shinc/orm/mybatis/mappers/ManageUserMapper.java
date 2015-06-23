package net.shinc.orm.mybatis.mappers;

import java.util.LinkedHashMap;
import java.util.List;

import net.shinc.orm.mybatis.bean.ManageUserBean;

/**
 * @author zhangtaichao 2015年5月28日
 * 后台管理用户mapper
 */
public interface ManageUserMapper {
	
	
	public List<ManageUserBean> selectUser(ManageUserBean param);
	
	public Integer selectUserCount(ManageUserBean param);
	
	public void insertManageUser(ManageUserBean user);
	
	
	/*
	 * 删除用户
	 */
	public void deleteManageUser(String name);
	
	/*
	 * 查询所有
	 */

	public List<ManageUserBean> selectUserRole(ManageUserBean param);
	
	public Integer selectUserRoleCount(ManageUserBean param);
	
	public List<String> selectRemarkList(LinkedHashMap<String, String> param);
}
