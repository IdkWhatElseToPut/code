package Week28.Mar13demo;

// www.apluscompsci.com

//Inheritance example: 
// Because the classes are so small, they are all in one file.
// This code will run from the class with the main method.
// Run the code and answer the questions.



class Monster
{
   // 1. Can the Witch class access myName?
   //no becasue private variables

   private String myName;

   // Default constructor
   public Monster()
   {
       myName = "Monster";
   }

   // Constructor that receives a name
   public Monster( String name )
   {
       myName = name;
   }

   public void speak() {
       System.out.println("ROOOOOAAAAARRRRR\n");
   }

   public String toString()
   {
       return "Monster name :: " + myName;
   }
}
//----------------------------------------------------
class Witch extends Monster
{	
   public Witch(){
     super("Witch");
   }

   @Override
   public void speak() {
       super.speak();
       System.out.println("CACKLE CACKLE");
   }

   
   
   
}



//-----------------------------------------------
public class InheritExample
{
 public static void main ( String[] args )
 {
   // 2. Which Monster constructor will be invoked?
    // the first monster constructor will be invoked because there is no variable inside the constructor
    Monster m = new Monster();

    //3. What code is used to print m?
    //the speak class inside the Monster class and the toString method inside monster
    System.out.println(m);
    m.speak();

    //4. What happens when the Witch() default constructor is called?
    //a default constructor is created by java
    Witch witch = new Witch();

    //5. What code is used to print witch?
    // it will use the code from the Monster class
    System.out.println(witch);

    //6. What code is used to make the witch speak?
    //code from the monster class
    witch.speak();
    
    //7. Add a default constructor to the Witch class. add 
    //   the statement super("Witch").
    //8. Override the Monster speak() method with a speak method for Witch.
    //   Make a witch say "CACKLE CACKLE"
    //9. Run your code and submit the output with the answers to 
    //   the 6 questions.
    
 }
}