package gui.register_login_student_faculty.form;
import javax.swing.*;
import java.awt.*;  
import java.awt.event.*;  
import javax.swing.border.EmptyBorder;
public class Register { 
    
    public Register() {
   
        JFrame f=new JFrame("Register"); 
        f.setBounds(450, 190, 600, 500);
        f.setBackground(Color.cyan);
        f.setResizable(false);
        JLabel lblNewLabel = new JLabel("Register");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        lblNewLabel.setBounds(100, 13, 150, 50);
     
       final JTextField text = new JTextField();
        text.setFont(new Font("Tahoma", Font.PLAIN, 32));
        text.setBounds(270, 110, 200, 40);
        
        final JTextField text2 = new JTextField(); 
        text2.setFont(new Font("Tahoma", Font.PLAIN, 32));
        text2.setBounds(270, 155, 200, 40); 
        
        final JTextField email = new JTextField(); 
        email.setFont(new Font("Tahoma", Font.PLAIN, 32));
        email.setBounds(270, 205, 200, 40); 
        
         final JPasswordField value = new JPasswordField(); 
        value.setFont(new Font("Tahoma", Font.PLAIN, 32));
        value.setBounds(270, 255, 200, 40); 
        
        JLabel l1=new JLabel("FirstName:");
        l1.setBackground(Color.BLACK);l1.setForeground(Color.BLACK); l1.setFont(new Font("Tahoma", Font.PLAIN, 31));     
        l1.setBounds(100, 100, 150, 52); 
        
        JLabel l11=new JLabel("LastName:");
        l11.setBackground(Color.BLACK);l11.setForeground(Color.BLACK); l11.setFont(new Font("Tahoma", Font.PLAIN, 31));     
        l11.setBounds(100, 155, 150, 52); 
        
        JLabel l2=new JLabel("Email:");  l2.setForeground(Color.BLACK);l2.setBackground(Color.CYAN);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 31)); l2.setBounds(100, 200, 150, 52);  
        
        JLabel l3=new JLabel("Password:");  l3.setForeground(Color.BLACK);l3.setBackground(Color.CYAN);
        l3.setFont(new Font("Tahoma", Font.PLAIN, 31)); l3.setBounds(100, 250, 150, 52); 
        
        JButton b = new JButton("Register");
        b.setFont(new Font("Tahoma", Font.PLAIN, 26));   b.setBounds(300, 330, 130, 40);
         
        JButton r=new JButton("Login ");  r.setBounds(140, 330, 130, 40); f.add(r);
         r.setFont(new Font("Tahoma", Font.PLAIN, 26));
        
         
        
        f.add(lblNewLabel);
        f.add(value); f.add(l1);  f.add(l2); f.add(l11); f.add(l3);
        f.add(b);f.add(text); f.add(text2);  f.add(email); f.add(r); f.setLayout(null);    
        f.setVisible(true);  
        b.addActionListener(new ActionListener() { 
        public void actionPerformed(ActionEvent e) {    
          

            if (text.getText().equals("admin") && value.getText().equals("admin"))  
            { JOptionPane.showMessageDialog(b, "Succefuly"); 
              index ind=new index();
              ind.setVisible(true);
              f.hide();
            } 
             else
                JOptionPane.showMessageDialog(b, "Username or Password does not matched"); 
                //label.setText("Username or Password does not matched");
                    } 
                         });  
     r.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) {
                new Login();
                 }    });  
               }
   public static void main(String[] args) {
       new Register();
}
}  