
public class Solution {

    public static boolean validatePin(String pin) {

        if (pin.length() == 4 || pin.length() == 6) {

            pin = pin.replaceAll("[0-9]", "");
            System.out.println(pin);
            System.out.println(pin.length());
            if (pin.length() == 0) {
                return true;
            }

        }

        return false;
    }

}
