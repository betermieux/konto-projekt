package de.betermieux;


public interface KontoManager {
  Konto findeKonto(String kontoNummer);
  void updateKonto(Konto konto);
  void neuesKonto(Konto konto);
}