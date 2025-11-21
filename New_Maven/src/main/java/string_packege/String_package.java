package string_packege;

public class String_package {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s="hi";
  System.out.println(s);
  String s1=new String("hello");
  System.out.println(s1);
  //length()
  System.out.println(s.length());
  //concat()
  System.out.println(s.concat(s1));
  //charAt()
  System.out.println(s.charAt(1));
  //contains()
  String s2=new String("how are you");
  System.out.println(s2.contains("you"));
  System.out.println(s.contains(s2));
  String s3="java";
  String s4="java";
  String s5="Java";
  String s6="Selenium";
  //equals()
  System.out.println(s3.equals(s4));
  System.out.println(s4.equals(s5));
  System.out.println(s4.equals(s6));
  //equalsIgnoreCase()
  System.out.println(s3.equalsIgnoreCase(s5));
  System.out.println(s4.toUpperCase());
  System.out.println(s5.toLowerCase());
  System.out.println(s5.isEmpty());
  String d="";
  System.out.println(d.isEmpty());
  int l=33;
  System.out.println(String.valueOf(33));
  String m="manual";
  String m0="manual";
  String m1=new String("manual");
  System.out.println(m.equals(m0));
  System.out.println(m==m0);
  System.out.println(m.equals(m1));
  System.out.println(m==m1);
  
 
	}

}
