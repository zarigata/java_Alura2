import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        double money = 3750;
        double flow = 0;
        int terminal = 0;

        System.out.println("""
                 
                 
                 /$$$$$$$                      /$$                        /$$$$$$        /$$$$$$$   /$$$$$$   /$$$$$$  /$$      /$$
                | $$__  $$                    | $$                       /$$__  $$      | $$__  $$ /$$__  $$ /$$__  $$| $$$    /$$$
                | $$  \\ $$  /$$$$$$  /$$$$$$$ | $$   /$$        /$$$$$$ | $$  \\__/      | $$  \\ $$| $$  \\ $$| $$  \\ $$| $$$$  /$$$$
                | $$$$$$$  |____  $$| $$__  $$| $$  /$$/       /$$__  $$| $$$$          | $$  | $$| $$  | $$| $$  | $$| $$ $$/$$ $$
                | $$__  $$  /$$$$$$$| $$  \\ $$| $$$$$$/       | $$  \\ $$| $$_/          | $$  | $$| $$  | $$| $$  | $$| $$  $$$| $$
                | $$  \\ $$ /$$__  $$| $$  | $$| $$_  $$       | $$  | $$| $$            | $$  | $$| $$  | $$| $$  | $$| $$\\  $ | $$
                | $$$$$$$/|  $$$$$$$| $$  | $$| $$ \\  $$      |  $$$$$$/| $$            | $$$$$$$/|  $$$$$$/|  $$$$$$/| $$ \\/  | $$
                |_______/  \\_______/|__/  |__/|__/  \\__/       \\______/ |__/            |_______/  \\______/  \\______/ |__/     |__/
                     
                 Welcome to Bank of DOOM, here you can do the folowing actions:
                 1 - Check Money Balance
                 2 - Recive value
                 3 - Transfer Value
                 4 - LEAVE 
                                                                                                                                 
                """);
        while(terminal != 4){
            System.out.println("====================================================");
            System.out.println("Your Current Balance is: " + money + " Silver Lions");
            System.out.println("====================================================");
            System.out.println("Please type your input:");
            terminal = entry.nextInt();
            if (terminal == 1){
                System.out.println("Your Current Balance is " + money + "Silver Lions");
            }
            if (terminal == 2){
                System.out.println("Please input the value you want to insert:");
                flow = entry.nextInt();
                money += flow;
                System.out.println("your operations is sucesfully done! Your new balance is" + money + "Silver Lions");
            }
            if (terminal == 3){
                System.out.println("Please Input how much money you want to withdraw:");
                flow = entry.nextInt();
                if (flow >= money){
                    System.out.println("Cant withdraw more than you have...");
                }else{
                    money -= flow;
                    System.out.println("your operations is sucesfully done! Your new balance is" + money + "Silver Lions");
                }
            }
        }
        System.out.println("Thank you for using DOOM bank!");
    }
}