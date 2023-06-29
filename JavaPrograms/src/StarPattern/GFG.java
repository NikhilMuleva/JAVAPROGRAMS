package StarPattern;	
import java.util.*;
class GFG {

	              public static void main (String[] args) {

	                  Scanner sc=new Scanner(System.in);

	                           System.out.println("enter the row of the mtarix");

	                           int row=sc.nextInt();

	                           System.out.println("enter the column of the mtarix");

	                           int column=sc.nextInt();

	                           int [][] matrix=new int[row][column];

	                          

	                           System.out.println("enter the matrix");

	                           for(int i=0;i<row;i++){

	                               for(int j=0;j<column;j++){

	                                   matrix[i][j]=sc.nextInt();

	                               }

	                           }

	                                         int [][] trans=new int[column][row];

	                                         for(int i=0;i<row;i++){

	                                             for(int j=0;j<column;j++){

	                                                 trans[i][j]=matrix[i][j];

	                                             }

	                                         }

	                                         System.out.println("original matrix");

	                                         for(int i=0;i<row;i++){

	                                             for(int j=0;j<column;j++){

	                                                 System.out.print(matrix[i][j]);

	                                             }

	                                             System.out.println();

	                                         }

	                                         System.out.println("transverse matrix");

	                                         for(int i=0;i<column;i++){

	                                             for(int j=0;j<row;j++){

	                                                 System.out.print(trans[j][i]);

	                                             }

	                                             System.out.println();

	                                         }

	              }

	}

	 


