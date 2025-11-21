package interface_package;

public class Multi_Interface implements InterfaceParent1,InterfaceParent2 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Multi_Interface obj=new Multi_Interface();
obj.display();
Multi_Interface obj1=new Multi_Interface();
obj1.show();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
	System.out.println("intp 1");	
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
	System.out.println("intp 2");	
	}

}
