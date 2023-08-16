import java.util.Arrays;
import java.util.Scanner;

public class BankApp{
    public static void main(String[] args) {
        
        Scanner SCANNER = new Scanner(System.in);

        final String CLEAR = "\033[H\033[2J";
        final String COLOR_BLUE_BOLD = "\033[34;1m";
        final String COLOR_RED_BOLD = "\033[31;1m";
        final String COLOR_GREEN_BOLD = "\033[33;1m";
        final String RESET = "\033[0m";

        final String DASHBOARD = "Welcome to Start Banking";
        final String CREATE_ACCOUNT = "Create New Account";
        final String DEPOSIT_MONEY = "Deposit";
        final String WITHDRAW_MONEY = "Withdrawal";
        final String TRANSFER_MONEY = "Transfer";
        final String CHECK_BALANCE  = "Check Balance";
        final String DELETE_STATE = "Delete Statement";

        final String ERROR_MSG = String.format("\t%s%s%s\n", COLOR_RED_BOLD, "%s", RESET);
        final String SUCCESS_MSG = String.format("\t%s%s%s\n", COLOR_GREEN_BOLD, "%s", RESET);

        String screen = DASHBOARD;
        String[][] users = new String[0][];

        mainloop:

        do{

            final String APP_TITLE = String.format("%s%s%s",
            COLOR_BLUE_BOLD, screen, RESET);

            System.out.println(CLEAR);
            System.out.println("\t" + APP_TITLE + "\n");

            switch(screen){

                case DASHBOARD:

                System.out.println("\t[1]. Create New Account");
                System.out.println("\t[2]. Deposit");
                System.out.println("\t[3]. Withdrawal");
                System.out.println("\t[4]. Transfer");
                System.out.println("\t[5]. Check Balance)");
                System.out.println("\t[6]. Delete Statement");
                System.out.print("\tEnter an option to continue: ");
                int option = SCANNER.nextInt();
                SCANNER.nextLine();

                switch (option){
                    case 1: screen = CREATE_ACCOUNT; break;
                    case 2: screen = DEPOSIT_MONEY; break;
                    case 3: screen = WITHDRAW_MONEY; break;
                    case 4: screen = TRANSFER_MONEY; break;
                    case 5: screen = CHECK_BALANCE; break;
                    case 6: screen = DELETE_STATE; break;
                    case 7: System.out.println(CLEAR); System.exit(0);
                    default: continue;
                }
                break;

                case CREATE_ACCOUNT:

                    //User ID generation

                    



            }








        }while(true);








    }
}