package exception_package;

public class Exception_Class {

	public static void main(String[] args) {
		
try
{
	// TODO Auto-generated method stub

int a=1;
int b=0;
int c=a/b;
System.out.println(c);
}
catch(ArithmeticException l)
{
	System.out.println("exception handled");
}
finally
{
	System.out.println("important code");

}


/*int a[]= {2,3,5,8,9};

for(int i=0;i<=6;i++)
{
	System.out.println(a[i]);
}*/
/*String a=null;
System.out.println(a.length());*/
		
	}

}
