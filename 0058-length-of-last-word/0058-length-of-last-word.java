class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        String lastWorld = words[words.length - 1];
        return lastWorld.length();
    }
}