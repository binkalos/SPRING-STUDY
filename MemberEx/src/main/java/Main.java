import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import exam.member.dao.MemberDao;
import exam.member.dao.MemberDaoImpl;
import exam.member.service.MemberChangeService;
import exam.member.service.MemberChangeServiceImpl;
import exam.member.service.MemberListPrintService;
import exam.member.service.MemberListPrinterServiceImpl;
import exam.member.service.MemberPrinterService;
import exam.member.service.MemberPrinterServiceImpl;
import exam.member.service.MemberRegisterService;
import exam.member.service.MemberResisterServiceImpl;
import exam.member.ui.MemberUI;

public class Main {
	public static void main(String[] args) {
		/*
		MemberDao memberDao = new MemberDaoImpl();
		MemberRegisterService memberRegisterService = 
				new MemberResisterServiceImpl(memberDao);
		MemberUI memberUI = new MemberUI();
		memberUI.setMemberRegisterService(memberRegisterService);
		
		
		MemberPrinterService memberprinterService = 
				new MemberPrinterServiceImpl();
		MemberListPrintService memberListPrintService = 
				new MemberListPrinterServiceImpl(memberDao, memberprinterService);
		
		memberUI.setMemberListPrinterService(memberListPrintService);
		
		MemberChangeService memberChangeService = new MemberChangeServiceImpl(memberDao);
		memberUI.setMemberChangeService(memberChangeService);
		
		memberUI.showMenu();
		*/
		
		ApplicationContext ctx = new GenericXmlApplicationContext("member.xml");
		MemberUI memberUI = ctx.getBean("memberUI",MemberUI.class);
		memberUI.showMenu();
	}
}
