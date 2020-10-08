public class ReID {

    public static String solution(int i) {
        if (i < 0 || i > 10000)
            return "Please provide a valid minion ID";
        int startIndex = i;
        int endIndex = startIndex + 5;

        String primeString = "";// initially empty
        int realNo = 0;// loop var for holding real numbers
        int divisor = 0;// loop var for dividing real numbers 

        try {
            for (realNo = 0; realNo <= 10000; realNo++) {
                int factors = 0;
                for (divisor = realNo; divisor >= 1; divisor--) {
                    if (realNo % divisor == 0) {
                        //check number of factors
                        factors = factors + 1;
                    }
                }
                if (factors == 2) {
                    // if the number is prime
                    primeString = primeString + realNo;
                    if (primeString.length() >= endIndex)
                        // if the lenght is greater than or equal to the endIndex
                        break;
                }
            }
            return primeString.substring(startIndex, endIndex);
        } catch (NumberFormatException ex) {
            return "An error occurred assigning this minion a new ID";
        } catch (Exception ex) {
            return "An error occurred assigning this minion a new ID";
        }
    }

    public static void main(String[] args) {
        String id = solution(5);
        System.out.println("The minion's new ID is :" + id);
    }
}