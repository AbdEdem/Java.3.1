public class rubl2 {
    public static void main(String[] args) {
        int account = 1050;
        int balance = 100;
        int total = account + balance;
        boolean ttt = account >= 1000;

        int bonus = (ttt ? account / 100 + total: account + balance);
        System.out.println(bonus);
    }
}

