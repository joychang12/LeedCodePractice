public static boolean isPalindrome(int x) {

        boolean result = false;
		int after = 0;
		int temp = x;

		while(temp > 0) {
			after = after*10 + temp%10;
			temp /= 10;
		}

		if(after == x) {
			result = true;
		}

		return result;

}