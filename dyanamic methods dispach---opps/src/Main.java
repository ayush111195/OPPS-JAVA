 class phone{
   public void  ShowTheTime() {
       System.out.println("show the time ");
   }
   public void on(){
       System.out.println(" turning on the phone");
   }
 }
 class smartphone extends phone{
    public void music(){
        System.out.println("play the music");
    }

 }
public class Main {
    public static void main(String[] args) {
        phone apple=new smartphone();  // ye allowed h kyun ki smart-phone phone to hoga hi..
        apple.on();
        apple.ShowTheTime();
        apple.music(); //ye allowed nhi h .

    }
}