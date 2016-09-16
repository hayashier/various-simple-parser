package Target;

use strict;
use warnings;

sub new {
	my $class = shift;
	my $self = {
		strings => $_[0]
	};

	return bless $self, $class;
}

sub is_equal {
	my $self = shift;
	my $comparison = $_[0];

	if ($self->{strings} eq $comparison->{strings}) {
		return 1;
	}
	else {
		return '';
	}
}

sub is_bigger {
	my $self = shift;
	my $comparison = $_[0];

	if (($self->{strings} + 0) >= ($comparison->{strings} + 0)) {
		return 1;
	}
	else {
		return '';
	}
}

sub extract {
	my $self = shift;
	my $last_index = $_[0];
	my $chara_num = $_[1];

	return Target->new(substr($self->{strings}, $last_index, $chara_num));
}

1;