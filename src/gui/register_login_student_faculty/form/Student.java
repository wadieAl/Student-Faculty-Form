package gui.register_login_student_faculty.form;
import javax.swing.*;
import java.awt.*;  
import java.awt.event.*;
import javax.swing.border.EmptyBorder;

public class Student extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField name,Age,email,dep,cla,mob;
    private JButton btnNewButton,btnResetButton;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Student frame = new Student();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }            }         });
    } 
    public Student() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 700, 600);
        setResizable(false);         contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);         contentPane.setLayout(null);
        contentPane.setBackground(Color.cyan);
        JLabel lblNewUserRegister = new JLabel("Form Student");
        lblNewUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        lblNewUserRegister.setBounds(214, 20, 325, 20); contentPane.add(lblNewUserRegister);
        JLabel lblName = new JLabel("Name");
        lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblName.setBounds(58, 70, 99, 43);         contentPane.add(lblName);
        JLabel lblNewLabel = new JLabel("Age");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel.setBounds(58, 140, 110, 29);
        contentPane.add(lblNewLabel);
        JLabel lblEmailAddress = new JLabel("Email\r\n address");
        lblEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblEmailAddress.setBounds(58, 200, 124, 36);contentPane.add(lblEmailAddress);
        name = new JTextField(); name.setFont(new Font("Tahoma", Font.PLAIN, 32));
        name.setBounds(214, 70, 228, 50); contentPane.add(name);name.setColumns(10);
        Age = new JTextField(); Age.setFont(new Font("Tahoma", Font.PLAIN, 32));
        Age.setBounds(214, 140, 228, 50); contentPane.add(Age);  Age.setColumns(10);
        email = new JTextField();  email.setFont(new Font("Tahoma", Font.PLAIN, 32));
        email.setBounds(214, 200, 228, 50); contentPane.add(email); email.setColumns(10);  
        dep = new JTextField(); dep.setFont(new Font("Tahoma", Font.PLAIN, 32));
        dep.setBounds(214, 270, 228, 50); contentPane.add(dep); dep.setColumns(10);
        JLabel lblUsername = new JLabel(" Department ");
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20)); lblUsername.setBounds(58, 270, 136, 43);
        contentPane.add(lblUsername);
        JLabel lblPassword = new JLabel(" Password "); lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPassword.setBounds(58, 340, 99, 24); contentPane.add(lblPassword);
        JLabel lblMobileNumber = new JLabel("Mobile number"); lblMobileNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblMobileNumber.setBounds(58, 400, 139, 26);
        contentPane.add(lblMobileNumber); mob = new JTextField(); mob.setFont(new Font("Tahoma", Font.PLAIN, 32));
        mob.setBounds(214, 400, 228, 50); contentPane.add(mob); mob.setColumns(10);
        cla = new JTextField(); cla.setFont(new Font("Tahoma", Font.PLAIN, 32)); cla.setBounds(214, 340, 228, 50);
        contentPane.add(cla); mob.setColumns(10);
        btnNewButton = new JButton("Register"); 
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String mobil = mob.getText();
                int len = mobil.length();
                String msg = "" + name.getText();
                msg += " \n";
                if (len != 9) {
                    JOptionPane.showMessageDialog(btnNewButton, "Enter a valid mobile number");  }
                else{
                JOptionPane.showMessageDialog(btnNewButton, "Successfullylogin"); 
                name.setText("");
                Age.setText("");
                email.setText("");
                dep.setText("");
                cla.setText("");
                mob.setText("");
                }        } 

        } 
        );
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton.setBounds(140, 460, 150, 50);
        contentPane.add(btnNewButton);
        btnResetButton = new JButton("Reset"); 
        btnResetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 name.setText("");
                Age.setText("");
                email.setText("");
                dep.setText("");
                cla.setText("");
                mob.setText("");
            }});
            btnResetButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnResetButton.setBounds(310, 460, 150, 50);
        contentPane.add(btnResetButton);
    }
}