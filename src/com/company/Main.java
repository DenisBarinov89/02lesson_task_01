package com.company;

public class Main {

    public static void main(String[] args) {
       int clientOS = 0; // задаем переменную

       if (clientOS == 1) {
           System.out.println("Установите версию приложения Android по ссылке");
       }

       if (clientOS == 0) {
           System.out.println("Установите версию приложения iOS по ссылке");

       }
    }
}
