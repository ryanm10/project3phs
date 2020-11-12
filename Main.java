import java.util.Scanner; //Scanner to be imported
class Main {
  public static void main(String[] args) {
    int [] learnerSeats = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }; //These are the seat numbers, as there are 15 people in the class, there are 15 numbers.
    String[] newNames = new String[15];
     Scanner sc = new Scanner(System.in);
     System.out.println("Welcome! To begin, as you know it's the first day of school. (Yay!) As a way to help, please give 15 names, so it can be easier to assign a student to a seat, as I'm confused. Thank you!");
      for(int x = 0; x < 15; x++)
     {
         String name = sc.nextLine();
         NewNames[x] = name;
     }
     int i = 0; 
     System.out.println("Well, thank you! Here is assigned seats chart, you made for me: ");
     while(i<15); {
       System.out.println(newNames[i] + "Has been assigned to seat: " + learnerSeats[i] );
       i++;
     }
     System.out.println("Thanks!");
  } //End bracket don't worry 
} //End bracket don't worry