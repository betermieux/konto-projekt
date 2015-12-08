package de.betermieux;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

public class KontoServiceTest {
  @Test
  public void testTransfer() {
    Konto quelle = new Konto("1", 1000.0);
    Konto ziel = new Konto("2", 100.0);
    KontoManager stub = new KontoManagerStub();
    stub.neuesKonto(quelle);
    stub.neuesKonto(ziel);
    KontoService service = new KontoService();
    service.setKontoManager(stub);
    service.transfer("1", "2", 500.0);
    assertThat(quelle.getSaldo(), equalTo(500.0));
    assertThat(ziel.getSaldo(), equalTo(600.0));
  }
}