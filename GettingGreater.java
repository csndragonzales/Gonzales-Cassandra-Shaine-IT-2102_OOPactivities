import java.util.Scanner;

 class IGettingGreater{
    public static void main(String[] args) {

        Scanner input =new Scanner (System.in);
       
        
    
    System.out.println("Getting the Greater Value "); 
    System.out.print("Enter first character: "); 
    char first= input.next().charAt(0);
    int num1= (int)first;
    System.out.print("Enter second character: "); 
    char second= input.next().charAt(0);
    int num2= (int)second;
    

    char greaterchar= (char) Math.max (first, second);

    System.out.println("-------------------------------------- ");
    System.out.println("The character with greater value is: " + greaterchar );
    System.out.println("------------------------------------- ");

  System.out.println("Showing the ASCII Codes "); 
  System.out.println(first +": "+ num1); 
  System.out.println(second +": "+ num2); 
  
 
    }
}



    
    
