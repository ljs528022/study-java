package com.app.enumeration;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum CompanyType {
	STARTUP("스타트업"), SMALL("중소기업"), MIDSIZE("중견기업"), LARGE("대기업");
	
	private final String value;
	
	private static final Map<String, CompanyType> COMPANY_TYPE_MAP =
			Stream.of(CompanyType.values())
			.collect(Collectors.toMap(CompanyType::getValue, Function.identity()));

	private CompanyType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return value;
	}
			
	public static CompanyType getEnum(String value) {
		return COMPANY_TYPE_MAP.get(value);
	}
			
	
}
