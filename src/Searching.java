import java.util.ArrayList;

public class Searching {
  ArrayList<String> strings = new ArrayList<>();

  public int getIndex(ArrayList array, String str) {
    for (int i = 0; i < array.size(); i++) {
      if (array.get(i).equals(str)) {
        return i;
      }
    }
    throw new RuntimeException("Didn't find string");
  }

  public void execute() {
    strings.add("One");
    strings.add("Two");
    strings.add("Three");
    strings.add("Four");

    System.out.println(getIndex(strings, "Five"));
  }

  public static void main(String[] args) {
    new Searching().execute();
  }
}
