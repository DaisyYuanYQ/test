package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Service.selectServiceImpl;
import com.entity.Bean;

public class Register extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		boolean Flag = true;
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		
		selectServiceImpl dao = new selectServiceImpl();
		List<Bean> list = dao.SelectDao();
		
		PrintWriter out = response.getWriter();
		
		for (Bean bean : list) {
			if (bean.getName().equals(name)) {
				out.write("name");
				Flag=false;
				break;
			} else if (bean.getPass().equals(pass)) {
				out.write("pass");
				Flag=false;
				break;
			}
		}

		if (Flag) {
			Bean b = new Bean(name, pass);
			try {
				int result = dao.insert(b);
				if (result > 0) {
					out.write("ok");
				} else {
					out.write("error");
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

	}

}
