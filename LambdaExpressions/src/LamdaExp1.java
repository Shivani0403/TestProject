interface Name
{
	public void show();
}
public class LamdaExp1 {
	public static void main(String[] args) {
		Name na = () -> {System.out.println("My name is Shivani G Shirodkar");};
		//Name na = () ->System.out.println("My name is Shivani G Shirodkar");
		na.show();
	}

}
