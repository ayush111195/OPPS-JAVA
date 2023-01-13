public class Main {
     static int logic(int x, int y ) {
        int z;
        if (x > y) {
            z = x * y;
        } else {
            z = (x * y) / 5;
        }
         return z;
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        int c;
//        Main obj=new Main(); //(jab humne mathods ko static nhi kiya to object bnate h )
//        c=obj.logic(a,b);
        c=logic(a,b);
//        if(a>b){
//            c=a*b;
//        }
//        else {
//            c=(a*b)/5;
//        }

        System.out.println(c);

        int a1 = 10;
        int b1 = 20;
        int c1 ;
        c1=logic(a1,b1);
//        if(a1>b1){
//            c1=a1*b1;
//        }
//        else {
//            c1=(a1*b1)/5;
//        }
        System.out.println(c1);



    }}