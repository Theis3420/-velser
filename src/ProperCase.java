import java.util.ArrayList;

public class ProperCase {


  public void stringMethod(String str) {
    String[] words = str.split(" ");
    for (int i = 0; i < words.length; i++) {
      if (words[i].equals(words[i].toUpperCase())) {
      } else if (words[i].length() > 3) {
        words[i] = String.valueOf(words[i].charAt(0)).toUpperCase() + words[i].substring(1);
      } else if (words[i].length() <= 3) {
        words[i] = words[i].toLowerCase();
      }
      System.out.print(words[i] + " ");
    }
  }

  public void execute() {
    System.out.println("YESTERDAY Was great");
    stringMethod("YESTERDAY Was great");
  }

  public static void main(String[] args) {
    new ProperCase().execute();
  }
}
