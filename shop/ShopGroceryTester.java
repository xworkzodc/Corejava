class ShopGroceryTester{
	
	public static void main(String[] args)
	{
		GroceryShop shop= new GroceryShop("S J","Sachin","Honnali","GSTIN1234567890");
		
		shop.initBudget(600000);
		shop.initOpenTime(09.00);
		shop.initCloseTime(08.00);
		shop.initNoOfWorkers(2);
		shop.initHomeDelivery(true);
		shop.initAmbience(true);
		shop.initWholeSale(false);
		shop.initParking(false);
		shop.initShopType(ShopType.BAKERY);
		shop.initBillingType(BillingType.MANUAL);
		shop.setLargeScale(false);
		shop.setPackageType("Plastics");
		shop.setOnlineDelivery(true);
		shop.setProfit(30000);
		shop.setCustomerFeedBack("Good");
		String[] iteam= new String[]{"Chocolates","biscuits"};
		shop.setIsoCertifiedIteams(iteam);
		shop.displayIsoCertifiedIteams();
		shop.onlineDelivery();
		shop.displayProperties();
	}
}
		