import java.util.Scanner;

class Main 
{
  //static int totalCostTax (int );
  
  
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    int menuChoice;
    String name;
    float [] price ={21.25f,8.00f,15.95f,16.95f,17.95f};
    
    int menuAmount;
    float lambChopSubTotalCost;
    float frenchOnionSubTotalCost;
    float chickenFingersSubTotalCost;
    float fishTacosSubTotalCost;
    float baconBurgerSubTotalCost;

    float [][]menuArray; 
    menuArray = new float [5][3];
    System.out.println("Welcome to The LowDown!");
    System.out.println("What is your name?");
    name = input.nextLine();
      
    for(int i=0; i<5; i++)
    {
      menuArray [i][1] = price[i];
    }

    do {
      System.out.println();
      System.out.println("What would you like to buy?");
      System.out.println("1. Lamb Chop       $21.25 2. French Onion Soup        $8.00");
      System.out.println("3. Chicken Fingers $15.95 4. Fish Tacos (Three Tacos) $16.95");
      System.out.println("5. Bacon Burger    $17.95 6. Leave the menu" );
      System.out.println();
      menuChoice = Integer.parseInt(input.nextLine());
      
    
      if (menuChoice == 1 || menuChoice == 2 || menuChoice == 3 || menuChoice == 4 || menuChoice == 5 )
       {
      if (menuChoice == 1) 
      {
        System.out.println("How many meals would you like?");
        menuAmount = Integer.parseInt(input.nextLine());
        
        lambChopSubTotalCost = price[0] * menuAmount;
        System.out.println(menuAmount+" Lamb Chop(s) cost $"+lambChopSubTotalCost);
      }
      
      if (menuChoice == 2) 
      {
        System.out.println("How many meals would you like?");
        menuAmount = Integer.parseInt(input.nextLine());
        frenchOnionSubTotalCost = price[1] * menuAmount;
        System.out.println(menuAmount+" French Onion Soup(s) cost $"+frenchOnionSubTotalCost);
      }   
      
      if (menuChoice == 3) 
      {
        System.out.println("How many meals would you like?");
        menuAmount = Integer.parseInt(input.nextLine());
        chickenFingersSubTotalCost = price[2] * menuAmount;
        System.out.println(menuAmount+" Chicken Fingers cost $"+chickenFingersSubTotalCost);
      }
      
      if (menuChoice == 4) 
      {
        System.out.println("How many meals would you like?");
        menuAmount = Integer.parseInt(input.nextLine());
        fishTacosSubTotalCost = price[3] * menuAmount;
        System.out.println(menuAmount+" Fish Tacos cost $"+fishTacosSubTotalCost);
      }
      
      if (menuChoice == 5) 
      {
        System.out.println("How many meals would you like?");
        menuAmount = Integer.parseInt(input.nextLine());
        baconBurgerSubTotalCost = price[4] * menuAmount;
        System.out.println(menuAmount+" Bacon Burger(s) cost $"+baconBurgerSubTotalCost);
      }

      }
    } while (menuChoice != 6);
if (menuChoice == 6) 
      {
        System.out.println(menuArray[][]);
      }
  }
}