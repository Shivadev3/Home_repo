package access_specifier;

public class Access_Specifier {
public void publicmethod()
{
	System.out.println("this is public");
}
private void privatemethod()
{
	System.out.println("this is private");
}
void method()
{
	System.out.println("this is default");
}
protected void protectedmethod()
{
	System.out.println("this is protected");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Access_Specifier obj1=new Access_Specifier();
obj1.privatemethod();
obj1.protectedmethod();
obj1.publicmethod();
obj1.method();
	}

}
