class Solution {
    public boolean isPalindrome(int x) {
        String numberAsString = String.valueOf(x);
        String reversed = new StringBuilder(numberAsString).reverse().toString();
        return numberAsString.equals(reversed);
    }
}