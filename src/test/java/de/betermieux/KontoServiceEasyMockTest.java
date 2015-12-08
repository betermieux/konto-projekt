package de.betermieux;

import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

/**
 * @author Stefan Betermieux
 */
public class KontoServiceEasyMockTest {
  @Test
  public void test() {
    Konto quelle = new Konto("1", 1000.0);
    Konto ziel = new Konto("2", 100.0);
    
    KontoManager kontoManagerMock = createMock(KontoManager.class);
    expect(kontoManagerMock.findeKonto("1")).andReturn(quelle);
    expect(kontoManagerMock.findeKonto("2")).andReturn(ziel);
    kontoManagerMock.updateKonto(quelle);
    kontoManagerMock.updateKonto(ziel);
    
    replay(kontoManagerMock);
    KontoService service = new KontoService();
    service.setKontoManager(kontoManagerMock);
    
    service.transfer("1", "2", 500.0);
    verify(kontoManagerMock);
    assertThat(quelle.getSaldo(), equalTo(500.0));
    assertThat(ziel.getSaldo(), equalTo(600.0));
  }
}
