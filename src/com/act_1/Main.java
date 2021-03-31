package com.act_1;
import  java.util.Random;
public class Main {

    public static void main(String[] args) {
        int x=1;
        while (x <=10) {
            System.out.println(genBoysname() + " " + genRelationship() + " " + genGirlsname());
            x++;
        }
    }
    public static String genBoysname(){
         String[] bname={"vincent","sehun","suho","kai","chanyeol"};
         return bname[genRandom()];
    }
    public static String genGirlsname(){
        String[] gname={"jenny","rose","jisoo","lisa","trisha shang"};
        return gname[genRandom()];
          }
    public static String genRelationship(){
        String[] relationship={"have crush to","is admired to","motivated by","is happy with","is angry with"};
        return relationship[genRandom()];
    }
    public static int genRandom(){
        Random random = new Random();
        return random.nextInt(5);
    }

}
