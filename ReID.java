public class ReID {

    public static void main(String[] args) {
        String id = solution(5);
        System.out.println("The minion's new ID is :" + id);
    }

    public static String getPrime() {
        String rs = new String();
        int i, j;
        for (i = 2; i < 30000; i++) {
            for (j = 2; j <= i; j++) {
                if (i == j) {
                    rs = rs + i;
                }
                if (i % j == 0) {
                    break;
                }
            }
        }
        return rs;
    }

    public static String solution(int n) {
        return getPrime().substring(n, n + 5);
    }

}