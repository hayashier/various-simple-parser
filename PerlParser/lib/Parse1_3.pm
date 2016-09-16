package Parse1_3;

use base 'Parse';

sub output {
	my $self = shift;

	my $parse_string = $self->{target}->{strings};
	my @target = split(//, $parse_string);
	$last_num = Target->new($target[0]);
	$pos = 0;
	$last_index = 0;
	$max_interval = 0;
	$candidate = "";

	foreach my $chara (@target) {
		$num = Target->new($chara);
		$index = $pos;
		if (!$last_num->is_equal($num)) {
			if ($index - $last_index >= $max_interval) {
				$candidate = $self->{target}->extract($last_index, $index - $last_index);
				$max_interval = $index - $last_index;
			}
			$last_index = $index;
		}
		elsif (($pos == @target - 1) && ($last_num->is_equal($num)) && ($index - $last_index >= $max_interval)) {
			$candidate = $self->{target}->extract($last_index, $index - $last_index + 1);
		}

		$last_num = $num;
		$pos += 1;
	}

	return $candidate;
}

1;