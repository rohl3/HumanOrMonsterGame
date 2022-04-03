package com.classes;

//Licantropo is a werewolf
public class Licantropo implements Personaggio{
    private boolean isNight;
    private int forzaUmano = 10;
    private int forzaMostro = 15;

    @Override
    public int getForzaFisica() throws Exception{
        if(isNight){
            if(forzaMostro<=0) throw new Exception("Licantropo è morto come Mostro");
            else
                return forzaMostro;
        }else {
            if(forzaUmano<=0) throw new Exception("Licantropo è morto come Umano");
            else
                return forzaUmano;
        }
    }

    @Override
    public void attack(){
        if(isNight){
            forzaMostro -=2;
        }else {
            forzaUmano -=3;
        }
    }

    public Licantropo() {
    }

    public boolean isNight() {
        return isNight;
    }

    public void setNight(boolean night) {
        this.isNight = night;
    }
}
