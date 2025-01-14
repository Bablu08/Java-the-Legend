package OOPSBYSRADHA.Encapsulation.Bank;
class Account {
    public String name;
    protected String email;
    private String password;

//    gatter & setters - for accessing private
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String pass){
        this.password = pass;
    }
}
public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "TechTide Innovation";
        account1.email = "techtideinnovation@gmail.com";
//        account1.password = "abcd";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());
    }
}

//AccessModifiers - 4 types
//1. Public, Private, Protected, Default