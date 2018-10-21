public class Sort{
 
  public int[] shellsort(int[] array) {
    int inner, outer;
    int temp;
 
    int h = 1;
    while (h <= array.length / 3) {
      h = h * 3 + 1;
    }
    while (h > 0) {
      for (outer = h; outer < array.length; outer++) {
        temp = array[outer];
        inner = outer;
 
        while (inner > h - 1 && array[inner - h] >= temp) {
          array[inner] = array[inner - h];
          inner -= h;
        }
        array[inner] = temp;
      }
      h = (h - 1) / 3;
    }
    return array;
  }
//Bubble sort swaps values, comparing each set of two and ordering them.
	// This process is repeated until the array has been sorted.
  public int[] bubble(int[] array) {
		// This will cause it to loop through the array until it's sorted.
		// The length of the array will always be enough to fully sort.
		for (int i = 0; i < array.length; i++) {
			// Loop through the array once
			for (int j = 1; j < array.length; j++) {
				// Is the first value in the set of two larger?
				// Then it should go after the smaller value.
				if (array[j - 1] > array[j]) {
					// Store second value and replace it with first value
					int temp = array[j];
					array[j] = array[j - 1];
					// Make first value what the second was before
					array[j - 1] = temp;
				}
			}
		}
		return array;
	}
	// Selection sort goes backwards through the array, finding the highest value and moving them to the end in order.
	public int[] selection(int[] arr) {
		int n = arr.length;
		 
       // One by one move boundary of unsorted subarray
       for (int i = 0; i < n-1; i++)
       {
           // Find the minimum element in unsorted array
           int min_idx = i;
           for (int j = i+1; j < n; j++)
               if (arr[j] < arr[min_idx])
                   min_idx = j;

           // Swap the found minimum element with the first
           // element
           int temp = arr[min_idx];
           arr[min_idx] = arr[i];
           arr[i] = temp;
       }
		return arr;
	}
	// Insertion sort, for each item it will find where in the already-sorted items it should be placed do so.
	public int[] insertion(int[] array) {
		// Loop through the array until sorted.
		for (int i = 1; i < array.length; i++) {
			int index = array[i];
			int j = i;
			// If these aren't the right surrounding numbers, switch the target index up one.
			while ((j > 0) && (array[j - 1] > index)) {
				array[j] = array[j - 1];
				j = j - 1;
			}
			// After the right position has been found, put in the new number.
			array[j] = index;
		}
		return array;
	}
}
