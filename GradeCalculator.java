import java.util.*;
class GradeCalculator
{
	public static void main(String[]args)
	{
		double sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of subjects:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the mark of subject"+" "+i+" "+":");
			double marks =sc.nextInt();
			sum=sum+marks;
		}
		char grade;
		double averagePercentage= sum/n;
		if(averagePercentage>=90)
			grade='A';
		else if(averagePercentage>=80)
			grade='B';
		else if(averagePercentage>=70)
			grade='C';
		else if(averagePercentage>=60)
			grade='D';
		else if(averagePercentage>=50)
			grade='E';
		else
			grade='F';
		
		System.out.println("Total Marks:"+sum);
		System.out.println("Average Percentage:"+averagePercentage+"%");
		System.out.println("Grade:"+grade);
	}
}
