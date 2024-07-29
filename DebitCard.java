public class DebitCard extends BankCard
{
    //Declaring the variables
    private int pinNumber;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;
    //Creating a constructor for DebitCard class with parameters
    public DebitCard(int balanceAmount,int cardId,String bankAccount, String issuerBank, String clientName,int pinNumber)
    {
        super(balanceAmount,cardId,bankAccount,issuerBank);//Calling BankCard class construtor
        this.pinNumber=pinNumber;
        this.hasWithdrawn=false;
        super.setClientName(clientName);//Calling method setClientName of parent class
    }
    //Create an accessor method for cardId
    public int getPinNumber()
    {
        return pinNumber;
    }
    //Create a mutator method for withdrawalAmount 
    public void setWithdrawalAmount(int withdrawalAmount)
    {
        this.withdrawalAmount=withdrawalAmount;
    }
    //Create an accessor method for withdrawalAmount
    public int getWithdrawalAmount()
    {
        return withdrawalAmount;
    }
    //Create an accessor method for dateOdWithdrawal
    public String getDateOfWithdrawal()
    {
        return dateOfWithdrawal;
    }
    //Create an accessor method for hasWithdrawn
    public boolean getHasWithdrawn()
    {
        return hasWithdrawn;
    }
    //Create a method for withdraw
    public void withdraw(int withdrawalAmount, String dateOfWithdrawal, int pinNumber)
    {
        //Nested if statement is used
        if(pinNumber==this.pinNumber)
        {
            if(super.getBalanceAmount()>=withdrawalAmount)
            {
                this.withdrawalAmount=withdrawalAmount;//Assign attribute with prameters
                System.out.println("Amount Has Withdrawn");
                this.hasWithdrawn=true;
                this.dateOfWithdrawal=dateOfWithdrawal;
                super.setBalanceAmount(super.getBalanceAmount()-this.withdrawalAmount);
            }
            else
            {
                System.out.println("Not Sufficient Balance");//Print Not Sufficient Balance
            }
        }
        else
        {
            System.out.println("Pin Number is  Incorrect");//Print Pin Number is Incorrect
        }
    }
    //Create a method for display
    public void display()
    {
        super.display();//Call the display method of parent class 
        if(this.hasWithdrawn==true)//If else statement is used
        {
            /* Following code prints pinnumber,withdrawalAmount and dateOfWithdrawal*/
            System.out.println("Pin Number="+this.pinNumber);
            System.out.println("Withdrawal Amount="+this.withdrawalAmount);
            System.out.println("Date of Withdrawal="+this.dateOfWithdrawal);
        }
        else
        {
            System.out.println("Transition Is Not Carried Out");
            System.out.println("Balance Amount="+getBalanceAmount());
        }
    }
}
