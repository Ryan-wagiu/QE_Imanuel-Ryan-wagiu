public class problem6 {
    private static boolean palindrome(String value) {
        String putar="";

        boolean hasil = false;

        for (int i = (value.length() - 1); i >=0; --i) {
            putar = putar + value.charAt(i);
        }if (value.equals(putar)) {
            hasil=true;
        } return hasil;

    }
    public static void main(String[] args) {
        System.out.println(palindrome("civic"));        //true
        System.out.println(palindrome("katak"));        //true
        System.out.println(palindrome("kasur rusak"));  //true
        System.out.println(palindrome("kupu-kupu"));    //false
        System.out.println(palindrome("lion"));         //false
    }
}
