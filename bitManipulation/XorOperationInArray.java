public class XorOperationInArray {
    public static int xorOperation(int n, int start) {
        int xor = 0;
        for(int i = 0;i<n;i++){
            int ele = start + 2*i;
            xor ^= ele;
        }
        return xor;
    }
    public static void main(String[] args) {
        System.out.println(xorOperation(4,3));
    }
}
