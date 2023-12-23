package sevlet_crud.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sevlet_crud.dao.StudentDao;

@WebServlet("/deleteById")
public class DeleteById extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		int cid=Integer.parseInt(id);
		
		 StudentDao dao =new StudentDao();
         String o =dao.deleteById(cid);
         resp.getWriter().print(o);
	}

}
