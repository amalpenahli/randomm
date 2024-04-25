import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int returnNumber = random();
        sum+=returnNumber;
        System.out.println(returnNumber);
        System.out.println("tesadufi qayidan reqem: " +   returnNumber);
        int number1 = input();
        success(number1, sum);
        unSuccess(number1, sum);

  }
  public  static int input(){
      System.out.println("Reqem texmin edin");
      Scanner scanner = new Scanner(System.in);
      int number1 = scanner.nextInt();
      return number1;
  }
  public  static int random(){
      Random random = new Random();
      int rand = random.nextInt(100)+1;
      return rand;


  }

  public static void success(int number, int sum){

      System.out.println(number);

      if(number==sum){
          System.out.println("tebrikler");
      }


  }

    public static  void unSuccess(int number , int sum){

           if (number > sum) {
               System.out.println("kicik reqem yazin");
               input();
           } else if (number < sum) {
               System.out.println("boyuk reqem yazin");
               input();
           }

    }
}