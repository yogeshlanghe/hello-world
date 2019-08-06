package simpleprograms;

import java.util.Scanner;


public class Mathematics {

	int addition(int num1,int num2)
	{
		return num1 + num2;
	}
	
	int substraction(int num1,int num2)
	{
		return num1 - num2;
	}
	int multiplication(int num1,int num2)
	{
		return num1*num2;
	}
	int division(int num1,int num2)
	{
		try
		{
		 return	num1/num2;
		}
		catch(ArithmeticException exc)
		{
			System.out.println("Denominator should not be zero");
			return 0;
		}
	}
	int reverseNumber(int num1)
	{
		int revNum=0;
		while(num1%10>0)
		{
			revNum=revNum*10;
			revNum=revNum+num1%10;
			num1=num1/10;
		}
		return revNum;
	}
	
	boolean pallindrom(int num1)
	{
		return (num1==reverseNumber(num1));
	}
	
	void pattern(int num1)
	{
		for(int index=0;index<num1;index++)
		{
			for(int index1=1;index1<=num1-index;index1++)
			{
				System.out.print(index1);
			}
			for(int indexSpace=index;indexSpace>0;indexSpace--)
			{
				if(indexSpace>1)
				System.out.print(" ");
				System.out.print(" ");
			}
			for(int index2=num1-index;index2>0;index2--)
			{
				if(index2!=num1)
				{
					System.out.print(index2);
				}
			}
		if(index<num1-1)	
			System.out.println();	
		}
		for(int index=num1;index>=0;index--)
		{
			for(int index1=1;index1<=num1-index;index1++)
			{
				if(num1-index==1)
					continue;
				System.out.print(index1);
			}
			for(int indexSpace=index;indexSpace>0;indexSpace--)
			{
				if(num1-index==1)
					continue;
			
				if(indexSpace>1)
				System.out.print(" ");
				System.out.print(" ");
			}
			for(int index2=num1-index;index2>0;index2--)
			{
				if(num1-index==1)
					continue;
				if(index2<num1)
				System.out.print(index2);
			}
			if(num1-index==1)
				continue;		
		System.out.println();	
		}
	}
	void displayInput(int num1,int num2)
	{
		System.out.println("Number 1:"+num1);
		System.out.println("Number 2:"+num2);
	}
	void fibonacii(int term)
	{
		int next=1;
		int prev=0;
		int temp=0;
		for(int index=1;index<=term;index++)
		{
			
			next=temp+next;
				System.out.print("\t"+next);
			temp=prev;
			prev=next;	
		}
		System.out.println();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int choice=-1;
		int num1=0;
		int num2=0;
		Mathematics maths=new Mathematics();
		Scanner sc=new Scanner(System.in);
		
		do
		{
			try
			{
			
			System.out.println("************************************************************************************");
				
				System.out.println("0.Exit the program");
				System.out.println("1.Change input");
				System.out.println("2.Addition");
				System.out.println("3.Substraction");
				System.out.println("4.Multiplication");
				System.out.println("5.Division");
				System.out.println("6.Reverse");
				System.out.println("7.Palindrom");
				System.out.println("8.Pattern");
				System.out.println("9.Display Input");
				System.out.println("10.Fibonacii series");
				System.out.println("************************************************************************************");
				
				System.out.println("Enter your choice");
				choice=sc.nextInt();
				 
				switch (choice) {
				case 0:
						System.exit(0);
				case 1:
					System.out.println("Enter first number");	
					num1=sc.nextInt();
					System.out.println("Enter second number");
					num2=sc.nextInt();
					break;
				case 2:
					System.out.println("Addition : "+maths.addition(num1, num2));
						break;
				case 3:
					System.out.println("Substraction :"+maths.substraction(num1, num2));
						break;
				case 4:
					System.out.println("Multiplication :"+maths.multiplication(num1, num2));
						break;
				case 5:
					System.out.println("Division :"+maths.division(num1, num2));
						break;
				
				case 6:
					System.out.println("Reverse is "+maths.reverseNumber(num1));
					break;
				case 7:
					if(maths.pallindrom(num1))
						System.out.println("Number is pallindrom");
					else
						System.out.println("Number is not pallindrom");
					break;
				case 8:
					maths.pattern(num1%10);
					break;
				case 9:
					maths.displayInput(num1,num2);
					break;
				case 10:
					System.out.println("Enter term");
					int term=sc.nextInt();
					maths.fibonacii(term);
					break;
				default:
						System.out.println("Enter valid choice");
					
					break;
				}
				System.out.println("************************************************************************************");
				
			}
			catch(Exception e)
			{
				
				System.out.println("Error:"+e.getMessage());
			}
		}while(choice>0);
	
			
	}

}
