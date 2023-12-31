package org.example;

public class SapXepChon implements SapXepInterface {
    public SapXepChon() {
    }

    public void sapXepTang(double[] arr) {
        int n = arr.length;

        for(int i = 0; i < n - 1; ++i) {
            int min_idx = i;

            for(int j = i + 1; j < n; ++j) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }

                double temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }
        }

    }

    public void sapXepGiam(double[] arr) {
        int n = arr.length;

        for(int i = 0; i < n - 1; ++i) {
            int min_idx = i;

            for(int j = i + 1; j < n; ++j) {
                if (arr[j] > arr[min_idx]) {
                    min_idx = j;
                }

                double temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }
        }

    }
}

