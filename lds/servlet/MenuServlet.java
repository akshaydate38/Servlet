package com.hc.lds.servlet;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hc.DataClass.Menu;
import com.hc.lds.MenuStore;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class MenuServlet extends HttpServlet{
	private ObjectMapper mapper = new ObjectMapper();

	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp)throws SecurityException, IOException{
		String path = req.getPathInfo();
		System.out.println(path);
		String []s1= null;
		String s = "";
		if(path != null && !path.isEmpty()) {
			s1 = path.split("/");
			s = s1[1];
			System.out.println(s);
		}
		switch(s) {
		case "display":
			String menuName = s1[2];
			System.out.println(menuName);
			switch(menuName) {
			case "stack":
				Menu stackMenu = MenuStore.INSTANCE.getStackMenu();
				String stackJson = mapper.writeValueAsString(stackMenu);
				System.out.println(stackJson);
				resp.getWriter().append(stackJson).flush();
				System.out.println("In stack case...");
				break;

			case "queue":
				Menu queueMenu = MenuStore.INSTANCE.getQueueMenu();
				String queueJson = mapper.writeValueAsString(queueMenu);
				resp.getWriter().append(queueJson).flush();
				System.out.println("In queue case...");
				break;

			case "array":
				Menu arrayMenu = MenuStore.INSTANCE.getArrayMenu();
				String arrayJson = mapper.writeValueAsString(arrayMenu);
				resp.getWriter().append(arrayJson).flush();
				System.out.println("In array case...");
				break;

			case "linklist":
				Menu linklistMenu = MenuStore.INSTANCE.getLinkMenu();
				String linklistJson = mapper.writeValueAsString(linklistMenu);
				resp.getWriter().append(linklistJson).flush();
				System.out.println("In linklist case...");
				break;

			case "main":
				Menu maiMenu = MenuStore.INSTANCE.getMainMenu();
				String mainJson = mapper.writeValueAsString(maiMenu);
				resp.getWriter().append(mainJson).flush();
				break;
			}
			break;
		default:
			resp.getWriter().append("Operation not supported").flush();
			break;
		}
	}
}
