package string;

public class String_butter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello";
		//convert Dtring to stringbuffer
		StringBuffer sb=new StringBuffer(str);
		sb.append(",How are you?");
		System.out.println(sb);
		
		//convert stringbuffer to string
		//mutable to immutable
		StringBuffer sbb=new StringBuffer("pune");
		String str1=new String(sbb);
		System.out.println(sbb);
		
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb.substring(6,18));  //print from index 0 to index 10
		System.out.println(sb.delete(0,6));
		System.out.println(sb.deleteCharAt(2));
	}

}
