package Services;

import Config.DbConfig;
import entity.Invoice;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InvoiceService {
    public void addInvoice(Invoice invoice) throws SQLException {
        Connection conn = DbConfig.getConnection();
        PreparedStatement ps = conn.prepareStatement("INSERT INTO invoices (customers_id, survices_id," +
                " vehicel_id) VALUES (?,?,?)");
        ps.setInt(1, invoice.getCustomers_id());
        ps.setInt(2,invoice.getServices_id());
        ps.setInt(3,invoice.getVehicle_id());
        ps.executeUpdate();
        ps.close();
        conn.close();
    }
    public List<Invoice> getAllInvoice() throws SQLException {
        List<Invoice> list = new ArrayList<>();
        Connection conn = DbConfig.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM invoices");
        while (rs.next()){
            list.add(new Invoice(rs.getInt(1),rs.getInt("customers_id"),rs.getInt
                    ("survices_id"),rs.getInt("vehicel_id")));
        }
        return list;
    }
}
