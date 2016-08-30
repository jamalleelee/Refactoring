package com.zooservlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.myzoo.Animal;
import com.myzoo.DAO;

/**
 * Servlet implementation class AddToDBForm
 */
@WebServlet("/AddToDBForm")
public class AddToDBForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddToDBForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Animal addToDB= new Animal();
		
		addToDB.setAnimalSpecies(request.getParameter("species"));
		addToDB.setAnimalName(request.getParameter("name"));
		addToDB.setAnimalColor(request.getParameter("color"));
		addToDB.setAnimalFood(request.getParameter("food"));
		addToDB.setAnimalEnclosure(request.getParameter("enclosure"));
		addToDB.setAnimalWeight(Double.parseDouble(request.getParameter("weight")));
		
		DAO.writeToDB(addToDB);
		
	}

}
