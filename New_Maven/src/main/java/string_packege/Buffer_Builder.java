package string_packege;

public class Buffer_Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer p=new StringBuffer("hello world ");
System.out.println(p);
StringBuilder p1=new StringBuilder("hii");
System.out.println(p1);
//insert
System.out.println(p.insert(12, p1));
System.out.println(p);
//append
System.out.println(p.append("hello"));
System.out.println(p.replace(5, 10, " good"));
System.out.println(p.reverse());
System.out.println(p1.delete(0, 2));
	}

}
