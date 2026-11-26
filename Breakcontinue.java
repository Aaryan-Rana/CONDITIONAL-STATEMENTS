public class Breakcontinue {
    public static void main(String[] args) {

        //BREAK

        for(int i = 1; i<=10; i++){
            if (i==3) {
                break;
            }
            System.out.println(i);
        }

        //CONTINUE

        for(int i = 1; i<=10; i++){
            if (i==3) {
                continue;
            }
            System.out.println(i);
        }
    }
    
}
