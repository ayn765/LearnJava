package practice;

public class OutputForLoop {

    public static void main(String[] args) {

        OutputForLoop o = new OutputForLoop();

        o.go();
    }
    void go(){
        int y = 11;
        for (int x = 1; x < 8; x++){
            y++;
            if (x < 3){
                System.out.print(++y + " ");
            }
            if (y > 15){
                System.out.print(" x = " + x);
                break;
            }
        }
    }
}
