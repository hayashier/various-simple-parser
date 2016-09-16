<?php

abstract class Parser {
	public $target;

	public function __construct($target_string) {
		$this->target = $target_string;
	}

	abstract public function output();
}