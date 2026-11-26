//PROGRAM TO PRINT NUMBER FROM 1 TO 10
public class Loops {
    public static void main(String[] args) {
        // FOR LOOP
        // for(int i = 1;i<=10;i++){
        // System.out.println(i);

        // }

        // While loop
        // int i = 1;
        // while (i <= 10) {
        //     System.out.println(i);
        //     i++;
        // }

        //DO WHILE LOOP
        // int i = 1;
        // do{
        //     System.out.println(i);
        //     i++;
        // }
        // while(i<=10);

        // WRITE A PROGRAM TO PRINT EVEN AND ODD NUMBER FROM 1 TO 1000

        for(int i = 1; i<=1000;i++){
            if (i % 2 == 0) {
                System.out.println("Even number:" + i);
                
            }
            else{
                System.out.println("Odd number:" + i);
            }
        }
    }

}
