public class Main {
    public static String getArrChange(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                arr[i]++;
            }
        }
        String get = "";
        for (int i = 2; i < 7; i++){
            get = get + arr[i] + ", ";
        }
        return get;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        String arrChange = getArrChange(arr);
        System.out.println(arrChange);
    }
}

