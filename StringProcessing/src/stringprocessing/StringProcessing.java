/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringprocessing;

import java.io.File;
import java.util.Scanner;

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
                
                if (!line[0].isEmpty() && !line[1].isEmpty()) {
                    char [] firstnameToArray = new char[line[0].length()];
                    char [] lastnameToArray = new char[line[1].length()];
                    
                    int nonAlphaCount1 = 0;
                   
                    for (int i = 0; i < firstnameToArray.length; i++) {
                        if (firstnameToArray[i].)
                    }
                    
                }
                String firstname = line[0];
                
                String lastname = line[1];
                String gender = line[2]; 
                String age = line[3];
                String phoneNumber = line[4];
                String email = line[5];
                
                
                
                firstname.trim();
                lastname.trim();
                gender.trim();
                age.trim();
                phoneNumber.trim();
                email.trim();
                
                csvArray[currIndex] = String.format("%-15s %-20s %-8s %-3s %-12s %-40s", firstname, lastname, gender, age, phoneNumber, email);
                System.out.println(csvArray[currIndex]);
                currIndex++;
               
            }
            
            
        }
        catch (java.io.IOException ex) {
            System.err.println("File " + filename + " not found in directory");
        }
        
        
    }
    
}
