public class set_ith_bit
{
    public static int setIthBit(int num, int i){
        // In this we have to set(convert to 1) ith bit.
        int bitmask = 1 << i;
        return num | bitmask;
    }
	public static void main(String[] args) {
		System.out.println(setIthBit(10, 2));
	}
}
