
import java.lang.*;
import java.util.*;

class MAIN{

  public static void main(String[] args) throws Exception{

    boolean quit = false;
    String eingabe;

    Hangman drawer = new Hangman();
    Control controller = new Control();

    drawer.refresh();

    System.out.println(drawer.hangman[0]);

    while (!quit){

      System.out.println(controller.erraten+"\n\n");
      eingabe = new Scanner(System.in).next();
      controller.guess(eingabe);
      if(eingabe.equals("quit")){
        quit = true;
      }



      drawer.refresh();


    }
  }
}
