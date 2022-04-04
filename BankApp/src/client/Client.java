
package client;
import com.tnsif.Application.GSNormalAcc;
import com.tnsif.Application.GSPrimeAcc;
import com.tnsif.Application.GSShopFactory;
public class Client {
	public static void main(String args[]) {
		//step 1
		GSShopFactory gsft=new GSShopFactory();
		gsft.getNewPrimeAccount(123, "Shivani Shirodkar", 4000.00f, true);
		gsft.getNewNormalAccount(213, "Shivani Shirodkar ", 3443, 30);
		
		//step 2
	  
		GSPrimeAcc  gspa=new GSPrimeAcc (123,"Shivani",1000, false);
		gspa.bookProduct(1000);
		gspa.getAccNm();
		gspa.getAccNo();
		gspa.getCharges(); 
		gspa.toString();
		
		GSNormalAcc gsna=new GSNormalAcc(213,"Shivani", 1000, 50);
		gsna.bookProduct(1000);
		gsna.getAccNm();
		gsna.getAccNo(); 
		gsna.getDeliveryCharges();
		gsna.toString();
		
	}

}