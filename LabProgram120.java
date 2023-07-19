import java.util.Scanner; 

public class LabProgram120 {
   public static void main(String[] args) {
      /* Type your code here. */
	      Scanner scnr = new Scanner(System.in);
	      float[] userValues = new float[20];   // List of integers from input
	      
	      int tempValue = scnr.nextInt();  
	      float tempLargeValue = 0;
	      for (int i=0; i<tempValue; i++) {
	    	  userValues[i] = scnr.nextFloat();
	    	  if (userValues[i] > tempLargeValue) {
	    		  tempLargeValue = userValues[i];
	    	  }
	      }    
	      for (int i=0; i<tempValue; i++) {
	    	  userValues[i] /= tempLargeValue;
	      }
	      for (int i=0; i<tempValue; i++) {
	    	  System.out.printf("%.2f ", userValues[i]);
	      }
	      System.out.println();
   }
}
