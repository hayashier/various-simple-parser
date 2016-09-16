class Target
    attr_accessor :strings

    def initialize(parse_string)
      @strings = parse_string
    end

    def is_equal(comparison)
      if self.strings == comparison.strings
        return true
      else
        return false
      end
    end

    def is_bigger(comparison)
      if self.strings >= comparison.strings
        return true
      else
        return false
      end
    end

    def extract(last_index, chara_num = 1)
      return Target.new(self.strings[last_index, chara_num])
    end
end