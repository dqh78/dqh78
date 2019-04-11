package org.aeroplane1;
import java.util.*;

import org.aeroplane.Flight;
import org.areoplane.Passenger;

import java.io.*;
/**
 * 用户界面类操作
 * @author Asus
 */
public class Client {
	private static String flightName=null;
	private static int row=0;
	private int rowLength=0;
	private Flight flight=null;
	private String cmdString=null;
	private BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	/**
	 * 主方法，程序的入口
	 * @param args 命领行参数
	 */
public static void main(String[]args) {
	new Flight(flightName, row, row).commandshell();
}
private void commandShell() {
	 System.out.println("\n\n========================");
	 System.out.println("Command Shell V2.01");
	 System.out.println("type'exit'command to exit.");
	 while(true) {
		  readCommand1();
		  processCommand1();
	 }
}
private void readCommand1() {
	if(flightName==null) {
		System.out.println("************************");
		System.out.println("Please Create The Flight Date First!");
		System.out.println("Use command: create flight_name rows rowLengtht<CR>");
		System.out.println("*********************************\n\n\n");
		
	}
	System.out.print("\nCOMMANND>");
	try {
		  cmdString=br.readLine().trim();
	} catch(IQException e) {
		 System.out.println("command error!  ");
		 cmdString=null;
	}
}
     pivate void readCommand() {
    	 
     }
     private void processCommand1() {
    	 String[]cmds;
    	 String cmd;
    	 if(cmdString!=null) {
    		cmds=command(cmdString);
    		Object cmd;
			if(cmds!=null){
    			cmd=cmds[0].toLowerCase();
    			if(flightName==null)
    				  createCommand(cmds);
    			else {
    				System.out.print("Create Error:can't handle more flights");
    			         }
    			}else if(cmd.equals("reserve")) {
    				 if(flightName!=null)
    					 reserveCommand(cmds);
    			}else if(cmd.equals("cancel")) {
    				 if(flightName!=null)
    					 cancelCommand(cmds);
    			}else if(cmd.equals("list")) {
    				 Object flightNames;
					if(flightNames!=null)
    					 listCommand(cmds);
    			}else if(cmd.equals("exit")) {
    				  System.out.println("Thanks.See you later!");
    				  System.exit(0);
    			}else {
    				   System.out.println("Bad command!");
    				   cmdString=null;
    			}
            }
    	 }
     private void processCommand() {
     
     }
     private String[] command(String cmdStr) {
    	 int cc=0;
    	 String[]cmd;
    	 String TOkenizer st=new String Tokenizer(cmdStr);
    	 if((cc=st.countTokens())==0)
    		 return null;
    	 cmd=new String[cc];
    	 for(int i<cc;i++)
    		   cmd[i]=st.nextToken();
    		   return cmd;
     }
    	 private String[]  errcommand(String cmdStr) {
    		 
    	 }
     private int readInt(String valstr) {
    	  int val=0;
    	  try {
    		    val=Integer.parseInt(valstr);
    	  }catch(Exception e) {
    		  val=Integer.MIN_VALUE;
    	  }
    	  return val;
     } 	  
      private void createCommand(String[] cmds) {
    	   if(cmds.length!=4) {
    		   System.out.println("create command error!");
    	   }
    	   else {
    		   fligthName=cmds[1];
    		   row=readInt(cmds[2]);
    		   rowLength=readInt(cmds[3]);
    		   if(row<=0||rowLength<=0) {
    			   System.out.println("create command parameters error!");
    			   fligthName=null;
    			   row=0;
    			   rowLength=0;
    		   }else {
    			   try {
    				   fligth=new Fligth(fligthName,row,rowLength);
    				   System.out.println("creat Flight OK!");
    			   }catch(Exception e) {
    				   System.out.println(e);
    				   flight=null;
    				   fligthName=null;
    				   row=0;
    				   rowLength=0;
    			   }
    		   }
    	   }
      }
              private void reserveCommand(String[] cmds) {
            	  if(cmds.Length<=1) {
            		  System.out.println("reserve command error!");
            		  return;
            	  }
              String[]names=new String[cmds.length-1];
              for(int i=0;i<names.length;i++)
            	  names[i]=new String(cmds[i+1]);
              int[]bn=fligth.reserve(names);
              if(bn[0]!=-1) {
            	  for(int i=0;i<bn.length;i++)
            		      System.out.println(names[i]+"'s Booking Number is:"+bn[i]);
            	  
              }else
            	  System.out.println("No Such Sequential Seats Now!");
              }
              private void reserveCommand(String[] cmds) {
            	  
              }
              private void cancelCommand(String[] cmds) {
            	  if(cmds.length!=2) {
            		  System.out.println("\ncancel command format error!");
            		  return;
            	  }
            	  int bookingNumber=readInt(cmds[1]);
            	  if(bookingNumber<=0) {
            		  System.out.println("\ncancel command paramater error!");
            		  return;
            	  }
            	  int bookingNumer=readInt(cmds[1]);
            	  if(bookingNumber<=0) {
            		  System.out.println("\ncancle command parameter error!");
            		  return;
            	  }
            	  boolean state=flight.cancel(bookingNumber);
            	  if(state)
            		  System.out.println("Your seat has been cancelled!");
            	  else
            		  System.out.println("The seat has not been reserved");
              }
              private void cancelCommand(String[] cmds) {
            	  
              }
              private void listCommand(String[] cmds) {
            	  if(cmds.length!=1) {
            		  System.out.println("\nlist command format error!");
            		  return;
            	  }
            	  Passenger[] passengerlist =flight.getPassengerList();
            	  int flat=0
            	  System.out.println("Name Booking Number Row Seat Position");
            	  System.out.println("------------------------------------");
            	  if(passengerList==null||passengerlist.length<=0)
            		    System.out.printlnn("Now no seat is occupied!");
            	  else {
            		   flag=0;
            		   for(int b=0;b<passengerlist.length;b++) {
            			   if(passengerlist[b]!=null) {
            				   flag=1;
            				   System.out.println(formatStr(passengerlist[b].getName())+formatStr(""+passengerlist[b].getBookingNumber())+formatStr(""+passengerlist[b].getRow())+formatStr(""+passengerlist[b].getSeatPosition()));
            			   }
            		   }
            		   if(flag==0)
            			   System.out.println("Now no seat occupied!");
            		   
            	  }
              }
              private String formatStr(String s) {
            	  for(int i=0;i<16-s.trim().length();i++)
                     s+='';
            	  return s;
              }
              
              