public class BankCard
{
    //Declaring the variables
    private int cardId;
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private int balanceAmount;
    //Creating a constructor for BankCard class with parameters
    public BankCard(int balanceAmount,int cardId, String bankAccount, String issuerBank)
    {
        //Assign the attributes with parameters
        this.cardId=cardId;
        this.clientName="";
        this.balanceAmount=balanceAmount;
        this.bankAccount=bankAccount; 
        this.issuerBank=issuerBank;
    }
    //Create an accessor method for cardId
    public int getCardId()
    {
        return cardId;
    }
    //Create a mutator method for client Name 
    public void setClientName(String clientName)
    {
        this.clientName=clientName;
    }
    //Create an accessor method for clientName
    public String getClientName()
    {
        return clientName;
    }
    //Create an accessor method for issuerBank
    public String getIssuerBank()
    {
        return issuerBank;
    }
    //Create an accessor method for bankAccount
    public String getBankAccount()
    {
        return bankAccount;
    }
    //Create a mutator method fro balanceAmount
    public void setBalanceAmount(int balanceAmount)
    {
        this.balanceAmount=balanceAmount;
    }
    //Create an accessor method for balanceAmount
    public int getBalanceAmount()
    {
        return balanceAmount;
    }
    //Create a method for display
    public void display()
    {
        /*If else statement is used which prints Client Name is not Assigned if client name is empty else it prints clientName*/
        if(this.clientName=="")
        {
            System.out.println("Client Name is not Assigned");
        }
        else
        {
            System.out.println("Client Name="+this.clientName);
        }
        /* Following code prints cardId,issuerBank,bankAccount, and balanceAmount*/
        System.out.println("Card Id="+this.cardId);
        System.out.println("Issur Bank="+this.issuerBank);
        System.out.println("Bank Account="+this.bankAccount);
        System.out.println("Balance Amount="+this.balanceAmount);
    }
}
