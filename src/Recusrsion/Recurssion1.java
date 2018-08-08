package Recusrsion;

//print number of combinations of  [1,2,3] to get total 6
public class Recurssion1 {

    public int coins[];
    public int count=0;
    public int remainingAmount;

    public int calTotal(int amount){
        if(amount == 0){
            return 1;
        }
        if(amount <= 0){
            return 0;
        }

        for(int i=0; i < coins.length; i++){
            remainingAmount = amount-coins[i];
            count = count + calTotal(remainingAmount);
        }

        return count;
    }

    public static void main(String[] args){
        Recurssion1 recurssion1 = new Recurssion1();
        recurssion1.coins = new int[]{1,2,3};

        System.out.println(recurssion1.calTotal(6));

    }
}
