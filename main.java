
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

<<<<<<< HEAD
      

      drawer.refresh();


      
=======


      eingabe = new java.util.Scanner(System.in).next();
      drawer.refresh();


        System.out.println(drawer.hangman[0]);
        System.out.flush();
>>>>>>> cd8224e4af3def4bffa404afa06ca85c967d0d28


      if(eingabe.equals("quit")){
        quit = true;
      }



<<<<<<< HEAD

=======
>>>>>>> cd8224e4af3def4bffa404afa06ca85c967d0d28
    }
  }
}
