import java.util.Scanner;

public class Customer {
    private String name;
    private String email;
    
    public Customer()
    {
    	
    }

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void getInputFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String name = scanner.next();

        System.out.print("Enter customer email: ");
        String email = scanner.next();

        this.setName(name);
        this.setEmail(email);

    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Customer otherBooking = (Customer) obj;
        return this.email.equals(otherBooking.getEmail());
    }
}
