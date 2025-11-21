package exception_package;

public class Custom_Exception {

	public static void main(String[] args) throws VotingException {
		// TODO Auto-generated method stub
int age=14;
if (age>=18)
{
	System.out.println("eligible");
}
else
{
	throw new VotingException("not eligible");
}
	}

}
