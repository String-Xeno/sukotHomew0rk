
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        Scanner input = new Scanner(System.in);
        int err0rrollbacks = 0;
        for (int i = 13; i <= 19; i++) {

            System.out.println();
            System.out.println("Targil " + i + " is running now!");
            System.out.println();
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

                double average = (double) (htest + etest + cctest + mtest) / 4;
                System.out.println("The students average is: " + average);

            }
            if (i == 15) {
                System.out.println("Hello! this is a calculator to add the tax price to the item (default tax 18%)");
                System.out.println("Please enter the price of the item you'd like to purchase: ");
                int price = input.nextInt();
                double pricewtax = price + price*0.18;
                System.out.println("The price of the item with tax is: " + pricewtax);
            }
            if (i == 16) {
                System.out.println("seller agent tax calculator");
                System.out.println("Shirt cost the agent sold them at:");
                int sold = input.nextInt();
                System.out.println("How many shirts did he sell?");
                int amount = input.nextInt();
                double taxed = amount*0.12 * sold;
                System.out.print("calculating");
                for (int la = 0; la <4; la++){
                    Thread.sleep(550);
                    System.out.print(".");
                }
                System.out.println();
                System.out.println("the agent's pay is: " + taxed);
            } else if (i == 17) {
                System.out.println("Enter monthly salary:");
                int salary = input.nextInt();
                double monthlyfund = ((salary - salary*0.15) * ((double) 2 /3));
                double dailyfund = monthlyfund/30;
                System.out.println("You can spend " + dailyfund + "per day");
            } else if (i == 18) {
                System.out.println("How much was the property sold for?");
                int pr1ce = input.nextInt();
                System.out.println("Enter the tax % the real estate agent takes");
                int taxpercent = input.nextInt();
                System.out.println("Enter expenses %");
                int expens3s = input.nextInt();
                System.out.println("Original price: " + pr1ce);
                double agentcost = pr1ce * taxpercent;
                System.out.println("Real estate agent cost: " + agentcost);
                double expenses = pr1ce * expens3s;
                System.out.println("other expenses: " + expenses);
                double finalprice = pr1ce - expens3s - taxpercent;
                System.out.println("the final profit is: " + finalprice);
            } else if (i == 19) {
                //first way
                System.out.println("enter A value");
                int a = input.nextInt();
                System.out.println("enter B value");
                int b = input.nextInt();
                int c = a;
                a = b;
                b = c;
                System.out.println("Values swapped! a = " + a + "and value b = " + b);
                //second way
                System.out.println("second way");
                System.out.println("enter A value");
                int x = input.nextInt();
                System.out.println("enter B value");
                int y = input.nextInt();
                x = x + y;
                y = x - y;
                x = x - y;
                System.out.println("Values swapped, now x = " + x + " and y = " + y);


            }
        }
    }
}
