require './target.rb'
require './parser.rb'

class Parser1_2 < Parser
  def initialize(parse_target)
    @target = parse_target
  end

  def output()
    target_string = @target.strings
    last_num = @target.extract(0,1)
    last_index = 0
    pos = 0
    max_interval = 0
    candidate = ""

    target_string.split("").each do |chara|
      num = Target.new(chara)
      index = pos

      if !last_num.is_equal(num)
        if (pos != target_string.length - 1) && (index - last_index >= max_interval)
          candidate = @target.extract(last_index, index-last_index)
          max_interval = index - last_index
        end
        last_index = index
      elsif (pos == target_string.length - 1) && (last_num.is_equal(num)) && (index - last_index >= max_interval)
        candidate = @target.extract(last_index, index-last_index + 1)
      end
      last_num = num
      pos += 1
    end

    return candidate
  end
end
