
class Kata {

    public static String getMiddle(String word) {
        int length = word.length();
        if (length % 2 == 0) {
            String output = Character.toString(word.charAt((length / 2) - 1)) + Character.toString(word.charAt((length / 2)));
            return output;
        } else {
            String output = Character.toString(word.charAt(length / 2));
            return output;

        }

    }
}
