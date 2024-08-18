public class TO_New_Prac {

    void TOH(int n, int source, int dest, int aux){
        if (n>0){
            int count = 0;
            TOH(n-1, source, aux, dest);
            System.out.println("Mode disk "+n+" from rod "+source+" to dest "+dest);
            count++;
            TOH(n-1, aux, dest, source);
        }
    }

    public static void main(String[] args) {
        TO_New_Prac obj = new TO_New_Prac();

        int n = 3; // Number of disks
        int source = 1; // Source rod
        int dest = 3; // Destination rod
        int aux = 2; // Auxiliary rod

        obj.TOH(n, source, dest, aux);
    }

}
