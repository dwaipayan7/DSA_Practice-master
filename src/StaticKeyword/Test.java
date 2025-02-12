package StaticKeyword;

public class Test {

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();

//        System.out.println(Student.count);

        Student.getCount();

        int c = sum(1,2);
        System.out.println(c);

        System.out.println(Utils.max(1, 2));
        System.out.println(Utils.min(1, 2));

        System.out.println(Utils.trimAndUppercase("fkdsjfakdjfd dfaf"));

        Singleton.getInstance();

    }

    public static int sum(int a, int b){
        return a+b;
    }



}
