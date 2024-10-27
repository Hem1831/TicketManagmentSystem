package real_time_project;
import java.util.Scanner;
public class MainClass 
{
	public static void main(String[] args) 
	{
	    Passenger passenger = new Passenger();
	    String boardPoint;
	    String destination;
		Scanner sc = new Scanner(System.in);
		int cost;
		boolean isStart = true;
		while(isStart)
		{
			System.out.println("enter the choice :::::: \n1. enter bookTicket \n2. display ticket \n3.searchTicketBasedOnBoardPoint \n4.changeDestinationBasedOnId \n5.removeTicket \n6. Exit from app ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
			{
				while(true)
				{
					try{
				System.out.println("Enter the TicketCost");
				 cost = sc.nextInt();
				System.out.println("Enter the boarding point ");
				 boardPoint = sc.next();
				System.out.println("Enter the destination point ");
				destination = sc.next();
				passenger.bookTicket(new Ticket(cost,boardPoint,destination));
				break;
					}
					catch(TicketBoardingPointMisMatchException e)
					{
						System.out.println("plz enter valid boarding point");
						boardPoint=sc.next();
					}
					catch(TicketDestinationPointMisMatchException e)
					{
						System.out.println("plz enter valid  Destination point");
						destination=sc.next();
					}
					catch(TicketCostOutOfBoundsException e)
					{
						System.out.println("plz enter valid cost");
					}		
			}
			}
			break;
			case 2 :
			{
				passenger.display();
			}
			break;
			case 3 :{
				System.out.println("enter boarding point ");
				int id = sc.nextInt();
				passenger.changeDestinationBasedOnId(id);
			}
			break;
			case 4:
			{
				System.out.println("Enter id for change destination");
				int id = sc.nextInt();
				passenger.changeDestinationBasedOnId(id);
			}
			break;
			case 5 :
			{
				System.out.println("Enter id to cancel ticket -- ");
				int id = sc.nextInt();
				passenger.removeTicket(id);
				
			}
			break;
			case 6 :
			{
				isStart =  false ;
				System.out.println("Thank you Visit again");
				
			}
			break;
			default:
				System.err.println("invlid choice entered");
		}
	  }
	}
}
