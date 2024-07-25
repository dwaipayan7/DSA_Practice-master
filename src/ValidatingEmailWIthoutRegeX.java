public class ValidatingEmailWIthoutRegeX {

    public static boolean isValidEmail(String email){
        int atSymbolIndex = email.indexOf('@');
        int dotSymbolIndex = email.lastIndexOf('.');

        if (atSymbolIndex < 1 || dotSymbolIndex < atSymbolIndex + 2 || dotSymbolIndex >= email.length()){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "abc@gmail.com";
        String s2 = "fdfsfsfa";

        String val1 = String.valueOf(isValidEmail(s1));
        System.out.println(val1);

        String val2 = String.valueOf(isValidEmail(s2));
        System.out.println(val2);

    }
}
