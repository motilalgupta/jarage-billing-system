import Services.BillingService;
import entity.Customer;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        BillingService service = new BillingService();

        while (true){

            System.out.println("1. Add Customer with Vehicle \n2. Generate Invoice \n3. Show Invoice \n4. Exit \n");
            int ch = sc.nextInt();
            switch (ch){
                case 1:
                    System.out.print("Customer name: ");
                    String name = sc.next();
                    System.out.print("Phone: ");
                    String phone = sc.next();
                    service.customerService.addCustomers(new Customer(0,name,phone));
                    System.out.println("Enter Vehicle number ");
                    String vehicleNum = sc.next();
                    System.out.println("Enter Vehicle model ");
                    String model = sc.next();
                    Customer customerBasedOnNum = service.customerService.getCustomerBasedOnNum(phone);

                    break;
                case 2:
                    System.out.println("Select a ID from above Customer");
                    System.out.print("Enter customer ID: ");
                    int cid = sc.nextInt();
                    System.out.print("Enter vehicle ID: ");
                    int vid = sc.nextInt();
                    System.out.print("Enter the number of survices: ");
                    int n = sc.nextInt();
                    List<Integer> sids = new ArrayList<>();
                    for(int i = 0; i<n; i++){
                        System.out.print("Enter the service ID: ");
                        sids.add(sc.nextInt());
                    }
                    service.createInvoice(cid,vid,sids);
                    break;
                case 3:
                    service.showAllInvoice();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Your choice is not satisfied");
                    break;
            }
        }
    }
}
