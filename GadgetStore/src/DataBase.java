import java.sql.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.ClassNotFoundException;


public class DataBase {
    public void start(){
        Scanner s = new Scanner(System.in);
        Connection connection = null;
        Statement stmt = null;

        try {
            String url = "jdbc:postgresql://localhost:5432/GadgetStore";
            String username = "postgres";
            String password = "1234";

            Class.forName("org.postgresql.Driver");
            // Establish the connection
            connection = DriverManager.getConnection(url, username, password);
            if (connection != null) {
                System.out.println("Opened the database \n\n\n\n");
            }
            stmt = connection.createStatement();


            while (true) {
                ResultSet rs = null;
                System.out.println("Welcome to the GadgetStore!!!");
                System.out.println("--------------------------");
                System.out.println("What do you want to buy? Choose one of the options:");
                System.out.println("1. Smartphones");
                System.out.println("2. Laptops");
                System.out.println("3. SmartWatch");
                System.out.println("4. Accessories");
                System.out.println("5. Cart");
                System.out.println("--------------------------");
                int input = s.nextInt();
                if (input == 1) {
                    System.out.println("Please, choose brand you want to buy");
                    String query = "SELECT * FROM Smartphones";
                    try (PreparedStatement ps = connection.prepareStatement(query)) {
                        rs = ps.executeQuery();
                        while (rs.next()) {
                            System.out.println(rs.getString("Brand") + "    " + rs.getInt("price"));
                        }
                        System.out.println("--------------------------");
                        System.out.println("Which one do you want to buy?");
                        System.out.println("1. Apple");
                        System.out.println("2. Samsung");
                        System.out.println("3. Huawei");
                        System.out.println("4. LG");
                        System.out.println("5. <---Back");
                        int input1 = s.nextInt();
                        if (input1 == 1) {
                            query = "INSERT INTO ORDERS (Name, Price) values ('Apple', 500000)";
                            try (PreparedStatement ps1 = connection.prepareStatement(query)) {
                            ps1.execute();
                            System.out.println("Your product is in cart!");
                            System.out.println("--------------------------");
                            continue;
                            }
                        }
                        if (input1 == 2) {
                            query = "INSERT INTO ORDERS (Name, Price) values ('Samsung', 300000)";
                            try (PreparedStatement ps2 = connection.prepareStatement(query)) {
                                ps2.execute();
                                System.out.println("Your product is in cart!");
                                System.out.println("--------------------------");
                                continue;
                            }
                        }
                        if (input1 == 3) {
                            query = "INSERT INTO ORDERS (Name, Price) values ('Huawei', 250000)";
                            try (PreparedStatement ps3 = connection.prepareStatement(query)) {
                                ps3.execute();
                                System.out.println("Your product is in cart!");
                                System.out.println("--------------------------");
                                continue;
                            }
                        }
                        if (input1 == 4) {
                            query = "INSERT INTO ORDERS (Name, Price) values ('LG', 150000)";
                            try (PreparedStatement ps4 = connection.prepareStatement(query)) {
                                ps4.execute();
                                System.out.println("Your product is in cart!");
                                System.out.println("--------------------------");
                                continue;
                            }
                        }
                        else if (input1 == 5) {
                            continue;
                        }
                    }
                }

                if (input == 2) {
                    System.out.println("--------------------------");
                    System.out.println("Please, choose brand you want to buy");
                    String query = "SELECT * FROM Laptops";
                    try (PreparedStatement ps = connection.prepareStatement(query)) {
                        rs = ps.executeQuery();
                        while (rs.next()) {
                            System.out.println(rs.getString("Brand") + "    " + rs.getInt("price"));
                        }
                        System.out.println("--------------------------");
                        System.out.println("Which one do you want to buy?");
                        System.out.println("1. HP");
                        System.out.println("2. Lenovo");
                        System.out.println("3. Acer");
                        System.out.println("5. <---Back");
                        int input1 = s.nextInt();
                        if (input1 == 1) {
                            query = "INSERT INTO ORDERS (Name, Price) values ('HP', 500000)";
                            try (PreparedStatement ps4 = connection.prepareStatement(query)) {
                                ps4.execute();
                                System.out.println("Your product is in cart!");
                                System.out.println("--------------------------");
                                continue;
                            }
                        }
                        if (input1 == 2) {
                            query = "INSERT INTO ORDERS (Name, Price) values ('Lenovo', 300000)";
                            try (PreparedStatement ps5 = connection.prepareStatement(query)) {
                                ps5.execute();
                                System.out.println("Your product is in cart!");
                                System.out.println("--------------------------");
                                continue;
                            }
                        }
                        if (input1 == 3) {
                            query = "INSERT INTO ORDERS (Name, Price) values ('Acer', 400000)";
                            try (PreparedStatement ps6 = connection.prepareStatement(query)) {
                                ps6.execute();
                                System.out.println("Your product is in cart!");
                                System.out.println("--------------------------");
                                continue;
                            }

                        } else if (input1 == 5) {
                            continue;
                        }
                    }


                }
                if (input == 3) {
                    System.out.println("--------------------------");
                    System.out.println("Please, choose brand you want to buy");
                    String query = "SELECT * FROM SmartWatch";
                    try (PreparedStatement ps = connection.prepareStatement(query)) {
                        rs = ps.executeQuery();
                        while (rs.next()) {
                            System.out.println(rs.getString("Brand") + "    " + rs.getInt("price"));
                        }
                        System.out.println("--------------------------");
                        System.out.println("Which one do you want to buy?");
                        System.out.println("1. Apple Watch");
                        System.out.println("2. Samsung Galaxy Watch");
                        System.out.println("3. Xiaomi Mi Band");
                        System.out.println("5. <---Back");
                        int input1 = s.nextInt();
                        if (input1 == 1) {
                            query = "INSERT INTO ORDERS (Name, Price) values ('Apple Watch', 120000)";
                            try (PreparedStatement ps7 = connection.prepareStatement(query)) {
                                ps7.execute();
                                System.out.println("Your product is in cart!");
                                System.out.println("--------------------------");
                                continue;
                            }
                        }
                        if (input1 == 2) {
                            query = "INSERT INTO ORDERS (Name, Price) values ('Samsung Galaxy Watch', 90000)";
                            try (PreparedStatement ps8 = connection.prepareStatement(query)) {
                                ps8.execute();
                                System.out.println("Your product is in cart!");
                                System.out.println("--------------------------");
                                continue;
                            }
                        }
                        if (input1 == 3) {
                            query = "INSERT INTO ORDERS (Name, Price) values ('Xiaomi Mi band', 30000)";
                            try (PreparedStatement ps9 = connection.prepareStatement(query)) {
                                ps9.execute();
                                System.out.println("Your product is in cart!");
                                System.out.println("--------------------------");
                                continue;
                            }

                        } else if (input1 == 5) {
                            continue;
                        }
                    }


                }
                if (input == 4) {
                    System.out.println("--------------------------");
                    System.out.println("Please, choose type of accessories you want to buy");
                    String query = "SELECT * FROM Accessories";
                    try (PreparedStatement ps = connection.prepareStatement(query)) {
                        rs = ps.executeQuery();
                        while (rs.next()) {
                            System.out.println(rs.getString("Type") + "    " + rs.getInt("price"));
                        }
                        System.out.println("--------------------------");
                        System.out.println("Which one do you want to buy?");
                        System.out.println("1. Earphone");
                        System.out.println("2. Charger");
                        System.out.println("5. <---Back");
                        int input1 = s.nextInt();
                        if (input1 == 1) {
                            query = "INSERT INTO ORDERS (Name, Price) values ('Earphone', 15000)";
                            try (PreparedStatement pss = connection.prepareStatement(query)) {
                                pss.execute();
                                System.out.println("Your product is in cart!");
                                System.out.println("--------------------------");
                                continue;
                            }
                        }
                        if (input1 == 2) {
                            query = "INSERT INTO ORDERS (Name, Price) values ('Charger', 5000)";
                            try (PreparedStatement pss1 = connection.prepareStatement(query)) {
                                pss1.execute();
                                System.out.println("Your product is in cart!");
                                System.out.println("--------------------------");
                                continue;
                            }

                        } else if (input1 == 5) {
                            continue;
                        }
                    }
                }
                if (input == 5) {
                    ResultSet result = null;
                    String query = "SELECT * FROM Orders";
                    try (PreparedStatement ps = connection.prepareStatement(query)) {
                        result = ps.executeQuery();
                        while (result.next()) {
                            System.out.println(result.getString("Name") + "    " + result.getInt("price"));
                        }
                    }
                    System.out.println("--------------------------");
                    System.out.println("1. Show SUM");
                    System.out.println("2. Clear");
                    System.out.println("3. Back");

                    int input2 = s.nextInt();
                    if (input2 == 1) {
                        ResultSet result1 = null;
                        String query1 = "Select SUM(price) as SUM FROM Orders";
                        try (PreparedStatement pss = connection.prepareStatement(query1)) {
                            result1 = pss.executeQuery();
                            while (result1.next()) {
                                System.out.println("Your sum is " + result1.getInt("SUM"));
                            }
                        }
                    }

                    if (input2 == 2) {
                        String query2 = "Delete from Orders";
                        try (PreparedStatement pss1 = connection.prepareStatement(query2)) {
                            pss1.execute();
                            System.out.println("Your cart is empty!");
                            System.out.println("--------------------------");
                            continue;
                        }
                    }

                    else if (input2 == 3) {
                      return;
                    }

                } else {
                    break;
                }


            }
            stmt.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}