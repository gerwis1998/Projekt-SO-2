package Organizmy.Zwierzeta;

import Organizmy.Wspolrzedne;

public class Owca implements Zwierze{
    private int sila, inicjatywa, wiek;
    private Wspolrzedne polozenie;
    Owca(int x, int y){
        this.sila = 4;
        this.inicjatywa = 4;
        this.wiek = 0;
        this.polozenie = new Wspolrzedne(x,y);
    }

    @Override
    public String Rysuj() {
        return null;
    }

    @Override
    public void Kolizja() {

    }

    @Override
    public void Akcja() {

    }

    public int getSila() {
        return sila;
    }

    public void setSila(int sila) {
        this.sila = sila;
    }

    public int getInicjatywa() {
        return inicjatywa;
    }

    public void setInicjatywa(int inicjatywa) {
        this.inicjatywa = inicjatywa;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}