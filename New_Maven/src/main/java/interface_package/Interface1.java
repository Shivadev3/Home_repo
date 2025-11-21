package interface_package;

public class Interface1 implements Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Interface1 obj=new Interface1();
obj.sum();
Interface obj1=new Interface1();//reference
obj1.sum();
obj1.show();
Interface.difference(5, 7);
System.out.println(obj.a);
	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
	int a=3;
	int b=4;
	int c=a+b;
	System.out.println(c);
	}

}
