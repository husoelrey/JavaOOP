public class Main {
    public static void main(String[] args) {
        MyInteger nesne1 = new MyInteger(123);
        MyInteger nesne2 = new MyInteger(24);

        System.out.println("testObj1: " + nesne1.getValue());
        System.out.println("iseven: " + nesne1.isEven());
        System.out.println("isodd: " + nesne1.isOdd());
        System.out.println("isprime: " + nesne1.isPrime());

        System.out.println("testObj2: " + nesne2.getValue());
        System.out.println("iseven: " + nesne2.isEven());
        System.out.println("isodd: " + nesne2.isOdd());
        System.out.println("isprime: " + nesne2.isPrime());


    }
}



class MyInteger {

    private int value;

    public MyInteger(int value) {
        this.value= value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return!isEven();
    }

    public boolean isPrime() {
        if (value <= 1) {
            return false;
        }
        if(value == 2 ){
            return true;
        }
        if (value <= 3) {
            return true;
        }
        if (value % 2 == 0 || value % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= value; i += 6) {
            if (value % i == 0 || value % (i + 2) == 0) {
                return false;
            }
        }

        return true;

    }

    public static int parseInt(char[] chars) {
        int sum = 0;
        for (char a : chars) {
            sum += (int) a;
        }
        return sum;
    }
}