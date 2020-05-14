package exam.finalterm.algorithm;

import exam.finalterm.algorithm.PowerConsumption;
public class Bill {
	public static double addFee, total;
	public static int currentBill, consumedPower = PowerConsumption.consumedPower, consumptionLevel = PowerConsumption.consumptionLevel;
	
	public static int currentBill() {
		int L1 = 30, L2 = 20, L3 = 50;
		switch(consumptionLevel) {
			case 1: 
					currentBill = consumedPower * 1500;
					break;
			case 2:
					currentBill = L1 * 1500;
					currentBill += (consumedPower - L1) * 1800;
					break;
			case 3: 
					currentBill = (L1 * 1500) + (L2 * 1800);
					currentBill += (consumedPower - L3) * 2000;
					break;
			case 4:
					currentBill = (L1 * 1500) + (L2 * 1800) + (L3 * 2000);
					currentBill += (consumedPower - (2 * L3)) * 2500;
					break;
			case 5:
					currentBill = (L1 * 1500) + (L2 * 1800) + L3 * (4500);
					currentBill += (consumedPower - (3 * L3)) * 3500;
					break;
			}
		return currentBill;
	}
	
	public static double additionalFee() {
		int first = 300000, second = 500000, third = 1000000;
		if(currentBill < first) {
			return addFee;
			
		} else if(currentBill >= first && currentBill < second) {
			return addFee = 0.3;
			
		} else if(currentBill >= second && currentBill < third) {
			return addFee = 0.8;
			
		} else {
			return addFee = 1.1;
			
		}
	}
	
	public static double total() {
		return total = currentBill + (currentBill * addFee);
	}
}
