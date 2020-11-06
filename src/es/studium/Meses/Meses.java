package es.studium.Meses;

import java.util.Scanner;

public class Meses
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int opcion = 0 ;
		System.out.println( "¿Que mes quieres?" );
		opcion=teclado.nextInt();
		teclado.close();
		
	 switch(opcion){
		case 1:
            System.out.println("Enero");
            break;
		case 2:
            System.out.println("Febrero");
            break;
		case 3:
            System.out.println("Marzo");
            break;
		case 4:
            System.out.println("Abril");
            break;
		case 5:
            System.out.println("Mayo");
            break;
		case 6:
            System.out.println("Junio");
            break;
		case 7:
            System.out.println("Julio");
            break;
		case 8:
            System.out.println("Agosto");
            break;
		case 9:
            System.out.println("Septiembre");
            break;
		case 10:
            System.out.println("Octubre");
            break;
		case 11:
            System.out.println("Noviembre");
            break;
		case 12:
            System.out.println("Diciembre");
            break;
		default:
            System.out.println("El numero no corresponde a un mes");
            break;
            
			}

		}

	}


/*ROGRAMA ejercicio15
VARIABLES
ENTERO a
INICIO
ESCRIBIR "Introduce el nuemro del mes del 1 al 12"
LEER a
SEGUN a HACER
	CASO 1:
		ESCRIBIR "Enero"
	CASO 2:
		ESCRIBIR "Febrero"
	CASO 3:
		ESCRIBIR "Marzo"
	CASO 4:
		ESCRIBIR "Abril"
	CASO 5:
		ESCRIBIR "Mayo"
	CASO 6:
		ESCRIBIR "Junio"
	CASO 7:
		ESCRIBIR "Julio"
	CASO 8:
		ESCRIBIR "Agosto"
	CASO 9:
		ESCRIBIR "Septiembre"
	CASO 10:
		ESCRIBIR "Octubre"
	CASO 11:
		ESCRIBIR "Nobiembre"
	CASO 12:
		ESCRIBIR "Diciembre"
	DEFECTO:
		ESCRIBIR “Numero no correcto”
FIN SEGUN
FIN*/