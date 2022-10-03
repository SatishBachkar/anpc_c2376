package question4.main;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import question4.model.*;

public class Main {

	public static void main(String[] args) {
		Product obj1 = new Product(1,"Sansilk",90.00);
		Product obj2 = new Product(2,"Dove",120.00);
		Product obj3 = new Product(3,"Clinic plus",190.00);
		Product obj4 = new Product(4,"Himalaya",110.00);
		Product obj5 = new Product(5,"Lorial",260.00);
		
		List<Product> pdList = new ArrayList<Product>();
		pdList.add(obj1);
		pdList.add(obj2);
		pdList.add(obj3);
		pdList.add(obj4);
		pdList.add(obj5);
		
		
	  Product maxPriceProduct = pdList.stream().max((product1,product5)-> 
		      product1.getProductPrice()> product5.getProductPrice() ? 1: -1).get();
	  System.out.println("Max price product = "+maxPriceProduct);
	
	  Product minPriceProduct = pdList.stream().min((product1, product5)->
              product1.getProductPrice() > product5.getProductPrice() ? 1: -1).get();
      System.out.println("Min price product = "+minPriceProduct);
      
      Stream<String> stream = Stream.of(
              "Sansilk", "Dove", "Clinic plus", "Himalaya","Lorial");
      stream.filter(str -> str.startsWith("S"))
      .forEach(System.out::println);
          
      Iterator<Product> itr=pdList.iterator();
      while(itr.hasNext()) {
    	  pdList.stream().filter(p ->p.getProductPrice()> 100 && p.getProductPrice()<200)
    	  .forEach(System.out::println);
    	  break;
      }
	}

}
