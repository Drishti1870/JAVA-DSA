package Practice;

import java.util.Scanner;

public class RangeArmstrong {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Taking input for the range
            System.out.print("Enter the lower bound: ");
            int lower = scanner.nextInt();
            System.out.print("Enter the upper bound: ");
            int upper = scanner.nextInt();

            System.out.println("Armstrong numbers between " + lower + " and " + upper + ":");

            // Finding and printing Armstrong numbers
            for (int num = lower; num <= upper; num++) {
                if (isArmstrong(num)) {
                    System.out.print(num + " ");
                }
            }

            scanner.close();
        }

        // Method to check if a number is an Armstrong number
        public static boolean isArmstrong(int num) {
            int originalNum = num, sum = 0, digits = 0;

            // Count the number of digits
            int temp = num;
            while (temp > 0) {
                temp /= 10;
                digits++;
            }

            // Calculate sum of digits raised to the power of total digits
            temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            // Check if sum equals the original number
            return sum == originalNum;
        }
    }

