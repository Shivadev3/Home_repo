package aggregation;

public class Aggregation_Child {
	
	String subject;
	int mark;
	Aggregation_Parent ref;
public Aggregation_Child(String subject,int mark,Aggregation_Parent ref) 
{
this.subject=subject;
this.mark=mark;
this.ref=ref;
}
public void display()
{
System.out.println(mark+subject);	
System.out.println(ref.name+ref.age);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Aggregation_Parent obj=new Aggregation_Parent("sivadev",31);

Aggregation_Child obj1=new Aggregation_Child("maths",30,obj);
obj1.display();
	}

}
