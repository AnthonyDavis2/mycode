public class AnthonyTest { 
    
    static String firstName() { 
        return "Anthony"; 
    }

   static String lastName() { 
      return "Davis"; 
   }  

    public int age() { 
        return 1000; 
    } 

    public String home(String person) { 
        if (person == "Anthony")  { 
            return "Atlanta"; 
        } else { 
            return "N/A";
        } 
    } 
    public static void main(String[] args) { 
    
        AnthonyTest me = new AnthonyTest(); 
        
        String fullName = firstName() + lastName(); 

        System.out.println(fullName);

       System.out.println(me.age()); 
        System.out.println(me.home(firstName())); 
    }  
} 
