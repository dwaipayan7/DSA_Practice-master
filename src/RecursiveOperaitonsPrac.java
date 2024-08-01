public class RecursiveOperaitonsPrac {

    static void printPrem(String str, String permutations){
        if (str.length() == 0){
            System.out.println(permutations);
            return;
        }

        for (int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            String res = str.substring(0,i) + str.substring(i+1);
            printPrem(res,permutations+curr);
        }
    }

    public static void main(String[] args) {

        String str = "ABC";
        printPrem(str,"");
    }

}
