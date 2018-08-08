package Recusrsion;

public class StringRecurrsionTD1 {


    public void printCombinations(String newSeq, char[] chars, int wordLength){

        if(wordLength == 0){
            System.out.println(newSeq);
            return;
        }

        for(int i=0; i < chars.length; i++){
            String newPrefix = newSeq + chars[i];
            printCombinations(newPrefix, chars, wordLength-1);
        }

    }


    public static void main(String[] args){
        char[] chars = {'a', 'b', 'c'};
        int wordLength = 3;

        StringRecurrsionTD1 stringRecurrsion = new StringRecurrsionTD1();
        stringRecurrsion.printCombinations("", chars, wordLength);
    }

}
