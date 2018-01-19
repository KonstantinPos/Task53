public class Main {
    public static void main(String[] args) {
        int arr2[] = new int[10];
        for (int i = 0; i < 5; i++) {
            mas(arr2);
            System.out.println();
        }
    }
//метод выводит на экран массив
    static void mas(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = run(10, 5);
            System.out.print(arr[i] + " ");
        }
    }
// метод возвращает случайное число в заданом дипазоне
    static int run(int q, int w) {
        int e = (int) (Math.random() * (w - q)) + q;
        return e;
    }
}
