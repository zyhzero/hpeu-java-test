package com.shixun.atm.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.shixun.atm.service.AccountServicelmpl;

@WebServlet(urlPatterns="/LoginServlet",loadOnStartup=2)
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
		service.initAccounts();
	}

	AccountServicelmpl service = new AccountServicelmpl();

	// TODO 密码错误清空文本框,输入错误密码会报错
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 获取文本框中的用户名密码
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		// 比对返回值进行页面跳转
		int accountIndex = service.login(username, password);
		if (accountIndex == -1) {
			request.setAttribute("alert", "用户名或密码不正确");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		} else {
			HttpSession session = request.getSession();
			session.setAttribute("accountIndex", accountIndex);
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
