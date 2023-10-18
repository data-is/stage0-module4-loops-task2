package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if(multiplyByAndToInclusive>=0){
            int num = 0;
            while(num <=multiplyByAndToInclusive){
                int result = num * multiplyByAndToInclusive
                System.out.println(result);
                num++;
            }

        }
        else{
            int num = 0;
            while (num >=multiplyByAndToInclusive){
                int result = num * multiplyByAndToInclusive;
                System.out.println(result);
                num--;
            }
        }
    }
}
