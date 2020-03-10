package week7_lab13_ex2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.zip.CheckedOutputStream;

public class TestClass {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("%s%n", "Please enter the number of houses in the estate: ");

	    DoorToDoor one = new DoorToDoor(in.nextInt());

	    one.fillHouses();

	    for (int i = 0; i < one.number_of_houses; i++){
            System.out.printf("Please enter a sales value for house %d", one.house_numbers[i]);
            one.fillSales(one.house_numbers[i], in.nextInt());
        }

        System.out.printf("The average sales are: %.2f%n", one.calc_average_sales());
        one.min_sales();

        System.out.printf("%10s | %-10s%n", "House Number", "Sales");
        for (int i = 0; i < one.number_of_houses; i++){
            System.out.printf("%6d %11d%n", one.house_numbers[i], one.sales_per_house[i]);
        }


    }
}
