package co.kr.kd.join.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.kr.kd.join.dao.JoinDao;
import co.kr.kd.join.vo.JoinVO;

@Repository
public class JoinService {

	@Autowired
	JoinDao joinDao;
	
	public void insertMember(JoinVO joinVO) {
		
		
		joinDao.insertMember(joinVO);
		
		System.out.println(joinVO.getId());
		System.out.println(joinVO.getName());
		System.out.println(joinVO.getPw());
		
		
	}

}
