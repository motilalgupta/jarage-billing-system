package entity;

public class Customer {
    private int id;
    private String name;

    private int phone_no;

    public Customer(int id, String name, String phone_no) {
        this.id = id;
        this.name = name;
        this.phone_no = Integer.parseInt(phone_no);
    }

    public Customer() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(int phone_no) {
        this.phone_no = phone_no;
    }

    @Override
    public String toString() {
        return "[ Customer ID: "+id + "Name: "+name+ "Phone No. "+phone_no+" ]";
    }
}
