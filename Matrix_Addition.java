//Matrix addition
import java.util.Scanner;

public class Matrix_Addition
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int rows=sc.nextInt();
		int col= sc.nextInt();
		int[][] A= new int[rows][col];
		int[][] B= new int[rows][col];
		int[][] C= new int[rows][col];
		for(int i=0;i<rows;i++){
		    for(int j=0;j<col;j++){
		        A[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<rows;i++){
	    for(int j=0;j<col;j++){
	        B[i][j]=sc.nextInt();
	    }
	}
	for(int i=0;i<rows;i++){
	    for(int j=0;j<col;j++){
	        C[i][j]=A[i][j]+B[i][j];
	    }
	}
		for(int i=0;i<rows;i++){
	    for(int j=0;j<col;j++){
	        System.out.print(C[i][j]+" ");}
	        System.out.println();
	    }sc.close();
	}
	
}
