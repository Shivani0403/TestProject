
import java.util.LinkedList;
public class Lambdaforeach {

	public static void main(String[] args) {

		LinkedList<String> l1=new LinkedList<String>();
		l1.add("Shivani");
		l1.add("radhika");
		l1.add("akshara");
		l1.add("shreejeet");
		l1.forEach((n)->{System.out.println(n);});

	}

}