/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManageBook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Hoa Huynh
 */
public class ManageBook {
    ArrayList<TextBook> ListTextBooks;
    ArrayList<ReferenceBook> ListReferenceBooks;
    TextBook textBook;
    ReferenceBook referenceBook;

    public ManageBook() {
        ListTextBooks = new ArrayList<>();
        ListReferenceBooks = new ArrayList<>();
    }

    int chosen = 0;
    double sumTextBook = 0;
    double sumReferenceBook = 0;

    //METHOD Manage Book
    public void managerBook() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            boolean check = true;
            while (check) {
                System.out.println("Choose kind TextBook(1)/ ReferenceBook(2)");
                chosen = Integer.parseInt(input.readLine());
                if (chosen == 1) {
                    textBook = new TextBook();
                    textBook.inputInfo();
                    ListTextBooks.add(textBook);
                    sumTextBook += textBook.calculatePrice();
                } else if (chosen == 2) {
                    referenceBook = new ReferenceBook();
                    referenceBook.inputInfo();
                    ListReferenceBooks.add(referenceBook);
                    sumReferenceBook += referenceBook.calculatePrice();
                }
                if (chosen != 1 && chosen != 2) {
                     System.err.println("Input wrong format!! Please input type (int)");
                continue;
                }
                check = false;
            }
            System.out.print("Do you want to add Book 'Y' or 'N' ? ");
            String answer = input.readLine();
            if (answer.equalsIgnoreCase("y")) {
                continue;
            }
            System.out.println("Information of TextBooks: ");
            for (TextBook textBook : ListTextBooks) {

                textBook.outputInfo();
            }
            System.out.println("Information of ReferenceBook: ");
            for (ReferenceBook referenceBookstudent : ListReferenceBooks) {

                referenceBookstudent.outputInfo();
            }
            if (ListTextBooks.size() != 0) {
                System.out.println(String.format("Total Price Text Books: %.1f", sumTextBook));
            }
            if (ListReferenceBooks.size() != 0) {
                System.out.println(String.format("Total Price Reference Books: %.1f", sumReferenceBook));
                double averagePriceReferenceBooks = sumReferenceBook / ListReferenceBooks.size();
                System.out.println(String.format("Average Price Reference Books: %.1f", averagePriceReferenceBooks));
            }
        }
    }
}
