public class Demo046 {
    public static void main(String[] args) {
        int year = 2024; 

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true; 
                } else {
                    return false; 
                }
            } else {
                return true; 
            }
        } else {
            return false; 
        }
    }
}