package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int zeroNum=2;
        while ( zeroNum <= printToInclusive){
            int numbForLoop = 1;
            int check= 0;
            while(numbForLoop<=zeroNum){
                if((zeroNum/numbForLoop)*numbForLoop==zeroNum){
                    check++;
                }
                numbForLoop++;
            }
            if(check==2){

                System.out.println(zeroNum);
            }
            zeroNum++;
        }

    }
}
