package com.company.shop.controlers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.company.shop.model.ProductDto;
import com.company.shop.model.UserDto;
import com.company.shop.services.ProductService;
import com.company.shop.services.UserService;

@WebServlet("/home")
public class HomeController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final String HOME_VIEW = "home.jsp";


	UserService userService = new UserService();

	ProductService productService = new ProductService();
	
	private int itemId;
	private List<ProductDto> availableProducts = productService.getListAvailableProducts();
     static List<ProductDto> cartProducts = new ArrayList<>();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		UserDto user = userService.getCurrentLoggedInUser();
		request.setAttribute("user", user);

		List<ProductDto> availableProducts = productService.getListAvailableProducts();
		request.setAttribute("products", availableProducts);

		RequestDispatcher dispatcher = request.getRequestDispatcher(HOME_VIEW);
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		HttpSession session = request.getSession();
		
		
	
		itemId = Integer.parseInt(request.getParameter("selections"));

			for(ProductDto product: availableProducts ){
				if(product.getId()==  itemId && !cartProducts.contains(product)){
					cartProducts.add(product);
					product.setQuantity(1);
			
				
					
				}else if(product.getId() ==  itemId && cartProducts.contains(product)){
					product.increaseQuantity();
					
					
					
				}
	
		}
		session.setAttribute("cartProducts", cartProducts);
		
		response.sendRedirect("home");

}
	}


