package assignment;

public class Aggregation_Child {
String address;	
Aggregation_Parent ref;
public Aggregation_Child(String address,Aggregation_Parent ref)
{
	this.address=address;
	this.ref=ref;
}
public void display()
{
	System.out.println(address);
	System.out.println(ref.name+ref.rollnumber);
}
	public static void main(String[] args) {

	// TODO Auto-generated method stub
Aggregation_Parent obj=new Aggregation_Parent("sivadev",44);		
Aggregation_Child obj1=new Aggregation_Child("sakthikulangara",obj);
obj1.display();
	}

}
