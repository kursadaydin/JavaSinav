public class StringKontrol {

	public static void sayiKontrol(String yazi) {
		

		
		for (int i = 0; i < yazi.length(); i++) {

			if (Character.isDigit(yazi.charAt(i))) {
				System.out.println("Rakam");
				

			}
			
		else  {
		System.out.println("Rakam deðil");
		}
	}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sayiKontrol("45gtd");

	}

}
