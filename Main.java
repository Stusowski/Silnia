import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj z jakiej liczby mam obliczyć silnię: ");
    int a = scanner.nextInt();
    long silnia = 1;
    for(int i=1;i<=a;i++){
      silnia = silnia * i;
    }
    System.out.println("Silnia wynosi: "+silnia);
  }
}