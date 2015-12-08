package de.betermieux;

public class KontoService {
  private KontoManager kontoManager;

  public void setKontoManager(KontoManager kontoManager) {
    this.kontoManager = kontoManager;
  }

  public void transfer(String quelle, String ziel, double umsatz) {
    Konto quelleKonto = kontoManager.findeKonto(quelle);
    Konto zielKonto = kontoManager.findeKonto(ziel);
    quelleKonto.soll(umsatz);
    zielKonto.haben(umsatz);
    kontoManager.updateKonto(quelleKonto);
    kontoManager.updateKonto(zielKonto);
  }
}