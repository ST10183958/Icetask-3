/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icetask3;

/**
 *
 * @author kuri
 */
public class Workout {
    String exercises;
    int duration;
    int intensity;
    
    public Workout(String exercises, int duration, int intensity) {
        this.exercises = exercises;
        this.duration = duration;
        this.intensity = intensity;
        
        // printing work details
        System.out.println('\n');
        System.out.println("Your work out details");
        System.out.println("Exercise:"+exercises);
        System.out.println("Duration:"+duration);
        System.out.println("intensity:"+intensity);
    }
   
}
