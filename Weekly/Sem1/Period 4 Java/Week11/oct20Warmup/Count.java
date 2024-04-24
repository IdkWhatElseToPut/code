package oct20Warmup;
public class Count {
    private int value;

    public Count(int value){
        this.value=value;
    }
    public int getSum(int countBy){
        int total=0, counter;
        
        counter = countBy;
        while(counter<=value){
            total+=counter;
            counter+=countBy;
        }
        return total;
    }
}
