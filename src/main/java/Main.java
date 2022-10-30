import java.util.function.IntSupplier;

public class Main {
    public static void main(String[] args) {

        Object obj = new Object();
        System.out.println(obj.hashCode());
        IntSupplier intSupplier = obj::hashCode;
        System.out.println(intSupplier.getAsInt());

        MethodReference methodReference = new MethodReference();
        methodReference.test(intSupplier);
    }
}
