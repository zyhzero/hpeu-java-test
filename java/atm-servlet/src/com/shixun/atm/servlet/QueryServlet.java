package com.shixun.atm.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shixun.atm.service.AccountServicelmpl;

/**
 * Servlet implementation class QueryServlet
 */
@WebServlet("/QueryServlet")
public class QueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public QueryServlet() {
		super();
	}

	AccountServicelmpl service = new AccountServicelmpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int index = (int) request.getSession().getAttribute("accountIndex");
		// 调用查询余额方法
		double query = service.queryBalance(index);
		// 赋值
		request.setAttribute("query", query);
		request.getRequestDispatcher("/query.jsp").forward(request, response);

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
