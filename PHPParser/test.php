<?php

require_once('Target.php');
require_once('parse1_1.php');
require_once('parse1_2.php');
//require_once('parse1_3.php');

$test1 = '134297381';
$test2 = '011011100';
$test3 = 'aaBBBcC';


echo "1-1 : The most longest increase substring in ".strval($test1)." is ";
$target1 = new Target($test1);
$parse1 = new IncreaseNumberParser($target1);
$answer1 = $parse1->output();
echo $answer1->getStrings();
echo "\n";


echo "1-2 : The most longest same value substring in ".strval($test2)." is ";
$target2 = new Target($test2);
$parse2 = new SameValueParser($target2);
$answer2 = $parse2->output();
echo $answer2->getStrings();
echo "\n";


echo "1-3 : The most longest same string substring in ".strval($test3)." is ";
$target3 = new Target($test3);
$parse3 = new SameValueParser($target3);//new SameStringParser($test3);
$answer3 = $parse3->output();
echo $answer3->getStrings();
echo "\n";