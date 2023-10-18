package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if(power >= 0){
            int num = 0;
            while(power>=num){
                if(power == 0){
                    System.out.println(1);
                }
                else{
                    System.out.println(num*num);
                }

                num++;
            }
        }


    }
}
