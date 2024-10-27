package real_time_project;

public class TicketBoardingPointMisMatchException extends RuntimeException{
	public String toString()
	{
		return getClass()+": you entered wrong boarding point ..plz enter write boarding point";
	}

}
