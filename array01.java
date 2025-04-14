/******************************************************************************
exemplo array - entrada de dados 
*******************************************************************************/
import java.util.Scanner;
public class array01
{
	public static void main(String[] args) {
	int [] numeros = new int [5];
	Scanner ler = new Scanner(System.in);
	
	//entrada de dados 
	for (int i = 0; i <numeros.length; i++) {
	    System.out.println ("digite o" + (i + 1 )+ "° numero:");
	    numeros[i] = ler.nextInt ();
	   
	}
	//saida de dados  
	for (int i =0; i<numeros.length; i++)  {
	    System.out.println ("o "+ (i +1) + "° numero é:" + numeros [i]);
	}
	}
	}