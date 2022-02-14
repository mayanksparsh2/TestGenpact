import java.util.*;

class WeightLimitExceeded extends Exception{
    WeightLimitExceeded(int x){
        System.out.print(Math.abs(15-x)+" kg : ");
    }
}


class Ques5 {
    void validWeight(int weight) throws WeightLimitExceeded{
        if(weight>15)
            throw new WeightLimitExceeded(weight);
        else
            System.out.println("You are ready to fly!");
    }

    public static void main (String[] args) {
        Ques5 ob=new Ques5();
        Scanner in=new Scanner(System.in);
        for(int i=0;i<2;i++){
            try{
                ob.validWeight(in.nextInt());
            }catch(WeightLimitExceeded e){
                System.out.println(e);
            }
        }

    }
}