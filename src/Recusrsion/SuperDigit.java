package Recusrsion;

public class SuperDigit {

    public void calculateSuperDigit(String num, int repeation){
        String finalNumber="";
        for(int i =0 ; i<repeation; i++){
            finalNumber = finalNumber + num ;
        }
        System.out.println("Super Digit of " + finalNumber + ":: " + calSuperDigit(finalNumber));
    }

    public int calSuperDigit(String finalNumber){
        String[] numbers = finalNumber.split("");

        if(numbers.length == 1){
            return Integer.valueOf(numbers[0]);
        }

        int sd = 0;
        for(int i =0 ; i<numbers.length; i++){
            sd = sd + Integer.valueOf(numbers[i]) ;
        }
        return calSuperDigit(String.valueOf(sd));
    }

    public static void main(String[] args){
        SuperDigit sd = new SuperDigit();
        sd.calculateSuperDigit("1",2);
        sd.calculateSuperDigit("123",3);
        sd.calculateSuperDigit("148",3);
        sd.calculateSuperDigit("9875",4);
    }
}
