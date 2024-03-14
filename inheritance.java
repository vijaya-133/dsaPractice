import java.util.*;


public class inheritance {
    public static void main(String[] args){
        child c = new child();
        System.out.println(c.b);
        System.out.println(c.a);
        //System.out.println(c.show());
        

    }
}

// Parent - Child
//use keyword 'extends' for derived class

//types -> single ingeritance
//      -> multilevel inheritance
//        ->multiple inheritance  -->interfaces
//      ->heirachial inheritance

class parent{
    int a = 20;
    void display(){
        System.out.println("Parents");
    }
}

class child extends parent{
    int b = 10;
    void show(){
        System.out.println("Child");
    }
}
