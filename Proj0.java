//created by Mike DeGregory, 2021

package proj0;

import java.util.Scanner;

public class Proj0 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("Hello World! Uh - I mean, hi, nice to meet you! What is your name?\n\n");
        String name = scanner.nextLine();
        
        System.out.printf("\nHi " + name + ", it's great to meet you! What are you doing here?\n");
        String doing = scanner.nextLine();
        
        System.out.printf("\nOh I see, " + name + ". I remember when I used to " + doing + " back in the day... "
                + "That's when I wasn't trapped inside this computer.\n\nAnyways, anything else you'd like to say?\n"); 
        String anything = scanner.nextLine();
        
        System.out.println("\nOk, nice to meet you " + name +"! Have a great day!");
                
    }
    
}
