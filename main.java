
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


        System.out.println(drawer.hangman[0]);





      if(eingabe.equals("quit")){
        quit = true;
      }





    }
  }
}
