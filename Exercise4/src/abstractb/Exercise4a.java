package abstractb;

abstract class parent{
	void message() {
		System.out.println("MESSAGE");
	}
		
}

class firstSC extends parent{
	void message() {
		System.out.println("This is first subclass");
	}
}

class secSC extends parent{
	void message() {
		System.out.println("This is second subclass");
	}
}

public class Exercise4a {

	public static void main(String[] args) {
		firstSC fsc=new firstSC();
		secSC ssc=new secSC();
		
		fsc.message();
		ssc.message();
	}
}
