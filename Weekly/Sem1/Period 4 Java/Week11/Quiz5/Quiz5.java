public class Quiz5 {
    public void countDownBy3(int num){
        while(num>=0){
            System.out.print(num+"    ");
            num-=3;
        }
    }       
    public int getSummation(int num){
        int sum = 0;
        int count = 1;
        do{
            sum+=count;
            count++;
        }while(count<=num);
        return sum;
    } 
}
