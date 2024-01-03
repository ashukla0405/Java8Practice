package javatechi;

interface Calculator {

    //void switchOn();
    //void sum(int i);
    int subtractVal(int i, int j);
}

public class CalculatorImpl {

    public static void main(String[] args) {
/**
 Calculator cal = () -> System.out.println("First Lambda expression");
 cal.switchOn();*/

/**Calculator cal = (i) -> System.out.println(i);
 cal.sum(5);*/
        Calculator cal = (i, j) -> {
            if (j < i) {
                throw new RuntimeException();
            } else {
                return j - i;
            }
        };



        System.out.println("Reyurn value is - " + cal.subtractVal(30, 32));
    }

}


