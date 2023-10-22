package Loop;
import java.util.*;
public class ShuffleArray {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7};
		List<Integer> solution = new ArrayList<>();
		for(int k : a) {
			solution.add(k);
		}
		Collections.shuffle(solution);
		System.out.println(solution);
	}
}
