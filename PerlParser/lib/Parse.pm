package Parse;

use strict;
use warnings;

sub new {
	my $class = shift;
	my $self = {
		target => $_[0]
	};

	return bless $self, $class;
}

sub output {}

1;