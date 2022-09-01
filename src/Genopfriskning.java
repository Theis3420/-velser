import java.util.ArrayList;

public class Genopfriskning {

  public ArrayList<String> myArrayList = new ArrayList<>();

  public boolean doesArraylistContainString(ArrayList list, String str) {

    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).equals(str)) {
        System.out.println("The String has been found");
        return true;
      }
    }
    return false;
  }

  public void execute() {
    myArrayList.add("One");
    myArrayList.add("Hello World");
    doesArraylistContainString(myArrayList, "Hello World");
  }

  public static void main(String[] args) {
    new Genopfriskning().execute();
  }

}
