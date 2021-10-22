public class Hangman {

    public Hangman() {



    }

    public void refresh() throws Exception{

      new ProcessBuilder("clear").inheritIO().start().waitFor();
    }
}
