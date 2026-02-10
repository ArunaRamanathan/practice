// class Test{
//     public void demo(){
//         System.out.println("this is non static method");
//     }
//     public static void main(String[] args){
//         Test t=new Test();
//         t.demo();
//     }
// }// this is for non static method we have to create the object of the class to call the method

// 

// class Test1{
//     static int a=20;
//     public static void test(){
//         System.out.println("This is test method");
//     }
// }
// class Test{
//     public static void main(String[] args) {
//            System.out.println(Test1.a);
//            Test1.test();
//     }
// }//To call the static var and mtd of diff clss -call by that classnme.mtdname

class Test1{
    static int a=20;
    public static void demo(){
        System.out.println("This is test method");
    }
    public void demo1(){
        Test1 t1=new Test1();
        System.out.println(t1.a);
        t1.demo();
    }
}
class Test{
    public static void main(String[] args) {
        System.out.println(Test1.a);
        Test1.demo();
        Test1 obj=new Test1();
        obj.demo1();
    }
}