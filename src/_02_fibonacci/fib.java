package _02_fibonacci;

public class fib {
	public static void main(String[] args) {
	int a=1;
	int b=0;
	int c=1;
	for (int i = 0; i<13; i++) {
		a=b;
		b = c+a;
		c=a;
		System.out.println(b);
	}
	
	}
}
