import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Please type (1)type and (2)number of people or initial capital and (3)years");
		Scanner sc = new Scanner(System.in);
		try {
			while(sc.hasNext()) {
				int type = sc.nextInt();
					
				switch(type){
				
				case 0:
					int people = sc.nextInt() ; 	
					int prate = 2;
					int pyears = sc.nextInt();
					int generation = pyears/30;
					GeomProgression<Integer> Population = new GeomProgression<Integer>(people,prate);
					Population.printProgression(generation+1);
					break;
					
				case 1:
					double initial = sc.nextDouble();
					double crate = 1.016;
					int cyears = sc.nextInt() ;
					GeomProgression<Double> Capital = new GeomProgression<Double>(initial, crate);
					Capital.printProgression(cyears+1);
					break;
						
				default:
					System.out.println("InvalidType please enter type for 0 or 1");
					break;
					
				}
				
			}	
			
		}catch(Exception exception) {
				System.out.println(exception);
			}
		sc.close();
	}

}