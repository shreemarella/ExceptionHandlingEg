package com.lambton;

public class Person
{
    int salary;
    void setName(String name) throws NullPointerException
    {
        if(name==null)
        {
            throw new NullPointerException("name cannot be null");
        }

        System.out.println(" name length = "+ name.length());
    }

    public void setSalary(int salary) throws SalaryException
    {
        if(salary<1000)
        {
            throw new SalaryException("salary <1000");
        }
        this.salary=salary;
    }
}
