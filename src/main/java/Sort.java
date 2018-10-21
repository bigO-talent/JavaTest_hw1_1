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
  
  private int[] array;
  private int[] tempMergArr;
  private int length;
   
  public int[] merge(int inputArr[]) {
      this.array = inputArr;
      this.length = inputArr.length;
      this.tempMergArr = new int[length];
      doMergeSort(0, length - 1);
      return array;
  
  }

  private void doMergeSort(int lowerIndex, int higherIndex) {
       
      if (lowerIndex < higherIndex) {
          int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
          // Below step sorts the left side of the array
          doMergeSort(lowerIndex, middle);
          // Below step sorts the right side of the array
          doMergeSort(middle + 1, higherIndex);
          // Now merge both sides
          mergeParts(lowerIndex, middle, higherIndex);
      }
  }

  private void mergeParts(int lowerIndex, int middle, int higherIndex) {

      for (int i = lowerIndex; i <= higherIndex; i++) {
          tempMergArr[i] = array[i];
      }
      int i = lowerIndex;
      int j = middle + 1;
      int k = lowerIndex;
      while (i <= middle && j <= higherIndex) {
          if (tempMergArr[i] <= tempMergArr[j]) {
              array[k] = tempMergArr[i];
              i++;
          } else {
              array[k] = tempMergArr[j];
              j++;
          }
          k++;
      }
      while (i <= middle) {
          array[k] = tempMergArr[i];
          k++;
          i++;
      }

  }
}
