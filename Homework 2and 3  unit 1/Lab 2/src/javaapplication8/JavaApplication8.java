/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author Steenbok
 */
public class JavaApplication8 {

 
  public class AddressFormatter {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your street name");
        String street = scanner.nextLine();

        System.out.print("Enter your house or apartment nurber");
        String houseNum = scanner.nextLine();

        System.out.print("Enter your city");
        String city = scanner.nextLine();

        System.out.print("Enter your zip code");
        String zipCode = scanner.nextLine();

        System.out.print("Enter your province:");
        String province = scanner.nextLine();

        System.out.println(houseNum + "" + street + "," + city + "," + province + "," + zipCode);
    }
}}
