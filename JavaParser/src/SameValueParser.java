public class SameValueParser extends Parser{
	SameValueParser(Target target) {
		super(target);
	}
	public Target output() {
		Target parse_target = this.getTarget();
		Target lastString = parse_target.extract(0, 1);
		int lastIndex = 0;
		int maxInterval = 0;
		Target candidate = new Target("");

		for (int i = 1; i < parse_target.getStrings().length(); i++) {
			Target targetString = parse_target.extract(i, i+1);
			int index = i;
			if (!lastString.isEqual(targetString)) {
				if (index - lastIndex > maxInterval) {
					candidate = parse_target.extract(lastIndex, index);
					maxInterval = index - lastIndex;
				}
				lastIndex = index;
			}
			else if ((i == parse_target.getStrings().length() - 1) && (lastString.isEqual(targetString)) && (index -lastIndex >= maxInterval)) {
				candidate = parse_target.extract(lastIndex, index + 1);
			}
			lastString = targetString;
		}
		return candidate;
	}
}
