package com.campusdual;

public class Exercise3 {


    static int value = 5;

    public static void iSayHi(){
        System.out.println("OlaBuenoDia");
    }

    public static String createMessage(String message){
      String addmessage = "Hola";
      return addmessage += message;
    };

    public static void main(String[] args) {

        Exercise3.iSayHi();
        String hello = Exercise3.createMessage("Que tal");
        System.out.println(hello);

    }

}
