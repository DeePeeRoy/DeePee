package packageTest.testing;

import java.util.Scanner;

public class Test
{
    public static void main(String[] args)
    {
        int firstNum, secondNum;
        Scanner keyboard = new Scanner(System.in);
         
        System.out.println("Enter an integer: ");
        firstNum = keyboard.nextInt();
         
        System.out.println("Enter another integer larger than the first one: ");
        secondNum = keyboard.nextInt();
        System.out.println(": ");
       
 
     
        for(int i = firstNum; i <= secondNum; i++){
        	System.out.println(">>>>>>>>>>>>>>>>>>>>");
            if (i % 2 !=0)
            	System.out.print(i);
            }
    }

    }
