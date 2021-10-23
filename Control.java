//import java.lang.Character;
public class Control{

  String[] wortliste = {

    "Apfel",
    "Erde",
    "Pferd",
    "Kanalisation",
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

  public boolean guessed_letter(String letter){


    if(letter.length() >= 2){

      return false;
    }

    if (chosen.contains(letter)){

      return true;
    }

    return false;



}

public void replace_letter(String letter) throws Exception{

  int z = chosen.length();
  String neu = "";

  for(int i=0;i<z;i++){

    if(Character.toString(chosen.charAt(i)).equalsIgnoreCase(letter)){

      neu += Character.toLowerCase(letter.charAt(0));
      neu += " ";


    }
    else{
      neu += Character.toString(Character.toLowerCase(erraten.charAt(i*2)));
      neu += " ";

    }


  }

  erraten = neu;


}

public void print_erraten(){

  System.out.print(erraten);

  System.out.println();
}

public boolean won(){

  return (erraten.equalsIgnoreCase(chosen));
}





}
