import java.util.Random;

public class rpsgame{
  private String name;
  private String rps;
  private int botMove;
  private Random randInt;
  public rpsgame(String n){
    name = n;
    rps = "";
    botMove = 0;
    randInt = new Random();
    
  }
  public void move(String m){
    rps = m;
    if(rps.equalsIgnoreCase("r")){
    System.out.println("You played rock");
      AImove();
      if(botMove == 1){
        System.out.println("Tie.");
      }
      else if(botMove == 2){
        System.out.println("The bot wins.");
      }
      else if(botMove == 3){
        System.out.println("You win.");
      }
      }
  if(rps.equalsIgnoreCase("p")){
    System.out.println("You played paper");
        AImove();
      if(botMove == 1){
        System.out.println("You win.");
      }
      else if(botMove == 2){
        System.out.println("Tie.");
      }
      else if(botMove == 3){
        System.out.println("The bot wins.");
      }
      }
    if(rps.equalsIgnoreCase("s")){
    System.out.println("You played scissors");
        AImove();
      if(botMove == 1){
        System.out.println("The bot wins.");
      }
        else if(botMove == 2){
        System.out.println("You win.");
        }
      else if(botMove == 3){
        System.out.println("Tie.");
      }
      }
  
  }  
  public void AImove(){
     botMove = randInt.nextInt(1,4);
    System.out.print(botMove);
  
    if(botMove == 1){
      System.out.println("The AI played Rock.");
    } else if(botMove == 2){
      System.out.println("The AI played Paper.");
    } else if(botMove == 3){
      System.out.println("The AI played Scissors.");
    }
    
  }
    
}
