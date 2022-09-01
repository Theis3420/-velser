import java.util.ArrayList;

public class Bibliotek {

  private ArrayList<Bog> Bøger = new ArrayList<>();

  public boolean harBog(Bog bog) {
    for (int i = 0; i < Bøger.size(); i++) {
      if (Bøger.get(i).getIsbnNummer().equals(bog.getIsbnNummer())) {
        System.out.println("Har Bog!");
        return true;
      }
    }
    return false;
  }

  public void execute() {
    Bog bog1 = new Bog("0001", "One", "1990");
    Bog bog2 = new Bog("0002", "Two", "1991");
    Bog bog3 = new Bog("0003", "Three", "1992");
    Bøger.add(bog1);
    Bøger.add(bog2);
    Bøger.add(bog3);

    harBog(bog3);
  }

  public static void main(String[] args) {
    new Bibliotek().execute();
  }

}
