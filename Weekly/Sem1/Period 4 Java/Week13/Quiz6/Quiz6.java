public class Quiz6 {
    private int grade1, grade2;

    public Quiz6(int grade1, int grade2){
        this.grade1=grade1;
        this.grade2=grade2;
    }
    public String getGrade1(){
        if(grade1>=95&&grade2>=95){
            return "A";
        }else if(grade1>=90||grade2>=90){
            return "B";
        }else{
            return "F";
        }
    }
    public String getGrade2(){
    switch (grade2) {          
        case 95:
            return "A";

        case 85:
            return "B";
         
        case 75:
            return "C";

        default:
        return "F";
        }
    }
}

