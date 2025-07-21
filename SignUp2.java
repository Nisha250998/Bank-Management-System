package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class SignUp2 extends JFrame  implements ActionListener {
    
    JTextField panNum , aadharNum;
    JButton nextButtonField;
    JRadioButton seniorYes, seniorNo,existingYes,existingNo;
    ButtonGroup seniorGroup , existingGroup;
    JComboBox relig , cate , inc , educationalquali, occu;
    String formno;
    
    SignUp2(String formno)
    {
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        this.formno=formno;
        
        JLabel additionalDetails = new JLabel("Page 2 : Additional Details");
        additionalDetails.setFont(new Font("Raleway" , Font.BOLD , 22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        JLabel religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway" , Font.BOLD , 20));
        religion.setBounds(100,140,100,30);
        add(religion);
        
        String valReligion[]={"Hindu","Muslim","Sikh" ,"Christian","Other"};
        relig = new JComboBox(valReligion);
        relig.setFont(new Font("Raleway", Font.BOLD,14));
        relig.setBounds(300,140,400,30);
        add(relig);
        
        
        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Raleway" , Font.BOLD , 20));
        category.setBounds(100,190,200,30);
        add(category);
        
        String valueCategory[] = {"General","SC","ST","OBC","Other"};
        cate = new JComboBox(valueCategory);
        cate.setFont(new Font("Raleway", Font.BOLD,14));
        cate.setBounds(300,190,400,30);
        add(cate);
        
        
        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway" , Font.BOLD , 20));
        income.setBounds(100,240,200,30);
        add(income);
        
        String incomeCategory[] = {"Null","< 1,50,000","< 2,50,000","< 5,00,000","Upto 10,00,000"};
        inc = new JComboBox(incomeCategory);
        inc.setFont(new Font("Raleway", Font.BOLD,14));
        inc.setBounds(300,240,400,30);
        add(inc);
         
        JLabel educational = new JLabel("Educational");
        educational.setFont(new Font("Raleway" , Font.BOLD , 20));
        educational.setBounds(100,280,120,30);
        add(educational);
        
        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway" , Font.BOLD , 20));
        qualification.setBounds(100,310,200,30);
        add(qualification);
        
        String educationalValues[] = {"Non Graduation","Graduate","Post Graduation","Doctrate","Others"};
        educationalquali = new JComboBox(educationalValues);
        educationalquali.setFont(new Font("Raleway", Font.BOLD,14));
        educationalquali.setBounds(300,310,400,30);
        add(educationalquali);
        
        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway" , Font.BOLD , 20));
        occupation.setBounds(100,360,200,30);
        add(occupation);
        
        String occupationValues[] = {"Salaried","Self-Employed","Bussiness","Student","Retired","Others"};
        occu = new JComboBox(occupationValues);
        occu.setFont(new Font("Raleway", Font.BOLD,14));
        occu.setBounds(300,360,400,30);
        add(occu);
        
        JLabel panNumber = new JLabel("PAN Number:");
        panNumber.setFont(new Font("Raleway" , Font.BOLD , 20));
        panNumber.setBounds(100,410,200,30);
        add(panNumber);
        
        panNum = new JTextField ();
        panNum.setFont(new Font("Raleway", Font.BOLD,14));
        panNum.setBounds(300,410,400,30);
        add(panNum);
        
        JLabel aadharNumber = new JLabel("Aadhar Number:");
        aadharNumber.setFont(new Font("Raleway" , Font.BOLD , 20));
        aadharNumber.setBounds(100,460,200,30);
        add(aadharNumber);
        
        aadharNum = new JTextField ();
        aadharNum.setFont(new Font("Raleway", Font.BOLD,14));
        aadharNum.setBounds(300,460,400,30);
        add(aadharNum);
        
        JLabel seniorCitizen = new JLabel("Senior Citizen:");
        seniorCitizen.setFont(new Font("Raleway" , Font.BOLD , 20));
        seniorCitizen.setBounds(100,510,200,30);
        add(seniorCitizen);
        
        seniorYes = new JRadioButton("Yes");
        seniorYes.setBounds(300,510,60,30);
        seniorYes.setBackground(Color.WHITE);
        add(seniorYes);
        
        seniorNo = new JRadioButton("No");
        seniorNo.setBounds(450,510,60,30);
        seniorNo.setBackground(Color.WHITE);
        add(seniorNo);
        
        seniorGroup=new ButtonGroup();
        seniorGroup.add(seniorYes);
        seniorGroup.add(seniorNo);
        
        JLabel existingAccount = new JLabel("Existing Account:");
        existingAccount.setFont(new Font("Raleway" , Font.BOLD , 20));
        existingAccount.setBounds(100,560,200,30);
        add(existingAccount);
        
        existingYes = new JRadioButton("Yes");
        existingYes.setBounds(300,560,60,30);
        existingYes.setBackground(Color.WHITE);
        add(existingYes);
        
        existingNo = new JRadioButton("No");
        existingNo.setBounds(450,560,60,30);
        existingNo.setBackground(Color.WHITE);
        add(existingNo);
        
        existingGroup=new ButtonGroup();
        existingGroup.add(existingYes);
        existingGroup.add(existingNo);
       
        nextButtonField = new JButton ("Next");
        nextButtonField.setFont(new Font("Raleway", Font.BOLD,14));
        nextButtonField.setBounds(600,650,100,30);
        nextButtonField.setBackground(Color.BLACK);
        nextButtonField.setForeground(Color.WHITE); 
        nextButtonField.addActionListener(this);
        add(nextButtonField);
        
        
        getContentPane().setBackground(Color.white);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
           
    }
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        String religion = (String)relig.getSelectedItem();
        String category = (String)cate.getSelectedItem();
        String income = (String)inc.getSelectedItem();
        String eduqual = (String)educationalquali.getSelectedItem();
        String occupation = (String)occu.getSelectedItem();
        String pan = panNum.getText();
        String aadhar = aadharNum.getText();
        String sc=null;
        if(seniorYes.isSelected())
        {
            sc = "Yes";
        }else if(seniorNo.isSelected())
        {
            sc = "No";
        }
        String ea=null;
        if(existingYes.isSelected())
        {
            ea = "Yes";
        }else if(existingNo.isSelected())
        {
            ea = "No";
        }
        
        try {
            if (religion.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Reliion is required");
            }
            if (category.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Category is required");
            }
            if (income.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Incomeis required");
            }
            if (eduqual.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Educational Qualification is required");
            }
            if (occupation.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Occupation is required");
            }
            if (pan.equals(""))
            {
                JOptionPane.showMessageDialog(null, "PAN Number is required");
            }
            if (aadhar.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Aadhar Number is required");
            }
            else {
                Conn c = new Conn();
                String query = "insert into signup2 values ('"+formno+"' , '"+religion+"' , '"+category+"' , '"+income+"' , '"+eduqual+"' , '"+occupation+"' ,'"+pan+"' , '"+aadhar+"' ,'"+sc+"' , '"+ea+"' )";  
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignUp3(formno).setVisible(true);
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }

        
    }

    public static void main(String args[]) {
        new SignUp2("");
    }
}
