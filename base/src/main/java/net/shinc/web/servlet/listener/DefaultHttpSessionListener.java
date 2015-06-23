package net.shinc.web.servlet.listener;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DefaultHttpSessionListener implements HttpSessionListener {
	
	private int timeout = 3;

	private Logger logger = LoggerFactory.getLogger(getClass());
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		logger.debug("session created");
		HttpSession s = se.getSession();
		if (s != null) {
			s.setMaxInactiveInterval(timeout * 60);
			logger.info(se.getSession().getMaxInactiveInterval() + "");
		}
		
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		logger.debug("session created");
	}

	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	
}
