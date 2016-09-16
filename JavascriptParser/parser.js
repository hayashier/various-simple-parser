var Parser = (function() {
	var target = "";

	var Parser = function(parse_target) {
		this.target = parse_target;
	};

	var func = Parser.prototype;
	func.output = function() {
	};

	return Parser;
})();


var inherits = function(child, parent) {
	Object.setPrototypeOf(child.prototype, parent.prototype);
}