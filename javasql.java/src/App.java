public class App {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        Customer c1 = new Customer(1, "Roberto", "García", 28, "robert@email.com");
        Customer c2 = new Customer(2, "Rodrigo", "Gonzalez", 31, "rodri@email.com");

        MySqlCRUD conn = new MySqlCRUD();
        conn.insertCustomer(c1);
        conn.insertCustomer(c2);
        conn.readCustomer();
        conn.updateCustomer(3, "Jorge");
        conn.deleteCustomer(3);
    }
}
