package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int num = 0;
        int check =0;
        while (num <= printToInclusive){
            while(check<=printToInclusive){
                int checker= 0;
                checker= num % check ==0 ? checker++ : 0;

            }
        }
    }
}
