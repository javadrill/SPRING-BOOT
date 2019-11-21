package in.tecmentor;

import java.util.Arrays;
import java.util.List;

public class SumListOfIntegers {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 3, 4);
		int total = integers.stream().mapToInt(i -> i).sum();
		System.out.println("Total: " + total);
	}
}
