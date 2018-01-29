package com.chohyunsu.eunsolMamma.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.chohyunsu.eunsolMamma.model.MammaDetail;
import com.chohyunsu.eunsolMamma.service.*;


@Controller
public class MammaController {


	private static Logger logger = LoggerFactory.getLogger(MammaController.class);
	@Autowired
	private MammaService mammaService;

	@RequestMapping(value = "getMammaDetail.do", method = RequestMethod.GET)
	public @ResponseBody List<MammaDetail> getMammaDetailCtr(HttpServletRequest request) {
		
		List<MammaDetail> mammaDetailData = mammaService.getMammaDetailSvc("input");

		return mammaDetailData;

	}
	
	

	@RequestMapping(value = "getMammaDaily.do", method = RequestMethod.GET)
	public @ResponseBody List<MammaDetail> getMammaDailyCtr(HttpServletRequest request) {
		
		List<MammaDetail> mammaDailyData = mammaService.getMammaDailySvc("input");

		return mammaDailyData;

	}
	

	@RequestMapping(value = "insertMamma.do", method = RequestMethod.POST)
	public @ResponseBody int insertMammaCtr(@RequestBody MammaDetail mamma) {

		int resultInt = mammaService.insertMammaSvc(mamma);

		return resultInt;
	}

}
