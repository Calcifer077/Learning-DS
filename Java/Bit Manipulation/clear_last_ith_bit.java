public class clear_last_ith_bit{
    public static int clearLastIthBit(int num, int i){
        int bitmask = (~0)<<i;
        return num & bitmask;
    }
	public static void main(String[] args) {
		System.out.println(clearLastIthBit(15, 2));
	}
}
