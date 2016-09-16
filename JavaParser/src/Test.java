public class Test {

	public static void main(String[] args) {
		String test1 = "134297381";
		String test2 = "011011100";
		String test3 = "aaBBBcC";

		System.out.print("1-1 : The most longest increase substring in " + test1 + " is ");
		Target target1 = new Target(test1);
		IncreaseValueParser parse1 = new IncreaseValueParser(target1);
		Target answer1 = parse1.output();
		System.out.println(answer1.getStrings());

		System.out.print("1-2 : The most longest same value substring in " + test2 + " is ");
		Target target2 = new Target(test2);
		SameValueParser parse2 = new SameValueParser(target2);
		Target answer2 = parse2.output();
		System.out.println(answer2.getStrings());

		System.out.print("1-3 : The most longest same string substring in " + test3 + " is ");
		Target target3 = new Target(test3);
		SameValueParser parse3 = new SameValueParser(target3);
		//SameStringParser parse3 = new SameStringParser(target3);
		Target answer3 = parse3.output();
		System.out.println(answer3.getStrings());
	}
}
