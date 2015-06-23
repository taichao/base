package net.shinc.orm.mybatis.bean;

/**
 * @author zhangtaichao 2015年5月29日
 * 用户与权限对应关系表
 */
public class ManageUserAuthorityBean {
	
	private String username;
	private String authority;
	private String remark;
	
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	

	
}
