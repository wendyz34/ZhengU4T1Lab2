public class WhileLoopFun {
    public WhileLoopFun() {

    }

    public void printDigits(int number) {
        int num =number;
        while (num>10){
            num= number%10;
            System.out.println(num);
            number /=10;
        }
    }

    public int countLetter(String word, String letter) {
        int count = word.indexOf(letter);
        int index =1;
        while(word.length()<=1){
            word.substring(1);
            count++;
            index++;
        }
        return count;
    }



    public int maxDoubles(int number, int threshold) {
        while(number <=threshold){
            number = number*2;
        }
        return number;
    }

    public boolean isPrime(int number) {
        int count = 1;
        int divisor = 2;
        if (number == 1) {
            return false;
        }
        while (number <= divisor) {
            if (number % divisor == 0) {
                return true;
            }
            divisor++;
            if (divisor>2){
                return false;
            }

        }
        return true;
    }
}



