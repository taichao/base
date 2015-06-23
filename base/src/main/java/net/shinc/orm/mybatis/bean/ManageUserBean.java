package net.shinc.orm.mybatis.bean;

import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author zhangtaichao 2015年5月29日
 * 后台用户表
 */
public class ManageUserBean{

	private int id;
	
	@NotEmpty(message="{username.not.empty}")
	private String username;
	
	@NotEmpty(message="{password.not.empty}")
	private String password;
	
	@NotEmpty(message="{manageUserType.not.empty}")
	private String type;
	
	private List<String> authorities;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<String> getAuthorities() {
		return authorities;
	}
	public void setAuthorities(List<String> authorities) {
		this.authorities = authorities;
	}
	
	
	
}
