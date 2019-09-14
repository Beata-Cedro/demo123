package pl.cedro;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Pattern;

//Wczytaj informacje od użytkownika
//Dopóki to, co podał użytkownik nie pasuje do wyrażenia regularnego, proś go ponownie o podanie danych
//Jeśli to, co wpisał użytkownik pasuje do wyrażenia regularnego przejdź dalej
// i wykonaj właściwy kod (np. konwersja daty)
// — możliwe, że nadal będziesz musiał używać bloków try-catch w niektórych miejscach (przez checked exceptions)
public class Interfajs {

    static Scanner sc = new Scanner(System.in);

   public static String getUserInput(){
        return sc.nextLine().trim();
    }

    public static void main(String[] args) {

        Kot kot = new Kot();
        //wprowadzanie nazwy
        System.out.println("Podaj imię kota: ");
        kot.setImieKota(getUserInput());

        //wprowadzanie daty ur
        Pattern wzorzecDatyUrodzenia = Pattern.compile("[0-9]{4}-[0-1]?[0-9]{2}-[0-3]?[0-9]{2}");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dataUrWczytana;

        do{System.out.println("Podaj datę urodzenia w formacie RRRR-MM-DD: ");
            dataUrWczytana=getUserInput();
            if(wzorzecDatyUrodzenia.matcher(dataUrWczytana).matches()){
                try {
                    kot.setDataUrodzeniaKota(sdf.parse(dataUrWczytana));
                }catch(ParseException pe){
                    System.out.println("Coś nie tak z datą. Przykładowa data to: 2019-08-15");
                }}else {
                System.out.println("Podałeś błędny format daty... Wprowadź ponownie:");
            }
        }while (kot.getDataUrodzeniaKota() ==null);

        //wprowadzanie wagi kota
        Pattern wzorzecWagi = Pattern.compile("[0-9]+(\\.[0-9]+)?");
        String wczytynaWaga;
        do{
            System.out.println("Podaj wagę kota: ");
            wczytynaWaga=getUserInput();
            if(wzorzecWagi.matcher(wczytynaWaga).matches()){
                try{
                kot.setWagaKota(Float.valueOf(wczytynaWaga));
                }catch (NumberFormatException ne){
                    System.out.println("Podaj ponownie wagę. Zastosowałeś zły format. Wprowadź ponownie: "); }
                }else {
                System.out.println("Zły format wagi.");}
        } while (kot.getWagaKota()==null);

        //wprowadzanie opiekuna
        System.out.println("Podaj opiekuna: ");
        kot.setImieOpiekunaKota(getUserInput());

        System.out.println("Dziękuję wszystko już wiem o kocie.");
    }
}
