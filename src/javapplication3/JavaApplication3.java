/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javapplication3;
import java.util.Scanner ;

/**
 *
 * @author Vedika Jain
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myscanner =new Scanner(System.in);

        //prompt the user for an octal number
        System.out.print("Please enter the 4 digits octal number:" );
        String octal = myscanner.nextLine();

        //Display the Octal Number
        System.out.print("\n Octal number   : "+octal);

        //seperating into 4 different digits (extract the character from the string)
        char firstValue = octal.charAt(0);
        char secondValue = octal.charAt(1);
        char thirdValue =octal.charAt(2);
        char fourthValue = octal.charAt(3);

        //Get the value from the ascci table & substract it from the given octal number
        int interger1 = (int)(((int)firstValue-(int)'0') * Math.pow(8,3));
        int interger2 = (int)(((int)secondValue-(int)'0')* Math.pow(8,2)) ;
        int interger3 = (int)(((int)thirdValue -(int)'0')* Math.pow(8,1));
        int interger4 = (int)(((int)fourthValue -(int)'0')* Math.pow(8,0));

        //Display the decimal conversion
        int decimal = interger1+ interger2+interger3+interger4;
        System.out.printf("\n Decimal Number : %d\n", decimal);

    }
}











