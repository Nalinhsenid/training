import com.nalin.interfaces.Shape;
import com.nalin.shapeinpout.PrintOutput;
import com.nalin.shapeinpout.ShapeInput;

public class Main {
    public static void main(String[] args) {
        Shape s = new ShapeInput().getInputShape();
        new PrintOutput().printOutputShape(s);
    }
}