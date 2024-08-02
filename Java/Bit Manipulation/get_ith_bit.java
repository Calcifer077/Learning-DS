public class get_ith_bit
{
    public static int getIthBit(int num, int i){
        int bitmask = 1 << i;
        if((num & bitmask) != 1){
            return 1;
        }else{
            return 0;
        }
    }
	public static void main(String[] args) {
		System.out.println(getIthBit(15, 2));
	}
}
