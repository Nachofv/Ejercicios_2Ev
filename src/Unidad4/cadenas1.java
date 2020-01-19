package Unidad4;

import java.util.Scanner;

public class cadenas1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in= new Scanner (System.in);
		
		int a=0;
		int e=0;
		int i=0;
		int o=0;
		int u=0;
		int n=0;
		
		String s;
		System.out.println("Introduce una cadena de caracteres");
		s=in.nextLine().toLowerCase();
		
		for(int j=0; j<s.length();j++){
			
			char c = s.charAt(j);
			
			switch (c) {
			case 'a':
			a++;
			break;
			case 'e':
			e++;
			break;
			case 'i':
			i++;
			break;
			case 'o':
			o++;
			break;
			case 'u':
			u++;
			break;
			case 'n':
			n++;
			break;
			}
		}
	System.out.println("a: "+ a );
	System.out.println("e: "+ e );
	System.out.println("i: "+ i );
	System.out.println("o: "+ o );
	System.out.println("u: "+ u );
	System.out.println("n: "+ n );
		

	}

}
