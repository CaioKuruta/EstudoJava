public class estruturaWhile {
    public static void main(String[] args) {
        int x = 1;
        while (x<10){
            System.out.println("x é "+x);
            if (x == 5){
                break;
            }
            x++;
        }
    }
}
