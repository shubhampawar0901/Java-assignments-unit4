package com.q3;
public class IPL  {
	void homeTeamStadium(Stadium stadium) {
		switch(stadium) {
			case  EDEN_GARDENS_STADIUM:
				System.out.println("This is the home ground of KKR");
				break;
			case WANKHEDE_STADIUM:
				System.out.println("This is the home ground of Mumbai Indians");
				break;
			case CHIDAMBARAM_STADIUM:
				System.out.println("This is the home ground of CSK");
				break;
			case M_CHINNASWAMY_STADIUM:
				System.out.println("This is the home ground of RCB");
				break;
			default :
				System.out.println("Enter valid Stadium name");
		}
	}
	
	public static void main (String[] args) {
		IPL ipl = new IPL();
		Stadium s1 = Stadium.CHIDAMBARAM_STADIUM;
		ipl.homeTeamStadium(s1);
	}
}
