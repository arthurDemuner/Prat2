package exercicios;
import java.util.Scanner;
public class n2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] tab = new int[50][50];
		int x=1;
		for (int i = 0; i< 50;i++) {
			for (int j = 0; j< 50;j++) {
				tab[i][j]=0;
			}
		}	
		
		for (int i = 0; i< 50;i++) {
			for (int j = 0; j< 50;j++) {
				tab[i][j]=x;
				x=x+2;
			}
		}	
		
		for (int i = 0; i< 50;i++) {
			for (int j = 0; j< 50;j++) {
				if(i==j)
					System.out.print(tab[i][j]+"\t");
			}
			System.out.print("\n");
		}
					
	}

}
