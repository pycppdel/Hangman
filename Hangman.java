public class Hangman {

    public Hangman() {



    }

    public void refresh() throws Exception{

        if(Control.getOS().equals("Windows 10")) {
            new ProcessBuilder("cmd","/c", "cls").inheritIO().start().waitFor();
        } else {
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        }

        

    }
}
