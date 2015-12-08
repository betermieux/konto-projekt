package de.betermieux;

public class Konto {

  private String kontoNummer;

  private double saldo;

  public Konto(String kontoNummer, double saldo) {
    this.kontoNummer = kontoNummer;
    this.saldo = saldo;
  }

  public void soll(double umsatz) {
    saldo -= umsatz;
  }

  public void haben(double umsatz) {
    saldo += umsatz;
  }

  public String getKontoNummer() {
    return kontoNummer;
  }

  public double getSaldo() {
    return saldo;
  }
}
