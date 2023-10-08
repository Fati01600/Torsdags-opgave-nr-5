package Task1;

public class Customer {
    //we are going to make 4 privates attributes
    // 1. first name - String
    private final String firstName;

    // 2. the last name - String
    private final String lastName;

    // 3. Username - String
    private final String userName;

    // 4. id - int
    private final int id;

    //Constructor for the attributes
    public Customer(String firstName1, String lastName1, String userName1, int id1){
        this.firstName = firstName1;
        this.lastName = lastName1;
        this.userName = userName1;
        this.id = id1;
    }
    // Getter for each attributes
    public String getFirstName(){
        return firstName; // it will give me the name
    }

    public String getLastName() {
        return lastName; // it will give me the last name
    }

    public String getUserName() {
        return userName; //it will give me the username
    }

    public int getId() {
        return id;// it will give me the id
    }
    public String toString(){ //printing the results
        return "First name: " + getFirstName() + "\n" + "Last name: " + getLastName() + "\n" + "User Name: " + getUserName() + "\n" + "ID Number: " + getId() + "\n";



    }
}
