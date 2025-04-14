/******************************************************************************
exemplo : utilizando Array e visualizando a saida de dados 
*******************************************************************************/
public class exemplo00
{
	public static void main(String[] args) {
		 int [] numero = new int [5];
         
         numero[0] = 10;
         numero[1] = 20;
         numero[2] = 30;
         numero[3] = 40;  
         numero[4] = 50;
         
         // saida de dados 
         for (int i = 0; i <numero.length; i++ ){
             System.out.println ("o " + (i+1) + "°  numero é: " + numero[i] );
         }      
         }
	}

