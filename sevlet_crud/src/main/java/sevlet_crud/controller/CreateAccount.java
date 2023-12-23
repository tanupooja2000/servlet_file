package sevlet_crud.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sevlet_crud.dao.StudentDao;
import sevlet_crud.dto.StudentDto;

// Servlet class or controller class
@WebServlet("/insert")
public class CreateAccount extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id=req.getParameter("id");
		int cid = Integer.parseInt(id);
		String name=req.getParameter("name");
		String email=req.getParameter("email");
		String phone_no=req.getParameter("phone_no");
		long cphone_no=Long.parseLong(phone_no);
		String dob=req.getParameter("dob");
		String gender=req.getParameter("gender");
		String country=req.getParameter("country");
		String account=req.getParameter("account");
		
		StudentDto dto = new StudentDto();
		dto.setId(cid);
		dto.setName(name);
		dto.setEmail(email);
		dto.setPhone_no(cphone_no);
		dto.setDob(dob);
		dto.setGender(gender);
		dto.setCountry(country);
		dto.setAccount(account);
		
		
		StudentDao dao = new StudentDao();
		String msg=dao.insert(dto);
		resp.getWriter().print(msg);
		
	}
	

}
