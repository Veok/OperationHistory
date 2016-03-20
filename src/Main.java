import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by L on 13.03.2016.
 */
public class Main {

    public static void main(String [] args){


       Operations account1 = new Operations(0.0);

        OperationHistory transaction1 =  new OperationHistory(2016,03,13, "Cash Income"  ,account1.income(1500.00));
        OperationHistory transaction2 =  new OperationHistory(2015,02,16, "Cash Withdraw"  ,account1.withdraw(500.00));
        OperationHistory transaction3 =  new OperationHistory(2016,01,17, "Cash Transfer"  ,account1.withdraw(455.00));
        OperationHistory transaction4 =  new OperationHistory(2013,05,18, "Cash Income"  ,account1.income(999.00));
        OperationHistory transaction5 =  new OperationHistory(2016,06,12, "Cash Withdraw"  ,account1.withdraw(5.00));
        OperationHistory transaction6 =  new OperationHistory(2015,07,11, "Cash Income"  ,account1.income(400.00));
        OperationHistory transaction7 =  new OperationHistory(2014,03,01, "Cash Transfer"  ,account1.withdraw(1000.00));
        OperationHistory transaction8 =  new OperationHistory(2016,04,06, "Cash Income"  ,account1.income(100.00));
        OperationHistory transaction9 =  new OperationHistory(2016,10,29, "Cash Withdraw"  ,account1.withdraw(150.00));
        OperationHistory transaction10 =  new OperationHistory(2016,03,10, "Cash Transfer"  ,account1.income(25.00));
        OperationHistory transaction11 =  new OperationHistory(2016,04,23, "Cash Withdraw"  ,account1.withdraw(300.00));
        OperationHistory transaction12 =  new OperationHistory(2016,12,11, "Cash Withdraw"  ,account1.withdraw(100.00));
        OperationHistory transaction13 =  new OperationHistory(2016,05,05, "Cash Income"  ,account1.income(50.00));
        OperationHistory transaction14 =  new OperationHistory(2016,01,01, "Cash Transfer"  ,account1.withdraw(20.00));
        OperationHistory transaction15 =  new OperationHistory(2016,03,07, "Cash Income"  ,account1.income(123.00));


        OperationHistory[] history = new OperationHistory[15];
        history[0] = transaction1;
        history[1] = transaction2;
        history[2] = transaction3;
        history[3] = transaction4;
        history[4] = transaction5;
        history[5] = transaction6;
        history[6] = transaction7;
        history[7] = transaction8;
        history[8] = transaction9;
        history[9] = transaction10;
        history[10] = transaction11;
        history[11] = transaction12;
        history[12] = transaction13;
        history[13] = transaction14;
        history[14] = transaction15;

       System.out.println("List of all operations:\n");
     OperationHistoryManager.printall(history);


     List<OperationHistory> historyList = Arrays.asList(history);

  Scanner in= new Scanner(System.in);
  int userChoice;
  boolean quit = false;

  do{

   System.out.println("\nWhat you like to do?");
   System.out.println("1. Show History by oldest.");
   System.out.println("2. Show History by newest.");
   System.out.println("3. Show history by year. ");
   System.out.println("4. Show history by month and year.");
   System.out.println("5. Show history by day.");
   System.out.println("6. Show balance.");
   System.out.println("7. Quit.");
   System.out.print("Choose a number:: ");
   userChoice = in.nextInt();

   switch(userChoice) {

    case 1: {

     OperationHistoryManager.sortByOldest(historyList);
     OperationHistoryManager.printall(history);
     break;
    }
    case 2: {

     OperationHistoryManager.sortByNewest(historyList);
     OperationHistoryManager.printall(history);
     break;
    }
    case 3: {

     String year;
     System.out.println("Type a year: ");
     Scanner yr = new Scanner(System.in);
     year = yr.nextLine();

     for (int i = 0; i < history.length; i++) {
      if (OperationHistoryManager.sortByDate(history[i].data2(), year) == false) {
      continue;
      }
      System.out.println(history[i]);
     }
     break;
    }
    case 4: {
     String yearAndMonth;
     System.out.println("\nType a year and month at this format YYYY-MM: ");
     Scanner yr = new Scanner(System.in);
     yearAndMonth = yr.nextLine();

     for (int i = 0; i < history.length; i++) {
      if (OperationHistoryManager.sortByDate(history[i].data3(), yearAndMonth) == false) {
       continue;
      }
      System.out.println(history[i]);
     }
     break;
    }

    case 5: {

     String dayYearAndMonth;
     System.out.println("Type a year and month at this format YYYY-MM-DD: ");
     Scanner dy = new Scanner(System.in);
     dayYearAndMonth = dy.nextLine();

     for (int i = 0; i < history.length; i++) {
      if (OperationHistoryManager.sortByDate(history[i].data1(), dayYearAndMonth) == false) {
       continue;
      }
      System.out.println(history[i]);
     }
     break;
    }

    case 6: {
     System.out.println("\nYour balance is: " + account1.getBalance() + "$");
     break;
    }

    case 7: {
     quit = true;
     System.out.println("\nGoodbye");
     break;
    }

    default:{
     System.out.println("\nWrong number.");
     break;}
   }

  }while(!quit);
 }
    }

