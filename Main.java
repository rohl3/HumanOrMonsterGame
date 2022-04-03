package com.classes;

import java.util.ArrayList;
import java.util.Random;


public class Main {
    public static void main(String[] args) {

        ArrayList<Personaggio> list = new ArrayList<>();

        Eroe hero = new Eroe();
        Vampiro vampire = new Vampiro();
        Licantropo werewolf = new Licantropo();

        list.add(hero);
        list.add(vampire);
        list.add(werewolf);

        Random rand = new Random();
        Personaggio someone;

        for (int i = 0; i < 7; i++) {
            int index = rand.nextInt(0, list.size());
            someone = list.get(index);
            try {
                if(someone instanceof Eroe && someone.getForzaFisica()>0){
                    System.out.println("Attacca Eroe");
                    someone.attack();
                }else if(someone instanceof Vampiro && someone.getForzaFisica()>1){
                    System.out.println("Attacca Vampiro");
                    someone.attack();
                }else if(someone instanceof Licantropo && someone.getForzaFisica()>0){
                    ((Licantropo) someone).setNight(rand.nextBoolean());
                    System.out.println("Attacca Licantropo");
                    someone.attack();
                }
                System.out.println(someone.getForzaFisica());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println(System.lineSeparator());

        for (Personaggio pp:list) {
            try {
            if (pp instanceof Eroe ) {
                System.out.println("Eroe vive con forza fisica: "+pp.getForzaFisica());
            }else if(pp instanceof Vampiro ){
                System.out.println("Vampiro vive con forza fisica: "+pp.getForzaFisica());
            }else if (pp instanceof Licantropo ){
                System.out.println("Licantropo vive con forza fisica: "+pp.getForzaFisica());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        }
    }
}
