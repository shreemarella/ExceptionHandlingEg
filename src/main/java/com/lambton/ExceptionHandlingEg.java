package com.lambton;

import java.util.Arrays;

public class ExceptionHandlingEg
{
    public static void main(String[] args) {
        System.out.println("START");
        int d = 10;
        int n = 20;
        int a[]=new int[]{1,2,3};
        String s="Hello";
        Person p=new Person();

        try {
            int fraction = n / d;
            System.out.println("Fraction : " + fraction);
            System.out.println("Array Value :"+a[2]);
            System.out.println("Length of String :" +s.length());

            p.setName("Thank You");
            p.setSalary(500);

        }
        catch (ArithmeticException e)
        {
            System.out.println("Error :" +e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error aiobe : " +e.toString());
        }

        catch (NullPointerException e)
        {
            System.out.println("other  NPE : " +e.getMessage());
        }
        catch (SalaryException e)
        {
            System.out.println("Error  : " +e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println("other  : " +e.toString());
        }
        finally
        {
            System.out.println("I am in finally block");
        }
        System.out.println("END");
    }
}
