
import java.lang.*;
import java.util.*;

class MAIN{

  public static void main(String[] args) throws Exception{

    boolean quit = false;
    String eingabe;

    Hangman drawer = new Hangman();
    drawer.refresh();

    System.out.println(drawer.hangman[0]);

    while (!quit){

      eingabe = new Scanner(System.in).next();

      if(eingabe.equals("quit")){
        quit = true;
      }

      drawer.refresh();


    }
  }
}
