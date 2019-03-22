package module2;

public class nopyramid {

	public static void main(String[] args) {
	      for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	                if (j <= i) {
	                    System.out.print(j+1+"\t");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
		}

	}
