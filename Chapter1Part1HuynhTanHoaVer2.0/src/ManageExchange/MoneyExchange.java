/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageExchange;

import java.io.IOException;

/**
 *
 * @author Hoa Huynh
 * DATE: 23/08/2016
 * VER 1.0
 */
public class MoneyExchange extends Exchange {

    public MoneyExchange(int moneyExchange, int typeExchange, String idExchange, String dateExchange, int numberExchange) {
        super(idExchange, dateExchange, numberExchange);
        this.moneyExchange = moneyExchange;
        this.typeExchange = typeExchange;
    }

    public MoneyExchange() {
    }

    public int getMoneyExchange() {
        return moneyExchange;
    }

    public void setMoneyExchange(int moneyExchange) {
        this.moneyExchange = moneyExchange;
    }

    public int getTypeExchange() {
        return typeExchange;
    }

    public void setTypeExchange(int typeExchange) {
        this.typeExchange = typeExchange;
    }
    int moneyExchange;
    int typeExchange;

    public double getTotalPrice() {
        double totalPrice = 0;
        switch (moneyExchange) {
            case 1:
                if (typeExchange == 1) {
                    totalPrice = numberExchange * MoneyType.USD.price;
                } else if (typeExchange == 2) {
                    totalPrice = numberExchange * MoneyType.USD.price + (numberExchange * MoneyType.USD.price) * 0.01;
                }
                break;
            case 2:
                if (typeExchange == 1) {
                    totalPrice = numberExchange * MoneyType.EUR.price;
                } else if (typeExchange == 2) {
                    totalPrice = numberExchange * MoneyType.EUR.price + (numberExchange * MoneyType.EUR.price) * 0.01;
                }
                break;
            case 3:
                if (typeExchange == 1) {
                    totalPrice = numberExchange * MoneyType.AUD.price;
                } else if (typeExchange == 2) {
                    totalPrice = numberExchange * MoneyType.AUD.price + (numberExchange * MoneyType.AUD.price) * 0.01;
                }
                break;
            default:
                break;
        }
        return totalPrice;
    }
    //METHOD OVERRIDE INPUT INFORMATION MONEY 
    @Override
    public void inputInfo() throws IOException {
        super.inputInfo();
        boolean check = true;
        while (check) {
            try {
                System.out.println("Money type: USA(1)/ EUR(2)/ AUD(3) ");
                moneyExchange = Integer.parseInt(input.readLine());
            } catch (Exception e) {
                System.err.println("Input wrong format!! Please input type (int)");
                continue;
            }
            if (moneyExchange < 1 || moneyExchange > 3) {
                System.err.println("Input wrong format!! Please input (1),(2) or (3)");
                continue;
            }
            check = false;
        }

        check = true;
        while (check) {
            try {
                System.out.println("Exchange type: Buy(1)/ Sell(2) ");
                typeExchange = Integer.parseInt(input.readLine());
            } catch (Exception e) {
                System.err.println("Input wrong format!! Please input (1),(2)");
                continue;
            }
            if (typeExchange != 1 && typeExchange != 2) {
                System.err.println("Input wrong format!! Please input (1) or (2)");
                continue;
            }
            check = false;
        }
    }
    //METHOD OVERRIDE OUTPUT INFORMATION MONEY  
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("total Price: " + String.format("%.1f", getTotalPrice()));
    }

}
//ENUM TYPE MONEY
enum MoneyType {
    USD(22260), EUR(24900), AUD(16700);

    double price;

    MoneyType(double price) {
        this.price = price;
    }
}
