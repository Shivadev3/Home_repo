package sample_collection;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> k=new HashSet<String>();
k.add("oxygen");
k.add("hydrogen");
k.add("silicon");
k.add("helium");
k.add("boron");
System.out.println(k);
Set<String> l=new HashSet<String>();
l.add("earth");
l.add("neptune");
l.add("uranus");
l.add("jupitor");
l.add("titan");

System.out.println(l);
//addAll
System.out.println(k.addAll(l));
System.out.println(k);
//contains()
System.out.println(k.contains("silicon"));
//containsAll
System.out.println(k.containsAll(l));
//isEmpty
System.out.println(k.isEmpty());
//Size
System.out.println(k.size());
//remove()
System.out.println(k.remove("helium"));
System.out.println(k);
//clear()
k.clear();
System.out.println(k);

	}

}
