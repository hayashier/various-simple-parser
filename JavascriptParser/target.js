var Target = (function() {
		var strings = "";

		var Target = function(parse_strings) {
			this.strings = parse_strings;
		};

		var target_func = Target.prototype;

		target_func.isEqual = function(comparison) {
			if (this.strings === comparison.strings) {
				return true;
			}
			else {
				return false;
			}
		};

		target_func.isBigger = function(comparison) {
			if (this.strings >= comparison.strings) {
				return true;
			}
			else {
				return false;
			}
		};

		target_func.extract = function(last_index, chara_num) {
			return new Target(this.strings.substr(last_index, chara_num));
		};

		return Target;
})();