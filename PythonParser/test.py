from Target import *
from Parser1_1 import *
from Parser1_2 import *
from Parser1_3 import *


if __name__ == '__main__':
    test1 = '134297381'
    target1 = Target(test1)
    parser1 = Parser1_1(target1)
    answer1 = parser1.output()
    print('1-1 : The most longest increase substring in ' + test1 + ' is ' + answer1.strings)

    test2 = '011011100'
    target2 = Target(test2)
    parser2 = Parser1_2(target2)
    answer2 = parser2.output()
    print('1-2 : The most longest same value substring in ' + test2 + ' is ' + answer2.strings)

    test3 = 'aaBBBcC'
    target3 = Target(test3)
    parser3 = Parser1_2(target3)#Parser1_3(target3)
    answer3 = parser3.output()
    print('1-3 : The most longest same string substring in ' + test3 + ' is ' + answer3.strings)