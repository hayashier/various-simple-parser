#include "parse1_1.h"
#include "parse1_2.h"
#include "parse1_3.h"

#include <iostream>
#include <string>
#include "target.h"

int main() {
	std::string test1 = "134297381";
	Target *target1 = new Target(test1);
	Parse1_1 *parse1 = new Parse1_1(target1);
	Target *answer1 = parse1->output();
	std::cout << "1-1 : The most longest increase substring in " << test1 << " is " << answer1->getStrings() << std::endl;

	std::string test2 = "011011100";
	Target *target2 = new Target(test2);
	Parse1_2 *parse2 = new Parse1_2(target2);
	Target *answer2 = parse2->output();
	std::cout << "1-2 : The most longest same value substring in " << test2 << " is " << answer2->getStrings() << std::endl;

	std::string test3 = "aaBBBcC";
	Target *target3 = new Target(test3);
	Parse1_3 *parse3 = new Parse1_3(target3);
	Target *answer3 = parse3->output();
	std::cout << "1-3 : The most longest same string substring in " << test3 << " is " << answer3->getStrings() << std::endl;

	return 0;
}
