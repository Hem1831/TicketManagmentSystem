package real_time_project;

public class TicketDestinationPointMisMatchException extends RuntimeException{
	public String toString()
	{
		return getClass()+": you entered wrong destination point ..plz enter write destination point";
	}

}
