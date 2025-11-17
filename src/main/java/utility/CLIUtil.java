package utility;

import exceptions.InvalidInputException;
import models.StatisticList;

import java.util.Scanner;

public class CLIUtil {
    private static Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public static int getInt(){
        return scanner.nextInt();
    }

    public static double getDouble(){
        return scanner.nextDouble();
    }

    public static String getString(){
        return scanner.nextLine();
    }

    public static Number getNumber(double input) throws Exception{
        try{

            if (input < 0){
                throw new InvalidInputException("Invalid Input");
            }
            return input;
        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
