/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package icetask3;
import java.util.Scanner;

public class IceTask3 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declaring variables to be used as input valeus
        String exercises;
        int duration;
        int intensity;
        
        // getting user inputs 
        System.out.print("Enter type of Exercise:");
        exercises = scanner.nextLine();
        
        System.out.print("Enter Duration of exercise:");
        duration = scanner.nextInt();
        
        System.out.print("Enter intensity of exercise:");
        intensity = scanner.nextInt();
        
        printWorkout(exercises, duration, intensity);
    }
    
    // method to retrieve from class contructor Workout
    public static void printWorkout(String exercises, int duration, int intensity) {
        Workout UserInput = new Workout(exercises,duration,intensity);
    }
    
}
