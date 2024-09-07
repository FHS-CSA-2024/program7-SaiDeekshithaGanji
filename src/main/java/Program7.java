package src.main.java;
//import stuff here
import java.util.Scanner;
//Your code here

public class Program7{
    //Define your final variables here
    // **HINT: Maybe the conversion rates?????**       
   
    public static void main(String[] args){
    
        double sb = 0.0;
        double k = 0.0;
        double sno = 0.0;
        
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter Schrute-bucks: ");
        sb = myScanner.nextInt();
        
        //Scanner for kelvin
        System.out.print("Enter Kelvins: ");
        k = myScanner.nextInt();
        
        
        //Scanner for stanely nickels
        System.out.print("Enter Stanley-Nickels: ");
        sno = myScanner.nextInt();
        
        
        double decimalSchruteBucks = 0.0;
        final double ke = k/20.0;
        final double sn = sno/240.0;
        
        decimalSchruteBucks = (sb+ke+sn)+0.005;
        decimalSchruteBucks = (int)(decimalSchruteBucks*100);
        decimalSchruteBucks = (double)(decimalSchruteBucks/100);
        
        System.out.println("Decimal-schrute-bucks: " + "$" + decimalSchruteBucks);
    }
    
    
    
    /*
     * this was not at all working, so didnt endup using it : (
     * 
     * public double convertMoney(int schruteBucks, int stanleyNickels, int klevins){
        //implement a function that converts from the old format to the new format
        
        double totalStanleyNickels = (schruteBucks * sn)+ (klevins * ke) + stanleyNickels;

        // Convert to decimal schrute-bucks
        double decimalSchruteBucks = totalStanleyNickels / 100.0;

        return decimalSchruteBucks;
    }*/
    
    
    
    //Paste console output below:
    /*
       Enter Schrute-bucks: 7
       Enter Kelvins: 17
       Enter Stanley-Nickels: 9
       Decimal-schrute-bucks: $7.89
       
       */

    
}
