#ifndef TARGET_H_
#define TARGET_H_

#include <string>

class Target {
	std::string strings;
public:
	Target(std::string parse_string_): strings{parse_string_} {};
	~Target(){};

	std::string getStrings() {
		return this->strings;
	}

	bool isEqual(Target *comparison) {
		if (this->strings == comparison->strings) {
			return true;
		}
		else {
			return false;
		}
	}

	bool isBigger(Target *comparison) {
		if (this->strings >= comparison->strings) {
			return true;
		}
		else {
			return false;
		}
	}

	Target *extract(int last_index, int chara_num) {
		return new Target(this->strings.substr(last_index, chara_num));
	}
};



#endif /* TARGET_H_ */
