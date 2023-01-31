package com.assignments;
public class IfThenStatement
{
	public static void main(String args[])
	{
		int testscore = 85;
		char grade;
		
		if (testscore >= 85)
		{
			grade = 'A';
		}
		else if (testscore >= 45)
		{
			grade = 'b';
		}
		else if( testscore >= 44)
		{
			grade = 'c';
		}
		else 
		{
			grade = 'f';
		}
		
	System.out.println("Grade = " + grade);
}
}
