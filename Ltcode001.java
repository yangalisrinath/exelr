public class Ltcode001 {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        // Create a reversed number
        int original = x;
        int reversed = 0;
        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        // Check if the original number is equal to the reversed number
        return original == reversed;
    }

    public static void main(String[] args) {
        Ltcode001 solution = new Ltcode001();
        System.out.println(solution.isPalindrome(121)); // true
        System.out.println(solution.isPalindrome(-121)); // false
        System.out.println(solution.isPalindrome(10)); // false
    }
}