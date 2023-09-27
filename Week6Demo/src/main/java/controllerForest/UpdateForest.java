package controllerForest;

import java.io.IOException;
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
 * Servlet implementation class UpdateTree
 */
@WebServlet("/updateForest")
public class UpdateForest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateForest() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ForestHelper helper = new ForestHelper();
		
		String oldName = request.getParameter("oldName");
		String name = request.getParameter("newName");
		String location = request.getParameter("location");

		Forest forestToUpdate = helper.searchForestByName(oldName);
		forestToUpdate.setName(name);
		forestToUpdate.setLocation(location);
		helper.update(forestToUpdate);
		
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
