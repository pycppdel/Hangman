public class Hangman {

    String[] hangman = new String[9];
    int index = 0;


    public Hangman() {

        hangman[7] =    "                      \n"+
                        "         _____        \n"+
                        "        |     |       \n"+
                        "        |     O       \n"+
                        "        |    /|\\     \n"+
                        "        |    / \\     \n"+
                        "      __|__           \n"+
                        "     /     \\         \n";

        hangman[6] =    "                      \n"+
                        "         _____        \n"+
                        "        |     |       \n"+
                        "        |     O       \n"+
                        "        |    /|\\     \n"+
                        "        |             \n"+
                        "      __|__           \n"+
                        "     /     \\         \n";

        hangman[5] =    "                      \n"+
                        "         _____        \n"+
                        "        |     |       \n"+
                        "        |     O       \n"+
                        "        |     |       \n"+
                        "        |             \n"+
                        "      __|__           \n"+
                        "     /     \\         \n";

        hangman[4] =    "                      \n"+
                        "         _____        \n"+
                        "        |     |       \n"+
                        "        |     O       \n"+
                        "        |             \n"+
                        "        |             \n"+
                        "      __|__           \n"+
                        "     /     \\         \n";

        hangman[3] =    "                      \n"+
                        "         _____        \n"+
                        "        |     |       \n"+
                        "        |             \n"+
                        "        |             \n"+
                        "        |             \n"+
                        "      __|__           \n"+
                        "     /     \\         \n";

        hangman[2] =    "                      \n"+
                        "         _____        \n"+
                        "        |             \n"+
                        "        |             \n"+
                        "        |             \n"+
                        "        |             \n"+
                        "      __|__           \n"+
                        "     /     \\         \n";

        hangman[1] =    "                      \n"+
                        "                      \n"+
                        "        |             \n"+
                        "        |             \n"+
                        "        |             \n"+
                        "        |             \n"+
                        "      __|__           \n"+
                        "     /     \\         \n";

        hangman[0] =    "                      \n"+
                        "                      \n"+
                        "                      \n"+
                        "                      \n"+
                        "                      \n"+
                        "                      \n"+
                        "      __ __           \n"+
                        "     /     \\         \n";

    }

    public void refresh() throws Exception{

        if(Control.getOS().equals("Windows 10")) {
            new ProcessBuilder("cmd","/c", "cls").inheritIO().start().waitFor();
        } else {
            new ProcessBuilder("clear").inheritIO().start().waitFor();
        }

    }

    public String drawCurrentHangman() {

        return hangman[index-1];

    }

    public String drawNextHangman() {

        index++;
        return hangman[index-1];

    }

    public boolean checkForLoser() {

        if(index == 8) {
            return true;
        } else {
            return false;
        }

    }
}
