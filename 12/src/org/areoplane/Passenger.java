package org.areoplane;
/**
 *旅客
 * @author Asus
 */
public class Passenger implements PassengerInterface {
	private String names;
	private int bookingNumber;
	private int rows;
	private int seatPosition;
	/**
	 *旅客类的构造方法
	 *@param names 旅客姓名
	 *@param bookingNumber;
	 *@param rows 座位排数
	 *@param seatPositin 座位号
	 */
public Passenger(String names,int bookingNumber,int rows,int seatPosition) {
	  this.names=names;
	  this.bookingNumber=bookingNumber;
	  this.rows=rows;
	  this.seatPosition=seatPosition;
}
public String getName() {
     return names;
}
public int getBookingNumber() {
	 return bookingNumber;
}
public int getRow() {
     return rows;
}
public int getSeatPosition() {
	 return seatPosition;
}

}
