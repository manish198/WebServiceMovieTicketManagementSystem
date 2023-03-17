package Interface;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;


@WebService
@SOAPBinding(style=Style.RPC)
public interface MovieTicketInterface {

	/**
	 * 
	 * @param movieID
	 * @param movieName
	 * @param bookingCapacity
	 * @return
	 * @throws RemoteException
	 */
	public String addMovieSlots(String movieID, String movieName, int bookingCapacity);
	
	/**
	 * 
	 * @param movieID
	 * @param movieName
	 * @return
	 */
	public String removeMovieSlots (String movieID, String movieName);
	
	/**
	 * 
	 * @param movieName
	 */
	public String listMovieShowsAvailability(String movieName);
	
	/**
	 * 
	 * @param customerID
	 * @param movieID
	 * @param movieName
	 * @param numberOfTickets
	 * @return
	 * @throws IOException
	 */
	public String bookMovieTicket(String customerID, String movieID,String movieName, int numberOfTickets);

	/**
	 * 
	 * @param customerID
	 * @return
	 * @throws IOException
	 */
	public String getBookingSchedule(String customerID);
	
	/**
	 * 
	 * @param customerID
	 * @param movieID
	 * @param movieName
	 * @param numberOfTicekts
	 * @return
	 * @throws IOException
	 */
	public String cancelMovieTickets(String customerID,String movieID, String movieName,int numberOfTicekts);
	
	/**
	 * 
	 * @param customerID
	 * @param movieID
	 * @param newMovieID
	 * @param newMovieName
	 * @param numberOfTickets
	 * @return
	 * @throws IOException
	 */
	public String exchangeTickets(String customerID,String movieName, String movieID,String newMovieID,String newMovieName,int numberOfTicketsToCancel);
}


