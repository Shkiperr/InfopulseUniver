package lesson1.prakt1;

class ExceptionDivideZero extends RuntimeException {
    private String error;

    ExceptionDivideZero(String error) {
        this.error = error;
        System.out.println(error);
    }
}
