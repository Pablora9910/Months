package es.studium.Meses;

import java.util.Scanner;

public class Meses2
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int mes,año ;
		System.out.println( "Introduce un Mes " );
		mes=teclado.nextInt();
		System.out.println( "introduce un Año" );
		año=teclado.nextInt();
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
        			System.out.println("El mes tiene 31 días");
        			break;
        		case 2:
        			if( año%4==0 && año%100!=0 || año%400==0) 
        			{
        				System.out.println("El mes indicado tiene 29 días");
        			}
        			else 
        			{
        				System.out.println("El mes indicado tiene 28 días");
        			}
        			break;
        		default:
        			System.out.println("El mes indicado tiene 30 días");
        	}
        }
	}

}
