public class User {

    // TODO: Create Private Attribute of User (Name and Phone Number) then Create Setter method for each attribute
    private String name;
    private int number;

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }
     
    public int getNumber() {
        return number;
    }


    // TODO: Create Method to Register User and Display User's Name and Phone Number and success message
    public void Register() {
        System.out.println("Register Berhasil");
        System.out.println("Nama: " + this.name);
        System.out.println("Nama: " + this.number);
    }

}
