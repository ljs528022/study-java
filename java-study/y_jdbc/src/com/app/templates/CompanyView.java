package com.app.templates;

import com.app.domain.CompanyVO;
import com.app.enumeration.CompanyType;
import com.app.repository.CompanyDAO;

public class CompanyView {
	public static void main(String[] args) {
		CompanyDAO companyDAO = new CompanyDAO();
		CompanyVO companyVO = new CompanyVO();
		
//		companyVO.setId(1L);
//		companyVO.setCompanyName("삼성");
//		companyVO.setCompanyAddress("서울시 강남구 역삼동");
//		companyVO.setCompanyPhone("02-1234-5555");
//		companyVO.setCompanyType(CompanyType.LARGE);
		
		// 추가
//		companyDAO.save(companyVO);
		
		// 수정
//		companyDAO.setCompany(companyVO);
		
		// 삭제(soft)
//		companyDAO.setStatus(1L);

		// 삭제(hard)
//		companyDAO.delete(1L);
		
		// 조회
//		CompanyVO company = companyDAO.findById(2L).orElse(null);
//		System.out.println(company);
		
		// 목록
		companyDAO.findAll().forEach(System.out::println);
		
	}
}
