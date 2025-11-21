package encapsulation;

public class Encaps_Child {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Encaps_Parent obj1=new Encaps_Parent();
obj1.setSubject("maths");
obj1.setMark(30);
System.out.println(obj1.getSubject());
System.out.println(obj1.getMark());
	}

}
