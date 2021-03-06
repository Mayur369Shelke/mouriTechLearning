package javaBasics;
import javax.swing.JOptionPane;

public class ProblemStatment {
	
	
	public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }
	
	public static boolean isStrongNumber(int num) {
        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            sum += factorial(num % 10);
            num /= 10;
        }

        return sum == originalNum;
    }
	
	public static void main(String[] args) {
	
	String a = JOptionPane.showInputDialog("please enter value ");
	int b = Integer.parseInt(a);
	
	
	
	//Find factorial===============================================
	
	int c=1;
	for (int i=1; i<=b;i++) {
		c = c*i;
	}

	System.out.println("factorial of "+b+" is ==" +c);
	
	System.out.println("factorial using pre define static method is =="+factorial(b));
	
	
	//reverse the number===================================
	
	int reverse = 0;   
	while(b!=0)
	{  
	int remainder = b % 10;  
	reverse = reverse * 10 + remainder;
	b=b/10;
	}  
	System.out.println("The reverse of the given number is: " + reverse);   
	
	
	//check it is palinrome or not 
	
	if(b==reverse) {
		System.out.println(b+" is a palindrome number");
	}
	else {
		System.out.println(b+" is not a palindrome number");
	}
	
	
	//perfect Number 
		long sum=0;    
		int i=1;  
		
		while(i <= b/2)  
		{  
		if(b % i == 0)  
		{  
		
			sum = sum + i;  
		}
		i++;  
		} 
		if(sum==b)  
		{   
		System.out.println(b+" is a perfect number.");  
		} 
		else  {  
		System.out.println(b+" is not a perfect number.");   
		}  
		
		
		// find Strong number 
		if (isStrongNumber(b)) {
			System.out.println(b+" is a Strong number");
		}
		
		else {
			System.out.println(b+"  is no a Strong number");
		}
		
		
	
	
	
}
}

