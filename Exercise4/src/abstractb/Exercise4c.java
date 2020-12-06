package abstractb;
import java.text.DecimalFormat;

abstract class Marks{
	abstract double getPercentage(double g);
}

class A extends Marks{
double sub1,sub2,sub3;
	A(double z,double x,double c){
		this.sub1=z;
		this.sub2=x;
		this.sub3=c;
	}
	
	double getPercentage(double g) {
		double aa;
		aa=(g/100)*100;
		return aa;
	}
}

class B extends Marks{
	double sub1,sub2,sub3,sub4;
	B(double z,double x,double c,double v){
		this.sub1=z;
		this.sub2=x;
		this.sub3=c;
		this.sub4=v;
	}
	
	double getPercentage(double g) {
		double bb;
		bb=(g/100)*100;
		return bb;
	}	
}

public class Exercise4c {
	private static DecimalFormat df = new DecimalFormat("0.00");//df.format(double)
	
	public static void main(String[] args) {
		A a= new A(50,94.3,79.5);
		B b= new B(63,69.9,93.7,86.9);
		
		System.out.println("Student A Subject 1 Percentage :"+df.format(a.getPercentage(a.sub1))+"%");
		System.out.println("Student A Subject 2 Percentage :"+df.format(a.getPercentage(a.sub2))+"%");
		System.out.println("Student A Subject 3 Percentage :"+df.format(a.getPercentage(a.sub3))+"%");
		
		System.out.println("Student B Subject 1 Percentage :"+df.format(b.getPercentage(b.sub1))+"%");
		System.out.println("Student B Subject 2 Percentage :"+df.format(b.getPercentage(b.sub2))+"%");
		System.out.println("Student B Subject 3 Percentage :"+df.format(b.getPercentage(b.sub3))+"%");
		System.out.println("Student B Subject 4 Percentage :"+df.format(b.getPercentage(b.sub4))+"%");
	}
}
