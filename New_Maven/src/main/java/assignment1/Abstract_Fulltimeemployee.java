package assignment1;

public class Abstract_Fulltimeemployee extends Abstract_Employee {
public Abstract_Fulltimeemployee(String name, double paymentperhour) {
		super(name, paymentperhour);
		// TODO Auto-generated constructor stub
	}

	@Override
public double calculatesalary() {
		
	// TODO Auto-generated method stub
	return paymentperhour *8;
}

	public static void main(String[] args) {
		Abstract_Contractor obj =new Abstract_Contractor("siva",50,10);
				Abstract_Fulltimeemployee obj1=new Abstract_Fulltimeemployee("Arun",100);
				System.out.println(obj.calculatesalary());
				System.out.println(obj1.calculatesalary());
		// TODO Auto-generated method stub

	}

}
