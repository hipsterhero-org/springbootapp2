package com.example.herokutest.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AccountDto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7808034089989786546L;
	
	private Long id;
	private String uuid;
	private String name;
	private String accountNumber;

}
