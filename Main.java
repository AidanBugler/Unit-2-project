import java.util.Scanner;

class Main 
{
  // This is the methoid that calculates the total tax of the item
  static double totalCostTax (double x)
  {
    return x * 1.13;
  }
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);

    int menuChoice;
    String name;
    
    //This array is what stores the price of every item for easy access
    float [] price ={21.25f,8.00f,15.95f,16.95f,17.95f};
    
    int menuAmount;
    //These are all the valuse before tax
    float lambChopSubTotalCost;
    float frenchOnionSubTotalCost;
    float chickenFingersSubTotalCost;
    float fishTacosSubTotalCost;
    float baconBurgerSubTotalCost;
    //These are the values after tax is calculated
    double lambChopTotalCost;
    double frenchOnionTotalCost;
    double chickenFingersTotalCost;
    double fishTacosTotalCost;
    double baconBurgerTotalCost;
    //This will take everything that is ordered and find the total with tax
    double orderTotal;
    //This is the menu array that stores Quantity, Price and subtotal
    double [][]menuArray; 
    menuArray = new double [5][3];
    
    //Boolan Array to check if the item on the menu has been bought and if so it wont let them buy it again, it is also how i check if the user has bought the max 5 items and needs to leave 
    boolean [] itemChecker = {false,false,false,false,false};
    
    //First output that looks for the name of the user
    System.out.println("Welcome to The LowDown!");
    System.out.println("What is your full name?");
    name = input.nextLine();
    //Name Array to split the name of user
    String nameArray []= name.split(" ");  
    for(int i=0; i<5; i++)
    {
      menuArray [i][1] = price[i];
    }
    //This is the output menu system that gives the user all the choices and prices to go along with it
    do {
      System.out.println();
      System.out.printf("What would you like to buy?%n");
      System.out.printf("1. Lamb Chop       $21.25 2. French Onion Soup        $8.00%n");
      System.out.printf("3. Chicken Fingers $15.95 4. Fish Tacos (Three Tacos) $16.95%n");
      System.out.println("5. Bacon Burger    $17.95 6. Leave the menu" );
      System.out.println();
      menuChoice = Integer.parseInt(input.nextLine());
      
    //Once the user imputs a selection this part of the code will figure out what they picked and where to go from there
      if (menuChoice == 1 || menuChoice == 2 || menuChoice == 3 || menuChoice == 4 || menuChoice == 5 )
      {
    //Each section is very similar other so i will only explain the first section. The first 2 lines ask the user how much they want of whatever they picked. The next 3 lines of code calculate the subtotal and total prices and tell the user what the total price of that will cost if the item was bought on its own. The last 3 lines of code are for storing the amount of things the user wants, the subtotal cost of everything and changing the item checker value so that the user can't buy it again and so that the program knows they have bought something.
      if (menuChoice == 1 && itemChecker[0]==false) 
      {
        System.out.println("How many meals would you like?");
        menuAmount = Integer.parseInt(input.nextLine());
        lambChopSubTotalCost = price[0] * menuAmount;
        lambChopTotalCost = totalCostTax(lambChopSubTotalCost);
        System.out.println(menuAmount+" Lamb Chop(s) cost $"+lambChopTotalCost+" tax included");
        menuArray[0][0] = menuAmount;
        menuArray[0][2] = lambChopSubTotalCost;
        itemChecker [0] = true;
      }else if (menuChoice == 2 && itemChecker[1]==false) 
      {
        System.out.println("How many meals would you like?");
        menuAmount = Integer.parseInt(input.nextLine());
        frenchOnionSubTotalCost = price[1] * menuAmount;
        frenchOnionTotalCost = totalCostTax(frenchOnionSubTotalCost);
        System.out.println(menuAmount+" French Onion Soup(s) cost $"+frenchOnionTotalCost+" tax included");
        menuArray[1][0] = menuAmount;
        menuArray[1][2] = frenchOnionSubTotalCost;
        itemChecker [1] = true;
      }else if (menuChoice == 3&& itemChecker[2]==false) 
      {
        System.out.println("How many meals would you like?");
        menuAmount = Integer.parseInt(input.nextLine());
        chickenFingersSubTotalCost = price[2] * menuAmount;
        chickenFingersTotalCost = totalCostTax(chickenFingersSubTotalCost);
        System.out.println(menuAmount+" Chicken Fingers cost  $"+chickenFingersTotalCost+" tax included");
        menuArray[2][0] = menuAmount;
        menuArray[2][2] = chickenFingersSubTotalCost;
        itemChecker [2] = true;
      }else if (menuChoice == 4 && itemChecker[3]==false) 
      {
        System.out.println("How many meals would you like?");
        menuAmount = Integer.parseInt(input.nextLine());
        fishTacosSubTotalCost = price[3] * menuAmount;
        fishTacosTotalCost = totalCostTax(fishTacosSubTotalCost);
        System.out.println(menuAmount+" Fish Tacos cost $"+fishTacosTotalCost+" tax included");
        menuArray[3][0] = menuAmount;
        menuArray[3][2] = fishTacosSubTotalCost;
        itemChecker [3] = true;
      }else if (menuChoice == 5 && itemChecker[4]==false) 
      {
        System.out.println("How many meals would you like?");
        menuAmount = Integer.parseInt(input.nextLine());
        baconBurgerSubTotalCost = price[4] * menuAmount;
        baconBurgerTotalCost = totalCostTax(baconBurgerSubTotalCost);
        System.out.println(menuAmount+" Bacon Burger(s) cost $"+baconBurgerTotalCost+" tax included");
        menuArray[4][0] = menuAmount;
        menuArray[4][2] = baconBurgerSubTotalCost;
        itemChecker [4] = true;
      }
        else
        {
        System.out.println("You have already ordered that!");
        }
      }
    // This is what checks if the user wants to leave early by pressing 6 or if they have bought everything on the menu and can not buy anything else
    } while (menuChoice != 6 && (itemChecker[0]==false || itemChecker[1]==false || itemChecker[2]==false || itemChecker[3]==false || itemChecker[4]==false) );
    // This is the receipt for the user once the program closes 
        System.out.println();
        System.out.println("Thank you "+nameArray[0]+" for your purchase!");
        System.out.println("Your order was... ");
        System.out.printf("%27s %8s %12s %n","Quantity","Price","Subtotal");
        System.out.printf("%-18s %.2f %s %.2f %s %.2f%n","Lamb Chop",menuArray[0][0],"      ",menuArray[0][1],"   ",menuArray[0][2]);
        System.out.printf("%-18s %.2f %s %.2f %s %.2f%n","French Onion Soup",menuArray[1][0],"      ",menuArray[1][1],"    ",menuArray[1][2]);
        System.out.printf("%-18s %.2f %s %.2f %s %.2f%n","Chicken Fingers",menuArray[2][0],"      ",menuArray[2][1],"   ",menuArray[2][2]);
        System.out.printf("%-18s %.2f %s %.2f %s %.2f%n","Fish Tacos",menuArray[3][0],"      ",menuArray[3][1],"   ",menuArray[3][2]);
        System.out.printf("%-18s %.2f %s %.2f %s %.2f%n","Bacon Burger",menuArray[4][0],"      ",menuArray[4][1],"   ",menuArray[4][2]);
        System.out.println();
        orderTotal = totalCostTax (menuArray[0][2]+menuArray[1][2]+menuArray[2][2]+menuArray[3][2]+menuArray[4][2]);
        System.out.printf("%s %.2f","Your final total is $",orderTotal);
  }
}

