package exception_package;

public class Throw_Throws {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
int age =14;
if(age>=18)
{
	System.out.println("eligible");
}
else
{
	throw new Exception("not eligible");
}
	}

}
