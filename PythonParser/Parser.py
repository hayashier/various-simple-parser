from abc import ABCMeta, abstractmethod

class Parser(object):
    __metaclass__ = ABCMeta

    def __init__(self, parse_target):
        self.target = parse_target

    @abstractmethod
    def output(self):
        pass