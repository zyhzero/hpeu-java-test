package com.shixun.atm.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shixun.atm.service.AccountServicelmpl;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

/**
 * Servlet implementation class DepositServlet
 */
@WebServlet("/DepositServlet")
public class DepositServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DepositServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	AccountServicelmpl service = new AccountServicelmpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获取数组索引
		int index = (int) request.getSession().getAttribute("accountIndex");
		//jsp页面获取存款金额
		double depositAmount=Double.parseDouble(request.getParameter("depositAmount")) ;
		//调用存款方法
		double deposit= service.deposit(index,depositAmount);
		request.setAttribute("deposit",deposit);
		request.getRequestDispatcher("/depositResult.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
