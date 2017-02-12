package lesson1.prakt1;

class Arifm{

    private String o;
    private int a;
    private int b;
    private int c = 0;

    Arifm(String o, int a, int b) {
        this.o = o;
        this.a = a;
        this.b = b;
    }

    int sum() {
        if (!o.equals("+")&&!o.equals("-")&&!o.equals("*")&&!o.equals("/")){
            System.out.println("Should be only +, -, *, /");
            System.exit(0);
        }if ((-1000 > a || 1000 < a) || (-1000 > b || 1000 < b)){
            System.out.println("Should be in range between -1000 and 1000");
            System.exit(0);
        }
        else {
            switch (o) {
                case "+":
                    c = a + b;
                    break;
                case "-":
                    c = a - b;
                    break;
                case "*":
                    c = a * b;
                    break;
                case "/":
                    if (b == 0){
                        throw new ExceptionDivideZero("Division by Zero!");
                    }else{
                        c = a / b;
                    }
            }
        }
        return c;
    }
}