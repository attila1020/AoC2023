import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> adatok = FileUtils.readLines("input.txt");

		Part1 Part1 = new Part1();

		int part1Sum = adatok.stream()
				.map(Part1::filterString)
				.map(Part1::getValue)
				.reduce(0, Integer::sum);

		System.out.println("Part 1 Megoldás: " + part1Sum);
	}

}