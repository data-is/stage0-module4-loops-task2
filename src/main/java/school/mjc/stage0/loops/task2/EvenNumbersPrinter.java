package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int num = 0;
        while (printTillInclusive >= num ){
            if(num % 2 ==0){
                System.out.println(num);
            }

            num++;
        }
    }
}
