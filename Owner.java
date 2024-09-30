import java.io.*;
import java.util.*;
public class Owner {
    public static void start(){   
        System.out.println("** Welcome to Pets A6! **\n1- Owl\n2- Worm\n");
        String input = Utility.getUserInput();
        if(input.equals("1")){
            Pet owl;
            while(true){
            owl = Serialization.downloadOwl();
            if (owl == null) {
                owl = new Owl();
            }
            System.out.println("\nChoose from the following:\n1- play\n2- feed\n3- make sound\n4- view color\n5- view hunger value\n6- view happiness value\n");
            String input2 = Utility.getUserInput();
            switch(input2) {
            case "1":
                owl.play();
                break;
            case "2":
                owl.feed();
                break;
            case "3":
                owl.makeSound();
                break;
            case "4":
                System.out.println(owl.getColor());
                break;
            case "5":
                System.out.println(owl.getHunger().getValue(owl.getHunger().getCurrentValue()));
                
                break;
            case "6":
                System.out.println(owl.getHappiness().getValue(owl.getHappiness().getCurrentValue()));
                
                break;
            default:
                System.out.println("\nNot a valid option");
            }
            Serialization.saveOwl(owl);
            }
        
        } else if(input.equals("2")){
            Pet worm;
            while(true){
                worm = Serialization.downloadWorm();
                if (worm == null) {
                    worm = new Worm();
                }
            System.out.println("\nChoose from the following:\n1- play\n2- feed\n3- make sound\n4- view color\n5- view hunger value\n6- view happiness value\n");
            String input2 = Utility.getUserInput();
            switch(input) {
            case "1":
                worm.play();
                break;
            case "2":
                worm.feed();
                break;
            case "3":
                worm.makeSound();
                break;
            case "4":
                System.out.println(worm.getColor());
                break;
            case "5":
                System.out.println(worm.getHunger().getValue(worm.getHunger().getCurrentValue()));
                break;
            case "6":
                System.out.println(worm.getHappiness().getValue(worm.getHappiness().getCurrentValue()));
                break;
            default:
                System.out.println("\nNot a valid option");
            }
            Serialization.saveWorm(worm);
            }
            
        } else {
            System.out.println("\nInvalid input");
        }
    }
}