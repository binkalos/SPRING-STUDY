package exam.member.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import exam.member.dao.MemberDao;
import exam.member.vo.MemberVo;
@Component
public class MemberListPrinterServiceImpl implements MemberListPrintService{
	//Dao클래스 선언
	private MemberDao memberDao;
	private MemberPrinterService memberPrinter;
	
	@Autowired
	public MemberListPrinterServiceImpl(MemberDao memberDao,MemberPrinterService memberPrinter) {
		this.memberDao=memberDao;
		this.memberPrinter = memberPrinter;
	}
	@Override
	public void printAll() {
		Collection<MemberVo> members = memberDao.selectAll();
		for(MemberVo member : members) {
			//프린트 하는거 만들기
			memberPrinter.print(member);
		}
	}
}
