package main

import "fmt"

func main() {
	var test1 = "134297381"
	var parse1 parser1
	parse1.target = test1
	var answer1 = parse1.output()
	fmt.Println(answer1)

	var test2 = "011011100"
	var parse2 parser2
	parse2.target = test2
	var answer2 = parse2.output()
	fmt.Println(answer2)

	var test3 = "aaBBBcC"
	var parse3 parser3
	parse3.target = test3
	var answer3 = parse3.output()
	fmt.Println(answer3)
}