import java.util.Scanner;
class Main {
  public static void main (String[] args){
   Scanner kbReader = new Scanner(System.in);   
    
    System.out.println("Enter your name: ");
    String input = kbReader.nextLine();
    rpsgame newgame = new rpsgame(input);
    
    boolean play = true;
    while(play){
      
      String theMove = kbReader.nextLine();
    newgame.move(theMove);
    }
    kbReader.close();
  }
}