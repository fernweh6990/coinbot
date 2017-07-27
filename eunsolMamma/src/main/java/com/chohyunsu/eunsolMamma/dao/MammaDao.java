package com.chohyunsu.eunsolMamma.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chohyunsu.eunsolMamma.model.MammaDetail;

@Repository
public class MammaDao {
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	public List<MammaDetail> getMammaDetailDao(String str){
		List<MammaDetail> mammaDetailData = sqlSession.selectList("mammaDetailSelect");
		
		return mammaDetailData;
		
	}
	
	public List<MammaDetail> getMammaDailyDao(String str){
		List<MammaDetail> mammaDailyData = sqlSession.selectList("mammaDailySelect");
		
		return mammaDailyData;
		
	}
	
	
	
	public int insertMammaDao(MammaDetail mamma){
		int resultInt = sqlSession.insert("insertMilk",mamma);
		
		return resultInt;
		
	}
	
}
