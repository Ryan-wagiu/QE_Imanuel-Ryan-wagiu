public class problem5 {
    public static boolean primeNumber(int number) {
        int checker=0;
        for (int i=2; i<=number; i++)
        {
                if (number%i==0)
                {
                    checker++;
                }
            }if (checker==1){return true;}
        return false;
    }

    public static void main(String[] args) {
        System.out.println(primeNumber(11));
        System.out.println(primeNumber(13));
        System.out.println(primeNumber(17));
        System.out.println(primeNumber(20));
        System.out.println(primeNumber(35));
        System.out.println(primeNumber(7));
        System.out.println(primeNumber(10));
    }

}
