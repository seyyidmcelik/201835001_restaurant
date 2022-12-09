import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel {
    private JLabel jcomp1;
    private JLabel jcomp2;
    private JLabel jcomp3;
    private JButton jcomp4;
    private JButton jcomp5;
    private JButton jcomp6;

    private String customerName;
    private String hour;
    private String tableNo;

    public Panel() {
        //construct components
        jcomp1 = new JLabel ("Welcome the XXXX Restaurant Reservation System");
        jcomp2 = new JLabel ("Restaurant is open between 10AM - 24PM");
        jcomp3 = new JLabel ("All tables: ");
        jcomp4 = new JButton ("Book");
        jcomp5 = new JButton ("Reservation Info");
        jcomp6 = new JButton ("Booked Tables");

        //adjust size and set layout
        setPreferredSize (new Dimension (388, 300));
        setLayout (null);

        //add components
        add (jcomp1);
        add (jcomp2);
        add (jcomp3);
        add (jcomp4);
        add (jcomp5);
        add (jcomp6);

        //set component bounds (only needed by Absolute Positioning)
        jcomp1.setBounds (50, 25, 305, 50);
        jcomp2.setBounds (70, 70, 240, 40);
        jcomp3.setBounds (60, 145, 250, 25);
        jcomp4.setBounds (60, 200, 120, 25);
        jcomp5.setBounds (60, 240, 252, 25);
        jcomp6.setBounds (190, 200, 120, 25);

        Tables tables = new Tables();

        jcomp3.setText("All tables: " + tables.showAllTables());

        jcomp6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane bookedTablesPage = new JOptionPane();
                bookedTablesPage.showMessageDialog(null,tables.getBookedTables());
            }
        });

        jcomp4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane bookedTablesPage = new JOptionPane();
                customerName = bookedTablesPage.showInputDialog(null,"Customer Name: ","Booking",JOptionPane.QUESTION_MESSAGE);
                hour = bookedTablesPage.showInputDialog(null,"Reservation Hour: ","Booking",JOptionPane.QUESTION_MESSAGE);
                tableNo = bookedTablesPage.showInputDialog(null,"Table Number: ","Booking",JOptionPane.QUESTION_MESSAGE);
                tables.tableReservation(Integer.parseInt(tableNo));
                tables.addBookedTables(Integer.parseInt(tableNo));
                tables.addReservationInfo(
                        "**************************\nCustomer name: " + customerName + "\nTable Number: " + tableNo+"\n"
                );
                jcomp3.setText("All tables: " + tables.showAllTables());
                //getBookedTables();
            }
        });

        jcomp5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane bookedTablesPage = new JOptionPane();
                bookedTablesPage.showMessageDialog(null,tables.getReservationInfo());
            }
        });
    }
}
