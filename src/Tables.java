import java.util.ArrayList;

public class Tables extends Restaurant implements ITableControl {
    ArrayList<Integer> tables = new ArrayList<Integer>();

   public Tables(){
       super();
       defaultTableCount(5);
   }

   public void tableReservation(int tableNum){
       int selectedIndex = findIndex(tableNum);
       tables.remove(selectedIndex);

   }

   public int findIndex(int value){
       return tables.indexOf(value);
   }

   public String showAllTables(){
       String all = "";
       for (Integer table : tables) {
           all = all + table + " ";
       }
       return all;
   }

    @Override
    public String toString(){
        return "Total tables: " + tables.size();
    }

    @Override
    public void setTableCount(int maxTable) {
        tables.stream().limit(maxTable);
        System.out.println("Max table number is updated as " + maxTable);
    }

    @Override
    public void defaultTableCount(int defaultTableCount) {
        for (int i = 1; i <= defaultTableCount; i++){
            tables.add(i);
        }
    }

    @Override
    public void openRestaurant() {
        super.openRestaurant();
    }
}
