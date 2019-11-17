import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond{
	private LocalDateTime gs;

	public Gigasecond(LocalDate moment) {
		this(moment.atStartOfDay());
	}

	public Gigasecond(LocalDateTime moment) {
		gs = moment.plusSeconds(1_000_000_000);
	}

	public LocalDateTime getDateTime() {
		return gs;
	}
}
