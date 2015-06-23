package net.shinc.orm.mybatis.bean;

import org.springframework.security.core.GrantedAuthority;

/**
 * @author zhangtaichao 2015年5月25日
 * 后台管理用户权限
 */
public class ManageUserAuthority implements GrantedAuthority {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4919829783648029654L;
	private String authority;

	@Override
	public String getAuthority() {
		return this.authority;
	}

	@Override
	public String toString() {
		return this.authority;
	}
	
	

}
