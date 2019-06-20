package exam.member.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import exam.member.dao.MemberDao;
import exam.member.vo.MemberVo;
@Component
public class MemberChangeServiceImpl implements MemberChangeService{
	
	private MemberDao memberDao;
	
	@Autowired
	public MemberChangeServiceImpl(MemberDao memberDao) {
		this.memberDao = memberDao;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void changePassword(String email, String oldpassword, String newpassword) {
		MemberVo member = memberDao.selectByEmail(email);
		
		member.changePassword(oldpassword, newpassword);
		memberDao.update(member);
	}
}
