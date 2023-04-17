import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;
import java.util.Scanner;
import static java.lang.Math.*;

public class Main{
    public static void main(String[] args) {
        Main prog = new Main();
        prog.run();

        Main date = new Main();
        prog.date();
    }
    private double calcA(double x, double y){

        return ((2 * cos(x - PI / 6))/(1 / 2 + pow(sin(y), 2)));
    }
    private double calcB(double z){

        return ((1 + pow(z, 2)) / (3 + pow(z, 2) / 5));
    }

    private void print(double x, double y, double z, double a, double b){
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    private void date(){
        String pattern = "dd-MM-yy";
        SimpleDateFormat data = new SimpleDateFormat(pattern);
        String date = data.format(new Date());
        System.out.println("Дата: " + date);
    }
    private void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть х:");
        double x = scanner.nextDouble();

        System.out.println("Введіть у:");
        double y = scanner.nextDouble();

        System.out.println("Введіть z:");
        double z = scanner.nextDouble();

        double a = calcA(x, y);
        double b = calcB(z);

        print(x, y, z, a, b);
    }
}
