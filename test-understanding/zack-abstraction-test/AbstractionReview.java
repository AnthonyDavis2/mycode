// abstract class - you may not create a FantasyCreature ONLY inherit a FC
abstract class FantasyCreature { 
    // abstract method (no body) 
    abstract void makeSound(); 

    // not an abstract method (has a body)
    void rest() { 
        System.out.println("The fantasy creature is resting."); 
    }
} 

// this is a subclass of FantasyCreature
class Dragon extends FantasyCreature { 
    // provide implementation
    void makeSound(){ 
        System.out.println("The dragon roars with fire breath"); 
    } 
} 



// another subclass of FantasyCreature
class Unicorn extends FantasyCreature { 
    // provide implementation of our abstract method 
    void makeSound() { 
        System.out.println("The Unicorn neighs softly in the night"); 
    } 
} 


public class AbstractionReview { 
    public static void main(String[] args) { 
        
        Dragon smaug = new Dragon();
        Unicorn theLastUnicorn = new Unicorn(); 

        smaug.makeSound(); 
        smaug.rest(); 

        theLastUnicorn.makeSound(); 
        theLastUnicorn.rest(); 
        
        
        System.out.println(smaug.toString()); 
        System.out.println(theLastUnicorn.toString()); 
    } 
} 
