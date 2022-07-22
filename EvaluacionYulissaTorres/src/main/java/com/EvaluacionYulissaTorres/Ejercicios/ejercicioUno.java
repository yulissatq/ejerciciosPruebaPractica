package com.EvaluacionYulissaTorres.Ejercicios;



public class ejercicioUno {
	public static void main(String[] args) {
                      
        
        int[] numeros = new int[100];
        for ( int i= 0; i < numeros.length; i++) {
        	
        	if(numeros[i]/3!=0 && numeros[i]/5!=0){
        		numeros[i] = i+1;
        		System.out.println(numeros[i]);
        		
        	} else if (numeros[i]/3==0 && numeros[i]/5==0){
        		numeros[i] = i+1;
        		System.out.println(numeros[i] + "SOMOS BA");
        	} else if(numeros[i]/3==0){
            		numeros[i] = i+1;
                    System.out.println(numeros[i] + "SOMOS");
            } else if (numeros[i]/5==0) {
            	numeros[i] = i+1;
            	System.out.println(numeros[i] + "BA");
                    	
                    }
        }
        }
	
}
