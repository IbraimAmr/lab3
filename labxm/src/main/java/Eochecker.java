import java.util.Scanner;
public class Eochecker {
        public String checker(int number) {

            if (number % 2 == 0)
                return "even";
            else
                return "odd";
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int e = scanner.nextInt();
            var check = new Eochecker();
            check.checker(e);
        }
    }

