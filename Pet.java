/*

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
     implement food type in a list 
    
    */
    
    
    private String name; 
    private int age;
    private String sound; // is the definine charateristic of each pet
    private boolean hunger;
    private int index;
    private String type;
    
    public Pet(String n, int a){
        name = n;
        age = a;
                
    }

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
        public void setType(String t){
            type = t;
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
        public String getType(){
            return type;
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
        
        public int getIndex(){
            return index;
        }
    
}
