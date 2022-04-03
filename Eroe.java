package com.classes;

//Eroe is just a human
public class Eroe implements Personaggio{
    //forza is basically health
    private int forzaUmano = 10;
    public Eroe() {
    }


    @Override
    public int getForzaFisica() throws Exception {
        if(forzaUmano<=0) throw new Exception("Eroe è morto");
        else
            return forzaUmano;

    }

    @Override
    public void attack(){
        forzaUmano -= 3;
    }
}
