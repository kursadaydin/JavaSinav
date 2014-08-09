package YiyecekSoru;

public class Meyve extends Yiyecek {
	
	private YetismeYeri yetismeYeriYiyecek;
	
	

	public YetismeYeri getYetismeYeriYiyecek() {
		return yetismeYeriYiyecek.AGAC;
	}



	

	public Meyve(String isimYiyecek, String renkYiyecek) {
		super(isimYiyecek, renkYiyecek);
		// TODO Auto-generated constructor stub
	}

	
	public static void benNeyim (Meyve m1){

		System.out.println("Ben bir " + m1.getIsimYiyecek() + " meyvesiyim");
		

}
}