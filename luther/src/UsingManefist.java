import java.util.Scanner;

public class UsingManefist {
	
	static void myTable() {
		
		String[][] table = { {"   1 |", "      3|", "      30%   |", "   Low Chance"},
				             {"   1 |", "      2|", "      50    |", "   High Chance"},
				             {"   1 |", "      1|", "      100%  |", "   Highest Chance"},
				             {"   2 |", "      3|", "      75%   |", "   Higher Chance"},
				             {"   2 |", "      2|", "      100%  |", "   Highest Chance"},
				             {"   2 |", "      1|", "      200%  |", "   Highest Chance"},
				             {"   3 |", "      3|", "      100%  |", "   Highest Chance"},
				             {"   3 |", "      2|", "      150%  |", "   Highest Chance"},
				             {"   3 |", "      1|", "      300%  |", "   Highes Chance"}
				           };
       for (int i=0; i<table.length; i++) {
    	   System.out.println();
    	   for(int j=0;j<table[i].length; j++) {
    		   System.out.print(table[i][j]+ "");
    	   }
       }
       
		
	}
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println(" Predicting your manefistation? ");
		System.out.println("Type 1 to proceed ");
		
		double Type = in.nextDouble();
		
		 
		if (Type == 1) {
			System.out.println(" Instruction: ");
			System.out.println(" Please rate from 1.0, 2.0, 3.0 your manefestation based on your vision");
			double vision =(in.nextDouble());
			System.out.println(" Please rate from 1.0, 2.0, 3.0 your manefestation according to your will ");
			double will = (in.nextDouble());
			
			Manefist m = new Manefist(vision, will);
			
			m.myCalculation();
			
			//System.out.println(m.getVision() +" "+ m.getWill() +"  "+ m.getManefist() +"  "+ m.getPercentage() );
			System.out.println(" Your manefestation percentage is : " + m.getPercentage() + "%"  + "\n");
			
		
			
			System.out.println("\n" +"VISION   WILL   PERCENTAGE   INDICATION");
			myTable();
	
			System.out.println();
			} else  {
			System.out.println(" Thank you");
		
		
		
	  }	

	

}
}