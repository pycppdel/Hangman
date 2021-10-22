public class Hangman {

    public Hangman() {



    }

    public void refresh() throws Exception{

<<<<<<< HEAD
      
      new ProcessBuilder("cmd /c cls").inheritIO().start().waitFor();
=======
        if(Control.getOS().equals("Windows 10")) {
            new ProcessBuilder("cmd","/c", "cls").inheritIO().start().waitFor();
        } else {
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        }

        

>>>>>>> 88c2db922d60bfc8cad1255a8d297199a45555bf
    }
}
