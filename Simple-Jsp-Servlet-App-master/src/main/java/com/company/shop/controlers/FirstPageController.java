package com.company.shop.controlers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.shop.model.ProductDto;
import com.company.shop.model.UserDto;
import com.company.shop.services.ProductService;
import com.company.shop.services.UserService;

/**
 * Servlet implementation class FirstPageController
 */
@WebServlet("/FirstPage")
public class FirstPageController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final String FIRSTPAGE_VIEW = "FirstPage.jsp";
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(FIRSTPAGE_VIEW);
		dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
