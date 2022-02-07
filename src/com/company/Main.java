package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ekigeKoboitkon(12,32);

    }
    static void ekigeKoboitkon (int san, int san2){
        while ( san < san2){
            san *= 2;
            System.out.print(san+" ");
        }
    }
    static void jetiniKoshkon(int san,int san2){
        while (san <= san2){
            System.out.print(san+ "  ");
            san += 7;
        }
    }
    static void  tortkoBolungon(int san , int san2){
        while (san <= san2){
           if(san % 4 == 0){
               System.out.println(san);
               san++;
           }
        }
    }
}