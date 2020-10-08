public class ReID {

    public static String solution(int i) {
        int startIndex = i;
        int endIndex = startIndex + 5;

        String primeNumbers = "";// initially empty
        int x = 0;// loop var
        int num = 0;// loop var

        try {
            for (x = 0; x <= 10000; x++) {
                int counter = 0;
                for (num = x; num >= 1; num--) {
                    if (x % num == 0) {
                        counter = counter + 1;
                    }
                }
                if (counter == 2) {
                    // if the number is prime
                    primeNumbers = primeNumbers + x;
                    if (primeNumbers.length() >= endIndex)
                        // if the lenght is greater than or equal to the endIndex
                        break;
                }
            }
            return primeNumbers.substring(startIndex, endIndex);
        } catch (NumberFormatException ex) {
            return "An error occurred assigning this minion a new ID";
        }
    }

    public static void main(String[] args) {
        String id = solution(5);
        System.out.println("The minion's new ID is :" + id);
    }
}