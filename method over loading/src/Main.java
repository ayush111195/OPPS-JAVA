public class Main {
    static void foo(){
        System.out.println("good morning bro!");
    }
    static void foo(int z){
        System.out.println("good morning "+z+"bro");
    }
    static void foo(int z,int y){
        System.out.println("good morning "+z+"bro");
        System.out.println("good morning "+y+"bro");
    }
    static void change(int a){
        a=98;
    }
    static void change2(int[] arr){
        arr[0]=98;
    }
    static void telljoke(){
        System.out.println("i invented a new word!\n"+
                "plagiarism!");
    }
    public static void main(String[] args) {
        foo();
        foo(80);
        foo(800,500);


        int x=45;
        change(x);
        System.out.println(" the value of x after running  change is " + x );


        int []marks={52,66,77,88,99,80,};
        change2(marks);
        System.out.println(" the value of x after running  change is "+marks [0] );


        telljoke();


    }}