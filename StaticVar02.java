public class StaticVar02 {
    int num=3;
    void set(){
        num++;
        System.out.println(num);

    }
}
class Main{
    public static void main(String[] args) {
        StaticVar02 obj1=new StaticVar02();
        obj1.set();
        StaticVar02 obj2=new StaticVar02();
        obj2.set();
        StaticVar02 obj3=new StaticVar02();
        obj3.set();
    }
}