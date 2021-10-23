
import java.lang.*;
import java.util.*;

class MAIN{

  public static void main(String[] args) throws Exception{

    boolean quit = false;
    String eingabe = "ggg";
    Hangman drawer = new Hangman();
    Control controller = new Control();
    boolean start = true;
    boolean gewonnen = false;


    drawer.refresh();


    while (!quit){

      if (!controller.guessed_letter(eingabe) && !start){

        System.out.println(drawer.drawNextHangman());
      }
      else{
        controller.replace_letter(eingabe);
        System.out.println(drawer.drawCurrentHangman());
      }

      System.out.print("\n\n\n");
      controller.print_erraten();


      if(eingabe.equals("quit")){
        quit = true;
      } else if (drawer.checkForLoser()) {

        quit = true;
      }
      else if(controller.won()){
        quit = true;
        gewonnen = true;
      }

      eingabe = new java.util.Scanner(System.in).next();



      drawer.refresh();
      start = false;



    }

    if (gewonnen){
      System.out.println("GEWONNEN");
    }
    else{
      System.out.println("VERLOREN");
    }
  }
}
