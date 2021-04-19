package com.ola.Booking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ola.Booking.service.RouteService;
import com.ola.Booking.service.impl.RouteServiceImpl;

@WebServlet("/routes")
public class RouteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	RouteService routeService = new RouteServiceImpl();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//u have userId
		req.setAttribute("rList", routeService.getRoutes()); //all rout info + userId
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/views/routeview.jsp");
        rd.forward(req, resp);
        
       
        
	}

	
}
