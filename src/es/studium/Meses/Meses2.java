package es.studium.Meses;

import java.util.Scanner;

public class Meses2
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int mes,a�o ;
		System.out.println( "Introduce un Mes " );
		mes=teclado.nextInt();
		System.out.println( "introduce un A�o" );
		a�o=teclado.nextInt();
		teclado.close();
		if (mes>=0 && mes<13)
		{
        	switch(mes) 
        	{
        		case 1:
        		case 3:
        		case 5:
        		case 7:
        		case 8:
        		case 10:
        		case 12:
        			System.out.println("El mes tiene 31 d�as");
        			break;
        		case 2:
        			if( a�o%4==0 && a�o%100!=0 || a�o%400==0) 
        			{
        				System.out.println("El mes indicado tiene 29 d�as");
        			}
        			else 
        			{
        				System.out.println("El mes indicado tiene 28 d�as");
        			}
        			break;
        		default:
        			System.out.println("El mes indicado tiene 30 d�as");
        	}
        }
	}

}
