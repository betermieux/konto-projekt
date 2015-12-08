package de.betermieux;

import org.junit.Test;

/**
 * @author Stefan Betermieux
 */
public class ZeichenZaehlerTest {

  @Test
  public void testZaehlen() {
    ZeichenZaehler zeichenZaehler = new ZeichenZaehler();
    
    zeichenZaehler.zaehlen("AZ");
  }
  
}
