package com.shixun.atm.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shixun.atm.service.AccountServicelmpl;

/**
 * Servlet implementation class WithdrawServlet
 */
@WebServlet("/WithdrawServlet")
public class WithdrawServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public WithdrawServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	AccountServicelmpl service = new AccountServicelmpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 获取数组索引
		int index = (Integer) request.getSession().getAttribute("accountIndex");
		// jsp页面获取取款金额
		double withdrawAmount = Double.parseDouble(request.getParameter("withdrawAmount"));
		// 调用取款方法
		double withdraw = service.withdraw(index, withdrawAmount);
		if (withdraw == -1) {
			request.setAttribute("alert", "账户余额不足");
			request.getRequestDispatcher("/withdraw.jsp").forward(request, response);
		} else {
			request.setAttribute("withdraw", withdraw);
			request.getRequestDispatcher("/withdrawResult.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
