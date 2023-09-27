package controllerTree;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helpers.TreeHelper;
import models.Tree;

/**
 * Servlet implementation class ShowTrees
 */
@WebServlet("/showTrees")
public class ShowTrees extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowTrees() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		TreeHelper helper = new TreeHelper();
		
		List<Tree> treeList = helper.showAllTrees();

		request.setAttribute("allTrees", treeList);
		
		String path = "/show.jsp";
		
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}


}
