import arrays.MaxAndMinArray;
import arrays.ReverseAnArrayInPlace;

void main() {
    IO.println("Hello and welcome!");

    int[] arr = { 12, 3, 45, 6, 78, 9 };

    MaxAndMinArray.findMaxAndMin(arr);

    ReverseAnArrayInPlace.reverse(arr);
    IO.println("Reversed: " + Arrays.toString(arr));
}
