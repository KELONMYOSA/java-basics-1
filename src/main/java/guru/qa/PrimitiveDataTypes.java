package guru.qa;

public class PrimitiveDataTypes {

    byte aByte = 10; // 8 bit -128 ... 127
    short aShort = 100; // 16 bit -32768 ... 32767

    // самый используемый
    int aInt = 1_100_000; // 32 bit -2 ^ 31 ... (2 ^ 31) -1
    long aLong = 100L; // 64 bit -2 ^ 63 ... (2 ^ 63) -1

    float aFloat = 0.0F; // 32 bit
    // самый используемый (если просто хранить, но не использовать арифметику)
    double aDouble = 0.0D; // 64 bit

    char aChar = 'c';
    boolean aBoolean = false;
    String aString = "hello, qa.guru!";

    public static void main(String[] args) {
        // + -- сложение
        // - -- вычитание
        // * -- умножение
        // / -- целочисленное деление
        // % -- остаток от деления
        // инкремент ++
        // декремент --

        // >
        // <
        // >=
        // <=
        // ==
        // !=

        // =
        // +=
        // -=...
        //int a = 10;
        //int b = 10;
        //a = a + b;
        //a += b;

        // && (&)
        // || (|)
        // !

        byte i = 30, j = 100;
        short n = 3000, m = 30000;

        System.out.println("Сложение примитивных типов данных и переполнение:");
        System.out.println(i + n); // byte + short
        System.out.println((byte) (i + j)); // byte + byte overflow
        System.out.println((byte) (i + n)); // byte + short overflow
        System.out.println((byte) (n + m)); // short + short overflow
        System.out.println((short) (n + m)); // short + short overflow
        System.out.println((byte) (i - n)); // byte - short underflow

        System.out.println("Операторы:");
        int zero = 0;
        System.out.print("Значение: ");
        System.out.println(zero);

        System.out.println("+5");
        zero = zero + 5;
        System.out.print("Значение: ");
        System.out.println(zero);

        System.out.println("*5");
        zero = zero * 5;
        System.out.print("Значение: ");
        System.out.println(zero);

        System.out.println("%2");
        zero = zero % 2;
        System.out.print("Значение: ");
        System.out.println(zero);

        System.out.println("++_");
        System.out.print("Значение: ");
        System.out.println(++zero);

        System.out.println("_++");
        System.out.print("Значение: ");
        System.out.println(zero++);

        System.out.println("> 1");
        System.out.print("Значение: ");
        System.out.println(zero > 1);
    }
}
