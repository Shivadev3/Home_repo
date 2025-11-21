package access_specifier;

public class Access_Specifier2 extends Access_Specifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Access_Specifier2 obj1=new Access_Specifier2();
obj1.protectedmethod();
obj1.publicmethod();
obj1.method();
//obj1.privatemethod(); private method is not visible outside class
	}

}
