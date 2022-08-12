package Assignments;

public class Day2A2 {
	
	public int sub(int a1, int a2) {
		int a4;
		a4 = a1-a2;
		return a4;		
	}
	public int sum(int b1, int b2) {
		int b3;
		b3 = b1+b2;
		return b3;
	}
	public int minn(int z1, int z2) {
		int z3;
		z3 = z1-z2;
		return z3;
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
		Day2A2 obj = new Day2A2();
		int A1 = obj.sub(10,2);
		int B1 = obj.sum(A1,2);
		int Z1 = obj.minn(B1,2);
		int C1 = obj.mul(Z1, 2);
		obj.div(C1, 2);
	}
}

