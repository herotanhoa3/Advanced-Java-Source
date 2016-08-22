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
public class GoldExchange extends Exchange {

    public GoldExchange(int type, String idExchange, String dateExchange, int numberExchange) {
        super(idExchange, dateExchange, numberExchange);
        this.type = type;
    }
    public GoldExchange(){
    }
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    int type;
    boolean check;

    public double calculatePrice() {
        double totalPrice = 0;
        check = true;
        while (check) {
            switch (type) {
                case 1:
                    totalPrice = numberExchange * GoldType.Gold18K.price;
                    break;
                case 2:
                    totalPrice = numberExchange * GoldType.Gold24K.price;
                    break;
                case 3:
                    totalPrice = numberExchange * GoldType.GoldSJC.price;
                    break;
                default:
                    System.out.println("");
                    continue;
            }
            check = false;
        }
        return totalPrice;
    }
    //METHOD OVERRIDE INPUT INFORMATION GOLD    
    @Override
    public void inputInfo() throws IOException {
        super.inputInfo();
        check = true;
        while (check) {
            try {
                System.out.println("Gold type: (1)Gold 18K/ (2)Gold 24k/ (3)Gold SJC");
                type = Integer.parseInt(input.readLine());
            } catch (Exception e) {
                System.err.println("Input wrong format!! Please input type (int)");
                continue;
            }
            if (type < 1 || type > 3) {
                System.err.println("Input wrong format!! Please input (1),(2) or (3)");
                continue;
            }
            check = false;
        }
    }
    //METHOD OVERRIDE OUTPUT INFORMATION GOLD    
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Gold type: " + type);
        System.out.println("total Price: " + String.format("%.1f", calculatePrice()));
    }

}
//ENUM TYPE GOLD
enum GoldType {
    Gold18K(25978000), Gold24K(35141000), GoldSJC(36230000);
    double price;

    GoldType(double price) {
        this.price = price;
    }
}
