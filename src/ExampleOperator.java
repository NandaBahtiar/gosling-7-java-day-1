public class ExampleOperator {
    public static void main(String[] args) {
        /**
         * aturan penamaan
         * 1, pascal case   : nama class
         * 2 camelCase      : variable, Method
         * 3, sneak_case    : variable, Method
         * 4, kebab-case    : nama file (java-fundamental)
         * 5. SCREAMING_CASE: variabel constan ( tidak dapat di ubah)
         * */

        System.out.println("operator");
        /*
        * operator
        * 1. aritmatika : +,-,*,/
        * 2, logic      : ||,&&,!
        * 3, comparation: ==, <=, !=, dll
        * 4, unary      : ++, --
        *
        * */

        int number1 = 300;
        int number2 = 200;
        double pembagian = (double) number1 / number2;
        int sum = number1 + number2;
        System.out.println(sum);
        System.out.println(number1 + number2);
        System.out.println(pembagian);
        System.out.println((double) number1 / number2);

//        parsing
        // int -> string]
        int number3 = 123;
        String stringNumber = String.valueOf(number3);
        System.out.println(stringNumber);
        System.out.println(stringNumber.getClass().getSimpleName());

        Integer numberString= Integer.parseInt(stringNumber);
        System.out.println(numberString);
        System.out.println(numberString.getClass().getSimpleName());

        Float numberFloat = Float.parseFloat(stringNumber);
        System.out.println(numberFloat);
        System.out.println(numberFloat.getClass().getSimpleName());
    }
}
