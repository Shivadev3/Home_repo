package assignment1;

public abstract class Abstract_Employee {
String name;
double paymentperhour;

public Abstract_Employee(String name,double paymentperhour)
{
this.name=name;
this.paymentperhour=paymentperhour;
}

public abstract double calculatesalary();
}
