import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> calibrations = FileUtils.readLines("input.txt");

		Part1 Part1 = new Part1();
		Part2 Part2 = new Part2();

		int part1Result = calibrations.stream()
				.map(Part1::filterString)
				.map(Part1::getValue)
				.reduce(0, Integer::sum);

		int part2Result = calibrations.stream()
						.map(Part2::brigiFuggveny)
						.map(Part1::filterString)
						.map(Part1::getValue)
						.reduce(0, Integer::sum);

		System.out.println("Part 1 Result: " + part1Result);
		System.out.println("Part 2 Result: " + part2Result);
	}

}