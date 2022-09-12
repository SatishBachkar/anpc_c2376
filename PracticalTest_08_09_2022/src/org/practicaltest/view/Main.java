package org.practicaltest.view;
import org.practicaltest.model.*;
public class Main {
	
	public static Product getProductNameStartingWithA(Product product[]){
	
		Product pd = new Product();
		for(int i=0; i<product.length ;i++) {
			product[i].getId();
			if(product[i].getId()== 1 ) {
			System.out.println(product[i]);
			}
		}
		
		return pd; 
	}

	public static void main(String[] args) {
		
		Product obj1 = new Product(3,"ABC");
		Product obj2 = new Product(2,"IJK");
		Product obj3 = new Product(1,"XYZ");
		Product obj4 = new Product(4,"SDF");
		Product obj5 = new Product(5,"DFR");
		
		Product productArr[] = {obj1,obj2,obj3,obj4,obj5};
		
		getProductNameStartingWithA(productArr);

		
	}

}
