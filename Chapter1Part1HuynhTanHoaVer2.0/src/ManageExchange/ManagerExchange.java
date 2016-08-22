/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageExchange;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Hoa Huynh
 * DATE: 23/08/2016
 * VER 1.0
 */
public class ManagerExchange {

    ArrayList<GoldExchange> ListGoldExchange;
    ArrayList<MoneyExchange> ListMoneyExchange;
    MoneyExchange moneyExchange;
    GoldExchange goldExchange;

    public ManagerExchange() {
        ListGoldExchange = new ArrayList<>();
        ListMoneyExchange = new ArrayList<>();

    }

    int chosen = 0;
    double averagePriceGold = 0;
    double averagePriceMoney = 0;
    double sumGold = 0;
    double sumMoney = 0;

    //Manage Exchange
    public void manageExchange() {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                boolean check = true;
                while (check) {
                    System.out.println("Choose kind Exchange Gold(1)/ Money(2)");
                    chosen = Integer.parseInt(input.readLine());
                    if (chosen == 1) {
                        goldExchange = new GoldExchange();
                        goldExchange.inputInfo();
                        ListGoldExchange.add(goldExchange);
                        sumGold += goldExchange.calculatePrice();
                    } else if (chosen == 2) {
                        moneyExchange = new MoneyExchange();
                        moneyExchange.inputInfo();
                        ListMoneyExchange.add(moneyExchange);
                        sumMoney += moneyExchange.getTotalPrice();
                    }
                    if (chosen != 1 && chosen != 2) {
                        System.err.println("Input wrong format!! Please input (1) or (2) ");
                        continue;
                    }
                    check = false;
                }
                System.out.print("Do you want to add Exchange 'Y' or 'N'? ");
                String answer = input.readLine();
                if (answer.equalsIgnoreCase("y")) {
                    continue;
                }
                System.out.println("Information of Gold Exchange: ");
                for (GoldExchange goldExchange : ListGoldExchange) {

                    goldExchange.showInfo();
                }
                System.out.println("Information of Money Exchange: ");
                for (MoneyExchange moneyExchange : ListMoneyExchange) {
                    moneyExchange.showInfo();
                }
                if (ListGoldExchange.size() != 0) {
                    averagePriceGold = sumGold / ListGoldExchange.size();
                    System.out.println(String.format("Average of Gold Exchange: %.2f", averagePriceGold));
                }
                if (ListMoneyExchange.size() != 0) {
                    averagePriceMoney = sumMoney / ListMoneyExchange.size();
                    System.out.println(String.format("Average of Money Exchange: %.2f", averagePriceMoney));
                }
                System.exit(0);
            } catch (Exception ex) {
                System.out.println(ex.toString());
                continue;
            }
        }

    }
}
