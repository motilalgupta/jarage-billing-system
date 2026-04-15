package entity;

public class Invoice {
    private int id;
    private int customers_id;
    private int services_id;
    private int vehicle_id;

    public Invoice(int id, int customers_id, int services_id, int vehicle_id) {
        this.id = id;
        this.customers_id = customers_id;
        this.services_id = services_id;
        this.vehicle_id = vehicle_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomers_id() {
        return customers_id;
    }

    public void setCustomers_id(int customers_id) {
        this.customers_id = customers_id;
    }

    public int getServices_id() {
        return services_id;
    }

    public void setServices_id(int services_id) {
        this.services_id = services_id;
    }

    public int getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(int vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    @Override
    public String toString() {
        return "Invoice [ " + "id= " + id +", customers_id= " + customers_id + ", services_id= " + services_id +
                ", vehicle_id= " + vehicle_id + " ]";
    }
}
