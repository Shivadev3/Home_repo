package access_specifier2;

import access_specifier.Access_Specifier;

public class Access_Specifier2outside extends Access_Specifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Access_Specifier2outside obj1=new Access_Specifier2outside();
	obj1.protectedmethod();
	obj1.publicmethod();
	Access_Specifier obj2=new Access_Specifier();
	obj2.publicmethod();
	// obj2.protected();cannot accessible with parent class

	}

}
