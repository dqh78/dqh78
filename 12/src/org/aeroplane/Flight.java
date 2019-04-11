package org.aeroplane;

import org.areoplane.Passenger;

/**
 * 航班类
 * @author Asus
 */
public class Flight implements FlightInterface {
	  private String flightName;
	  private int row;
	  private int rowLength;
	  private int[] fail= {-1};
 	  private Passenger[] passengerList;
	  /**
	   * 航班类的构造方法
	   * @param FlightName 航班名
	   * @param rows 多少排座位
	   * @param rowLength 每排座位数
	   * @throws Exception 刨除异常类
	   */
public Flight(String FlightName,int row,int rowLength)throws Exception{
     int rows;
	if(FlightName==null||FlightName.trim().length()==0||rows<=0||rowLength<=0)
    	  throw new Exception("Error");
     else {
    	   this.flightName=FlightName;
    	   int rwos = 0;
		this.row=rwos;
    	   this.rowLength=rowLength;
    	   this.passengerList=new Passenger[row*rowLength];
    	   passengerList=new Passenger[row*rowLength];
    	   for(int i=0;i<row*rowLength;i++)
    		   passengerList[i]=null;
    	   
     }
}
public int[] reserve(String names) {
	if(names.length()>rowLength)
		    return fail;
	int i=0,j=0,k=0;
	boolean flag=false;
	labelA:for(i=0;i<=row-1;i++) {
		for(j=0;j<=rowLength-names.length();j++) {
			for(k=j;k<=j+names.length()-1;k++) {
				if(passengerList[i*rowLength+k]!=null)
					 break;
			}
			if(k>j+names.length()-1) {
				  flag=true;
				  break labelA;
			}
		}
	}
	if(!flag)
		  return fail;
	int[]bn=new int[names.length()];
	for(k=j;k<=j+names.length()-1;k++) {
		bn[k-j]=i*rowLength+k+1;
		passengerList[i*rowLength+k]=new Passenger(names[k-j],i*rowLength+k+1,i,k);
	}
	return bn;
}
public int[]reserve(String names[]){
	return fail;

}
public boolean cancel1(int bookingNumber) {
	   boolean Status=false;
	   for(int i=0;i<row*rowLength;i++) {
		   if(passengerList[i]!=null&&bookingNumber==passengerList[i].getBookingNumber())
		   {
			   Status=true;
			   passengerList[i]=null;
			   break;
		   }
	   }
	   return Status;
}
public boolean cancel(int bookingNumber) {
	return false;

}
public org.aeroplane.Passenger[] getPassengerList() {
	 return passengerList;
}
public void commandshell() {
	// TODO Auto-generated method stub
	
}

}
