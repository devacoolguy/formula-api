package com.homebrew.formula.exception;

import java.time.LocalDateTime;

public class FormulaNotFoundResponse {
	private String message;
	private int code;
    private LocalDateTime dateTime;
    
    public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public LocalDateTime getDateTime() {
        return dateTime;
    }
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }    
}
