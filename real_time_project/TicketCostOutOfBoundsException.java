package real_time_project;

public class TicketCostOutOfBoundsException extends RuntimeException {
	public String toString()
	{
		return getClass()+": you entered odd digit ..plz enter even digit to get cost";
	}
}
