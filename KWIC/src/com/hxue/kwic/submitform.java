package com.hxue.kwic;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class submitform
 */
@WebServlet("/submitform")
public class submitform extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public submitform() {
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
		// TODO Auto-generated method stub
		//doGet(request, response);
		String inputvalue = request.getParameter("inputvalue");
		PrintWriter writer = response.getWriter();
		KWIC newkwic = new KWIC();
		String output =  "<button onclick=\"window.history.back();\n"
				+ "\">Go Back</button>\n"
				+ "<h1>Result</h1>\n"
				+ "    <form action=\"submitform\" method=\"post\">\n"
				+ "     <input name=\"inputvalue\" value = \"" +newkwic.KWIC(inputvalue)+ "\"style=\"min-height: 150px; width: 80%;\"></input>\n"
				+ "    <br>\n"
				+ "    <p style=\"margin-top: 20\"></p>\n"
				+ "        <input type=\"submit\" id=\"outputbutton\" value=\"Output\" />\n"
				+ "    \n"
				+ "</form>\n"
				+ "    \n"
				+ "    <textarea id=\"outputvalue\" style=\"min-height: 150px; width: 80%;\"></textarea>\n"
				+ "    \n";
		writer.println(output);
		writer.close();
	}

}
