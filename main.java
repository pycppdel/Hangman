
import java.lang.*;
import java.util.*;

class MAIN{

  public static void main(String[] args) throws Exception{

    boolean quit = false;
    String eingabe;
    int i = 0;
    int a = 8;

    Hangman drawer = new Hangman();
    Control controller = new Control();

    drawer.refresh();

    while (!quit){

      eingabe = new Scanner(System.in).next();


      if(false) {
        // Eingabe war richtig
      } else {
        // Eingabe war falsch

        System.out.println(drawer.hangman[2]);

        
      }


      if(eingabe.equals("quit")){
        quit = true;
      }



      drawer.refresh();
      System.out.println(controller.erraten);
      controller.guess(eingabe);


    }
  }
}
