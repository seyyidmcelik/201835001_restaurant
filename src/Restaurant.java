import java.util.Scanner;

public class Restaurant extends Hour {

    Scanner scanner = new Scanner(System.in);

    public Restaurant(Object start, Object end) {
        super(start, end);
    }

    public Restaurant() {
        super();
    }

    @Override
    public void setStart(Object start) {
        super.setStart(start);
    }

    @Override
    public void setEnd(Object end) {
        super.setEnd(end);
    }

    public void openRestaurant() {
        System.out.println("****************************************************");
        System.out.println("Welcome the XXXXX Restaurant Reservation System");
        System.out.println("Restaurant is open between " + setPeriod((int)workingHourAtStart()) + " - " + setPeriod((int)workingHourAtEnd()));
        System.out.println("****************************************************");
    }

    private String setPeriod(Integer time){
        if (time > 12){
            return time + "PM";
        }else{
            return time + "AM";
        }
    }

    private void bookOrExit(){
        System.out.println("What do you want to ?");
        System.out.println("1 --> Book a table");
        System.out.println("2 --> Exit");
    }

    private void checkReservation(){
        System.out.println("Would you check reservartions ?");
        System.out.println("1 --> Check reservations");
        System.out.println("2 --> Go home page");
    }

    public void openSystem(){
        setStart(10);
        setEnd(24);
        Customer customer = new Customer();
        while (true){
            openRestaurant();
            bookOrExit();
            if (scanner.nextInt() == 1){
                customer.createCustomer();
                checkReservation();
                if (scanner.nextInt() == 1){
                    customer.getReservationInfo();
                }else {
                    continue;
                }
            }else {
                System.out.println("Exiting...");
                break;
            }
        }
    }


}
