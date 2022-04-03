package com.classes;

//Vampiro is a Vampire
public class Vampiro implements Personaggio{

    private int forzaMostro = 15;
    public Vampiro() {
    }

    @Override
    public int getForzaFisica() throws Exception{
        if(forzaMostro<=0) throw new Exception("Vampiro è morto");
        else
            return forzaMostro;
    }

    @Override
    public void attack() throws Exception{
        forzaMostro -=2;
    }
}
