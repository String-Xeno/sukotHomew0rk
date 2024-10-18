
import java.util.Scanner;
import  java.util.concurrent.TimeUnit;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        Scanner input = new Scanner(System.in);
        int err0rrollbacks = 0;
        for (int i = 13; i <= 19; i++) {

            System.out.println("Targil " + i + " is running now!");
            if (i == 13){
                while (err0rrollbacks != 1) { //I use the while in error cases, the project will rerun
                    System.out.println("Hello! this is gram to ounce and ounce to gram calculator!");
                    System.out.println("Which unit would you like to be converted to the other?");
                    System.out.println("O/o = ounce.");
                    System.out.println("G/g = gram");
                    char un1t = input.next().charAt(0);
                    //gram to ounce
                    if (un1t == 'G' || un1t == 'g') {
                        System.out.println("How many grams would you like to convert into ounces?");
                        double convert2ounce = input.nextDouble();
                        double converted2ounce = convert2ounce/28.34952;
                        System.out.println("The grams in ounce are: " + converted2ounce);
                        System.out.println("Have a good day!");
                        err0rrollbacks = 1;
                    } else if (un1t == 'O' || un1t == 'o') {
                        System.out.println("How many ounces would you like to convert into grams?");
                        double convert2gram = input.nextDouble();
                        double converted2gram = convert2gram*28.34952;
                        System.out.println("The ounces in grams are: " + converted2gram);
                        System.out.println("Have a good day!");
                        err0rrollbacks = 1;
                    } else {
                        System.out.print("Error! restarting");
                        for (int u = 1; u <= 3; u++){
                            Thread.sleep(750);
                            System.out.print(".");
                        }
                        System.out.println();
                    }
                    // error system


                }

            }
            if (i == 14) {
                System.out.println("Hello, this is an average grade calculator!");
                System.out.println("Please enter English test result: ");
                int etest = input.nextInt();

                System.out.println("Please enter Math test result: ");
                int mtest = input.nextInt();

                System.out.println("Please enter History test result: ");
                int htest = input.nextInt();

                System.out.println("Please enter Coding test result: ");
                int cctest = input.nextInt();
                double average = (htest + etest + cctest + mtest) / 4;
                System.out.print("The students average is: ");

                System.out.println();

                System.out.printf("");
            }
        }
    }
}
