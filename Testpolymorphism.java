package bisekleta;

public class Testpolymorphism {

	public static void main(String[] args) {
	Bisekleta uy[] = new Bisekleta[3];
	
	uy[0] = new Bicycle("bmx ", "alloy ", "alloy ", "Chris King(Sealed Bearing) \n", 20,
			"double wall ", "stainless \n", 2.3, "da bomb ", "single speed ",
			"flatpedal ", "shortstem \n", 40, "drumbrake ",14,"standard \n",
			28, "peanut ", 27.2, "easton ", "silicon ", "quick release \n");
	
	System.out.println("\n");
	
	uy[1] = new Bicycle("MTB","STEEL","STEEL","MTP \n", 29,"triple wall","steel \n", 2.2,"sagmit","12speed","cleats",
			"longstem \n", 80,"discbrake ",50,"oversized \n",34, "kmc", 31.6,"labici","silicon","quickrelease \n");
	
	System.out.println("\n");
	
	uy[2] = new Bicycle("small bmx", "alloy", "alloy", "Chris King(Sealed Bearing) \n", 18,"triple wall", "stainless \n", 2.1, "hope", "single speed",
			"flatpedal", "shortstem \n", 35, "discbrake",12, "standard \n",
			26, "peanut", 27.2, "easton" , "silicon", "quick release");
	

	for(Bisekleta bisekleta : uy) {
		bisekleta.print();
	}
}
}
