public class WhileLoopFun {
    public WhileLoopFun() {

    }

    public void printDigits(int number) {
        int num =number;
        while (num>10){
            System.out.println(num%10);
            num= num/10;
        }
    }

    public int countLetter(String word, String letter) {
        int count = 0;
        int index =0;
        while(word.length()>index){
            String next = word.substring(index,index+1);
            if (next.equals(letter)){
                count++;
            }
            index++;
        }
        return count;
    }



    public int maxDoubles(int number, int threshold) {
        int doubleCount =0;
        while((number*2) <= threshold){
            doubleCount++;
            number = number*2;
        }
        return doubleCount;
    }

    public boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        int divisor = 2;
        while (number > divisor) {
            if (number%divisor ==0) {
                return false;
            }
                divisor++;
            }
        return true;
    }
}



