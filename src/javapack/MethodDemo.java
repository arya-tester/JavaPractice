package javapack;

public class MethodDemo {
	public static void main(String[] args) {
		
		MethodDemo md=new MethodDemo();
		
		doLogin();
		doLogin();
		doLogin();
		md.doLogout();
		diffParams("arya", 29, 90000);
		
		System.out.println(md.sameParams(5,10));
	}
	public static void doLogin() {
		System.out.println("Logged in successfully");
	}
	public static void doLogout() {
		System.out.println("Logged out successfully");
	}
	public int sameParams(int x,int y) {
		int z=x+y;
		return z;
		
	}
	public static void diffParams(String name,int age,float salary) {
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
	}

}
