package gitTutorial;

public class Main {

   public static void main(String[] args) {
       SalesData data = new SalesData();
       displayGreeting();
       data.display();
   } //End main


  private static void displayGreeting() {
           System.out.println("Hello happy sales people!");
           System.out.println("This app shows sales data.");
           System.out.println("---------------------------");
  } //End displayGreeting

}  //End class Main