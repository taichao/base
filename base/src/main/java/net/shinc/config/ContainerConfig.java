package net.shinc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSessionListener;

import net.shinc.web.servlet.filter.LoggingFilter;
import net.shinc.web.servlet.listener.DefaultHttpSessionListener;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;

@Configuration
public class ContainerConfig implements WebApplicationInitializer {
	
	@Value("${session.timeout.minutes}")
	private int sessionTimeout;
	
	@Bean
	public LoggingFilter loggingFilter() {
		return new LoggingFilter();
	}
	
	
	@Bean
	public HttpSessionListener defaultSessionListener() {
		DefaultHttpSessionListener sl = new DefaultHttpSessionListener();
		sl.setTimeout(sessionTimeout);
		return sl;
	}

	@Override
	public void onStartup(ServletContext servletContext)
			throws ServletException {
		if(servletContext != null) {
			servletContext.addFilter("defaultloggingFilter", loggingFilter());
			servletContext.addListener(defaultSessionListener());
		}
		
	}
}
