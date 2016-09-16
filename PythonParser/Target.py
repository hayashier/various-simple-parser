class Target(object):
    def __init__(self, parse_string):
        self.strings = parse_string

    def is_equal(self, comparison):
        if (self.strings == comparison.strings):
            return True
        else:
            return False

    def is_bigger(self, comparison):
        if (int(self.strings) >= int(comparison.strings)):
            return True
        else:
            return False

    def extract(self, last_index, index):
        return Target(self.strings[last_index:index])