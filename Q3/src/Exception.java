public class Exception {

    public static class IllegalParameterException extends java.lang.Exception {
        public IllegalParameterException(String message) {
            super(message);
        }
    }

    public class TestClass {
        public static void testMethod(int num) throws IllegalParameterException {
            if (num < 0) {
                throw new IllegalParameterException("Number cannot be negative");
            }
            else if (num % 3 == 0) {
                System.out.println(num + " is a multiple of 3");
            }
            else {
                System.out.println(num + " is not a multiple of 3");
            }
        }
        public static void main(String[] args) {
            try {
                testMethod(9);
                testMethod(-5);
            } catch (IllegalParameterException e) {
                System.out.println("Exception caught: " + e.getMessage());
            }
        }
    }

}
