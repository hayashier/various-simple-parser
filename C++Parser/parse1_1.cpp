#include "parse1_1.h"

#include <string.h>
#include <iostream>
Target *Parse1_1::output() {
	std::string target_string = this->target->getStrings();
	Target *last_num = new Target(target_string.substr(0,1));
	int last_index = 0;
	int max_interval = 0;
	Target* candidate = new Target("");

	for (unsigned int i = 0; i < target_string.size(); i++) {
		Target *num = new Target(target_string.substr(i,1));
		int index = i;
		if (last_num->isBigger(num)) {
			if (index - last_index > max_interval) {
				candidate = new Target(target_string.substr(last_index, index - last_index));
				max_interval = index - last_index;
			}
			last_index = index;
		}
		else if ((i == target_string.size() - 1) && (!last_num->isBigger(num)) && (index - last_index >= max_interval)) {
			candidate = new Target(target_string.substr(last_index, index - last_index + 1));
		}
		last_num = num;
	}

	return candidate;
}
