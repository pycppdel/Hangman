

class TEST{

  public static void main(String... args) throws Exception{

    Control controller = new Control();
    Hangman drawer = new Hangman();


    java.util.Scanner scan = new java.util.Scanner(System.in);

    boolean quit = false;

    String guess = "";

    while (!quit){


      drawer.refresh();


      controller.print_erraten();
      System.out.flush();
      guess = scan.next();

      if(guess.equals("quit")){

        quit = true;
      }
      else if(controller.guessed_letter(guess)){

        controller.replace_letter(guess);

      }



    }

  }
}
