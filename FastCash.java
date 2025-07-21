package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener{
    
    JButton hun, fhun,tho,twotho,fivetho,tentho,exit;
    String pinnumber;
    
    FastCash(String pinnumber)
    {
        this.pinnumber=pinnumber;
        setLayout(null);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2= i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel("SELECT WITHDRAWL AMOUNT");
        text.setBounds(210,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);
        
        hun= new JButton("Rs 100");
        hun.setBounds(170, 415, 150, 30);
        hun.addActionListener(this);
        image.add(hun);
        
        fhun= new JButton("Rs 500");
        fhun.setBounds(355, 415, 150, 30);
        fhun.addActionListener(this);
        image.add(fhun);
        
        tho= new JButton("Rs 1000");
        tho.setBounds(170, 450, 150, 30);
        tho.addActionListener(this);
        image.add(tho);
        
        twotho= new JButton("Rs 2000");
        twotho.setBounds(355, 450, 150, 30);
        twotho.addActionListener(this);
        image.add(twotho);
        
        fivetho= new JButton("Rs 5000");
        fivetho.setBounds(170, 485, 150, 30);
        fivetho.addActionListener(this);
        image.add(fivetho);
        
        tentho= new JButton("Rs 10000");
        tentho.setBounds(355, 485, 150, 30);
        tentho.addActionListener(this);
        image.add(tentho);
        
        exit= new JButton("BACK");
        exit.setBounds(355, 520, 150, 30);
        exit.addActionListener(this);
        image.add(exit);
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
    }

    public static void main(String args[]) {
        new FastCash("");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == exit)
        {
           setVisible(false);
           new Transactions(pinnumber).setVisible(true);
        }
        else {
            String amount = ((JButton)ae.getSource()).getText().substring(3);  // Rs 100
            Conn c = new Conn();
            try {
                ResultSet rs = c.s.executeQuery("Select * from bank where pin = '"+pinnumber+"'");
                int balance = 0;
                while(rs.next())
                {
                    if(rs.getString("type").equals("Deposit"))
                    {
                        balance += Integer.parseInt(rs.getString("amount"));
                    }
                    else {
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }
                if(ae.getSource() != exit && balance < Integer.parseInt(amount))
                {
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                   return;
                }
                Date date= new Date();
                String query = "insert into bank values ('"+pinnumber+"', '"+date+"','Withdrawl','"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs " +amount+ " Debited Successfully");
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            }catch (Exception e)
            {
                System.out.println(e);
            }
            
        }
    }
}
