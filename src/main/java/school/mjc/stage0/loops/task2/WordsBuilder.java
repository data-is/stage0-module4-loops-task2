package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        String word="";
        int num = 0;
        while(num < chars.length){
            word+=chars[num];
        }
    }
}
