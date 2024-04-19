package com.demo.functionalInterface;

@FunctionalInterface
public interface Account {
	
	public void accountType();
	public default Boolean isActive(String accountType) {
		
		if(accountType=="1") {
			return true;
		} else {
			return false;
		}
		
	}
	
	

}
