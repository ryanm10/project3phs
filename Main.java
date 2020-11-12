//Ryan Milton 
//November 12th 2020 
//Period 3 Gaber


import java.util.Scanner; //Scanner to be imported
class Main {
  public static void main(String[] args) {
    int [] learnerSeats = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }; //These are the seat numbers, as there are 15 people in the class, there are 15 numbers.
      String[] newNames = new String[15]; //Because there are 15, we put string15
     Scanner reader = new Scanner(System.in);
      System.out.println("Welcome! To begin, as you know it's the first day of school. (Yay!) As a way to help, please give 15 names, so it can be easier to assign a student to a seat, as I'm confused. Thank you!"); //This is where they will have to enter in 15 names from here, and then their input will be recieved. It's meant to be a nice little introduction, so they understand what to do and the story behind it. 
      for(int x = 0; x < 15; x++)
     {
         String temp = reader.nextLine();
         newNames[x] = temp;
     }
     int i = 0; 
     System.out.println("Well, thank you! Here is assigned seats chart, you made for me: "); //Printing out the assigned chart, after the user gives in 15 different names.
     while(i<15) {
       System.out.println(newNames[i] + " Has been assigned to seat: " + learnerSeats[i] ); //Keeps printing out 15 different names, because since there are 15 seats, it should only print 15 names, nothing less or more. 
       i++;
     }
  } //End bracket don't worry 
} //End bracket don't worry
//I tried to make this interactive, as if this was a real story, and not just, put 15 seats. For example, I said that the teacher needs your help, and she needs hel