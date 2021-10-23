
import java.lang.*;
import java.util.*;

class MAIN{

  public static void main(String[] args) throws Exception{

    boolean quit = false;
    String eingabe = "";
    Hangman drawer = new Hangman();
    Control controller = new Control();


    drawer.refresh();


    while (!quit){

      eingabe = new java.util.Scanner(System.in).next();
      drawer.refresh();


      if(true) {
        System.out.println(drawer.drawNextHangman());
      } else {
        System.out.println(drawer.drawCurrentHangman());
      }


      if(eingabe.equals("quit")){
        quit = true;
      } else if (drawer.checkForLoser()) {
        System.out.println("Du hast verloren!");
        quit = true;
      }

    }
  }
}
