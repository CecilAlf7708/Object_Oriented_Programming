/*Alfred Thomas Cecil
 * 6/5/19
 * A program that returns an array of substrings split by a delimiter
 */
public class ChapterTenTwentyFive {
	public static void main(String[] args) {
		String[] b = split("ab#12#453","#");
		for (int i = 0; i < b.length; i++) {
			if(b[i] != null) {
				System.out.print (b[i]);
				if (i < b.length && b[i + 1] != null) {
					System.out.print(", ");
				}
			}
			
		}
			
	}
	
	public static String[] split(String s, String regex) {
		String[] a = new String[s.length()];
		int c = 0;
		String temp = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.substring(i,i+1).equals(regex)) {
				a[c] = temp;
				c++;
				a[c] = regex;
				c++;
				temp = "";
				
			}
			else {
				temp += s.substring(i,i+1);
				
			}
		}
		a[c] = temp;
		return a;
	}
}
