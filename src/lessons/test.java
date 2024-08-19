package lessons;

public class test {
    public static void main(String[] args) {
        A obj=new B();
        obj.display();

        int i=5;
        do{
            System.out.println(i+" ");
            i++;
        }while (i<5);

        try{
            System.out.println("Внутри блока try");
            int[] numbers = {1,2,3};
            System.out.println(numbers[3]);
            System.out.println("Конец блока try");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Исключение ");
        }finally {
            System.out.println("finally ");
        }
        System.out.println("Код после ");
    }
}

class A{
    public void display(){
        System.out.println("A");
    }
}
class B extends A{
    public void display(){
        System.out.println("B");
    }
}
