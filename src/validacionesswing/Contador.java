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
}
