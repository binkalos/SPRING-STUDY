package mybatisExam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;


import mybatis.Singer;

public class Test1 {
	private SqlSession sqlSession;
	
	public Test1(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	public void selectone() {
		int count = sqlSession.selectOne("exam.test.SingerMapper.getSingerCount");
		System.out.println("그룹 명수:" + count);
	}
	public void selectone1(String name) {
		int count= sqlSession.selectOne("exam.test.SingerMapper.getSingerMember",name);
		System.out.println("그룹 명수:" + count);
	}
	public void selectone2(int member) {
		String name = sqlSession.selectOne("exam.test.SingerMapper.getStringMember2",member);
		System.out.println("그룹 이름:" + name);
	}
	public void selectone3(String name,int member) {
		Map<String,Object>paramMap=new HashMap<String, Object>();
		paramMap.put("name",name);
		paramMap.put("member",member);
		String rname=sqlSession.selectOne("exam.test.SingerMapper.getsingerNameMember",paramMap);
		System.out.println(member+"명 그룹이름(map이용)"+name);
	}
	
	public void selectone4(Singer singer) {
		Singer rsinger=sqlSession.selectOne("exam.test.SingerMapper.getSinger",singer);
		System.out.println(rsinger);
	}
	
	public void insert(Singer singer) {
		int num=sqlSession.insert("exam.test.SingerMapper.insertSinger",singer);
		System.out.println(num+"개의 레코드 삽입됨");
	}
	
	public void selectlist(int member) {
		List<Singer>singers=sqlSession.selectList("exam.test.SingerMapper.getSingers",member);
		for(Singer singer:singers) {
			System.out.println("그룹 이름:" + singer.getName());
		}//for
	}
	
	public void update(Singer singer) {
		int num1 = sqlSession.update("exam.test.SingerMapper.updateSinger",singer);
		System.out.println(num1+"개의 레코드 수정");
	}
	
	public void delete(String name) {
		int num2=sqlSession.delete("exam.test.SingerMapper.deleteSinger",name);
		System.out.println(num2+"개의 레코드 수정");
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx=new GenericXmlApplicationContext("mapper/bean.xml");
		Test1 test1 = ctx.getBean("test1",Test1.class);
		test1.selectone();
		test1.selectone1("비투비");
		test1.selectone2(2);
		test1.selectone3("비투비",7);
		test1.selectone4(new Singer("비투비",7));
		
		test1.insert(new Singer("미림걸",7));
		test1.selectlist(7);
		test1.update(new Singer("미림걸",6));
		test1.delete("미림걸");
	}

}
