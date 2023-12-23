package sevlet_crud.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sevlet_crud.dao.StudentDao;

@WebServlet("/fetchById")
public class FectchById extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         String id = req.getParameter("id");
         int cid=Integer.parseInt(id);
         System.out.println(cid);
         
         
         StudentDao dao =new StudentDao();
         Object o =dao.fetchById(cid);
         resp.getWriter().print(o);
	}
}
