import java.util.function.IntSupplier;

public class MethodReference {

    public void test(IntSupplier intSupplier){
        System.out.println(intSupplier.getAsInt());
    }
}
