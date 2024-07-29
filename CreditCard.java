public class CreditCard extends BankCard
{
    //Declaring the variables
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;
    //Creating a constructor for CreditCard class with parameters
    public CreditCard(int cardId, String clientName, String issuerBank, String bankAccount, int balanceAmount, int cvcNumber, double interestRate, String expirationDate)
    {
        super(balanceAmount,cardId,bankAccount,issuerBank);//Calling BankCard class constructor
        super.setClientName(clientName);//Calling method setClientName of parent class
        this.cvcNumber=cvcNumber;/*Assign attribute cvcNumber, interestRate,expirationDate with parameters and assign isGranted false*/
        this.interestRate=interestRate;
        this.expirationDate=expirationDate;
        this.isGranted=false;
    }
    //Create an accessor method for cvcNumber
    public int getCvcNumber()
    {
        return this.cvcNumber;
    }
    //Create a mutator method for creditLimit
    public void setCreditLimit( double creditLimit, int gracePeriod)
    {
        if(this.creditLimit<=2.5*super.getBalanceAmount())//If else statement is used
        {
            /* Assigning attributes with parameters */
            this.creditLimit=creditLimit;
            this.gracePeriod=gracePeriod;
            this.isGranted=true;
        }
        else
        {
            System.out.println("Credit Limit Is Declined");//Print Credit Limit Is Declined
        }
    }
    //Create an accessor method for creditLimit
    public double getCreditLimit()
    {
        return this.creditLimit;
    }
    //Create an accessor method for interestRate
    public double getInterestRate()
    {
        return this.interestRate;
    }
    //Create an accessor method for expirationDate
    public String getExpirationDate()
    {
        return this.expirationDate;
    }
    //Create an accessor method for gracePeriod
    public int getGracePeriod() 
    {
        return this.gracePeriod;
    }
    //Create an accessor method for isGranted
    public boolean getIsGranted()
    {
        return this.isGranted;
    }
    //Create a method for cancelCreditCard
    public void cancelCreditCard()
    {
        /*Assign the attributes cvcNumber,creditLiit,gracePeriod equal to zero and isGranted false*/
        this.cvcNumber=0;
        this.creditLimit=0;
        this.gracePeriod=0;
        this.isGranted=false;
    }
    //Create a method for display
    public void display()
    {
        super.display();//Call the display method of parent class 
        System.out.println("CVC Number="+this.cvcNumber);
        System.out.println("Interest Rate="+this.interestRate);
        System.out.println("Expiration Date="+this.expirationDate);
        System.out.println("Is Granted="+this.isGranted);
        if(this.isGranted==true)//If statement is used
        {
            System.out.println("Credit Limit="+this.creditLimit);
            System.out.println("Grace Period="+this.gracePeriod);
        }
    }
}

