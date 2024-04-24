package oct25Classwork1;
public class Selection {
    public void zipCode(int zip){
        switch (zip){
            case 94040:
                System.out.println("Mountain View");
                break;
            case 94115:
                System.out.println("San Francisco");
                break;
            case 95051:
                System.out.println("Santa Clara");
                break;
            default:
                System.out.println("Not Valid");
                break;
        }
    }
}
