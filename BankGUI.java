import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class BankGUI implements ActionListener
{
    // Declaring JFrame, JPanel, JButton, JLabel, JTextField and JComboBox with their respective variables
    JFrame frame1, frame2, frame3;
    JPanel panel1, panel2, panel3;
    JButton bt1, bt2, btaddcredit, btcancelcredit, btsetcreditlimit, btdisplay, btclear, btgoback, btadddedit, btdcwithdraw, btdisplay2, btclear2, btenter, btdcgoback2;
    JLabel label1, label2, info, cardid, cd_cardid, clientname, issuerbank, bankaccount, balanceamount, cvc, interest, expiration, creditlimit, graceperiod, cardid2, dcinfo, dccardid, clientname2, issuerbank2, bankaccount2, balanceamount2, pinnumber, dccardid1, withdrawalamount, pinnumber2, dofwithdrawal;
    JTextField tfcardid, tfcd_cardid, tfclientname, tfissuer, tfbankaccount, tfbalanceamount, tfcvc, tfinterest, tfcreditlimit, tfgraceperiod, tfcardid2, dctfcardid, tfclientname2, tfissuer2, tfbankaccount2, tfbalanceamount2, tfpinnumber, dctfcardid1, tfwithdrawal, tfpinnumber2;
    JComboBox<String> cdbox1List, cdbox2List, cdbox3List, dcbox1List, dcbox2List, dcbox3List;

    ArrayList<BankCard> bank_card = new ArrayList<BankCard>();  //Creating Array List of Bank Card Class

    public BankGUI()  // Creating the constructor of BankGUI
    {
        frame3 = new JFrame();  // Creating and Initialize frame3

        panel3 = new JPanel(); // Creating and Initialize panel3
        panel3.setBackground(Color.LIGHT_GRAY);
        panel3.setLayout(null);
        frame3.add(panel3);

        label1 = new JLabel(" Select Your Card"); // Creating label with set bounds
        label1.setBounds(80, 11, 146, 20);
        label1.setFont(new Font("Helvetica", Font.BOLD, 16));
        panel3.add(label1); // Adding label to panel

        bt1 = new JButton("Credit Card"); // Creating buttons with set bounds
        bt1.setFocusable(false);
        bt1.setBounds(87, 82, 120, 32);
        panel3.add(bt1);

        bt2 = new JButton("Debit Card");  // Creating buttons with set bounds
        bt2.setFocusable(false);
        bt2.setBounds(87, 165, 120, 32);
        panel3.add(bt2);

        label2 = new JLabel(" Thank You");  // Creating label with set bounds
        label2.setBounds(100, 262, 100, 20);
        label2.setFont(new Font("Helvetica", Font.BOLD, 16));
        panel3.add(label2);
        // Adding Action Listener
        bt1.addActionListener(this);
        bt2.addActionListener(this);

        frame3.setResizable(false);
        frame3.setVisible(true);
        frame3.setSize(307, 340);
        frame3.setDefaultCloseOperation(frame3.EXIT_ON_CLOSE);
    }

    public void credit() // Creating a void method
    {
        frame1 = new JFrame("Credit Card"); //Creating and Initialize frame1

        panel1 = new JPanel(); //Creating and Initialize panel1
        panel1.setBackground(Color.LIGHT_GRAY);
        panel1.setLayout(null);
        frame1.add(panel1); // Adding panel1 to frame1

        String[] cdbox = {"2023"}; // Creating a combo box
        cdbox1List = new JComboBox<String>(cdbox);
        cdbox1List.setBounds(445, 251, 81, 32);
        panel1.add(cdbox1List);
        // Creating a combo box
        String[] dcbox2 = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Agu", "Sep", "Oct", "Nov", "Dec"};
        cdbox2List = new JComboBox<String>(dcbox2);
        cdbox2List.setBounds(540, 251, 67, 32);
        panel1.add(cdbox2List);
        // Creating a combo box
        String[] dcbox3 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32"};
        cdbox3List = new JComboBox<String>(dcbox3);
        cdbox3List.setBounds(622, 251, 52, 32);
        panel1.add(cdbox3List);

        /* Initialize JLabel variables and creating labels for credit card GUI */
        info = new JLabel("Credit Card Info");
        info.setBounds(282, 8, 150, 40);
        info.setFont(new Font("Helvetica", Font.BOLD, 18));
        panel1.add(info);

        cardid = new JLabel("Card Id :");
        cardid.setBounds(30, 93, 70, 20);
        cardid.setFont(new Font("Helvetica", Font.BOLD, 16));
        panel1.add(cardid);

        cd_cardid = new JLabel("Card Id :");
        cd_cardid.setBounds(30, 370, 70, 20);
        cd_cardid.setFont(new Font("Helvetica", Font.BOLD, 16));
        panel1.add(cd_cardid);

        clientname = new JLabel("Client Name :");
        clientname.setBounds(30, 143, 110, 20);
        clientname.setFont(new Font("Helvetica", Font.BOLD, 16));
        panel1.add(clientname);

        issuerbank = new JLabel("Issuer Bank :");
        issuerbank.setBounds(381, 93, 101, 20);
        issuerbank.setFont(new Font("Helvetica", Font.BOLD, 16));
        panel1.add(issuerbank);

        bankaccount = new JLabel("Bank Account :");
        bankaccount.setBounds(381, 143, 124, 20);
        bankaccount.setFont(new Font("Helvetica", Font.BOLD, 16));
        panel1.add(bankaccount);

        balanceamount = new JLabel("Balance Amount :");
        balanceamount.setBounds(30, 196, 138, 20);
        balanceamount.setFont(new Font("Helvetica", Font.BOLD, 16));
        panel1.add(balanceamount);

        cvc = new JLabel("CVC Number :");
        cvc.setBounds(30, 249, 110, 20);
        cvc.setFont(new Font("Helvetica", Font.BOLD, 16));
        panel1.add(cvc);

        interest = new JLabel("Interest Rate :");
        interest.setBounds(381, 196, 111, 20);
        interest.setFont(new Font("Helvetica", Font.BOLD, 16));
        panel1.add(interest);

        expiration = new JLabel("Expiration Date :");
        expiration.setBounds(315, 251, 155, 20);
        expiration.setFont(new Font("Helvetica", Font.BOLD, 16));
        panel1.add(expiration);

        graceperiod = new JLabel("Grace Period :");
        graceperiod.setBounds(30, 420, 110, 20);
        graceperiod.setFont(new Font("Helvetica", Font.BOLD, 16));
        panel1.add(graceperiod);

        creditlimit = new JLabel("Credit Limit :");
        creditlimit.setBounds(381, 368, 150, 20);
        creditlimit.setFont(new Font("Helvetica", Font.BOLD, 16));
        panel1.add(creditlimit);

        cardid2 = new JLabel("Card Id :");
        cardid2.setBounds(30, 535, 70, 20);
        cardid2.setFont(new Font("Helvetica", Font.BOLD, 16));
        panel1.add(cardid2);

        /* Initialize JTextField  variables and creating text fields for credit card GUI */
        tfcardid = new JTextField();
        tfcardid.setBounds(100, 87, 137, 32);
        tfcardid.setFont(new Font("Helvetica", Font.BOLD, 14));
        panel1.add(tfcardid);

        tfclientname = new JTextField();
        tfclientname.setBounds(140, 137, 150, 32);
        tfclientname.setFont(new Font("Helvetica", Font.BOLD, 14));
        panel1.add(tfclientname);

        tfissuer = new JTextField();
        tfissuer.setBounds(486, 87, 137, 32);
        tfissuer.setFont(new Font("Helvetica", Font.BOLD, 14));
        panel1.add(tfissuer);

        tfbankaccount = new JTextField();
        tfbankaccount.setBounds(501, 137, 184, 32);
        tfbankaccount.setFont(new Font("Helvetica", Font.BOLD, 14));
        panel1.add(tfbankaccount);

        tfbalanceamount = new JTextField();
        tfbalanceamount.setBounds(172, 190, 150, 32);
        tfbalanceamount.setFont(new Font("Helvetica", Font.BOLD, 14));
        panel1.add(tfbalanceamount);

        tfcvc = new JTextField();
        tfcvc.setBounds(140, 243, 129, 32);
        tfcvc.setFont(new Font("Helvetica", Font.BOLD, 14));
        panel1.add(tfcvc);

        tfinterest = new JTextField();
        tfinterest.setBounds(492, 190, 137, 32);
        tfinterest.setFont(new Font("Helvetica", Font.BOLD, 14));
        panel1.add(tfinterest);

        tfcd_cardid = new JTextField();
        tfcd_cardid.setBounds(100, 368, 137, 32);
        tfcd_cardid.setFont(new Font("Helvetica", Font.BOLD, 14));
        panel1.add(tfcd_cardid);

        tfcreditlimit = new JTextField();
        tfcreditlimit.setBounds(480, 368, 137, 32);
        tfcreditlimit.setFont(new Font("Helvetica", Font.BOLD, 14));
        panel1.add(tfcreditlimit);

        tfgraceperiod = new JTextField();
        tfgraceperiod.setBounds(141, 419, 137, 32);
        tfgraceperiod.setFont(new Font("Helvetica", Font.BOLD, 14));
        panel1.add(tfgraceperiod);

        tfcardid2 = new JTextField();
        tfcardid2.setBounds(98, 533, 137, 32);
        tfcardid2.setFont(new Font("Helvetica", Font.BOLD, 14));
        panel1.add(tfcardid2);

        /* Initialize JButton variables and creating buttons for credit card GUI */
        btaddcredit = new JButton("Add to Credit Card");
        btaddcredit.setFocusable(false);
        btaddcredit.setBounds(268, 300, 168, 43);
        panel1.add(btaddcredit);

        btcancelcredit = new JButton("Cancel Credit Card");
        btcancelcredit.setFocusable(false);
        btcancelcredit.setBounds(268, 528, 168, 43);
        panel1.add(btcancelcredit);

        btsetcreditlimit = new JButton("Set Credit Limit");
        btsetcreditlimit.setFocusable(false);
        btsetcreditlimit.setBounds(268, 470, 168, 43);
        panel1.add(btsetcreditlimit);

        btdisplay = new JButton("Display");
        btdisplay.setFocusable(false);
        btdisplay.setBounds(95, 620, 109, 43);
        panel1.add(btdisplay);

        btclear = new JButton("Clear");
        btclear.setFocusable(false);
        btclear.setBounds(315, 620, 109, 43);
        panel1.add(btclear);

        btgoback = new JButton("Go Back");
        btgoback.setFocusable(false);
        btgoback.setBounds(535, 620, 109, 43);
        panel1.add(btgoback);

        /* Adding Action Listener to the buttons of Credit card GUI */
        btgoback.addActionListener(this);
        btaddcredit.addActionListener(this);
        btsetcreditlimit.addActionListener(this);
        btclear.addActionListener(this);
        btdisplay.addActionListener(this);
        btcancelcredit.addActionListener(this);

        // Setting values of frame1
        frame1.setResizable(false);
        frame1.setVisible(true);
        frame1.setSize(730, 720);
        frame1.setDefaultCloseOperation(frame1.EXIT_ON_CLOSE);
    }

    public void debit()  // Creating a void method
    {
        frame2 = new JFrame("Debit Card"); //Creating and Initialize frame2

        panel2 = new JPanel(); //Creating and Initialize panel2
        panel2.setBackground(Color.LIGHT_GRAY);
        panel2.setLayout(null);
        frame2.add(panel2); // Adding panel to frame

        /* Creating three combo box */
        String[] dcbox1 = {"2023"};
        dcbox1List = new JComboBox<String>(dcbox1);
        dcbox1List.setBounds(185, 462, 81, 32);
        panel2.add(dcbox1List);

        String[] dcbox2 = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "July", "Agu", "Sep", "Oct", "Nov", "Dec"};
        dcbox2List = new JComboBox<String>(dcbox2);
        dcbox2List.setBounds(278, 462, 67, 32);
        panel2.add(dcbox2List);

        String[] dcbox3 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32"};
        dcbox3List = new JComboBox<String>(dcbox3);
        dcbox3List.setBounds(357, 462, 52, 32);
        panel2.add(dcbox3List);

        /* Initialize JLabel variables and creating labels for debit card GUI */
        dcinfo = new JLabel("Debit Card Info");
        dcinfo.setBounds(282, 8, 150, 40);
        dcinfo.setFont(new Font("Helvetica", Font.BOLD, 18));
        panel2.add(dcinfo);

        dccardid = new JLabel("Card Id :");
        dccardid.setBounds(30, 93, 70, 20);
        dccardid.setFont(new Font("Helvetica", Font.BOLD, 16));
        panel2.add(dccardid);

        clientname2 = new JLabel("Client Name :");
        clientname2.setBounds(30, 143, 110, 20);
        clientname2.setFont(new Font("Helvetica", Font.BOLD, 16));
        panel2.add(clientname2);

        issuerbank2 = new JLabel("Issuer Bank :");
        issuerbank2.setBounds(381, 93, 101, 20);
        issuerbank2.setFont(new Font("Helvetica", Font.BOLD, 16));
        panel2.add(issuerbank2);

        bankaccount2 = new JLabel("Bank Account :");
        bankaccount2.setBounds(381, 143, 124, 20);
        bankaccount2.setFont(new Font("Helvetica", Font.BOLD, 16));
        panel2.add(bankaccount2);

        balanceamount2 = new JLabel("Balance Amount :");
        balanceamount2.setBounds(30, 196, 138, 20);
        balanceamount2.setFont(new Font("Helvetica", Font.BOLD, 16));
        panel2.add(balanceamount2);

        pinnumber = new JLabel("PIN Number :");
        pinnumber.setBounds(381, 196, 110, 20);
        pinnumber.setFont(new Font("Helvetica", Font.BOLD, 16));
        panel2.add(pinnumber);

        dccardid1 = new JLabel("Card Id :");
        dccardid1.setBounds(30, 352, 70, 20);
        dccardid1.setFont(new Font("Helvetica", Font.BOLD, 16));
        panel2.add(dccardid1);

        withdrawalamount = new JLabel("Withdrawal Amount :");
        withdrawalamount.setBounds(30, 409, 160, 20);
        withdrawalamount.setFont(new Font("Helvetica", Font.BOLD, 16));
        panel2.add(withdrawalamount);

        pinnumber2 = new JLabel("PIN Number :");
        pinnumber2.setBounds(381, 352, 110, 20);
        pinnumber2.setFont(new Font("Helvetica", Font.BOLD, 16));
        panel2.add(pinnumber2);

        dofwithdrawal = new JLabel("Date of Withdrawal :");
        dofwithdrawal.setBounds(30, 466, 155, 20);
        dofwithdrawal.setFont(new Font("Helvetica", Font.BOLD, 16));
        panel2.add(dofwithdrawal);

        /* Initialize JTextField variables and creating text field  for debit card GUI */
        dctfcardid = new JTextField();
        dctfcardid.setBounds(100, 87, 137, 32);
        dctfcardid.setFont(new Font("Helvetica", Font.BOLD, 14));
        panel2.add(dctfcardid);

        tfclientname2 = new JTextField();
        tfclientname2.setBounds(140, 137, 150, 32);
        tfclientname2.setFont(new Font("Helvetica", Font.BOLD, 14));
        panel2.add(tfclientname2);

        tfissuer2 = new JTextField();
        tfissuer2.setBounds(486, 87, 137, 32);
        tfissuer2.setFont(new Font("Helvetica", Font.BOLD, 14));
        panel2.add(tfissuer2);

        tfbankaccount2 = new JTextField();
        tfbankaccount2.setBounds(501, 137, 184, 32);
        tfbankaccount2.setFont(new Font("Helvetica", Font.BOLD, 14));
        panel2.add(tfbankaccount2);

        tfbalanceamount2 = new JTextField();
        tfbalanceamount2.setBounds(172, 190, 150, 32);
        tfbalanceamount2.setFont(new Font("Helvetica", Font.BOLD, 14));
        panel2.add(tfbalanceamount2);

        tfpinnumber = new JTextField();
        tfpinnumber.setBounds(485, 190, 89, 32);
        tfpinnumber.setFont(new Font("Helvetica", Font.BOLD, 14));
        panel2.add(tfpinnumber);

        dctfcardid1 = new JTextField();
        dctfcardid1.setBounds(99, 346, 137, 32);
        dctfcardid1.setFont(new Font("Helvetica", Font.BOLD, 14));
        panel2.add(dctfcardid1);

        tfwithdrawal = new JTextField();
        tfwithdrawal.setBounds(191, 403, 137, 32);
        tfwithdrawal.setFont(new Font("Helvetica", Font.BOLD, 14));
        panel2.add(tfwithdrawal);

        tfpinnumber2 = new JTextField();
        tfpinnumber2.setBounds(485, 346, 89, 32);
        tfpinnumber2.setFont(new Font("Helvetica", Font.BOLD, 14));
        panel2.add(tfpinnumber2);

        /* Initialize JButton variables and creating buttons for Debit card GUI */
        btadddedit = new JButton("Add to Debit Card");
        btadddedit.setFocusable(false);
        btadddedit.setBounds(268, 249, 168, 43);
        panel2.add(btadddedit);

        btdcwithdraw = new JButton("Withdraw");
        btdcwithdraw.setFocusable(false);
        btdcwithdraw.setBounds(475, 453, 137, 43);
        panel2.add(btdcwithdraw);

        btdisplay2 = new JButton("Display");
        btdisplay2.setFocusable(false);
        btdisplay2.setBounds(50, 600, 109, 43);
        panel2.add(btdisplay2);

        btclear2 = new JButton("Clear");
        btclear2.setFocusable(false);
        btclear2.setBounds(305, 600, 109, 43);
        panel2.add(btclear2);

        btenter = new JButton("Enter");
        btenter.setFocusable(false);
        btenter.setBounds(475, 400, 123, 43);
        panel2.add(btenter);

        btdcgoback2 = new JButton("Go Back");
        btdcgoback2.setFocusable(false);
        btdcgoback2.setBounds(557, 600, 109, 43);
        panel2.add(btdcgoback2);

        /* Adding Action Listener to the buttons of debit card GUI */
        btdcgoback2.addActionListener(this);
        btadddedit.addActionListener(this);
        btenter.addActionListener(this);
        btdcwithdraw.addActionListener(this);
        btclear2.addActionListener(this);
        btdisplay2.addActionListener(this);

        // Setting values for frame2
        frame2.setResizable(false);
        frame2.setVisible(true);
        frame2.setSize(730, 700);
        frame2.setDefaultCloseOperation(frame2.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) // Creating a void method
    {
        if (e.getSource() == bt1) // getting object source and assigning to bt1
        {
            credit(); // Calling credit method
            frame3.setVisible(false);
        } else if (e.getSource() == bt2) // getting object source and assigning to bt2
        {
            debit(); // Calling debit method
            frame3.setVisible(false);
        } else if (e.getSource() == btgoback) // getting object source and assigning to btgoback
        {
            frame1.setVisible(false);
            frame3.setVisible(true);
        } else if (e.getSource() == btdcgoback2) // getting object source and assigning to btgoback2
        {
            frame2.setVisible(false);
            frame3.setVisible(true);
        }
        else if (e.getSource() == btaddcredit) // getting object source and assigning to btaddcredit
        {
            try {   /* Declaring variables and assigning with its respective text field*/
                int card_id = Integer.parseInt(tfcardid.getText());
                String cd_client_name = tfclientname.getText();
                String cd_issuer_bank = tfissuer.getText();
                String cd_bank_account = tfbankaccount.getText();
                int cd_balance_amount = Integer.parseInt(tfbalanceamount.getText());
                int cd_cvc_number = Integer.parseInt(tfcvc.getText());
                double cd_interest = Double.parseDouble(tfinterest.getText());
                String cd_year = cdbox1List.getSelectedItem().toString();
                String cd_month = cdbox2List.getSelectedItem().toString();
                String cd_date = cdbox3List.getSelectedItem().toString();
                String cd_expiration_date = cd_year + "-" + cd_month + "-" + cd_date;
                boolean card_id_check = false;
                for (BankCard card_obj : bank_card) {
                    if (card_obj instanceof CreditCard) {
                        if (card_obj.getCardId() == card_id) {
                            card_id_check = true;
                        }
                    }
                }
                if (card_id_check)
                {
                    JOptionPane.showMessageDialog(frame1, "Card Id is already registered", "Credit Card", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    if (cd_client_name.isEmpty() || cd_issuer_bank.isEmpty() || cd_bank_account.isEmpty()) {
                        JOptionPane.showMessageDialog(frame1, "Please fill the form in appropriate format", "Credit Card", JOptionPane.INFORMATION_MESSAGE);
                    } else {   // creating Credit Card class object
                        CreditCard credit_card_obj = new CreditCard(card_id, cd_client_name, cd_issuer_bank, cd_bank_account, cd_balance_amount, cd_cvc_number, cd_interest, cd_expiration_date);
                        bank_card.add(credit_card_obj); // adding Credit Card class object to the array list
                        JOptionPane.showMessageDialog(frame1, "Your Credit Card has been Added. Thank You !\n" + "Card Id = " + credit_card_obj.getCardId() + "\n" +
                            "Client Name = " + credit_card_obj.getClientName() + "\n" + "Issuer Bank = " + credit_card_obj.getIssuerBank() + "\n" + "Bank Account = " + credit_card_obj.getBankAccount() + "\n" +
                            "Balance Amount = Rs" + credit_card_obj.getBalanceAmount() + "\n" + "Interest Rate = " + credit_card_obj.getInterestRate() + "\n" +
                            "CVC Number = " + credit_card_obj.getCvcNumber() + "\n" + "Expiration Date = " + credit_card_obj.getExpirationDate(), "Credit Card", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
            catch (NumberFormatException ef)
            {
                JOptionPane.showMessageDialog(frame1, "Please fill the form in appropriate format", "Credit Card", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (e.getSource() == btsetcreditlimit) // getting object source and assigning to btsetcreditlimit
        {
            try {
                /* Declaring variables and assigning with its respective text field*/
                int cd_card_id = Integer.parseInt(tfcd_cardid.getText());
                int grace_period = Integer.parseInt(tfgraceperiod.getText());
                double credit_limit = Double.parseDouble(tfcreditlimit.getText());

                for (BankCard bank_obj : bank_card) // looping on array list
                {

                    if (bank_obj instanceof CreditCard)
                    {
                        CreditCard cd_obj = (CreditCard) bank_obj; //DownCasting
                        boolean isGranted = cd_obj.getIsGranted();
                        if (false == isGranted) {
                            if (cd_card_id == cd_obj.getCardId())
                            {
                                if (credit_limit <= 2.5 * bank_obj.getBalanceAmount()) {
                                    cd_obj.setCreditLimit(credit_limit, grace_period); // calling setCreditLimit method of Credit Card class
                                    JOptionPane.showMessageDialog(frame1, "Credit Limit has been set. Thank You !", "Credit Card", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    JOptionPane.showMessageDialog(frame1, "Credit Limit has been Declined!", "Credit Card", JOptionPane.INFORMATION_MESSAGE);
                                }
                            } else {
                                JOptionPane.showMessageDialog(frame1, "Card ID Does not match!!!" + "\n" + "Enter the correct Card ID", "Credit Card", JOptionPane.INFORMATION_MESSAGE);
                            }
                        } else {
                            JOptionPane.showMessageDialog(frame1, "Credit Limit had already set!", "Credit Card", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            } catch (NumberFormatException nm) {
                JOptionPane.showMessageDialog(frame1, "Please fill the form in appropriate format", "Credit Card", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if (e.getSource() == btclear) // getting object source and assigning to btclear
        {   /* Set all the text field of Credit card GUI to empty*/
            tfcardid.setText("");
            tfclientname.setText("");
            tfissuer.setText("");
            tfbankaccount.setText("");
            tfbalanceamount.setText("");
            tfcvc.setText("");
            tfinterest.setText("");
            tfgraceperiod.setText("");
            tfcreditlimit.setText("");
            tfcardid2.setText("");
            tfcd_cardid.setText("");
        } else if (e.getSource() == btdisplay) // getting object source and assigning to btdisplay
        {
            for (BankCard bank_obj2 : bank_card) // looping on array list
            {
                if (bank_obj2 instanceof CreditCard)
                {
                    CreditCard cd_obj2 = (CreditCard) bank_obj2; // Down Casting
                    cd_obj2.display(); // calling display method of credit card class
                }
            }
        } else if (e.getSource() == btcancelcredit) // getting object source and assigning to btcancelcredit
        {
            try {
                int cardid2 = Integer.parseInt(tfcardid2.getText());
                for (BankCard credit_obj : bank_card) // looping on array list
                {
                    if (credit_obj instanceof CreditCard) {
                        CreditCard credit_cancel = (CreditCard) credit_obj;

                        if (cardid2 == credit_cancel.getCardId()) // Down Casting
                        {
                            credit_cancel.cancelCreditCard(); // calling cancelCreditCard method of credit card class
                            JOptionPane.showMessageDialog(frame1, "Card has been canceled", "Credit Card", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(frame1, "Invalid Card ID", "Credit Card", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }

                }
            } catch (NumberFormatException em) {
                JOptionPane.showMessageDialog(frame1, "Please fill the form in appropriate format", "Credit Card", JOptionPane.INFORMATION_MESSAGE);
            }
        } // Add to Debit Card Code
        else if (e.getSource() == btadddedit) // getting object source and assigning to btadddebit
        {
            try {
                /* Declaring variables and assigning with its respective text field*/
                int dc_card_id = Integer.parseInt(dctfcardid.getText());
                String dc_client_name = tfclientname2.getText();
                String dc_issuer_bank = tfissuer2.getText();
                String dc_bank_account = tfbankaccount2.getText();
                int dc_pin_number = Integer.parseInt(tfpinnumber.getText());
                int dc_balance_amount = Integer.parseInt(tfbalanceamount2.getText());
                boolean debit_id_check = false;
                for (BankCard debit_obj : bank_card)
                {
                    if (debit_obj instanceof DebitCard)
                    {
                        if (debit_obj.getCardId() == dc_card_id)
                        {
                            debit_id_check = true;
                        }
                    }
                }
                if (debit_id_check)
                {
                    JOptionPane.showMessageDialog(frame1, "Card Id is already registered", "Credit Card", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    if (dc_client_name.isEmpty() || dc_issuer_bank.isEmpty() || dc_bank_account.isEmpty()) {
                        JOptionPane.showMessageDialog(frame2, "Please fill the form in appropriate format", "Debit Card", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else {
                        // Creating Debit Card class object
                        DebitCard debit_card_obj = new DebitCard(dc_balance_amount, dc_card_id, dc_bank_account, dc_issuer_bank, dc_client_name, dc_pin_number);
                        bank_card.add(debit_card_obj); // Adding Debit Card class object to array list
                        JOptionPane.showMessageDialog(frame2, "Your Debit Card has been Added. Thank You !\n" + "Card Id = " + debit_card_obj.getCardId() + "\n" +
                            "Client Name = " + debit_card_obj.getClientName() + "\n" + "Issuer Bank = " + debit_card_obj.getIssuerBank() + "\n" + "Bank Account = " + debit_card_obj.getBankAccount() + "\n" +
                            "Balance Amount = Rs" + debit_card_obj.getBalanceAmount() + "\n" + "Pin Number = " + debit_card_obj.getPinNumber(), "Debit Card", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
            catch (NumberFormatException ne) {
                JOptionPane.showMessageDialog(frame2, "Please fill the form in appropriate format", "Credit Card", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (e.getSource() == btenter) // getting object source and assigning to btenter
        {
            try {
                /* Declaring variables and assigning with its respective text field*/
                int dc_card_id2 = Integer.parseInt(dctfcardid1.getText());
                int Withdrawal_amount = Integer.parseInt(tfwithdrawal.getText());
                int Pin_number = Integer.parseInt(tfpinnumber2.getText());
                String Dc_year = dcbox1List.getSelectedItem().toString();
                String Dc_month = dcbox2List.getSelectedItem().toString();
                String Dc_date = dcbox3List.getSelectedItem().toString();
                String Withdrawal_date = Dc_year + "-" + Dc_month + "-" + Dc_date;
                for (BankCard bank_obj : bank_card) // looping on array list
                {
                    if (bank_obj instanceof DebitCard) {
                        DebitCard debit_obj = (DebitCard) bank_obj; // Down Casting
                        if (dc_card_id2 == debit_obj.getCardId())
                        {
                            JOptionPane.showMessageDialog(frame2, "Card Id = " + debit_obj.getCardId() + "\n" + "Client Name = " + debit_obj.getClientName() + "\n" + "Issuer Bank = " +
                                debit_obj.getIssuerBank() + "\n" + "Bank Account = " + debit_obj.getBankAccount() + "\n" + "Balance Amount = Rs" + debit_obj.getBalanceAmount() + "\n" + "\n" +
                                "Withdrawal Amount = " + Withdrawal_amount + "\n" + "Entered Pin Number = " + Pin_number + "\n" +
                                "Date of Withdrawal = " + Withdrawal_date, "Balance Amount", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(frame2, "Invalid Card Id", "Debit Card", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }
            } catch (NumberFormatException ae)
            {
                JOptionPane.showMessageDialog(frame2, "Please fill the form in appropriate format", "Credit Card", JOptionPane.INFORMATION_MESSAGE);
            }
        } // Debit Card Withdraw
        else if (e.getSource() == btdcwithdraw)  // getting object source and assigning to btdcwithdraw
        {
            try {
                /* Declaring variables and assigning with its respective text field*/
                int dc_card_id2 = Integer.parseInt(dctfcardid1.getText());
                int Withdrawal_amount = Integer.parseInt(tfwithdrawal.getText());
                int Pin_number = Integer.parseInt(tfpinnumber2.getText());
                String Dc_year = dcbox1List.getSelectedItem().toString();
                String Dc_month = dcbox2List.getSelectedItem().toString();
                String Dc_date = dcbox3List.getSelectedItem().toString();
                String Withdrawal_date = Dc_year + "-" + Dc_month + "-" + Dc_date;
                boolean check = true;

                for (BankCard debit_card_obj2 : bank_card) // looping on array list
                {
                    if (debit_card_obj2 instanceof DebitCard)
                    {
                        DebitCard debit_display = (DebitCard) debit_card_obj2; // Down Casting
                        if (dc_card_id2 == debit_display.getCardId())
                        {
                            if (Pin_number == debit_display.getPinNumber())
                            {
                                if (Withdrawal_amount <= debit_display.getBalanceAmount())
                                {
                                    debit_display.withdraw(Withdrawal_amount, Withdrawal_date, Pin_number); // Calling withdraw method of debit card class
                                    JOptionPane.showMessageDialog(frame2, "Amount has withdrawn" + "\n" + "Card Id = " + debit_display.getCardId() + "\n" + "Client Name = " + debit_display.getClientName() + "\n" +
                                        "Issuer Bank = " + debit_display.getIssuerBank() + "\n" + "Balance Amount = " + debit_display.getBalanceAmount(), "Withdraw", JOptionPane.INFORMATION_MESSAGE);
                                } else {
                                    JOptionPane.showMessageDialog(frame2, "Not Sufficient Balance", "Withdraw", JOptionPane.INFORMATION_MESSAGE);
                                }
                            }
                            else {
                                JOptionPane.showMessageDialog(frame2, "Pin Number is  Incorrect", "Withdraw", JOptionPane.INFORMATION_MESSAGE);
                            }
                        }
                        else {
                            JOptionPane.showMessageDialog(frame2, "Invalid Card Id Please Enter correct Card Id", "Withdraw", JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                }

            } catch (NumberFormatException ng) {
                JOptionPane.showMessageDialog(frame2, "Please fill the form in appropriate format", "Credit Card", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (e.getSource() == btclear2) // getting object source and assigning to btclear2
        {   /* Set all the text field of Credit card GUI to empty*/
            dctfcardid.setText("");
            tfclientname2.setText("");
            tfissuer2.setText("");
            tfbankaccount2.setText("");
            tfbalanceamount2.setText("");
            tfpinnumber.setText("");
            dctfcardid1.setText("");
            tfwithdrawal.setText("");
            tfpinnumber2.setText("");
        }
        else if (e.getSource() == btdisplay2) // getting object source and assigning to btdisplay
        {
            for (BankCard debit_display2 : bank_card) // looping on array list
            {
                if (debit_display2 instanceof DebitCard) {
                    DebitCard debit = (DebitCard) debit_display2; // Down Casting
                    debit.display(); // calling display method of debit card class
                }
            }
        }
    }

    public static void main(String[] args) // Creating main method
    {
        BankGUI obj = new BankGUI(); // Creating object of Bank GUI
    }
}

