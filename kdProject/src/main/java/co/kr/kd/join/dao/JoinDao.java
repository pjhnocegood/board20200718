package co.kr.kd.join.dao;

import org.springframework.stereotype.Repository;

import co.kr.kd.join.vo.JoinVO;

@Repository
public interface JoinDao {

	void insertMember(JoinVO joinVO);
	
}
