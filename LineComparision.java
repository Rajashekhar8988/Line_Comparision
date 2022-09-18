package bridgeLabz.Development.LineComparision;

import java.util.Scanner;

 class Cartisian{
	 int x1;
     int y1;
	 int x2;
	 int y2;
	public void length(int a,int b,int c,int d) {
		this.x1=a;
		this.y1=b;
		this.x2=c;
		this.y2=d;
		double length=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("Length of the Line is : "+length);		
	}
	
}
  class LineComparision {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter point x1 value :");
	int a=sc.nextInt();
	System.out.println("Enter point y1 value :");
	int b=sc.nextInt();
	System.out.println("Enter point x2 value :");
	int c=sc.nextInt();
	System.out.println("Enter point y2 value :");
	int d=sc.nextInt();
	Cartisian c1=new Cartisian();
	c1.length(a,b,c,d);
	
}
}
