package com.lambton;

public class SalaryException extends Exception
{
    private String message;

    public SalaryException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage()
    {
        return message;
    }
}
