public class _AddBinary {
	// https://leetcode.com/problems/add-binary

	public String addBinary(String a, String b) {
		int lenA = a.length();
		int lenB = b.length();
		int carry = 0;
		int index = 0;
		StringBuilder sb = new StringBuilder();
		while (index < lenA || index < lenB) {
			int sum = carry;
			if (index < lenA && index < lenB) {
				int aValue = a.charAt(a.length() - 1 - index) - '0';
				int bValue = b.charAt(b.length() - 1 - index) - '0';
				sum += aValue + bValue;
			} else if (index < lenA) {
				int aValue = a.charAt(a.length() - 1 - index) - '0';
				sum += aValue;
			} else {
				int bValue = b.charAt(b.length() - 1 - index) - '0';
				sum += bValue;
			}
			sb.append(sum % 2);
			carry = sum / 2;
			index++;
		}
		if (carry == 1) {
			sb.append(1);
		}
		return sb.reverse().toString();
	}
}