/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validacionesswing;

/**
 *
 * @author estuardo
 */
public class Contador {

    int contador;

    public String[] contadorPalabras(String frase) {
   
      String[] palabras = frase.split("\\W");
      return palabras;
    }

    public String [] contadorLetras(String frase) {
               
        String [] letras = new String[frase.length()];
        for (int x = 0; x < frase.length(); x++) {
            if (Character.isLetter(frase.charAt(x)) ) {
                letras[x]=String.valueOf(frase.charAt(x));
               
            } 
        }
        return letras; 
    }
    public String [] ordenar(String[] lista)
    {
        String aux; 
        for(int i=1; i<=lista.length; i++) {  
            for(int j=0; j<lista.length-i; j++) { 
                if(lista[j].compareToIgnoreCase( lista[j+1] ) > 0 ) { 
                    aux   = lista[j]; 
                    lista[j]  = lista[j+1]; 
                    lista[j+1]= aux; 
                }    
            } 
        }
        return lista;
    }
}
