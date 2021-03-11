package Kyu4;

class Range {
    public static String rangeExtraction(int[] arr) {
        String answer = "";
        for (int i = 0; i < arr.length-2; i++) {
            if (i != arr.length - 1 && arr[i] != arr[i + 1] - 1) {
                answer += arr[i] + ",";
                i++;
            }
            while(i + 2 != arr.length-1) {
                while (arr[i] == arr[i + 1] - 1 && arr[i] == arr[i + 2] - 2 && i != arr.length - 3) {
                    i++;
                }
                if (arr[i] == arr[i + 1] - 1) {
                    i++;
                }
                if (i == arr.length - 2) {
                    answer += arr[arr.length - 1];
                    break;
                }

                if (i != arr.length - 1 && arr[i] == arr[i + 1] - 1 && arr[i] == arr[i + 2] - 2) {
                    answer += arr[i] + "-";
                } else {
                    answer += arr[i] + ",";
                }
            }
        }
        return answer;
    }
}
