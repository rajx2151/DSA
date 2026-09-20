public class basics {
    
    public static void main(String[] args) {
        //1 or 1++ is always be true , and 0 or 0++ is always be false
int x = 1;
int y = 0;
        if (x == 1 && y == 0) {

            System.out.println("1 is true");

        }
        else if (x == 0 || y == 1) {

            System.out.println("0 is false");

        } else {
            System.out.println("Both are false");
        }
    
    }
}
