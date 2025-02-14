package StringPractice;

public class Test {




    public static void main(String[] args) throws InterruptedException {
//        String str1 = "Hello"; --> Not Mutable
//        String str2 = str1.concat("World");
//        System.out.println(str2);

//        String s1 = "Hello";
//        StringBuilder sb = new StringBuilder("Hello");
//        sb.append(" World").append(" !").reverse(); //-> Method chaining
//
//        String string = sb.toString();
//        System.out.println(string);

//        StringBuilder sb = new StringBuilder(); //Not thread safe

        //char array (16)
        //mutable
        //method chaining

//        sb.append("Hello");
//        sb.insert(1,"Java");
//        sb.replace(1,3,"World");
//        sb.delete(1,4);
//        sb.reverse();
//        sb.charAt(0);
//        sb.length();
//        sb.substring(1,4);



        //UnderStanding Thread Safety
//        StringBuilder sb = new StringBuilder(); --> causes random behaviour different thread sharing same resources.

        StringBuffer sb = new StringBuffer();

        Task t1 = new Task(sb);
        Task t2 = new Task(sb);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Length: "+sb.length());


    }

}


class Task extends Thread{

//    private  StringBuilder sb;

    StringBuffer sb;

    public Task(StringBuffer sb){
        this.sb = sb;
    }

    @Override
    public void run(){
        for (int i = 0; i<1000; i++){
            sb.append("a");
        }
    }


}