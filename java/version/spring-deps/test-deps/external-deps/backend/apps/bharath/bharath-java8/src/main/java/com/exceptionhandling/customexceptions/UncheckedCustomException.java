package com.exceptionhandling.customexceptions;

public class UncheckedCustomException extends RuntimeException{
	
	UncheckedCustomException(String message){
		super(message);
	}

}
