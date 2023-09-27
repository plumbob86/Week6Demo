package controllerForest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helpers.ForestHelper;
import helpers.TreeHelper;
import models.Forest;
import models.Tree;

/**
 * Servlet implementation class ShowTrees
 */
@WebServlet("/forest/showForest")
public class ShowForest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowForest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ForestHelper helper = new ForestHelper();
		
		List<Forest> forestList = helper.showAllForests();

		request.setAttribute("allForests", forestList);
		
		String path = "/forest/show.jsp";
		
		getServletContext().getRequestDispatcher(path).forward(request, response);
	}


}
