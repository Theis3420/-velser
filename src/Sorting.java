import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sorting {
  Scanner in = new Scanner(System.in);
  ArrayList<String> strings = new ArrayList<>();

  public void stringMethod(String str1, String str2, String str3, String str4, String str5) {
    strings.add(str1);
    strings.add(str2);
    strings.add(str3);
    strings.add(str4);
    strings.add(str5);

    Collections.sort(strings);
    Collections.reverse(strings);

    for (int i = 0; i < strings.size(); i++) {
      System.out.println(strings.get(i));
    }
  }

  public void execute() {
    stringMethod(in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
  }

  public static void main(String[] args) {
    new Sorting().execute();
  }

}
