package practice;

public class A {

	//static member
	public static int staticCount = 0;
	
	//instance member
	public int instanceCount = 0;
	
	
	public A() {
		staticCount++;
		this.instanceCount++;
	}
	
	public static int getStaticCount() {
		return A.staticCount;
	}
	
	public int getInstanceCount() {
		return this.instanceCount;
	}
}
