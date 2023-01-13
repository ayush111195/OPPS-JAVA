//access modifirs -->>
//there are 4 type of access modifirs
//1.private
//2.default
//3.protected
//4.public

// getters and setters--->
//getter--->return the value
//setter-->set/update the value
//
// class employee {
//    private int id;
//    private String name ;
//
//    public String getName(){
//        return name;
//    }
//
//     public int getId() {
//         return id;
//     }
//     public  void setname(String a){
//       this. name=a;
//     }
//
//     public void setId(int id) {
//         this.id = id;
//     }
// }
//public class Main {
//    public static void main(String[] args) {
//        employee ayush=new employee();
//        ayush.setname("ayush");
//        ayush.setId(1233);
//        System.out.println(ayush.getName());
//        System.out.println(ayush.getId());
//    }
//}

class cylinder{
    int redius;
    int height;

    public cylinder( int redius,int height ) {
        this.height=height;
        this.redius=redius;
    }

public cylinder(){

}


    public int getRedius(){
        return redius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setRedius(int redius) {
        this.redius = redius;
    }

    public double surfaceArea() {
        return 2*3.14*redius*redius+2*3.14*redius*height;
    }
    public double volume(){
        return 3.14*redius*redius*height;
    }
}

public class Main {
    public static void main(String[] args) {

    cylinder xyz=new cylinder();
//        cylinder xyz=new cylinder();
//        xyz.redius=12;
//        xyz.height=22;
        xyz.redius=12;
        xyz.height=13;
        System.out.println(xyz.getHeight());
        System.out.println(xyz.getRedius());
        System.out.println(xyz.surfaceArea());
        System.out.println(xyz.volume());
    }
}