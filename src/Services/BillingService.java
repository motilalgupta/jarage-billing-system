package Services;

import entity.Invoice;

import java.sql.SQLException;
import java.util.List;

public class BillingService {
    public CustomerService customerService = new CustomerService();
    public InvoiceService invoiceService = new InvoiceService();

    public void createInvoice(int customerId, int vehicleId, List<Integer> serviceIds) throws SQLException {
        String sids = "";
        for (int serviceId : serviceIds){
            sids += serviceId;
        }
        invoiceService.addInvoice(new Invoice(1,customerId,vehicleId,Integer.parseInt(sids)));
        System.out.println("Invoice is generated successfully!");
    }
    public void showAllInvoice() throws SQLException {
        List<Invoice> invoice = invoiceService.getAllInvoice();
        for ( Invoice invoices : invoice){
            System.out.println(invoices);
        }
    }

}
