package com.chohyunsu.eunsolMamma.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chohyunsu.eunsolMamma.dao.*;
import com.chohyunsu.eunsolMamma.model.MammaDetail;

@Service
public class MammaService {
	@Autowired
	private MammaDao mammaDao;

	public List<MammaDetail> getMammaDetailSvc(String str) {

		List<MammaDetail> mammaDetailData = mammaDao.getMammaDetailDao(str);

		return mammaDetailData;
	}

	public List<MammaDetail> getMammaDailySvc(String str) {

		List<MammaDetail> mammaDailyData = mammaDao.getMammaDailyDao(str);

		return mammaDailyData;
	}

	public int insertMammaSvc(MammaDetail mamma) {

		int resultInt = mammaDao.insertMammaDao(mamma);

		return resultInt;
	}

}
