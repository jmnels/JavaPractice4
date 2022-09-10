package exceptionExample;

public class PhoneExceptionTester {

    public static void main(String[] args) {
        String[] numbers = new String[]{"123-4567", null, "987-6541"};

        for(String number : numbers) {
            try {
                System.out.println(new Phone("iPhone", number));
            } catch (IllegalArgumentException e) {
                System.out.println(e.getLocalizedMessage());
            }
        }
    }
}
