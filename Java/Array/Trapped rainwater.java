import java.util.*;

public class Main
{
    public static int trappedRainwater(int height[]){
        // calculate left max boundary - array
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i = 1; i < height.length; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }
        // calculate right max boundary - array
        int rightMax[] = new int[height.length];
        rightMax[rightMax.length - 1] = height[height.length - 1];
        for(int i = height.length - 2; i >= 0; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }
        
        // loop
        // waterlevel = min(leftmax bound, rightmax bound);
        int waterlevel[] = new int[height.length];
        int trappedwater = 0;
        for(int i = 0; i < height.length; i++){
            waterlevel[i] = Math.min(leftMax[i], rightMax[i]);
            trappedwater += (waterlevel[i] - height[i]);
        }
        // trappedwater = waterlevel - height
        
        return trappedwater;
        
    }
    
	public static void main(String[] args) {
		int nums[] = {4,2,0,6,3,2,5};
		System.out.println(trappedRainwater(nums));
	}
} 
