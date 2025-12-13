package PracticeNew1;

public class RansomeNote {

    public static boolean canConstruct(String ransomeNote, String magazine){
        int[]arr = new int[26];
        for (char r: ransomeNote.toCharArray()){
            arr[r - 'a']++;
        }

        for (char m : magazine.toCharArray()){
            arr[m - 'a']--;
        }

        for (int i : arr){
            if (i > 0){
                return false;
            }
        }
        return true;
    }

    static void main() {

        String ransomeNote = "ab";
        String magazine = "ab";
        System.out.println(canConstruct(ransomeNote, magazine));

    }

}
