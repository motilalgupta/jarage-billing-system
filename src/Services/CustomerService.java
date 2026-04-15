package Services;

import Config.DbConfig;
import entity.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    public void addCustomers(Customer customer) throws SQLException {
        Connection conn = DbConfig.getConnection();
        PreparedStatement ps = conn.prepareStatement("INSERT INTO customers (name,phone_no)VALUES(?,?)");
        ps.setString(1, customer.getName());
        ps.setInt(2, customer.getPhone_no());
        ps.executeUpdate();
        ps.close();
        conn.close();
    }

    public List<Customer> getAllCustomer() throws SQLException {
        List<Customer> list = new ArrayList<>();
        Connection conn = DbConfig.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM customers");
        while (rs.next()) {
            list.add(new Customer(rs.getInt(1), rs.getString("name"), rs.getString
                    ("phone_no")));
        }
        return list;
    }
    public Customer getCustomerBasedOnNum(String number) throws SQLException {
        Customer customer = new Customer();
        Connection conn = DbConfig.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM customers where "+number);
        while (rs.next()) {
            customer = new Customer(rs.getInt("id"), rs.getString("name"), rs.getString
                    ("phone_no"));
        }
        return customer;
    }

}

