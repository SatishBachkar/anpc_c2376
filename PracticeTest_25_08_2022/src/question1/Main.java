package question1;

public class Main {

    static int dcount;
	static int pcount;
	static int ucount;
	static int countObjects(Degree digree) {
		if (digree instanceof Degree) {
			dcount++;
			return dcount;
		}
		if(digree instanceof PostGraduates) {
			pcount++;
			return pcount;
		}if(digree instanceof UnderGraduate) {
			ucount++;
			return ucount;
		}
		return 0;
		
	}
	
	
	public static void main(String[] args) {
		Degree dg= new Degree();
		dg.getDegree();
		
		Degree pg=new PostGraduates();
		pg.getDegree();
		
		Degree ug= new UnderGraduate();
		ug.getDegree();
		
		int count = Main.countObjects(dg);
		System.out.println("Digree obj count is "+count);
		
		count = Main.countObjects(pg);
		System.out.println("post Grad obj count is "+count);
		count = Main.countObjects(ug);
		System.out.println("Undergrad obj count is "+count);
		
		
		

	}




}
