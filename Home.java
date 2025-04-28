package airlinemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener {

    public Home() {
        setTitle("Air India Airline Management System");
        setLayout(new BorderLayout());
        
        // Background Image
        ImageIcon bgIcon = new ImageIcon(ClassLoader.getSystemResource("airlinemanagementsystem/icon/front.png"));
        Image bg = bgIcon.getImage().getScaledInstance(1620, 850, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(bg);
        JLabel background = new JLabel(scaledIcon);
        background.setLayout(null);
        add(background);

        // Transparent overlay panel for heading
        JPanel overlay = new JPanel();
        overlay.setBackground(new Color(0, 0, 0, 100)); // semi-transparent
        overlay.setBounds(0, 0, 1600, 100);
        overlay.setLayout(null);
        background.add(overlay);

        // Stylish Heading
        JLabel heading = new JLabel(" AIR INDIA WELCOMES YOU ", SwingConstants.CENTER);
        heading.setBounds(270, 20, 1000, 60);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Segoe UI", Font.BOLD, 50));
        overlay.add(heading);

        // Stylish Menu Bar
        JMenuBar menuBar = new JMenuBar();
        menuBar.setBackground(new Color(25, 25, 112)); // dark blue
        menuBar.setForeground(Color.WHITE);
        menuBar.setBorderPainted(false);
        menuBar.setOpaque(true);
        setJMenuBar(menuBar);

        // Add Menus with Font
        Font menuFont = new Font("Segoe UI", Font.BOLD, 16);

        JMenu details = new JMenu("Details");
        details.setForeground(Color.WHITE);
        details.setFont(menuFont);
        menuBar.add(details);

        JMenu ticket = new JMenu("Ticket");
        ticket.setForeground(Color.WHITE);
        ticket.setFont(menuFont);
        menuBar.add(ticket);

        // Add Menu Items
        addMenuItem(details, "Flight Details");
        addMenuItem(details, "Add Customer Details");
        addMenuItem(details, "Book Flight");
        addMenuItem(details, "Journey Details");
        addMenuItem(details, "Cancel Ticket");

        JMenuItem boardingPass = new JMenuItem("Boarding Pass");
        styleMenuItem(boardingPass);
        ticket.add(boardingPass);

        // JFrame settings
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void addMenuItem(JMenu menu, String title) {
        JMenuItem item = new JMenuItem(title);
        item.addActionListener(this);
        styleMenuItem(item);
        menu.add(item);
    }

    private void styleMenuItem(JMenuItem item) {
        item.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        item.setBackground(new Color(230, 230, 250));
        item.setForeground(Color.DARK_GRAY);
        item.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
    }


     public void actionPerformed(ActionEvent ae) {
        String text = ae.getActionCommand();
        
        if (text.equals("Add Customer Details")) {
            new AddCustomer();
        } else if (text.equals("Flight Details")) {
            new FlightInfo();
        } else if (text.equals("Book Flight")) {
            new BookFlight();
        } else if (text.equals("Journey Details")) {
            new JourneyDetails();
        } else if (text.equals("Cancel Ticket")) {
            new Cancel();
        }
    }

    public static void main(String[] args) {
        new Home();
    }
}
