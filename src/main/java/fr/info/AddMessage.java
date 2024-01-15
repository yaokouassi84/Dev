package fr.info;

import java.io.IOException;
import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.info.model.Message;

/**
 * Servlet implementation class Message
 */
@WebServlet("/AddMessage")
public class AddMessage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private EntityManagerFactory emf = Persistence.createEntityManagerFactory("DevTech");
	
	public AddMessage() {
		super();
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		 try {
			EntityManager em = emf.createEntityManager();

			EntityTransaction tx = em.getTransaction();
			String nom = request.getParameter("nom");
			String email = request.getParameter("email");
			String sujet = request.getParameter("sujet");
			String msg = request.getParameter("msg");

			Message ms = new Message();
			ms.setNom(nom);
			ms.setEmail(email);
			ms.setSujet(sujet);
			ms.setMsg(msg);
			ms.setDateMessage(new Date());
			ms.setHeureMessage(new Date());

			if (nom.equals("") && email.equals("") && sujet.equals("") && msg.equals("")) {

				RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
				rd.forward(request, response);

			} else {
				tx.begin();
				em.persist(ms);
				tx.commit();
				em.close();
				RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
				rd.forward(request, response);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
