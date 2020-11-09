import java.util.Scanner; //Scanner to be imported
class Main {
  public static void main(String[] args) {
     Scanner reader = new Scanner(System.in);
    int [] seatnumbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,15}; //These are the seat numbers, as there are 15 people in the class, there are 15 numbers.
       String[]names = {"Bob", "Mario", "Mark", "Blip", "Kim", "Rob", "Zard", "Card", "Mew", "Kim", "Sam", "Chad", "Ryan", "Mart", "Walk"}; //These are the names of the 15 kids who are in the class, as there are 15 seats, there will be 15 names.
    for (int i = 0; i < names.length; i++)
     {
         System.out.println( names[i] ); //Printing user's response
         String response = reader.nextLine(); //String response
     }
  } //End bracket don't worry
} //End bracket don't worry