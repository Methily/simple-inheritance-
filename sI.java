package inheritance;

     
   class A {
    int i, j;
    void showij() {
        System.out.println("i and j:"+i+ ' '+i);
    }
}
class B extends A {
    int k;
    void showk() {
        System.out.println(+k);
    }
    void sum() {
        System.out.println(+(i+j+k));
    }
}

public class sI {
    public static void main(String[] args) {
        
    }
}

    

