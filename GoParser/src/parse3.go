package main

import "strings"

type embedded3 struct {
	target string
}

func (self *parser3) output() string {
	var target_string = self.target
	var target_array = strings.Split(target_string, "")
	var last_num = target_array[0]
	var last_index = 0
	var max_interval = 0
	var candidate = ""

	for i := 1; i < len(target_array); i++ {
		var num = target_array[i]
		var index = i
		if last_num != num {
			if index - last_index >= max_interval {
				candidate = target_string[last_index:index]
				max_interval = index - last_index
			}
			last_index = index
		} else if (i == len(target_array) - 1) && (last_num == num) && (index - last_index >= max_interval) {
			candidate = target_string[last_index:index + 1]
		}

		last_num = num
	}

	return candidate
}

type parser3 struct {
	embedded3
}
