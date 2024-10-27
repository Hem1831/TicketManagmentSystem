package real_time_project;
import java.util.Random;
public class Ticket {
		
  private int ticketId;
  private int ticketCost;
  private String boardingPoint;
  private String destinationPoint;
  Random r = new Random();
@Override
public String toString() {
	return "ticketId= " + ticketId + "\n ticketCost=" + ticketCost + "\n boardingPoint=" + boardingPoint
			+ "\n destinationPoint=" + destinationPoint;
 }

public Ticket( int ticketCost, String boardingPoint, String destinationPoint) {
	
	this.ticketId  =ticketId ;
	if(valdiateTicketCost( ticketCost))
	{
	this.ticketCost = ticketCost;
	}
	else
	{
		TicketCostOutOfBoundsException t=new TicketCostOutOfBoundsException();
		throw t;
	}
	if(valdiateBoardingPoint(boardingPoint))
	{
	this.boardingPoint = boardingPoint;
	}
	else
	{
		TicketBoardingPointMisMatchException t1=new TicketBoardingPointMisMatchException();
		throw t1;
	}
	if(valdiateDestinationPoint(destinationPoint))
	{
	this.destinationPoint = destinationPoint;
	}
	else
	{
		TicketDestinationPointMisMatchException t2=new TicketDestinationPointMisMatchException();
		throw t2;
	}
}

public int getTicketId() {
	return ticketId;
}
public void setTicketId(int ticketId) {
	this.ticketId = ticketId;
}
public int getTicketCost() {
	return ticketCost;
}
public void setTicketCost(int ticketCost) {
	this.ticketCost = ticketCost;
}
public String getBoardingPoint() {
	return boardingPoint;
}
public void setBoardingPoint(String boardingPoint) {
	this.boardingPoint = boardingPoint;
}
public String getDestinationPoint() {
	return destinationPoint;
}
public void setDestinationPoint(String destinationPoint) {
	this.destinationPoint = destinationPoint;
}

public boolean valdiateTicketCost(int ticketCost)
{
	if(ticketCost%2==0)
	{
		return true;
	}
	else
	{
		return false;
	}
}
	
public boolean valdiateBoardingPoint(String boardingPoint)
{
	if(boardingPoint.equals("rajam")|| boardingPoint.equals("kaviti")||boardingPoint.equals("vizianagaram"))
	
	{
		return true;
	}
	else
	{
		return false;
	}
}

public boolean valdiateDestinationPoint(String destinationPoint)
{
	if(boardingPoint.equals("hyd")|| boardingPoint.equals("chennai")||boardingPoint.equals("vizag"))
	{
		return true;
	}
	else
	{
		return false;
	}
}
public void display() {
	System.out.println("Ticket id :"+getTicketId());
	System.out.println("Ticket cost :"+getTicketCost());
	System.out.println("Ticket BoardingPoint :"+getBoardingPoint());
	System.out.println("Ticket Destination point :"+getDestinationPoint());
}
  
}
