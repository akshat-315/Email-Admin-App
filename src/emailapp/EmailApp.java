package emailapp;

public class EmailApp {

	public static void main(String[] args) {
		Email em1 = new Email("Akshat", "Sharma");
		
		em1.setAlternateEmail("akshat315.sharma@gmail.com");
		System.out.println(em1.getAlternateEmail());
		
		em1.changePassword("qwerty1234");
		System.out.println(em1.getPassword());
	}

}
