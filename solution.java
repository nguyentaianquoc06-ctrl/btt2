class solution {
	public int secondLargest(int[] arr) {
		int max = arr[0];
		int f2 = arr[1];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				f2 = max;
				max = arr[i];
			} else if (arr[i] > f2 && arr[i] != max) {
				f2 = arr[i];
			}
		}
		return f2;
	}
}