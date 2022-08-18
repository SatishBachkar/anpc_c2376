package question2;

public class ForLoop {

	public static void main(String[] args) {
		
		for(int i=0; i<=7;i++) {
			for(int j=0;j<i;j++) {
				int k = i*j;
				System.out.print(k+" ");
			}
		System.out.println();
		}
	}

}
