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
 * Servlet implementation class AddTree
 */
@WebServlet("/addForest")
public class AddForest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddForest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Forest t = new Forest();
		ForestHelper helper = new ForestHelper();
		t.setName(request.getParameter("name"));
		t.setLocation(request.getParameter("location"));
		helper.persist(t);
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
