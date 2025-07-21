package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class SignUp1 extends JFrame  implements ActionListener {
    
    JTextField nameTextField , fnameTextField  , emailTextField, addressTextField , cityTextField, pinTextField ,stateTextField;
    JButton nextButtonField;
    JDateChooser dateChooser ;
    JRadioButton male, female,married,unmarried,other;
    ButtonGroup genderGroup , marritalGroup;
    long random;
    SignUp1()
    {
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM");
        
        Random ran = new Random();
        random=Math.abs((ran.nextLong()%9000L)+1000L);
        
        JLabel formno = new JLabel("APPLICATION FORM NO. "+random);
        formno.setFont(new Font("Raleway" , Font.BOLD , 38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel personalDetails = new JLabel("Page 1 : Personal Details");
        personalDetails.setFont(new Font("Raleway" , Font.BOLD , 22));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);
        
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway" , Font.BOLD , 20));
        name.setBounds(100,140,100,30);
        add(name);
        
        nameTextField = new JTextField ();
        nameTextField.setFont(new Font("Raleway", Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
        
        JLabel fatherName = new JLabel("Father's Name:");
        fatherName.setFont(new Font("Raleway" , Font.BOLD , 20));
        fatherName.setBounds(100,190,200,30);
        add(fatherName);
        
        fnameTextField = new JTextField ();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD,14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
        
        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway" , Font.BOLD , 20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300,240,400,30);
        dateChooser.setForeground(Color.BLACK);
        add(dateChooser);
        
        
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway" , Font.BOLD , 20));
        gender.setBounds(100,290,100,30);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(300,290,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(450,290,100,30);
        female.setBackground(Color.WHITE);
        add(female);
        
        genderGroup=new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        
        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway" , Font.BOLD , 20));
        email.setBounds(100,340,200,30);
        add(email);
        
        emailTextField = new JTextField ();
        emailTextField.setFont(new Font("Raleway", Font.BOLD,14));
        emailTextField.setBounds(300,340,400,30);
        add(emailTextField);
        
        JLabel maritalStatus = new JLabel("Marital Status:");
        maritalStatus.setFont(new Font("Raleway" , Font.BOLD , 20));
        maritalStatus.setBounds(100,390,200,30);
        add(maritalStatus);
        
        married = new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.WHITE);
        add(married);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        other = new JRadioButton("Other");
        other.setBounds(600,390,60,30);
        other.setBackground(Color.WHITE);
        add(other);
        
        marritalGroup = new ButtonGroup();
        marritalGroup.add(married);
        marritalGroup.add(unmarried);
        marritalGroup.add(other);        
        
        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway" , Font.BOLD , 20));
        address.setBounds(100,440,100,30);
        add(address);
        
        addressTextField = new JTextField ();
        addressTextField.setFont(new Font("Raleway", Font.BOLD,14));
        addressTextField.setBounds(300,440,400,30);
        add(addressTextField);
        
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway" , Font.BOLD , 20));
        city.setBounds(100,490,100,30);
        add(city);
        
        cityTextField = new JTextField ();
        cityTextField.setFont(new Font("Raleway", Font.BOLD,14));
        cityTextField.setBounds(300,490,400,30);
        add(cityTextField);
        
        JLabel pin = new JLabel("Pin Code:");
        pin.setFont(new Font("Raleway" , Font.BOLD , 20));
        pin.setBounds(100,540,100,30);
        add(pin);
        
        pinTextField = new JTextField ();
        pinTextField.setFont(new Font("Raleway", Font.BOLD,14));
        pinTextField.setBounds(300,540,400,30);
        add(pinTextField);
        
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway" , Font.BOLD , 20));
        state.setBounds(100,590,100,30);
        add(state);
        
        stateTextField = new JTextField ();
        stateTextField.setFont(new Font("Raleway", Font.BOLD,14));
        stateTextField.setBounds(300,590,400,30);
        add(stateTextField);
       
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
        String formno = ""+random;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(male.isSelected())
        {
            gender = "Male";
        }else if(female.isSelected())
        {
            gender = "Female";
        }
        String email = emailTextField.getText();
        String maritalStatus=null;
        if(married.isSelected())
        {
            maritalStatus = "Married";
        }else if(unmarried.isSelected())
        {
            maritalStatus = "Unmarried";
        }else if (other.isSelected())
        {
            maritalStatus = "Other";
        }
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String pin = pinTextField.getText();
        String state = stateTextField.getText();
        
        try {
            if (name.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Name is required");
            }
            if (fname.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Father's Name is required");
            }
            if (dob.equals(""))
            {
                JOptionPane.showMessageDialog(null, "DOB is required");
            }
            if (email.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Email is required");
            }
            if (address.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Address is required");
            }
            if (city.equals(""))
            {
                JOptionPane.showMessageDialog(null, "City is required");
            }
            if (pin.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Pin Code Status is required");
            }
            if (state.equals(""))
            {
                JOptionPane.showMessageDialog(null, "State is required");
            }
            else {
                Conn c = new Conn();
                String query = "insert into signup values ('"+formno+"' , '"+name+"' , '"+fname+"' , '"+dob+"' , '"+gender+"' ,'"+email+"' , '"+maritalStatus+"' ,'"+address+"' , '"+city+"' ,'"+pin+"' ,'"+state+"' )";  
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignUp2(formno).setVisible(true);
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }

        
    }

    public static void main(String args[]) {
        new SignUp1();
    }
}
