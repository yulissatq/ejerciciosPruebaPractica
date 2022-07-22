package com.EvaluacionYulissaTorres.Ejercicios;

import java.util.Arrays;
import java.util.Collections;

public class ejercicioTres {
	public static void main(String[] args) {	
		
		Integer [] arreglo = {50,5,10,36,25,85,23,65};
		System.out.println("\nArreglo Desordenado:");
		for (int c : arreglo) {
			System.out.print(c+" ");
		}
		
		Arrays.sort(arreglo, Collections.reverseOrder());
		System.out.println("\nArreglo Ordenado de mayor a menor:");
		for (int c : arreglo) {
			
			System.out.print(c+" ");
		}
	}

}
