//import java.lang.Character;
public class Control{

  String[] wortliste = {

    "Apfel",
    "Erde",
    "Pferd",
    "Kanlisation",
    "Frucht",
    "Essen",
    "Garten",

  };

  String erraten, chosen;
  int wortlength;
  int index;

  public Control(){

    index = (int)(Math.random()*1000%wortliste.length);
    chosen = wortliste[index];
    wortlength = chosen.length();

    erraten = "";

    for(int i=0; i<wortlength;i++){

      erraten += "_ ";
    }


  }

  public static String getOS(){

    return System.getProperty("os.name");
  }

  public boolean guess(String letter){


return true;
}

}
