#ifndef PARSE_H_
#define PARSE_H_

#include <iostream>
#include <string>

#include "target.h"

class Parse {
	Target *target;

public:
	Parse(Target *parse_target_): target(parse_target_) {};
	~Parse(){};
	virtual Target *output() = 0;
};

#endif


