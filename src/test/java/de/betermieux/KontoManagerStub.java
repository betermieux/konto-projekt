package de.betermieux;

public class KontoManagerStub implements KontoManager {

  private Konto konto1;

  private Konto konto2;

  public void neuesKonto(Konto konto) {
    if (konto1 == null) { konto1 = konto; }
    else { konto2 = konto; }
  }

  public void updateKonto(Konto konto) {
    // no operation
  }

  public Konto findeKonto(String kontoNummer) {
    if (konto1.getKontoNummer().equals(kontoNummer))
      return konto1;
    if (konto2.getKontoNummer().equals(kontoNummer))
      return konto2;
    throw new IllegalArgumentException();
  }
}