package apple;

public class Orange {

	public static void main(String[] args) {
		 int a = 1;
		 String b = "This Mentoring class";
		 System.out.println(b +" "+ a);
		 String d = "My name is Romel 33 Bensalem PA 19020";
		 String m = "BREAK TILL 07:17PM";
		 String l = "i like coding";
		 String k = "";
		 String s = " go go go go ";
		 System.out.println(s.trim());
		 System.out.println(l.replace("c", "C"));
		 System.out.println(l.replace("coding", "CODING"));
		 System.out.println(k.isEmpty());
		 System.out.println(l.isEmpty());
		 System.out.println(l.endsWith("ding"));
		 System.out.println(l.startsWith("i"));
		 System.out.println(l.contains("code"));
		 System.out.println(l.toUpperCase());
		 System.out.println(m.substring(0, 5));
		 System.out.println(m.charAt(7));
		 System.out.println(m.indexOf("7"));
		 System.out.println(m.length());
		 System.out.println(d.compareTo("My name is Romel 33 Bensalem PA 19020"));
		 System.out.println(d.equals("My name is Romel 34 Bensalem PA 19020"));
		 System.out.println(d.equalsIgnoreCase("My name is romel 33 Bensalem PA19020"));
		 System.out.println(d.contains("BREAK"));
		 System.out.println(m.toLowerCase());
		 System.out.println(d.toUpperCase());
		
		
		 System.out.println(d.length());
		 System.out.println(b.length());
		 System.out.println(d.indexOf("R"));
		 System.out.println(d.charAt(26));
		 System.out.println(d.substring(0, 20));
		 System.out.println(b.concat(d));
		String a1 = "This is my first Mentoring Class";
		String b1 = "Today i am doing 3rd class of Java";
		String c = "I am trying to do my best";
		System.out.println(a1.length());
		System.out.println(b1.compareTo(c));
		System.out.println(a1.concat(" "+c));

	}

}
