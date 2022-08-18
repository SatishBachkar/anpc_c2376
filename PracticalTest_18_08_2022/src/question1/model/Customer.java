package question1.model;

public class Customer {
	
	private int id;
	private String name;
	private int age;
	
	
	//setter
	        public void setId(int i) {
	         	id = i;
	        }
			public void setName(String n) {
				name = n;
			}
			public void setage(int p) {
				age = p;
			}
			
	//Getter
			public int getId() {
			return id;
		    }
		    public String getName() {
			return name;
		    }
	    	public int getage() {
			return age;
		    }

      public Customer(int a_id, String a_name,int a_age) {
    	  id = a_id;
    	  name = a_name;
    	  age = a_age;
    	  
      }
      public Customer() {
    	  
      }

}
