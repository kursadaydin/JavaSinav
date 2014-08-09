package YiyecekSoru;

public class Sebze extends Yiyecek {
	
private YetismeYeri yetismeYeriYiyecek;
	
	public YetismeYeri getYetismeYeriYiyecek() {
		return yetismeYeriYiyecek.TOPRAK;
	}


	public Sebze(String isimYiyecek, String renkYiyecek) {
		super(isimYiyecek, renkYiyecek);
		// TODO Auto-generated constructor stub
	}

	public static void benNeyim (Sebze s1){

		System.out.println("Ben bir " + s1.getIsimYiyecek() + " sebzesiyim");
		

}

	
}
