import java.util.Scanner;
public class LineComparison2 {
	double Length()
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int x=(a-c)*(a-c);
		int y=(b-d)*(b-d);
		double z=Math.sqrt(x+y);
		return z;
	}
	void comp()
	{	System.out.println("Enter the coordinates of first line");
		String p=String.valueOf(Length());
		System.out.println("Enter the coordinates of second line");
		String q=String.valueOf(Length());
		if(p.compareTo(q)==0)
		{
			System.out.println("THE TWO LINES ARE EQUAL");
		}
		else if(p.compareTo(q)<0)
		{
			System.out.println("THE FIRST LINE IS SMALLER IN LENGTH COMPARED TO THE SECOND LINE");
		}
		else if(p.compareTo(q)>0)
		{
			System.out.println("THE FIRST LINE IS LARGER IN LENGTH COMPARED TO THE SECOND LINE");
		}
	}
	
	public static void main (String a0rgs[])
	{
		LineComparison2 l=new LineComparison2();
		Scanner sc=new Scanner(System.in);
		l.comp();	
	}
}