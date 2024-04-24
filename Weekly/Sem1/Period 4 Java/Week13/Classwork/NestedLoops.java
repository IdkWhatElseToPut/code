package Week13.Classwork;
public class NestedLoops{
  public void drawFilledBox(){
    //for loop that has 10 columns and 10 rows of astericks with outer variable being columns and inner variable being rows
    for(int outer = 1; outer <= 10; outer++){
      for(int inner = 1; inner <= 10; inner++){
        //makes each row
        System.out.print("*");
      }
      //seperates each row
      System.out.println();
    }
  }


  public void drawFilledBox(int width, int height){
    //for loop that will print how ever many rows and colums there are, passed in by the user.
    for(int x = 1; x <= width;x++){
      for( int y = 1; y <= height; y++){
        //what is being printed
        System.out.print("*");
    }
      System.out.println();
    }
  }


  public void drawMultiChart(){
    //for loop that creates 9 rows and 9 columns filled with 1 - 9 on both side. Everytime a numbers crosses with another like on a graph, they multiply and the product is listed on that spot.
    for(int outer = 1; outer <= 9; outer++){
      for(int inner = 1; inner <= 9; inner++){
        //creates the numbers by multiplying the number with the outer variable as a multiplyer. We do this to utilize the outer variable as a counter variable to make the illusion of multiplication
        System.out.print(inner * outer + " ");
      }
      //seperates each row
      System.out.println();
    }
  }




  public void drawTriangle(int height){
    //first for loop is value passed in by user to print how many rows there are
    for(int y = 1; y <= height; y++ ){
      //secord for loop prints the amount of astrics right as the value it is down. so if you are on the fourth row down, it will print out 4.
      for( int x = 1; x<=y; x++){
        System.out.print("*");
    }
      System.out.println();
    }
  }
}