package gui.register_login_student_faculty.form;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Faculty extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField name,email,address,dep;
    private JButton btnNewButton,btnResetButton;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Faculty frame = new Faculty();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }            }         });
    } 
    public Faculty() {
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 600, 600);
        setResizable(false);         contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);         contentPane.setLayout(null);
        contentPane.setBackground(Color.cyan);
        JLabel lblNewFucRegister = new JLabel("Form Faculty");
        lblNewFucRegister.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        lblNewFucRegister.setBounds(214, 20, 325, 20); contentPane.add(lblNewFucRegister);
        JLabel lblName = new JLabel("faculty Name");
        lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblName.setBounds(58, 70, 99, 43);         contentPane.add(lblName);
        JLabel lblNewLabel = new JLabel("Address");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel.setBounds(58, 140, 110, 29);
        contentPane.add(lblNewLabel);
        
        JLabel lblEmailAddress = new JLabel("Email");
        lblEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblEmailAddress.setBounds(58, 200, 124, 36);contentPane.add(lblEmailAddress);
        
        name = new JTextField(); name.setFont(new Font("Tahoma", Font.PLAIN, 32));
        name.setBounds(214, 70, 228, 50); contentPane.add(name);name.setColumns(10);
        
        address = new JTextField(); address.setFont(new Font("Tahoma", Font.PLAIN, 32));
        address.setBounds(214, 140, 228, 50); contentPane.add(address);  address.setColumns(10);
        
        email = new JTextField();  email.setFont(new Font("Tahoma", Font.PLAIN, 32));
        email.setBounds(214, 200, 228, 50); contentPane.add(email); email.setColumns(10);
        
        dep = new JTextField(); dep.setFont(new Font("Tahoma", Font.PLAIN, 32));
        dep.setBounds(214, 270, 228, 50); contentPane.add(dep); dep.setColumns(10);
        
        JLabel lblUsername = new JLabel(" Department ");
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20)); lblUsername.setBounds(58, 270, 136, 43);
        contentPane.add(lblUsername);
       
        btnNewButton = new JButton("Add"); 
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(name.getText().equals("")){
                    JOptionPane.showMessageDialog(btnNewButton, "Enter a faculty name");  }
                else{
                JOptionPane.showMessageDialog(btnNewButton, "Successfully Add"); 
                name.setText("");
                address.setText("");
                email.setText("");
                dep.setText("");
                
                }        } 

        } 
        );
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton.setBounds(140, 400, 130, 50);
        contentPane.add(btnNewButton);
        btnResetButton = new JButton("Reset"); 
        btnResetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                 name.setText("");
                address.setText("");
                email.setText("");
                dep.setText("");
                
            }});
            btnResetButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnResetButton.setBounds(280, 400, 130, 50);
        contentPane.add(btnResetButton);
    }
}