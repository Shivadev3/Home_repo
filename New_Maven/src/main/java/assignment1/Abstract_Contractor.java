package assignment1;

public class Abstract_Contractor extends Abstract_Employee {
int workingHours;
public Abstract_Contractor(String name,double paymentperhour,int workingHours)
{
	super(name,paymentperhour);
	this.workingHours=workingHours;
	}
@Override
public double calculatesalary() {
	// TODO Auto-generated method stub
	return paymentperhour*workingHours;
}
	

}
