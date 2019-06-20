package exam.member.ui;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import exam.member.service.MemberChangeService;
import exam.member.service.MemberListPrintService;
import exam.member.service.MemberRegisterService;
import exam.member.service.MemberResisterServiceImpl;
import exam.member.vo.RegisterRequest;
@Component("memberUI")
public class MemberUI {
	@Autowired
	MemberRegisterService memberRegisterService;
	@Autowired
	MemberListPrintService memberListPrintService;
	@Autowired
	MemberChangeService memberChangeService;
	
	public MemberUI() {}
	
	public void setMemberRegisterService(MemberRegisterService memberRegisterService) {
		this.memberRegisterService=memberRegisterService;
	}
	public void setMemberListPrinterService(MemberListPrintService memberListPrintService) {
		this.memberListPrintService = memberListPrintService;
	}
	
	public void setMemberChangeService(MemberChangeService memberChangeService) {
		this.memberChangeService = memberChangeService;
	}
	
	public void showMenu(){
		Scanner scan = new Scanner(System.in);
		String command="";
		while(true) {
			System.out.println("명령어 입력:");
			command=scan.nextLine();
			if(command.equalsIgnoreCase("exit")) {
				System.out.println("시스템 종료");
				break;
			}else if(command.toLowerCase().startsWith("new ")) {
				processNewCommand(command.split(" "));
				continue;
			}else if(command.toLowerCase().startsWith("change ")) {
				//비번바꾸기
				processChangeCommand(command.split(" "));
				continue;
			}
			else if(command.equalsIgnoreCase("list")) {
				processNewCommand();
				continue;
			}
		}
	}
	public void processNewCommand(String[] args){
		if(args.length !=5) {
			return;
		}
		RegisterRequest req = new RegisterRequest();
		req.setEmail(args[1]);
		req.setName(args[2]);
		req.setPassword(args[3]);
		req.setConfirmPassword(args[4]);
		
		memberRegisterService.regist(req);
	}
	
	public void processNewCommand() {
		memberListPrintService.printAll();
	}
	
	public void processChangeCommand(String[] args) {
		memberChangeService.changePassword(args[1],args[2],args[3]);
	}
}
