package bitCounting;

public class Main {

	public static void main(String[] args) {
		int n = 1234;
		int counter = 0;
	    String temp;
	    
	    temp = Integer.toBinaryString(n);
	    
	    for (int i = 0; i < temp.length(); i++) {
	    	if(temp.charAt(i) == '1') counter++;
	    }
	    
	    System.out.println(counter);
	   
	    
	}

}
