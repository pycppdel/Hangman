

class TEST{

  public static void main(String... args) throws Exception{

    Control controller = new Control();
    Hangman drawer = new Hangman();


    java.util.Scanner scan = new java.util.Scanner(System.in);

    boolean quit = false;

    String guess = "";

    while (!quit){

      Thread.sleep(100);

      drawer.refresh();


      System.out.println(controller.erraten);
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
