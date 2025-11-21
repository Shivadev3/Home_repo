package sample_collection;

import java.util.ArrayList;
import java.util.Iterator;

public class SampleArray_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> a=new ArrayList<String>();
a.add("black");
a.add("suv");
a.add("yello");
a.add("muscle");
a.add("white");
System.out.println(a);

ArrayList<String> b=new ArrayList<String>();
b.add("audi");
b.add("bmw");
b.add("benz");
b.add("porsche");
b.add("vw");
System.out.println(b);
//addAll
System.out.println(a.addAll(b));
System.out.println(a);
//ContainsAll
System.out.println(a.containsAll(b));
System.out.println(b.containsAll(a));
//isempty
System.out.println(a.isEmpty());
//size
System.out.println(a.size());
Iterator<String>it=a.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
it.remove();
System.out.println(a);
	}

}
