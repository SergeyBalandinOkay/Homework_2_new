public class Main {
    public static void main(String[] args) {

//  0) применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int

        int A = 20;
        int B = 10;
        int resultPlus = A + B;
        int resultMinus = A - B;
        int resultMultiplication = A * B;
        int resultDivision = A / B;

        System.out.println("A + B = " + resultPlus);
        System.out.println("A - B = " + resultMinus);
        System.out.println("A * B = " + resultMultiplication);
        System.out.println("A / B = " + resultDivision);
        System.out.println("---");

//  1) применить несколько арифметических операций над int и double в одном выражении

        int C = 100;
        double D = 2.5;
        double resultPlusFraction = C + D;
        double resultMinusFraction = C - D;
        double resultMultiplicationFraction = C * D;
        double resultDivisionFraction = C / D;

        System.out.println("C + D = " + resultPlusFraction);
        System.out.println("C - D = " + resultMinusFraction);
        System.out.println("C * D = " + resultMultiplicationFraction);
        System.out.println("C / D = " + resultDivisionFraction);
        System.out.println("---");

//   2) применить несколько логических операций ( < , >, >=, <= )
        boolean result1 = A > B;
        boolean result2 = A < B;
        boolean result3 = A >= B;
        boolean result4 = A <= B;

        System.out.println("A > B = " + result1);
        System.out.println("A < B = " + result2);
        System.out.println("A >= B = " + result3);
        System.out.println("A <= B = " + result4);
        System.out.println("---");

//  4) получить переполнение при арифметической операции.
        int maxInt = 2147483647;
        int number = 1;
        System.out.println(maxInt + number);
    }
}
