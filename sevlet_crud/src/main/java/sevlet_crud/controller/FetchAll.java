package sevlet_crud.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sevlet_crud.dao.StudentDao;
import sevlet_crud.dto.StudentDto;

@WebServlet("/fetchAll")
public class FetchAll extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StudentDao dao = new StudentDao();
		List<StudentDto> list=dao.fetchAll();
		resp.getWriter().print(list);
	}
}
