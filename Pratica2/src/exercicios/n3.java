package exercicios;
import java.util.Scanner;
import java.util.Arrays;
public class n3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] tab = new int[10];
		int aux=0;
		Scanner entrada = new Scanner(System.in); 
		for (int i = 0; i< 10;i++) {
			 tab[i] = entrada.nextInt();
			}
		
		System.out.println("N�meros n�o ordenados:");
        for(int numero : tab)
            System.out.println(numero);
        System.out.println();

        Arrays.sort(tab);

        System.out.println("N�meros ordenados:");
        for(int numero : tab)
            System.out.println(numero);
        System.out.println();
}
}
