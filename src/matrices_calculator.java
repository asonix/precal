import java.util.Scanner;

//	
//	Code by Alex Price, 2014
//	

public class matrices_calculator {

	
	static int reverse(int s) {
		int reversed = s - (s-1);
		return reversed;
    }
	
	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int rowsA;
        int colsA;
        int rowsB;
        int colsB;
        int rowsAR;
        int colsAR;
        int rowsBR;
        int colsBR;
        
        int repeat = 1;
        char repeatChar;
        int checkRepeat = 1;
        
        int row1A[] = new int[5];
        int row2A[] = new int[5];
        int row3A[] = new int[5];
        int row4A[] = new int[5];
        int row5A[] = new int[5];
        int row1B[] = new int[5];
        int row2B[] = new int[5];
        int row3B[] = new int[5];
        int row4B[] = new int[5];
        int row5B[] = new int[5];
        
        while( repeat == 1 ) 
        {
	        System.out.println("# of rows (matrix A): ");
			rowsA = sc.nextInt();
			rowsAR = ( rowsA - ( rowsA-- ) ); 
			System.out.println("# of cols (matrix A): ");
			colsA = sc.nextInt();
			colsAR = ( colsA - ( colsA-- ) ); 
			
			System.out.println("# of rows (matrix B): ");
			rowsB = sc.nextInt();
			rowsBR = ( rowsB - ( rowsB-- ) ); 
			System.out.println("# of cols (matrix B): ");
			colsB = sc.nextInt();
			colsBR = ( colsB - ( colsB-- ) ); 
			
			while(rowsA>0) 
			{
				System.out.println(rowsA + "  " +rowsAR +"  " +row1A[rowsAR]);
				System.out.println("Enter data for row " +rowsAR +", col " +colsAR );
				row1A[rowsAR] = sc.nextInt();
				rowsA--;
			}
			
			
			while(checkRepeat == 1) {
				System.out.println("repeat (y/n): ");
				repeatChar = (sc.next()).charAt(0);
				if( repeatChar == 'y' ) 
				{ 
					repeat = 1; 
					checkRepeat = 0;
				}
				else if( repeatChar == 'n' )
				{ 
					repeat = 0; 
					checkRepeat = 0; 
					System.out.println("done!"); 
				}
				else 
				{ 
					checkRepeat = 1; 
					System.out.println("type 'y' or 'n' please."); 
				}
        	}
			
        }
        
    }

 

}
