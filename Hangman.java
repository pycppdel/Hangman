public class Hangman {

    public Hangman() {



    }

    public void refresh() throws Exception{

      new ProcessBuilder("cls").inheritIO().start().waitFor();
    }
}
