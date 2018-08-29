/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringprocessing;

import java.io.File;
import java.util.Scanner;
import static javafx.scene.input.KeyCode.Z;

/**
 *
 * @author skerr
 */
public class StringProcessing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        listCSVToArray(args[0]);
    }
    
    public static void listCSVToArray(String filename) {
        String [] csvArray = new String[100];
        try {
            Scanner input = new Scanner(new File(filename));
            int currIndex = 0;
            while(input.hasNext()) {
                String [] line = input.nextLine().split(",");
                String firstname = "";
                String lastname = "";
                if (nameIsValid(line[0]) == true && nameIsValid(line[1]) == true) {
                    firstname = line[0];
                    lastname = line[1];
                }
                String gender = "";
                if (genderIsValid(line[2]) == true) {
                    gender = line[2]; 
                }
                String age = "";
                
                if (ageIsValid(line[3]) == true) {
                    age = line[3];
                }
                
                String phoneNumber = "";
                if (phoneNumberIsValid(line[4]) == true) {
                    phoneNumber = line[4];
                }
                
                String email = "";
          
                csvArray[currIndex] = String.format("%-15s %-20s %-8s %-3s %-12s %-40s", firstname, lastname, gender, age, phoneNumber, email);
                System.out.println(csvArray[currIndex]);
                currIndex++;
               
            }
            
            
        }
        catch (java.io.IOException ex) {
            System.err.println("File " + filename + " not found in directory");
        }
        
        
    }
    private static boolean nameIsValid(String name) {
        if (name.trim().matches("[a-zA-Z]+\\.?")) {
           return true; 
        } else {
            System.err.print("Name is invalid");
            return false;
        }
    }
    private static boolean genderIsValid(String gender) {
        if ((gender.trim().equalsIgnoreCase("male")) || (gender.trim().equalsIgnoreCase("female"))) {
            return true;
        } else {
            System.err.print("gender is invalid");
            return false;
            
        }
    }
    private static boolean ageIsValid(String age) {
        if (age.trim().matches("[1-130]+\\.?")) {
            return true;
        } else {
            System.err.print("age is invalid");
            return false;
        }
    }
    private static boolean phoneNumberIsValid(String phoneNumber) {
        if ((phoneNumber.trim().length() - 3) == 10) {
           return true; 
        } else {
            System.err.print("Phone number is invalid");
            return false;
        }
    }
   /* private static boolean emailIsValid(String email) {
        char [] 
        if ((email.charAt(0).matches["[a-zA-Z]\\.?"]) && email.contains("@") && (email.contains(".com") || email.contains(".net")) ) {
            return true;
        } else {
            System.out
        }
    } */
}
