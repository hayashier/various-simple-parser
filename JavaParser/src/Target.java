public class Target {
	private String strings;
	Target(String target_strings) {
		this.strings = target_strings;
	}

	public String getStrings() {
		return this.strings;
	}

	public boolean isEqual(Target comparison) {
		if (this.strings.equals(comparison.strings)) {
			return true;
		}
		else {
			return false;
		}
	}

	public boolean isBigger(Target comparison) {
		if (Integer.parseInt(this.strings) >= Integer.parseInt(comparison.strings)) {
			return true;
		}
		else {
			return false;
		}
	}

	public Target extract(int lastIndex, int index) {
		return new Target(this.strings.substring(lastIndex, index));
	}
}
