package Exercise2_ManageCD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Huynh Tan Hoa
 * @version 1.0
 * @since 19/09/2016
 */
public class ManageController {

    Database db = new Database();
    CD cd;
    public BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    //method insert product into CD
    public void insertProduct(CD cd) throws SQLException, ClassNotFoundException, UnsupportedEncodingException {
        try (Connection conn = db.connect()) {
            String sql = "INSERT INTO cd VALUES(NULL, '" + cd.getName() + "','"
                    + cd.getSinger() + "', '" + cd.getNumbersongs() + "','" + cd.getPrice() + "' )";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.execute();
            System.out.println("Insert cd successfull!!!");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    //method search product of CD from database
    public List<CD> searchProduct(String name) throws SQLException, ClassNotFoundException {
        List<CD> rs = new ArrayList<>();;
        try (Connection conn = db.connect()) {
            String sql = "SELECT * FROM cd WHERE name like '%" + name + "%'";
            java.sql.Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                cd = new CD();
                cd.setName(resultSet.getString("name"));
                cd.setSinger(resultSet.getString("singer"));
                cd.setNumbersongs(resultSet.getInt("numbersongs"));
                cd.setPrice(resultSet.getDouble("price"));
                rs.add(cd);
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

        return rs;
    }

    //method show Product of CD from database
    public void showProduct(CD cd) throws SQLException, ClassNotFoundException, UnsupportedEncodingException {
        try (Connection conn = db.connect()) {
            String sql = "SELECT * FROM cd";
            java.sql.Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                System.out.println("--------------------");
                System.out.println("id: " + resultSet.getInt("id"));
                System.out.println("name cd: " + resultSet.getString("name"));
                System.out.println("singer cd: " + resultSet.getString("singer"));
                System.out.println("number of songs: " + resultSet.getInt("numbersongs"));
                System.out.println("price cd: " + resultSet.getDouble("price"));
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    //method updated cd of CD from Database
    public void updateProduct(CD cd) throws SQLException, ClassNotFoundException {
        try (Connection conn = db.connect()) {
            String sql = "UPDATE cd SET numbersongs = " + cd.getNumbersongs() + ", price = " + cd.getPrice() + " WHERE name ='" + cd.getName() + "' ";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.execute();
            System.out.println("Updated successful!!");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    //method delete cd of CD from Database
    public void deleteProduct(CD cd) throws SQLException, ClassNotFoundException {
        try (Connection conn = db.connect()) {
            String sql = "DELETE FROM cd WHERE name ='" + cd.getName() + "' ";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.execute();
            System.out.println("Delete successful!!");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    //method check Choose function of user
    public void checkChoose(int choose) throws IOException, SQLException, ClassNotFoundException, UnsupportedEncodingException {

        switch (choose) {
            case 1:
                cd = new CD();
                System.out.println("Input name cd: ");
                cd.setName(input.readLine());
                System.out.println("Input singer cd: ");
                cd.setSinger(input.readLine());
                boolean flag = true;
                while (flag) {
                    try {
                        System.out.println("Input number of songs: ");
                        cd.setNumbersongs(Integer.parseInt(input.readLine()));
                    } catch (Exception e) {
                        System.err.println("Please input integer");
                        continue;
                    }
                    flag = false;
                }
                flag = true;
                while (flag) {
                    try {
                        System.out.println("Input price: ");
                        cd.setPrice(Double.parseDouble(input.readLine()));
                    } catch (Exception e) {
                        System.err.println("Please input double");
                        continue;
                    }
                    flag = false;
                }
                insertProduct(cd);
                break;
            case 2:
                List<CD> listCD;
                System.out.println("--------Search cd--------");
                System.out.println("Input name cd: ");
                String name = input.readLine();
                try {
                    listCD = searchProduct(name);
                    if (listCD.size() <= 0) {
                        System.out.println("Cannot find cd");
                    } else {
                        for (CD cd : listCD) {
                            System.out.println("Have cd !!");
                            System.out.println("--------------------");
                            System.out.println("name cd: " + cd.name);
                            System.out.println("singer cd: " + cd.singer);
                            System.out.println("number of songs: " + cd.numbersongs);
                            System.out.println("price cd: " + cd.price);
                            System.out.println("--------------------");
                        }
                    }
                } catch (Exception e) {
                    System.err.println("Error: " + e.getMessage());
                }
                break;
            case 3:
                cd = new CD();
                List<CD> listCD3;
                showProduct(cd);
                System.out.println("----------Update----------");
                System.out.println("Please input name cd update: ");
                String nameUpdated = input.readLine();
                try {
                    listCD3 = searchProduct(nameUpdated);
                    if (listCD3.size() <= 0) {
                        System.out.println("Cannot find cd");
                    } else {
                        System.out.println("Input number of songs update: ");
                        int num = Integer.parseInt(input.readLine());
                        System.out.println("Input price update: ");
                        double price = Double.parseDouble(input.readLine());
                        for (CD cd : listCD3) {
                            cd.setName(cd.getName());
                            cd.setNumbersongs(num);
                            cd.setPrice(price);
                        }
                        updateProduct(cd);
                    }
                } catch (Exception e) {
                    System.err.println("Error: " + e.getMessage());
                }
                break;
            case 4:
                cd = new CD();
                List<CD> listCD4;
                showProduct(cd);
                System.out.println("----------Delete----------");
                System.out.println("Please input name cd delete: ");
                String nameDelete = input.readLine();
                try {
                    listCD4 = searchProduct(nameDelete);
                    if (listCD4.size() <= 0) {
                        System.out.println("Cannot find cd");
                    } else {
                        for (CD cd : listCD4) {
                            cd.setName(nameDelete);
                        }
                        deleteProduct(cd);
                    }
                } catch (Exception e) {
                    System.err.println("Error: " + e.getMessage());
                }
                break;
            default:
                System.out.println("Please input from 1 to 4");
                break;
        }

    }
}
