import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Scanner userInput = new Scanner(System.in);


        String[] coffeeShop = {"Coffee cups", "Sugar packets", "Plastic spoons", "Napkins", "Milk"};

        int[] inventory = {500, 2225, 800, 5500, 10};


        int userChoice;

        do {
            System.out.println("What would you like to do? ");
            System.out.println("------------------------------------");
            System.out.println("1.  Display the current inventory for all items");
            System.out.println("2.  Check an items current inventory");
            System.out.println("3.  Add to an items inventory");
            System.out.println("4.  Subtract from an items inventory");

            userChoice = userInput.nextInt();
        } while (userChoice != 1 && userChoice != 2 && userChoice != 3 && userChoice != 4 && userChoice != 5);

        switch (userChoice) {
            case 1:
                for (int count = 0; count < coffeeShop.length; count++)
                    System.out.println(coffeeShop[count] + " " + inventory[count]);

                break;
            case 2:
                System.out.println("Which Item's inventory would you like?");
                System.out.println("------------------------------------");
                System.out.println("1.  Coffee cups");
                System.out.println("2.  Sugar packets");
                System.out.println("3.  Plastic spoons");
                System.out.println("4.  Napkins");
                System.out.println("5.  Milk");
                int userInput1 = scan.nextInt();
                if (userInput1 == 1) {
                    System.out.println("There are "+ inventory[0] + " " + coffeeShop[0] + " in stock.") ;
                }
                else if (userInput1 == 2){
                    System.out.println("There are "+ inventory[1] + " " + coffeeShop[1] + " in stock.") ;
                    }
                else if (userInput1 == 3){
                    System.out.println("There are "+ inventory[2] + " " + coffeeShop[2] + " in stock.") ;
                }
                else if (userInput1 == 4){
                    System.out.println("There are "+ inventory[3] + " " + coffeeShop[3] + " in stock.") ;
                }
                else if (userInput1 == 5){
                    System.out.println("There are "+ inventory[4] + " " + coffeeShop[4] + " in stock.") ;
                }
                else {
                    System.out.println("That is not a valid choice");
                }
                break;
            case 3:
                System.out.println("Which item would you like to add to inventory?");
                System.out.println("------------------------------------");
                System.out.println("1.  Coffee cups");
                System.out.println("2.  Sugar packets");
                System.out.println("3.  Plastic spoons");
                System.out.println("4.  Napkins");
                System.out.println("5.  Milk");
                int userInput2 = scan.nextInt();
                System.out.println("How many items would you like to add?");
                int userInput3 = scan.nextInt();

                if (userInput2 == 1) {
                    inventory[0] += userInput3;
                    System.out.println("You added " + userInput3 + " " + coffeeShop[0]);
                    System.out.println("There are now a total of " + inventory[0] + " " + coffeeShop[0]);
                }
                else if (userInput2 == 2){
                    inventory[1] += userInput3;
                    System.out.println("You added " + userInput3 + " " + coffeeShop[1]);
                    System.out.println("There are now a total of " + inventory[1] + " " + coffeeShop[1]);

                }
                else if (userInput2 == 3){
                    inventory[2] += userInput3;
                    System.out.println("You added " + userInput3 + " " + coffeeShop[2]);
                    System.out.println("There are now a total of " + inventory[2] + " " + coffeeShop[2]);

                }
                else if (userInput2 == 4){
                    inventory[3] += userInput3;
                    System.out.println("You added " + userInput3 + " " + coffeeShop[3]);
                    System.out.println("There are now a total of " + inventory[3] + " " + coffeeShop[3]);

                }
                else if (userInput2 == 5){
                    inventory[4] += userInput3;
                    System.out.println("You added " + userInput3 + " " + coffeeShop[4]);
                    System.out.println("There are now a total of " + inventory[4] + " " + coffeeShop[4]);

                }
                else{
                    System.out.println("That is not a valid choice");
                }


                break;
            case 4:
                System.out.println("Which item would you like to subtract from inventory?");
                System.out.println("------------------------------------");
                System.out.println("1.  Coffee cups");
                System.out.println("2.  Sugar packets");
                System.out.println("3.  Plastic spoons");
                System.out.println("4.  Napkins");
                System.out.println("5.  Milk");
                int userInput4 = scan.nextInt();
                System.out.println("How many items would you like to subtract?");

                int userInput5 = scan.nextInt();

                if (userInput4 == 1) {
                    inventory[0] -= userInput5;
                        if (inventory[0] < 0){
                            System.out.print("There are not " + userInput5 + " items in stock");
                            inventory[0] = 0;
                            break;
                        }

                    System.out.println("You subtracted " + userInput5 + " " + coffeeShop[0]);
                    System.out.println("There are now a total of " + inventory[0] + " " + coffeeShop[0]);
                }
                else if (userInput4 == 2){
                    inventory[1] -= userInput5;
                    if (inventory[1] < 0){
                        System.out.print("There are not " + userInput5 + " items in stock");
                        inventory[1] = 0;
                        break;
                    }
                    System.out.println("You subtracted " + userInput5 + " " + coffeeShop[1]);
                    System.out.println("There are now a total of " + inventory[1] + " " + coffeeShop[1]);


                }
                else if (userInput4 == 3){
                    inventory[2] -= userInput5;
                    if (inventory[2] < 0){
                        System.out.print("There are not " + userInput5 + " items in stock");
                        inventory[2] = 0;
                        break;
                    }
                    System.out.println("You subtracted " + userInput5 + " " + coffeeShop[2]);
                    System.out.println("There are now a total of " + inventory[2] + " " + coffeeShop[2]);

                }
                else if (userInput4 == 4){
                    inventory[3] -= userInput5;
                    if (inventory[3] < 0){
                        System.out.print("There are not " + userInput5 + " items in stock");
                        inventory[3] = 0;
                        break;
                    }
                    System.out.println("You subtracted " + userInput5 + " " + coffeeShop[3]);
                    System.out.println("There are now a total of " + inventory[3] + " " + coffeeShop[3]);

                }
                else if (userInput4 == 5){
                    inventory[4] -= userInput5;
                    if (inventory[4] < 0){
                        System.out.print("There are not " + userInput5 + " items in stock");
                        inventory[4] = 0;
                        break;
                    }
                    System.out.println("You subtracted " + userInput5 + " " + coffeeShop[4]);
                    System.out.println("There are now a total of " + inventory[4] + " " + coffeeShop[4]);

                }
                else{
                    System.out.println("That is not a valid choice");
                }


                break;

            default:
                System.out.println("That is not a valid choice.");
                break;


        }

    }}