package fr.info.requetes;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.info.model.Etudiant;

/**
 * Servlet implementation class ListEtudiants
 */
@WebServlet("/ListEtudiants")
public class ListEtudiants extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private EntityManagerFactory emf = Persistence.createEntityManagerFactory("DevTech");   
    
    public ListEtudiants() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//EntityManager em = emf.createEntityManager();		
		//try {
			//List<Etudiant> ef = em.createNamedQuery("findAllEtudiants",Etudiant.class).getResultList();	
			//if(!ef.isEmpty()) {
			//request.setAttribute("ef", ef);
			//RequestDispatcher	 rd = request.getRequestDispatcher("listEtudiants.jsp");
			RequestDispatcher	 rd = request.getRequestDispatcher("erreur404.jsp");
			rd.forward(request, response);
			//}
			//else {
				//RequestDispatcher	 rd = request.getRequestDispatcher("index.jsp");
				//rd.forward(request, response);
			//}
		//}
		//catch (Exception e) {
			//System.out.println(e.getMessage());
		//}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
