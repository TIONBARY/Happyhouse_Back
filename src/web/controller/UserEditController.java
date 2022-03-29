package web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import web.dao.UserDAO;
import web.util.MyException;
import web.vo.UserVO;

public class UserEditController implements Controller{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws MyException, IOException, ServletException {
		response.setContentType("text/html;charset=utf-8");
		
		String id = request.getParameter("user_info_id");
		String pw = request.getParameter("user_info_password");
		String name = request.getParameter("user_info_name");
		String email = request.getParameter("user_info_email");
		int age = Integer.parseInt(request.getParameter("user_info_age"));
		
        UserVO userVO = new UserVO(id, pw, name, email, age);
        System.out.println(userVO);                    
        
        UserDAO memberDAO = UserDAO.getInstance();
        
        memberDAO.userEdit(userVO);
        

	}

}
