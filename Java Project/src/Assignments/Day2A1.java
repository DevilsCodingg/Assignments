package Assignments;

public class Day2A1 {
	//((((10+2)+2)-2)*2/2)
	
	public int sum(int a1, int a2, int a3) {
		int a4;
		a4 = a1+a2+a3;
		return a4;
		
	}
	public int sub(int b1, int b2) {
		int b3;
		b3 = b1-b2;
		return b3;
	}
	public int mul(int c1, int c2) {
		int c3;
		c3 = c2 * c1;
		return c3;	
	}
	public void div(int d1, int d2) {
		int d3;
		d3 = d1/ d2;
		System.out.println("final result is "+d3);
	}
	public static void main(String[] args) {
		Day2A1 obj = new Day2A1();
		int A1 = obj.sum(10,2,2);
		int B1 = obj.sub(A1,2);
		int C1 = obj.mul(B1, 2);
		obj.div(C1, 2);
	}
}
