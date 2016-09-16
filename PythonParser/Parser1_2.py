from Target import *
from Parser import *

class Parser1_2(Parser):
    def __init__(self, parse_target):
        Parser.__init__(self, parse_target)

    def output(self):
        target_string = self.target.strings
        last_num = self.target.extract(0, 1)
        pos = 0
        last_index = 0
        max_interval = 0
        candidate = ""

        for chara in target_string:
            num = Target(chara)
            index = pos
            if  not last_num.is_equal(num):
                if index - last_index >= max_interval:
                    candidate = self.target.extract(last_index, index)
                    max_interval = index - last_index

                last_index = index

            elif (pos == len(target_string) - 1) and (last_num.is_equal(num)) and (index - last_index >= max_interval):
                candidate = self.target.extract(last_index, index + 1)

            last_num = num
            pos += 1

        return candidate
