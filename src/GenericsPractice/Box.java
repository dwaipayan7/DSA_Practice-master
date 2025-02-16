package GenericsPractice;

public class Box<T extends Number> {

//    private Object value;
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
