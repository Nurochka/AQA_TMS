package hw6.lesson6;
// с переменным количеством переменных - указывается последним параметром; работать как с массивом
public class Dynamic{

    public static void main(String[] args) {
        Dynamic obj = new Dynamic();
        obj.testMethod(9, "Test", "Passed");
    }
    public void testMethod(int b, String... d){
       for (int i = 0; i < d.length; i++){
           System.out.println(d[i]);
       }

    }

}
