public class Main {
    public static void main(String[] args) {

        Check check = new Check();
        check.isTheSame("programação", "ão");
        check.isTheSame("olá", "mundo");
        check.isTheSame("", "abc");
        System.out.println(check.isTheSame("programação", "ão"));
        System.out.println(check.isTheSame("olá", "mundo"));
        System.out.println(check.isTheSame("", "abc"));


    }
}

