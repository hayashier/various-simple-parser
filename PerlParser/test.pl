use FindBin;
use lib "$FindBin::Bin/lib";
use Target;
use Parse1_1;
use Parse1_2;
use Parse1_3;

my $test1 = '134297381';
my $test2 = '011011100';
my $test3 = 'aaBBBcC';


print '1-1 : The most longest increase substring in '.$test1.' is ';
my $target1 = Target->new($test1);
my $parse1 = Parse1_1->new($target1);
my $answer1 = $parse1->output();
print $answer1->{strings};
print "\n";

print '1-2 : The most longest same value substring in '.$test2.' is ';
my $target2 = Target->new($test2);
my $parse2 = Parse1_2->new($target2);
my $answer2 = $parse2->output();
print $answer2->{strings};
print "\n";


print '1-3 : The most longest same string substring in '.$test3.' is ';
my $target3 = Target->new($test3);
my $parse3 = Parse1_2->new($target3);#Parse1_2->new($target3)
my $answer3 = $parse3->output();
print $answer3->{strings};
print "\n";