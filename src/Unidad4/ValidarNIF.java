package Unidad4;
import java.util.*;
public class ValidarNIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in =new Scanner(System.in);
	
		char [] comprueba_letra= {'T','R','W','A', 'G', 'M', 'Y','F', 'P', 'D', 'X', 'B','N','J','Z','S','Q', 'V' ,'H' ,'L','C','K','E'};	
		 	
		 System.out.println("Introduce tu dni");
		 	
		 String dni=in.nextLine().toUpperCase();
		 
		 int numero=Integer.valueOf(dni.substring(0,dni.length()-1));
		 
		 char letra=dni.charAt(dni.length()-1);
		 
		 if (comprueba_letra[numero % 23] == letra) 
			 System.out.println("dni correcto");
		 
				
			else
				System.out.println("dni incorrecto");
			in.close();

		 				   
		
	}

}




























//int [] resto= new int [22];
//		String letras= new String {"T", "R", "W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H2","L","C","K","E"};