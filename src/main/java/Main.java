import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the order amount?");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("What state do you live in?");
        String state = scanner.nextLine();

        // Wisconsin
        if(state.equalsIgnoreCase("Winconsin")){
            double taxes = amount*.05;
            System.out.println("What county do you live in?");
            String county = scanner.nextLine();
            // Eau Claire
            if(county.equalsIgnoreCase("Eau Claire")){
                taxes += amount*0.005;
            }
            if(county.equalsIgnoreCase("Dunn")){
                taxes += amount*0.004;
            }
            double total = amount + taxes;
            System.out.println("The tax is $"+(String.format("%.2f", taxes))+
                    "\nThe total is $"+(String.format("%.2f", total)));
        }
        else if(state.equalsIgnoreCase("illinois")){
            double taxes = amount*.08;
            double total = amount + taxes;
            System.out.println("The tax is $"+(String.format("%.2f", taxes))+
                    "\nThe total is $"+(String.format("%.2f", total)));
        }
        else{
            System.out.println("The total is $"+(String.format("%.2f", amount)));
        }

    }
}
