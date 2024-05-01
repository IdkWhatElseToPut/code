public class CombinedTable{
    SingleTable SingleTable1, SingleTable2;
    public CombinedTable(SingleTable SingleTable1, SingleTable SingleTable2){
        this.SingleTable1 = SingleTable1;
        this.SingleTable2 = SingleTable2;
    }
    public boolean canSeat(int numPeople){
        if((SingleTable1.getNumSeats() + SingleTable2.getNumSeats() - 2) >= numPeople)
            return true;
        else
            return false;
    }
    public double getDesirability(){
        if(SingleTable1.getHeight() == SingleTable2.getHeight())
            return (SingleTable1.getViewQuality() + SingleTable2.getViewQuality())/2;
        else
            return (SingleTable1.getViewQuality() + SingleTable2.getViewQuality())/2 - 10;
    }
}