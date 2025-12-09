package com.example.swieta;

import java.util.ArrayList;

public class RepozytoriumPrzepisow {
    private static ArrayList<Przepis> przepisy;
    private static void generujPrzepisy(){
        przepisy = new ArrayList<>();
        przepisy.add(new Przepis("Pierniczki","ciasteczka",
                R.drawable.potrawa1,
                "mąka, kakao, przyprawy, miód",
                "wszystko wymieszać"));
        przepisy.add(new Przepis("Muffinki","ciasteczka",R.drawable.potrawa2,"mąka, mleko, kakao","wszystko wymieszać, upiec", 1));
        przepisy.add(new Przepis("Przepis2"));
        przepisy.add(new Przepis("Przepis3"));
        przepisy.add(new Przepis("Przepis4"));
        przepisy.add(new Przepis("Sernik na zimno", "ciasta",R.drawable.potrawa3,"ser biały, galaretka,woda","wymieszaj i do lodówki", 2));
        przepisy.add(new Przepis("Herbata zimowa","napoje",R.drawable.potrawa4,"herbata, rozmaryn, gożdziki,jabłko, pomarańcza,imbir","wszystko zalać wrzątkiem i poczekać", 3));

    }

    public static ArrayList<Przepis> getPrzepisy(){
        generujPrzepisy();
        return przepisy;
    }

    public static  Przepis zwrocPrzepisoId(int id) {
        generujPrzepisy();
        for(Przepis przepis:przepisy) {
            if(przepis.getIdPrzepisu() == id){
                return przepis;
            }
        }
        return null;
    }
    public static ArrayList<Przepis> zwrocPrzepisyZKategorii(String kategoria) {
        ArrayList<Przepis> przepisyZKategorii = new ArrayList<>();
        generujPrzepisy();
        for (Przepis przepis:przepisy) {
            if(przepis.getKategoria().equals(kategoria)) {
                przepisyZKategorii.add(przepis);
            }
        }
        return przepisyZKategorii;
    }
}
