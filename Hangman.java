public class Hangman {

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
