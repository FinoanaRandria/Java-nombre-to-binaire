package finoana.entiertobinaire.mg;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter your number : ");
		
		
	    int userNumber = myObj.nextInt();
      
	    
	   String  convertisseurNumber = convertInToBinary(userNumber);
	    
	   
	   
	   System.out.println("la conversion en binaire est " + convertisseurNumber);
	   
	    
	}
	
	 static String convertInToBinary( int numbers) {
		 if(numbers == 0) 
			 
			 return "0";
			 
		StringBuilder stringBuilder = new StringBuilder();
		
		
		while(numbers > 0) {
			
			int accumulateur = numbers % 2;
			
			stringBuilder.append(accumulateur);
			
			 numbers /= 2;
			
			
		}
		 
		 
		stringBuilder = stringBuilder.reverse();
		 return stringBuilder.toString();
	 } 
	
	
	
	
	

}
