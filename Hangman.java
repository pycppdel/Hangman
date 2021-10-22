public class Hangman {

<<<<<<< HEAD
    public String[] hangman = new String[8];

    hangman[0] =    "                      \n"+
                    "         _____        \n"+
                    "        |     |       \n"+
                    "        |     O       \n"+
                    "        |    /|\\     \n"+
                    "        |    / \\     \n"+
                    "      __|__           \n"+
                    "     /     \\         \n";

    hangman[1] =    "                      \n"+
                    "         _____        \n"+
                    "        |     |       \n"+
                    "        |     O       \n"+
                    "        |    /|\\     \n"+
                    "        |    / \\     \n"+
                    "      __|__           \n"+
                    "     /     \\         \n";
=======

    public Hangman() {
>>>>>>> 3d21e547963a730406c84aca30fcb71830f080d7

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
