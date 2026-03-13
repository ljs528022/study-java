package com.app.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.app.config.DBConnecter;
import com.app.domain.CompanyVO;
import com.app.enumeration.Status;

public class CompanyDAO {
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
//	추가
	public void save(CompanyVO companyVO) {
		StringBuilder stringBuilder = new StringBuilder();
		String query = null;
		
		stringBuilder.append("insert into tbl_company ");
		stringBuilder.append("(company_name, company_address, company_phone, company_type)");
		stringBuilder.append("values (?, ?, ?, ?)");
		
		query = stringBuilder.toString();
		
		connection = DBConnecter.getConnection();

		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, companyVO.getCompanyName());
			preparedStatement.setString(2, companyVO.getCompanyAddress());
			preparedStatement.setString(3, companyVO.getCompanyPhone());
			preparedStatement.setString(4, companyVO.getCompanyType().getValue());
			
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("save(CompanyVO) SQL문 오류 발생");
		} finally {
	         try {
	             if(preparedStatement != null) {
	                preparedStatement.close();
	             }
	             if(connection != null) {
	                connection.close();
	             }
	          } catch (SQLException e) {
	             e.printStackTrace();
	             throw new RuntimeException();
	          }
	    }
	}
//	수정
	public void setCompany(CompanyVO companyVO) {
		StringBuilder stringBuilder = new StringBuilder();
		String query = null;
		
		stringBuilder.append("update tbl_company ");
		stringBuilder.append("set company_name = ?, company_address = ?, company_phone = ?, company_type = ? ");
		stringBuilder.append("where id = ?");
		
		query = stringBuilder.toString();
		
		connection = DBConnecter.getConnection();

		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, companyVO.getCompanyName());
			preparedStatement.setString(2, companyVO.getCompanyAddress());
			preparedStatement.setString(3, companyVO.getCompanyPhone());
			preparedStatement.setString(4, companyVO.getCompanyType().getValue());
			preparedStatement.setLong(5, companyVO.getId());
			
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("save(CompanyVO) SQL문 오류 발생");
		} finally {
	         try {
	             if(preparedStatement != null) {
	                preparedStatement.close();
	             }
	             if(connection != null) {
	                connection.close();
	             }
	          } catch (SQLException e) {
	             e.printStackTrace();
	             throw new RuntimeException();
	          }
	    }
	}
	
//	삭제
	// soft
	public void setStatus(Long id) {
	      StringBuilder stringBuilder = new StringBuilder();
	      String query = null;
	      
	      stringBuilder.append("update tbl_company ");
	      stringBuilder.append("set company_status = ? ");
	      stringBuilder.append("where id = ?");
	      
	      query = stringBuilder.toString();
	      
	      connection = DBConnecter.getConnection();
	      try {
	         preparedStatement = connection.prepareStatement(query);
	         preparedStatement.setString(1, Status.DISABLE.getValue());
	         preparedStatement.setLong(2, id);
	         preparedStatement.executeUpdate();
	         
	      } catch (SQLException e) {
	         e.printStackTrace();
	         System.out.println("setStatus(Long) SQL 오류");
	      } finally {
	         try {
	            if(preparedStatement != null) {
	               preparedStatement.close();
	            }
	            if(connection != null) {
	               connection.close();
	            }
	         } catch (SQLException e) {
	            e.printStackTrace();
	            throw new RuntimeException();
	         }
	      }
	   }
	// hard
	public void delete(Long id) {
	      StringBuilder stringBuilder = new StringBuilder();
	      String query = null;
	      
	      stringBuilder.append("delete from tbl_company ");
	      stringBuilder.append("where id = ?");
	      
	      query = stringBuilder.toString();
	      
	      connection = DBConnecter.getConnection();
	      
	      try {
	         preparedStatement = connection.prepareStatement(query);
	         preparedStatement.setLong(1, id);
	         preparedStatement.executeUpdate();
	         
	      } catch (SQLException e) {
	         e.printStackTrace();
	         System.out.println("delete(Long) SQL 오류");
	      } finally {
	         try {
	            if(preparedStatement != null) {
	               preparedStatement.close();
	            }
	            if(connection != null) {
	               connection.close();
	            }
	         } catch (SQLException e) {
	            e.printStackTrace();
	            throw new RuntimeException();
	         }
	      }
	   }
	
//	조회
	public Optional<CompanyVO> findById(Long id) {
		StringBuilder stringBuilder = new StringBuilder();
	      String query = null;
	      CompanyVO company = null;
	      
	      stringBuilder.append("select id, company_name, company_address, company_phone, company_type, company_status, created_datetime, updated_datetime ");
	      stringBuilder.append("from tbl_company ");
	      stringBuilder.append("where id = ?");
	      
	      query = stringBuilder.toString();
	      
	      connection = DBConnecter.getConnection();
	      try {
	         preparedStatement = connection.prepareStatement(query);
	         preparedStatement.setLong(1, id);
	         resultSet = preparedStatement.executeQuery();
	         
	         if(resultSet.next()) {
	            company = new CompanyVO();
	            
	            company.setId(resultSet.getLong("id"));
	            company.setCompanyName(resultSet.getString("company_name"));
	            company.setCompanyAddress(resultSet.getString("company_address"));
	            company.setCompanyPhone(resultSet.getString("company_phone"));
	            company.setCompanyType(resultSet.getString("company_type"));
	            company.setCompanyStatus(resultSet.getString("company_status"));
	            company.setCreatedDatetime(resultSet.getString("created_datetime"));
	            company.setUpdatedDatetime(resultSet.getString("updated_datetime"));
	         }
	      } catch (SQLException e) {
	         e.printStackTrace();
	         System.out.println("findById(Long) SQL 오류");
	      } finally {
	         try {
	            if(preparedStatement != null) {
	               preparedStatement.close();
	            }
	            if(connection != null) {
	               connection.close();
	            }
	         } catch (SQLException e) {
	            e.printStackTrace();
	            throw new RuntimeException();
	         }
	      }
	      
	      return Optional.ofNullable(company);
	}
	
//	목록
	public List<CompanyVO> findAll() {
		StringBuilder stringBuilder = new StringBuilder();
	    String query = null;
	    CompanyVO company = null;
	    List<CompanyVO> companies = new ArrayList<CompanyVO>();
	    
	    stringBuilder.append("select id, company_name, company_address, company_phone, company_type, company_status, created_datetime, updated_datetime ");
	    stringBuilder.append("from tbl_company ");
	      
	    query = stringBuilder.toString();
	    
	    connection = DBConnecter.getConnection();
	    try {
	    	preparedStatement = connection.prepareStatement(query);
	    	resultSet = preparedStatement.executeQuery();
	    	while(resultSet.next()) {
	            company = new CompanyVO();
	            
	            company.setId(resultSet.getLong("id"));
	            company.setCompanyName(resultSet.getString("company_name"));
	            company.setCompanyAddress(resultSet.getString("company_address"));
	            company.setCompanyPhone(resultSet.getString("company_phone"));
	            company.setCompanyType(resultSet.getString("company_type"));
	            company.setCompanyStatus(resultSet.getString("company_status"));
	            company.setCreatedDatetime(resultSet.getString("created_datetime"));
	            company.setUpdatedDatetime(resultSet.getString("updated_datetime"));
	            
	            companies.add(company);
		    }
		} catch (SQLException e) {
			e.printStackTrace();
	        System.out.println("findAll() SQL 오류");
		} finally {
	         try {
	             if(preparedStatement != null) {
	                preparedStatement.close();
	             }
	             if(connection != null) {
	                connection.close();
	             }
	          } catch (SQLException e) {
	             e.printStackTrace();
	             throw new RuntimeException();
	          }
	       }
	       
	       return companies;
	}
}
