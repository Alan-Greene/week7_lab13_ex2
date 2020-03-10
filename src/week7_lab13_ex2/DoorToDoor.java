package week7_lab13_ex2;

public class DoorToDoor {
    int[] house_numbers;
    int[] sales_per_house;
    int number_of_houses;

    public DoorToDoor(int number_of_houses){
        this.number_of_houses = number_of_houses;
        this.house_numbers = new int[number_of_houses];
        this.sales_per_house = new int[number_of_houses];
    }

    public void fillHouses(){
        for (int i = 0; i < this.number_of_houses; i++){
            this.house_numbers[i] = i+1;
        }
    }

    public void fillSales(int house_number, int sales_number){
        this.sales_per_house[house_number-1] = sales_number;
    }

    public void display_all(){
        for (int i = 0; i < this.number_of_houses; i++){
            System.out.printf("Entry %d%n", i+1);
            System.out.printf("house number %d%n", house_numbers[i+1]);
            System.out.printf("number of sales %d%n", sales_per_house[i]);
            System.out.println();
        }
    }

    public double calc_average_sales(){
        double sum = 0;

        for (int i = 0; i < this.number_of_houses; i++){
            sum += this.sales_per_house[i];
        }
        return sum / this.number_of_houses;
    }

    public void min_sales(){
        int min = this.sales_per_house[0];
        int house_with_min = this.house_numbers[0];

        for (int i = 1; i < this.number_of_houses; i++){
            if (this.sales_per_house[i] < min){
                min = this.sales_per_house[i];
                house_with_min = this.house_numbers[i];
            }
        }
        System.out.printf("House number with minimum sales is:" +
                " %d with sales of %d%n", house_with_min, min);
    }

}
