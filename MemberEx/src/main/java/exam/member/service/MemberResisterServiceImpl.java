package exam.member.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import exam.member.dao.MemberDao;
import exam.member.vo.MemberVo;
import exam.member.vo.RegisterRequest;
@Component
public class MemberResisterServiceImpl implements MemberRegisterService {
	private MemberDao memberDao;
	@Autowired
	public MemberResisterServiceImpl(MemberDao memberDao) {
		this.memberDao=memberDao;
	}
	@Override
	public void regist(RegisterRequest req) {
		// TODO Auto-generated method stub
		//1.기존에 같은 이메일 있느지 확인하고 있으면 안되고 없으면 Dao
		MemberVo member=memberDao.selectByEmail(req.getEmail());
		if(member!=null) {
			//이미 가입되어 있는 상황
		}
		MemberVo newMember=new MemberVo(req.getEmail(),req.getPassword(),req.getName(),new Date());
		memberDao.insert(newMember);
	}
}
