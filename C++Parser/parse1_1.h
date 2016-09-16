#ifndef PARSE1_1_H_
#define PARSE1_1_H_

#include "target.h"
#include "parse.h"

#include <iostream>
#include <string>


class Parse1_1 : public Parse {
	Target *target;

public:
	Parse1_1(Target *parse_target_): Parse(parse_target_) {
		this->target = parse_target_;
	};
	~Parse1_1(){};
	Target *output();
};


#endif /* PARSE1_1_H_ */
