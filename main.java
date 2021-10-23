
import java.lang.*;
import java.util.*;

class MAIN{

  public static void main(String[] args) throws Exception{

    boolean quit = false;
    String eingabe;
    Hangman drawer = new Hangman();
    Control controller = new Control();

    drawer.refresh();

    while (!quit){

        drawer.refresh();

      drawer.refresh();


<<<<<<< HEAD
      if(false) {
        // Eingabe war richtig
      } else {
        // Eingabe war falsch

        System.out.println(drawer.hangman[2]);

        
      }
=======
        System.out.println(drawer.hangman[0]);



>>>>>>> b046d162ea4d6e8958869b20ec6066608cabf782


      if(eingabe.equals("quit")){
        quit = true;
      }



<<<<<<< HEAD
      System.out.println(controller.erraten);
      controller.guess(eingabe);
=======
>>>>>>> b046d162ea4d6e8958869b20ec6066608cabf782

    }
  }
}
