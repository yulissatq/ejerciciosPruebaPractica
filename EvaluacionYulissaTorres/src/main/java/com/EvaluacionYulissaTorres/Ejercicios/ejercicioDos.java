package com.EvaluacionYulissaTorres.Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicioDos {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la primera palabra:");
		String palabraU=sc.nextLine();
		      
		      
		System.out.println("Introduce la segunda palabra:");
		String palabraD=sc.nextLine();
		           
		       		        
		String[][] palabras = {
				
				{palabraU, palabraD}
		        };
		        for (String[] par : palabras) {
		            System.out.println(String.format("las palabras '%s' y '%s' son anagramas? %b", par[0], par[1], esAnagrama(par[0], par[1])));
		        }
		  }

	public static String ordenar(String palabra) {
		
		char[] caracteres = palabra.toCharArray();
		
		Arrays.sort(caracteres);
		return new String(caracteres);
		
		}

		 
	public static boolean esAnagrama(String palabra, String confAnagrama) {
		        
		        palabra = palabra.toLowerCase().replace(" ", "").replace(".", "").replace(",", "").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
		        confAnagrama = confAnagrama.toLowerCase().replace(" ", "").replace(".", "").replace(",", "").replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u");
		        
		        palabra = ordenar(palabra);
		        confAnagrama = ordenar(confAnagrama);
		        
		        return palabra.equals(confAnagrama);
		    }
		}

