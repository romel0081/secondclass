package method;

  public class Wed02 implements Inface {
	Wed02() {
		final String y= "Romel";
		System.out.println("Cool down");
	}

	public static String b1 = "Cool down";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Wed02 d1 = new Wed02();

		Wed02 ob = new Wed02();
		ob.multiple(5, 10);
		ob.reverse("Pennsylvania");

	}

	public void multiple(int a, int b) {
		int s = 0;
		s = a * b;
		System.out.println("multiple num is  " + s);
	}

	public void reverse(String c) {
		String d = "";
		for (int i = c.length() - 1; i >= 0; i--) {
			d = d + c.indexOf(i);
		}
		System.out.println("This is reverse String  " + c);
		System.out.println(b1);
	}

	@Override
	public void vv() {
		// TODO Auto-generated method stub
		Wed02 ob=new Wed02();
		ob.sad();
		ob.dad();
		ob.mad();

	}

	@Override
	public void sad() {
		// TODO Auto-generated method stub

	}

	@Override
	public void mad() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dad() {
		// TODO Auto-generated method stub

	}
}
