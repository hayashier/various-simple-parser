public class IncreaseValueParser extends Parser{
	IncreaseValueParser(Target target) {
		super(target);
	}
	public Target output() {
		Target parse_target = this.getTarget();
		Target lastNum = parse_target.extract(0, 1);
		int lastIndex = 0;
		int maxInterval = 0;
		Target candidate  = new Target("");

		for (int i = 0; i < parse_target.getStrings().length(); i++) {
			Target num = parse_target.extract(i, i+1);
			int index = i;
			if (lastNum.isBigger(num)) {
				if (index - lastIndex >= maxInterval) {
					candidate = parse_target.extract(lastIndex, index);
					maxInterval = index - lastIndex;
				}
				lastIndex = index;
			}
			else if ((i == parse_target.getStrings().length() - 1) && (!lastNum.isBigger(num)) && (index -lastIndex >= maxInterval)) {
				candidate = parse_target.extract(lastIndex, index + 1);
			}
			lastNum= num;
		}
		return candidate;
	}
}
