
package javacollections2;
import java.util.*;   
public class ArrayListDemo {
	public static void main(String args[]) {
		ArrayList<String>list1=new ArrayList();
		
		list1.add("java");              //insert the value in a list
		list1.add("python");
		list1.add("C");
		list1.add("C++");
		list1.add("PHP");
		list1.add(".Net");
		System.out.println("Following are List of Programing Langauges::"+"\n"+list1);
		
		list1.remove(0);          // delete the value in a list
		list1.remove(3);
		
		System.out.println("After deleting index:: "+list1+" Size of list: "+list1.size());

}
}