package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int num = 1;
        int factorial = 1;
        while (factorial <= printToInclusive){
            num=num*factorial;
            factorial++;
        }
        System.out.println(num);
    }
}
