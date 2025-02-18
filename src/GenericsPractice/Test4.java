package GenericsPractice;

public class Test4 {

    enum Operation{
        ADD, SUBTRACT, MULTIPLY, DIVINE;

        public <T extends Number> double apply(T a, T b){

            switch (this){
                case ADD -> {
                    return a.doubleValue() + b.doubleValue();
                }
                case SUBTRACT -> {
                    return a.doubleValue() - b.doubleValue();
                }
                case MULTIPLY -> {
                    return a.doubleValue() * b.doubleValue();
                }
                case DIVINE -> {
                    return a.doubleValue()/b.doubleValue();
                }
                default -> {
                    throw new AssertionError("Unknown operation: " + this);
                }
            }

        }

    }

    public static void main(String[] args) {

       double res1 =  Operation.MULTIPLY.apply(10,20);
        System.out.println(res1);

    }

}
