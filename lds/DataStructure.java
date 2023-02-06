package com.hc.lds;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class DataStructure {
	public static void main(String[] args) throws Exception {
		Server server=new Server(8080);
		WebAppContext appContext=new WebAppContext();
		appContext.setResourceBase("src/main/webapp");
		appContext.setContextPath("/");
		server.setHandler(appContext);
		server.start();
		server.join();
	}

}
