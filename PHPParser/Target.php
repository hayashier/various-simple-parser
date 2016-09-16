<?php

class Target {
	private $strings;

	public function __construct($target) {
		$this->strings = $target;
	}

	public function getStrings() {
		return $this->strings;
	}

	public function isEqual($comparison) {
		if ($this->strings === $comparison->strings) {
			return true;
		}
		else {
			return false;
		}
	}

	public function isBigger($comparison_obj) {
		if ($this->strings >= $comparison_obj->strings) {
			return true;
		}
		else {
			return false;
		}
	}

	public function extract($index, $chara_num = 1) {
		return new Target(substr($this->strings, $index, $chara_num));
	}
}