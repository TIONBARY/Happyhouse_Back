package web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.dao.UserDAO;
import web.util.MyException;

public class UserRemoveController implements Controller{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws MyException, IOException, ServletException {
		response.setContentType("text/html;charset=utf-8");
		
		String id = request.getParameter("user_info_id");
		System.out.println(id+"------------");
		UserDAO memberDAO = UserDAO.getInstance();
		
		memberDAO.userRemove(id);
	}

}
