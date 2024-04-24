package Week5.Feb5Warmup;
import java.util.ArrayList;
public class Runner {
    public static void main(String[] args){

        ArrayList<Card> cardList = new ArrayList<Card>();


        for(int i = 0;  i<10; i++){
            cardList.add(new Card((int) (Math.random()*5+1)));
        }

        for(Card each : cardList){
            System.out.println(each + " ");
        }
        System.out.println();

        for(int i = 0; i<cardList.size();i++){
            if(cardList.get(i).getValue()%2 !=0){
                cardList.remove(i);
                i--;
            }
        }

        for(Card each : cardList){
            System.out.println(each.toString());
        }



    }
}
