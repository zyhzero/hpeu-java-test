package com.shixun.atm.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shixun.atm.service.AccountServicelmpl;

/**
 * Servlet implementation class TransferServlet
 */
@WebServlet("/TransferServlet")
public class TransferServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TransferServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	AccountServicelmpl service = new AccountServicelmpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 获取数组索引,jsp页面获取转账人,jsp页面获取转账金额
		int index = (int) request.getSession().getAttribute("accountIndex");
		String targetAccountName = request.getParameter("targetAccountName");
		double transferAmount = Double.parseDouble(request.getParameter("transferAmount"));
		// 调用取款方法，返回值为余额
		double transfer = service.transfer(index, targetAccountName, transferAmount);
		// TODO 警示信息展示不出来
		if (transfer == -1) {
			request.setAttribute("alert", "账户余额不足");
			request.getRequestDispatcher("/transfer.jsp").forward(request, response);
		} else if (transfer == -2) {
			request.setAttribute("alert", "找不到转账用户");
			request.getRequestDispatcher("/transfer.jsp").forward(request, response);
		} else if (transfer == -3) {
			request.setAttribute("alert", "不能转账给自己");
			request.getRequestDispatcher("/transfer.jsp").forward(request, response);
		} else {
			// 【转账成功跳转页面】
			request.setAttribute("transfer", transfer);
			request.getRequestDispatcher("/transferResult.jsp").forward(request, response);
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
