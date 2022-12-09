import java.util.Random;
import java.util.Scanner;

public class Customer extends Tables {
    private String name;
    private int reservationId;
    private int reservationTime;
    private int tableNum;

    private String period;

    public Customer() {

    }

    public void createCustomer(){
        Scanner sc = new Scanner(System.in);

        showAllTables();

        System.out.println("Customer name:");
        String name = sc.nextLine();
        this.name = name;

        System.out.println("Reservation hour(Ex: 14PM):");
        int reservationTime = sc.nextInt();
        this.reservationTime = reservationTime;


        System.out.println("Table:");
        int tableNum = sc.nextInt();
        this.tableNum = tableNum;

        this.reservationId = tableNum;

        tableReservation(tableNum);
        addBookedTables(tableNum);
        addReservationInfo(
                "\n******************************************\nCustomer: " + this.name + "\nTable: " + this.tableNum
        );
        getBookedTables();
    }

    private String setPeriod(){
        if (this.reservationTime > 12){
            return this.reservationTime + " PM";
        }else{
            return this.reservationTime + " AM";
        }
    }

    @Override
    public String toString(){
        return "Customer name: " + this.name + "\nReservation Id: " +
                this.reservationId + "\nReservation time: " + setPeriod() + "\nTable num: " + this.tableNum;
    }
}
