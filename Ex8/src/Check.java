public class Check {

    public static boolean isTheSame(String first, String second) {

        if (first.length() < 2 || second.length() < 2) {
            return false;
        } else {
            String lastCaracters = first.substring(first.length() - 2);
            String firstCaracters = second.substring(0, 2);

            if (lastCaracters.equals(firstCaracters)) {
                return true;

            } else {
                return false;
            }
        }
    }
}
