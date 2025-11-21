package sample_collection;

import java.util.ArrayList;
import java.util.List;

public class Sample_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> li=new ArrayList<String>();
System.out.println(li);
//add
li.add("red");
li.add("black");
li.add("green");
li.add("black");
System.out.println(li);
//indexOf
System.out.println(li.indexOf("green"));
System.out.println(li.indexOf("black"));
//LastIndexOf
System.out.println(li.lastIndexOf("black"));
System.out.println(li.indexOf("yellow"));
//contains()
System.out.println(li.contains("black"));
//remove()
System.out.println(li.remove(2));
System.out.println(li);
System.out.println(li.remove("black"));
System.out.println(li);
//get()
System.out.println(li.get(0));

for(int i=0;i<=1;i++)
{
	System.out.println(li.get(i));
}
for(String j:li)
{
	System.out.println(j);
}

	}

}

