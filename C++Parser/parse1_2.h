#ifndef PARSE1_2_H_
#define PARSE1_2_H_

#include "target.h"
#include "parse.h"

#include <iostream>
#include <string>


class Parse1_2 : public Parse{
	Target *target;

public:
	Parse1_2(Target *parse_target_): Parse(parse_target_) {
		this->target = parse_target_;
	};
	~Parse1_2(){};
	Target *output();
};


#endif /* PARSE1_2_H_ */
