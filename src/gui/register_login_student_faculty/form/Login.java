package gui.register_login_student_faculty.form;
import javax.swing.*;
import java.awt.*;   
import java.awt.event.*;  
public class Login { 
    
    public Login(){
    JFrame f=new JFrame("Login"); 
    f.setBounds(450, 190, 600, 400);
    f.setResizable(false);
    f.setForeground(Color.cyan);
    f.setBackground(Color.CYAN);
    f.setLayout(null);
    JLabel lblNewLabel = new JLabel("Login");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 46));
        lblNewLabel.setBounds(100, 13, 150, 50);
        
 
    final JPasswordField value = new JPasswordField(); 
    value.setFont(new Font("Tahoma", Font.PLAIN, 32));
    value.setBounds(270, 155, 200, 40);  
    JLabel l1=new JLabel("Username:");
 l1.setBackground(Color.BLACK);l1.setForeground(Color.BLACK); l1.setFont(new Font("Tahoma", Font.PLAIN, 31));     
    l1.setBounds(100, 100, 150, 52);   
    JLabel l2=new JLabel("Password:");  l2.setForeground(Color.BLACK);l2.setBackground(Color.CYAN);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 31)); l2.setBounds(100, 150, 150, 52);     
    
        JButton b = new JButton("Login");
    b.setFont(new Font("Tahoma", Font.PLAIN, 26));   b.setBounds(270, 250, 130, 40);
    f.add(b);
     JButton r=new JButton("Register ");  r.setBounds(100, 250, 140, 40); f.add(r);
     r.setFont(new Font("Tahoma", Font.PLAIN, 26));
     
    final JTextField text = new JTextField();
    text.setFont(new Font("Tahoma", Font.PLAIN, 32));
    text.setBounds(270, 110, 200, 40);
    

    f.add(lblNewLabel);
    f.add(value); f.add(l1);  f.add(l2);  
    f.add(b);f.add(text);   f.setLayout(null);    
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
        new Register();
         }    }); 
     
}
  public static void main(String[] args) {  
 new Login();
}    
}  