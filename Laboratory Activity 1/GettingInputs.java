import java.util.Scanner;

 class Input{
    public static void main(String[] args) {

        Scanner input =new Scanner (System.in);
        Scanner input2 =new Scanner (System.in);
        
        
    
    System.out.print("Enter the year: "); 
    int year= input2.nextInt();
    System.out.print("Enter the genre: ");
    String genre= input.nextLine();
    System.out.print("Enter the album: ");
    String album= input.nextLine();
    System.out.print("Enter the song title: ");
    String title= input.nextLine();
    System.out.print("Enter the Artist: "); 
    String bini= input.nextLine();
    

    System.out.println("------------------------ ");
    System.out.println("SONG DETAILS ");
    System.out.println("------------------------ ");

    System.out.println("Year Released: " + year);
    System.out.println("Genre: " + genre);
    System.out.println("Album: " + album);
    System.out.println("Title: " + title);
    System.out.println("Artist: " + bini);
    input.close();
    
   
    }

}