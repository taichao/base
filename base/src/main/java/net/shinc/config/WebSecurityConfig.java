package net.shinc.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.ObjectPostProcessor;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	
    	
    	
    	http
        .authorizeRequests()
            .anyRequest().permitAll()
            .and()
        .formLogin()
	        .withObjectPostProcessor(new ObjectPostProcessor<LoginUrlAuthenticationEntryPoint>() {
	
				@Override
				public <O extends LoginUrlAuthenticationEntryPoint> O postProcess(
						O laep) {
					laep.setUseForward(true);
					return laep;
				}
			})
            .loginPage("/login")
            .permitAll()
            .and()
        .logout()
        	.logoutUrl("/logout")
            .permitAll()
            .and()
         .csrf()
         	.disable();
    	
    }
    
    
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        
      auth.inMemoryAuthentication().withUser("admin").password("admin").authorities("ROLE_ADMIN");
        	
        	
    }
    
   
}