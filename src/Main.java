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
            terminal = entry.nextDouble();
        }

    }
}