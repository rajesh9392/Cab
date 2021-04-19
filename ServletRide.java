package com.ola.Booking;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ola.Booking.service.RideService;
import com.ola.Booking.service.impl.RideServiceImpl;

/**
 * Servlet implementation class ServletRide
 */
@WebServlet("/ServletRide")
public class ServletRide extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	RideService rideService = new RideServiceImpl();
	
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("myRides", rideService.getRides()); //all rout info + userId
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/rides.jsp");
        rd.include(request, response);
        
        
    
	}

}
