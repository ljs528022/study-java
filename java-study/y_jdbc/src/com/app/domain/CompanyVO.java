package com.app.domain;

import java.util.Objects;

import com.app.enumeration.CompanyType;
import com.app.enumeration.Status;

public class CompanyVO {
	private Long id;
	private	String companyName;
	private String companyAddress;
	private String companyPhone;
	private CompanyType companyType;
	private Status companyStatus;
	private String createdDatetime;
	private String updatedDatetime;

	public CompanyVO() {;}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getCompanyPhone() {
		return companyPhone;
	}

	public void setCompanyPhone(String companyPhone) {
		this.companyPhone = companyPhone;
	}

	public CompanyType getCompanyType() {
		return companyType;
	}
	
	public void setCompanyType(CompanyType companyType) {
		this.companyType = companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = CompanyType.getEnum(companyType);
	}

	public Status getCompanyStatus() {
		return companyStatus;
	}
	
	public void setCompanyStatus(Status companyStatus) {
		this.companyStatus = companyStatus;
	}

	public void setCompanyStatus(String companyStatus) {
		this.companyStatus = Status.getEnum(companyStatus);
	}

	public String getCreatedDatetime() {
		return createdDatetime;
	}

	public void setCreatedDatetime(String createdDatetime) {
		this.createdDatetime = createdDatetime;
	}

	public String getUpdatedDatetime() {
		return updatedDatetime;
	}

	public void setUpdatedDatetime(String updatedDatetime) {
		this.updatedDatetime = updatedDatetime;
	}

	@Override
	public String toString() {
		return "CompanyVO [id=" + id + ", companyName=" + companyName + ", companyAddress=" + companyAddress
				+ ", companyPhone=" + companyPhone + ", companyType=" + companyType + ", companyStatus=" + companyStatus
				+ ", createdDatetime=" + createdDatetime + ", updatedDatetime=" + updatedDatetime + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompanyVO other = (CompanyVO) obj;
		return Objects.equals(id, other.id);
	}
}
