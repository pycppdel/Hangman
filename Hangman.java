public class Hangman {

    public String[] hangman = new String[9];
<<<<<<< HEAD
=======

>>>>>>> b046d162ea4d6e8958869b20ec6066608cabf782


    public Hangman() {

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
                        "        |             \n"+
                        "      __|__           \n"+
                        "     /     \\         \n";

        hangman[2] =    "                      \n"+
                        "         _____        \n"+
                        "        |     |       \n"+
                        "        |     O       \n"+
                        "        |     |       \n"+
                        "        |             \n"+
                        "      __|__           \n"+
                        "     /     \\         \n";

        hangman[3] =    "                      \n"+
                        "         _____        \n"+
                        "        |     |       \n"+
                        "        |     O       \n"+
                        "        |             \n"+
                        "        |             \n"+
                        "      __|__           \n"+
                        "     /     \\         \n";

        hangman[4] =    "                      \n"+
                        "         _____        \n"+
                        "        |     |       \n"+
                        "        |             \n"+
                        "        |             \n"+
                        "        |             \n"+
                        "      __|__           \n"+
                        "     /     \\         \n";

        hangman[5] =    "                      \n"+
                        "         _____        \n"+
                        "        |             \n"+
                        "        |             \n"+
                        "        |             \n"+
                        "        |             \n"+
                        "      __|__           \n"+
                        "     /     \\         \n";

        hangman[6] =    "                      \n"+
                        "                      \n"+
                        "        |             \n"+
                        "        |             \n"+
                        "        |             \n"+
                        "        |             \n"+
                        "      __|__           \n"+
                        "     /     \\         \n";

        hangman[7] =    "                      \n"+
                        "                      \n"+
                        "                      \n"+
                        "                      \n"+
                        "                      \n"+
                        "                      \n"+
                        "      __ __           \n"+
                        "     /     \\         \n";

        hangman[8] =    "                      \n"+
                        "                      \n"+
                        "                      \n"+
                        "                      \n"+
                        "                      \n"+
                        "                      \n"+
                        "                      \n"+
                        "                      \n";

<<<<<<< HEAD
    }
=======
                      }
>>>>>>> b046d162ea4d6e8958869b20ec6066608cabf782

    public void refresh() throws Exception{

        if(Control.getOS().equals("Windows 10")) {
            new ProcessBuilder("cmd","/c", "cls").inheritIO().start().waitFor();
        } else {
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        }



    }
}
