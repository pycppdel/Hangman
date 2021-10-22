public class Hangman {

    public Hangman() {



    }

    public void refresh() throws Exception{

      
      new ProcessBuilder("cmd /c cls").inheritIO().start().waitFor();
    }
}
