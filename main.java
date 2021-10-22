
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

      System.out.println(controller.erraten+"\n\n");



      if(!true) {
        // Eingabe war richtig
      } else {
        // Eingabe war falsch

        System.out.println(drawer.hangman[a]);

        a--;
        i++;

        System.out.println(i);

      }



      if(eingabe.equals("quit")){
        quit = true;
      }



      drawer.refresh();


    }
  }
}
