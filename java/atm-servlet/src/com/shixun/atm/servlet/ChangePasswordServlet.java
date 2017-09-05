package com.shixun.atm.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shixun.atm.service.AccountServicelmpl;

/**
 * Servlet implementation class ChangePasswordServlet
 */
@WebServlet("/ChangePasswordServlet")
public class ChangePasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ChangePasswordServlet() {
		super();
	}

	AccountServicelmpl service = new AccountServicelmpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 获取数组索引
		int index = (int) request.getSession().getAttribute("accountIndex");
		// jsp页面获原密码和新密码
		String originalPassword = request.getParameter("originalPassword");
		String newPassword = request.getParameter("newPassword");
		// 调用取款方法
		int changePassword = service.changePassword(index, originalPassword, newPassword);
		if (changePassword == 0) {
			request.getRequestDispatcher("/changePasswordResult.jsp").forward(request, response);
		} else {
			request.setAttribute("alert", "原密码错误");
			request.getRequestDispatcher("/changePassword.jsp").forward(request, response);
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
