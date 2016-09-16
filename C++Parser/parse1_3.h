#ifndef PARSE1_3_H_
#define PARSE1_3_H_

#include "target.h"
#include "parse.h"

#include <iostream>
#include <string>


class Parse1_3 : public Parse{
	Target *target;

public:
	Parse1_3(Target *parse_target_): Parse(parse_target_) {
		this->target = parse_target_;
	};
	~Parse1_3(){};
	Target *output();
};


#endif /* PARSE1_3_H_ */
