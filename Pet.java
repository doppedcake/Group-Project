/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet;
//import java.util.Scanner;

/**
 *
 * @author pat
 */
public class Pet {
   // Scanner in = new Scanner(System.in);
    /*
    * 
    
    
    */
    
    
    private String name;
    private int age;
    private String sound;
    private boolean hunger;

    public Pet(){
        name = null;
        age = 0;
        sound = null;
        hunger = false;   
    }
    
        public Pet(String n, int a, String s, boolean h){
        name = n;
        age = a;
        sound = s;
        hunger = h;   
    }
        
        public void setName( String n){
            name = n;
        }
        
        public void setAge(int a){
            age = a;
        }
        
        public void setSound(String s){
            sound = s;
        }
        
        public void setHunger( String h){
            
            if( h.equals("y")){
                hunger = true;
            }
            else if( h.equals("n")){
                hunger = false;
                
            }
            else{
                System.out.println("Please enter [y/n]");
            }

        }
        
        public int getAge(){
            return age;
        }
        
        public boolean getHunger(){
            return hunger;
        }
        
        public String getSound(){
            return sound;
        }
        
        public String getName(){
            return name;
        }
            
        public void feed(){
            hunger = false;
        }
        
    
}
