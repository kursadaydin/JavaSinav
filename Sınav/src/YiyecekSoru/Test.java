package YiyecekSoru;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sebze s1 = new Sebze("Patl�can", "Mor");
		System.out.println(s1.getYetismeYeriYiyecek());
		
		Meyve m1 = new Meyve("Muz", "Sar�");
		m1.benNeyim(m1);
		
		s1.benNeyim(s1);

	}

}
