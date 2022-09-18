package bridgeLabz.Development.LineComparision;

import java.util.Scanner;

 class Cartisian{
	 int x1,y1,x2,y2;
	 int length1;
	 int length2;

	 //length of first line
	public void length1(int a,int b,int c,int d) {
		this.x1=a;
		this.y1=b;
		this.x2=c;
		this.y2=d;
		length1=(int) Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("Length of the Line1 is : "+length1);	
	}
	 //length of second line
		public void length2(int p,int q,int r,int s) {
			this.x1=p;
			this.y1=q;
			this.x2=r;
			this.y2=s;
			length2=(int) Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
			System.out.println("Length of the Line2 is : "+length2);
	}
	 //Comparison of two lines using Equals method
		void equalsMethod() {
			String str1=Double.toString(length1);
			String str2=Double.toString(length2);
			if(str1.equals(str2))
				System.out.println("Both Lines are equal");
			else
				System.out.println("Both Lines are not equal");

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
	System.out.println("Enter point x1 value :");
	int p=sc.nextInt();
	System.out.println("Enter point y1 value :");
	int q=sc.nextInt();
	System.out.println("Enter point x2 value :");
	int r=sc.nextInt();
	System.out.println("Enter point y2 value :");
	int s=sc.nextInt();
	Cartisian c1=new Cartisian();
	c1.length1(a,b,c,d);
	c1.length2(p,r,r,s);
	c1.equalsMethod();
}
}
