package gui.register_login_student_faculty.form;
import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;  
public class index { 
    public index(){
    JFrame f=new JFrame("Index"); 
    f.setBounds(450, 190, 400, 400);
    f.setResizable(false);
    f.setBackground(Color.cyan);
    
    JButton login = new JButton("Login");
    login.setFont(new Font("Tahoma", Font.PLAIN, 20)); 
    login.setBounds(70, 270, 102, 50);
    
    JButton register = new JButton("Register");
    register.setFont(new Font("Tahoma", Font.PLAIN, 20)); 
    register.setBounds(180, 270, 132, 50);
    
    JButton student = new JButton("Student");
    student.setFont(new Font("Tahoma", Font.PLAIN, 26));   student.setBounds(135, 100, 152, 50);
     JButton faculty=new JButton("Faculty ");  faculty.setBounds(135, 200, 152, 50); f.add(faculty); 
     faculty.setFont(new Font("Tahoma", Font.PLAIN, 26));
      f.add(login); f.add(register);
    f.add(student);   f.setLayout(null);    
    f.setVisible(true);  
   
    
    login.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            Login lg=new Login();
           // lg.setVisible(true);
        }
    });
     register.addActionListener(new ActionListener() { 
    public void actionPerformed(ActionEvent e) { 
       Register rg= new Register();
       //rg.setVisible(true);
    } }); 
     
    student.addActionListener(new ActionListener() { 
    public void actionPerformed(ActionEvent e) { 
       Student st= new Student();
       st.setVisible(true);
    } });  
 
     faculty.addActionListener(new ActionListener() { 
    public void actionPerformed(ActionEvent e) {
       Faculty fac=new Faculty(); fac.setVisible(true);
         }    }); 
}
  public static void main(String[] args) {  
 new index();
}    

    void setVisible(boolean b) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}  