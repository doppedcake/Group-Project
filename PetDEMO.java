/**
 * The goal of this application is to store Pet Objects in to an 
 * Array List without the use of a node
 * 
 * #Can I implement a Pet object that refers to a Cat Bird or Dog Object? 
 * 
 * #Should I implement a seperate ArrayList 
 */
package pet;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

/**
 *This application creates pets and stores them in an array list
 * 
 * @author pat
 */
public class PetDEMO{
    
    /**
     * @param option - selects the items on the menu
     * @param petstore - Array List of Pets
     * @param condition - determines the loop
     * @param args
     * @throws IOException 
     */    
    public static void main(String[] args)throws IOException
    {
        ArrayList<Pet> petstore = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        boolean condition = true;
        String name;
        int option;
        String c;
        int index = 0;
        
        
        Pet animal  = new Pet("Fil", 2, "Bark", false );
    /**
    animal.setAge(12);
    animal.setName("Fil");
    animal.setHunger("y");
    animal.setSound("Bark");


    System.out.println( animal.getAge());
    System.out.println( animal.getName());
    System.out.println( animal.getHunger());
    System.out.println( animal.getSound());
    */
    do{
        System.out.println("Begining Array List Demo."); 
        System.out.println("\f");
        System.out.println(petstore); // print out the ArrayList petstore
        System.out.println();
        pause();
        option = menu(in);
        switch(option){
            case 1: System.out.println("Add a pet\n");
                    System.out.println();
                    addPet(in, petstore, index);
                break;
            case 2: System.out.println("Remove a pet\n");
                System.out.println();
                    System.out.println("What is the name of the pet you want to remove?\n");
                    name = in.nextLine();
                    System.out.println("What is the index of the pet you want to remove?\n");
                    index = in.nextInt();
                    removePet(name, index, petstore);
                break;
            case 3: System.out.println("Display a pet\n");
                System.out.println();
                    System.out.println("What is the name of the pet you want to display?\n");
                    name = in.nextLine();
                    System.out.println("What is the index of the pet you want to display?\n");
                    index = in.nextInt();
                    displayPet(petstore, in, index, name);
                break;
            case 4: System.out.println("Display the list\n");
                
                break;
            case 5: System.out.println("Enter 'Q' to quit\n");
                    c = in.next();
                    if(c.equals('Q')){
                    condition = false;}
                break;
        }
        
    }
    while(condition);
    {
        System.out.println("\tExiting Array List Demo");
    }

    }
    
    /**
     * Adds a pet to the array list
     * Calls the chose pet method
     *        }
     * @petChoice is used to set the type of animal to be the pet
     * @age user is used to set the age of the animal
     * @condition meant to break the loop of the method
     * @petName  is used to set the name of the animal
     * @petChioce is the Object type selected by the user
     * @param petstore 
     * @param index
     * @param in
     * 
     */
    
    public static void addPet(Scanner in, ArrayList<Pet> petstore, int index){
        int petChoice;
        String name;
        int age;
        boolean condition = false;
        do{
        System.out.println("What you would like to name you pet? 'Q' to Quit. ");
        name = in.nextLine();
        if(name.equals("Q")){
            condition = true;
        }
        System.out.println("\f");
        System.out.println("Enter the age of the pet you want: ");
        age = in.nextInt();
        
        System.out.println("\f");
        petstore.add(new Pet(name , age));
        petChoice = chosePet(in);
        switch (petChoice){
            case 1 : petstore.add(new Cat()); // Constructors in each class need to be rewritten
                break;
            case 2:  petstore.add(new Dog());
                break;
            case 3: petstore.add(new Bird());
                break;
        }
        }
        while(!condition);
    }
    
    
    /**
     * -This Method assists the addPet method
     * @condition-
     * @option-
     * @param in
     * @return 
     */
    public static int chosePet (Scanner in){
        boolean condition = false;
        int option;
        do
        {
        System.out.println("\tSelect Pet\n"+
                "\fCat[1]\n"+
                "\tDog[2]\n"+
                "\tBirsd[3]\n");
        option = in.nextInt();
        }
        while(option > 1 || option < 3);
        
        return option;
    }
    
    /**
     * - Removes a Pet Object from the list
     * @param name represents the name of the Pet Object to be removed
     * @param index represents the index for the Pet Object to be remove from the list
     * @param petstore is the list Pet Objects are stored
     */
    public static void removePet(String name, int index, ArrayList<Pet> petstore){
        if(index > 0){
            if(petstore.get(index).getName().equals(name))
            {
             petstore.remove(index);  
            }
            else
            System.out.println("Mismatch name no removal");
        }
        else
            System.out.println("No such name in the list");
        
        
    }
    
    /**
     * @getCat - if cat is a child class of pet then how can i call a "pet" refering to a cat?
     * should the method check if its a cat?
     *  or seperate lists?
     * @param petstore
     * @param in
     * @param index 
     */
    public static void displayList(ArrayList<Pet> petstore, int index){
        for(int i = 0 ; i < index; i++ ){
             System.out.println("Hello I am a " + petstore.get(i).getType() +"and my name is " + petstore.get(i).getName() +
            " and my name is" + petstore.get(i).getAge()+"\n");
             
        }
    }
    
    /**
     * #doesn't need Scanner in Object
     * - displays the pet passed using
     * @petstore List of Pet Objects
     * @index Is the index to be displayed
     * @param name
     * @param petstore
     * @param in
     * @param index 
     */
    public static void displayPet(ArrayList<Pet> petstore, Scanner in, int index, String name){
        String n = petstore.get(index).getName();
        if(n.equals(name)){
        System.out.println("Hello I am a " + petstore.get(index).getType() +"and my name is " + petstore.get(index).getName() +
            " and my name is" + petstore.get(index).getAge()+"\n");
        }
        else
        {
            System.out.println("Mismatch\n");
            System.out.println("Name and  index don't match\n");
            System.out.println("No removal\n");
        }
        
    }
    
    public static void pause() throws IOException
    {
        System.out.print("\nPress any key to continue: ");
        char c = (char) System.in.read();       
    } 
    
    /**
     * -Displays options for the user
     * #needs to be used correctly
     * @param in
     * @return 
     */
    public static int menu(Scanner in){
        int option = 0;
        do{
        System.out.println("\tMenu Selection\n");
        System.out.println("\tAdd Pet[1]\n"
                          +"\tRemove Pet[2]\n"
                          +"\tDisplay Pet[3]\n"
                          +"\tDisplay List[4]\n"
                          +"\tQuit[5]\n"
                          +"\tPlese selection option in []");
        option = in.nextInt();
        }
        while(option > 1 ||option < 4);
        System.out.println("hey");
                return option;
    }
}
