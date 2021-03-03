package web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web.model.MemberDAO;
import web.util.Member;
import web.util.MyException;

@WebServlet("/main")
public class MainServlet extends HttpServlet {
	
	MemberDAO mDao;
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		
		 try {
			mDao=new MemberDAO();
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		a(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		a(request,response);
	}
	
	protected void a(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String sign=request.getParameter("sign");
		if(sign==null) {
			return ;
		}else if(sign.equals("login")) {//로그인 처리
			String id=request.getParameter("id");
			String pw=request.getParameter("pw");
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out=response.getWriter();
			try {
				String name=mDao.login(id,pw);
				
				if(name!=null) {
					//login ok
					out.write(name+"님 환영합니다");
				}else {
					//login fail
					out.write("다시 로그인 해주세요<br><a href='login.html' >다시 로그인 하기</a>");
				}
			} catch (MyException e) {
				// login error
				out.write(e.getMessage());
			}
			
			
		}else if(sign.equals("memberInsert")) {//회원가입 처리
			System.out.println(1);
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out=response.getWriter();
			
			String id=request.getParameter("id");
			String pw=request.getParameter("pw");
			String name=request.getParameter("name");
			String [] all_subject=request.getParameterValues("subject");
			
						
			Member m=new Member(id,pw,name,all_subject);
			try {
				mDao.memberInsert(m);
				out.write("회원가입 되셨습니다");
			} catch (MyException e) {
				out.write(e.getMessage());
			}			
		}else if(sign.equals("listMembers")) {//모든 회원 보기 처리
			try {
				List<Member> list=mDao.listMembers();
				//ok
				response.setContentType("text/html;charset=utf-8");
				PrintWriter out=response.getWriter();
				for(Member m:list) {
					out.append(m.getId()+":"+m.getName()+"<br>");
				}
			} catch (MyException e) {
				// fail
				e.printStackTrace();
			}
		}
	}

}