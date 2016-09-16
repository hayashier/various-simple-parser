require './target.rb'
require './parser1_1.rb'
require './parser1_2.rb'
require './parser1_3.rb'


test1 = "134297381"
test2 = "011011100"
test3 = "aaBBBcC"

target1 = Target.new(test1)
parse1 = Parser1_1.new(target1)
answer1 = parse1.output()
puts "1-1 : The most longest increase substring in " + test1 + " is " + answer1.strings


target2 = Target.new(test2)
parse2 = Parser1_2.new(target2)
answer2 = parse2.output()
puts "1-2 : The most longest same value substring in " + test2 + " is " + answer2.strings


target3 = Target.new(test3)
parse3 = Parser1_2.new(target3)#Parser1_3.new(target3)
answer3 = parse3.output()
puts "1-3 : The most longest same string substring in " + test3 + " is " + answer3.strings
