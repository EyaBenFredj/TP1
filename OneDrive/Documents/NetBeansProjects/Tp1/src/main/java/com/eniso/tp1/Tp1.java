/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.eniso.tp1;
import java.util.Scanner;
public class Tp1 {

    public static void main(String[] args) {
        System.out.println("Bonjour mon premier TP en POO");
        System.out.println("Quel est votre nom?");
        Scanner read = new Scanner(System.in);
        String name=read.nextLine();
        System.out.println();
        System.out.println("bonjour"+ name);
        System.out.println("Quel est votre age"+name+"?");
        read=new Scanner(System.in);
        int a;
        a=read.nextInt();
        System.out.println(name +"votre age est" + a);
        
        
        
    }
}
