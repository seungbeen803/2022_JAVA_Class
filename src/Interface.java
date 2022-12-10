interface Interface1 {
    void method_dish();
}
interface Interface2 {
    void method_sleep();
}
interface Interface3 extends Interface1, Interface2 {
    @Override
    void method_dish();

    @Override
    void method_sleep();
}

class InterfaceClass implements Interface3 {
    public void method_dish(){
        System.out.println("저는 설거지를 할 수 있어요");
    }
    public void method_sleep(){
        System.out.println("저는 잠에 들 수 있어요");
    }
}
public class Interface extends InterfaceClass {
    public static void main(String[] args) {
        InterfaceClass interface_1 = new InterfaceClass();

        interface_1.method_dish();
        interface_1.method_sleep();
    }
}
