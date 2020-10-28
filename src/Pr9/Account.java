package Pr9;

public class Account
{
    private String INN;
    private String name;

    public Account(String INN, String name)
    {
        this.INN = INN;
        this.name = name;
    }
    public String get_INN()
    {
        return INN;
    }

    public String getName()
    {
        return name;
    }
    public void test_INN(String inn) throws Verification_INN
    {
        if(inn.length()!=10)
            throw new Verification_INN(this);
    }

    public static void main(String[] args)
    {
        Account client=new Account("6893729674620","Johnathan McKenzie");
        try {
            client.test_INN(client.get_INN());
            System.out.println("ITIN client's "+client.getName()+" valid.");
        } catch (Verification_INN e) {
            System.out.println(e.getMessage());;
        }

        Account client1=new Account("56838567032614","Dina Pitts");
        try {
            client1.test_INN(client1.get_INN());
            System.out.println("ITIN client's "+client1.getName()+" valid.");
        } catch (Verification_INN e) {
            System.out.println(e.getMessage());;
        }

        Account client2=new Account("9833672456824","Christopher Hart");
        try {
            client2.test_INN(client2.get_INN());
            System.out.println("ITIN client's "+client2.getName()+" valid.");
        } catch (Verification_INN e) {
            System.out.println(e.getMessage());
        }
    }
}