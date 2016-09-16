public abstract class Parser {
	private Target target;

	Parser(Target target) {
		this.target = target;
	}

	abstract Target output();
	public Target getTarget() {
		return this.target;
	}
}
