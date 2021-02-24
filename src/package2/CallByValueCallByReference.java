package package2;

public class CallByValueCallByReference {

    public static void main(String[] args) {
        CallByValueCallByReference obj = new CallByValueCallByReference();

        int x = 10;
        int y = 20;
        int z = obj.testSum(x, y);  //call by value or pass by value
    }

    public int testSum(int a, int b){
        a = 30;
        b = 40;
        int c = a + b;
        return c;
    }

}
