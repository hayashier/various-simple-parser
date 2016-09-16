var Parser1_1 = (function() {
	var target = "";

	var Parser1_1 = function(parse_target) {
		this.target = parse_target;
	};

	inherits(Parser1_1, Parser);
	var func = Parser1_1.prototype;
	func.output = function() {
		var target_string = this.target.strings;
		var last_num = this.target.extract(0,1);
		var pos = 0;
		var last_index = 0;
		var max_interval = 0;
		var candidate = new Target("");
		var target = this.target;
		target_string.split("").forEach(function(chara) {
			var num = new Target(chara);
			var index = pos;
			if (last_num.isBigger(num)) {
				if (index - last_index > max_interval) {
					candidate = target.extract(last_index, index - last_index);
					max_interval = index - last_index;
				}
				last_index = index;
			}
			else if ((pos === target_string.length - 1) && (!last_num.isBigger(num)) && (index - last_index) >= max_interval) {
				candidate = target.extract(last_index, index - last_index + 1);
			}
			last_num = num;
			pos++;
		});
		return candidate
	};

	return Parser1_1;
})();