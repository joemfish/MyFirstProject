package com.promineotech;

public class testenvironment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String loyaltyMemberStatus = "GOLD";
		double loyaltyMemberDiscount = 0.0;


		switch (loyaltyMemberStatus) {
		case "SILVER":
			loyaltyMemberDiscount = 0.10;
			System.out.println(loyaltyMemberDiscount);
			break;
		case "GOLD":
			loyaltyMemberDiscount = 0.15;
			System.out.println(loyaltyMemberDiscount);
			break;
		case "PLATINUM":
			loyaltyMemberDiscount = 0.25;
			System.out.println(loyaltyMemberDiscount);
			break;
		default:
			loyaltyMemberDiscount = 0.0;
			System.out.println(loyaltyMemberDiscount);
			
		}
	}

}
