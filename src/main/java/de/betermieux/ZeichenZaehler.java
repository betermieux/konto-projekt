package de.betermieux;

/**
 * @author Stefan Betermieux
 */
public class ZeichenZaehler {
  
  public void zaehlen(String eingabe) {
    int c = 0, v = 0;


    while ((c < eingabe.length()) 
           && (eingabe.charAt(c) >= 'A') 
           && (eingabe.charAt(c) <= 'Z')) {
    
      if ((eingabe.charAt(c) == 'A') 
          || (eingabe.charAt(c) == 'E') 
          || (eingabe.charAt(c) == 'I') 
          || (eingabe.charAt(c) == 'O') 
          || (eingabe.charAt(c) == 'U')) {
        v++;
      }
      
      c++;
    }

    System.out.println("Der Text enthält " + c + 
        " Grossbuchstaben. Davon sind " + v + " Vokale.");
  }

}
