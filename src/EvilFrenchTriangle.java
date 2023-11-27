
public class EvilFrenchTriangle {

	
	/*
		for(int line = 1; line <= n; line++) {
	    	
	    	int C=1;// used to represent C(line, i)
	   		
	   		for(int i = 1; i <= line; i++) { 
	       		// The first value in a line is always 1
		        System.out.print(C+" ");
		        C = C * (line - i) / i; 
	     	}
	     	
	    	System.out.println();
    	}
	 */
	
	public void printPascalTriangle(int n) {
        printPascalLine(n, 0);
    }

    private void printPascalLine(int maxRow, int currRow) {
        if (currRow <= maxRow) {
            printPascalElement(maxRow, currRow, 0);
            
            System.out.println();
            
            printPascalLine(maxRow, currRow + 1);
        }
    }

    private void printPascalElement(int maxRow, int currRow, int element) {
    	// fill the row with appropriate amount of elements
    	if (currRow <= element) {
    		// print item
    		System.out.print(binomialCoefficient(currRow, element) + " ");
            
    		// print next item
    		printPascalElement(maxRow, currRow, element + 1);
        }
    	
    }

    private int binomialCoefficient(int n, int k) {
        
    	// if at beginning or end of the row it is 1
    	if (k == 0 || k == n) {
            return 1;
        } else { // if it is not at beginning or end of row get its upper left and upper right element then set it
            return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
        }
    	
    }
    
    
    public static void main(String[] args) {
    	EvilFrenchTriangle e = new EvilFrenchTriangle();
    	e.printPascalTriangle(5);
    }
	
}
