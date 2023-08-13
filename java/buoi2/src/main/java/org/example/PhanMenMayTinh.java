package org.example;

public class PhanMenMayTinh implements MayTinhBoTuiInterface, SapXepInterface {
    public PhanMenMayTinh() {
    }

    public double cong(double a, double b) {
        return a + b;
    }

    public double tru(double a, double b) {
        return a - b;
    }

    public double nhan(double a, double b) {
        return a * b;
    }

    public double chia(double a, double b) {
        return a / b;
    }

    public void sapXepGiam(double[] arr) {
        int n = arr.length;

        for(int i = 1; i < n; ++i) {
            double key = arr[i];

            int j;
            for(j = i - 1; j >= 0 && arr[j] > key; --j) {
                arr[j + 1] = arr[j];
            }

            arr[j + 1] = key;
        }

    }

    public void sapXepTang(double[] arr) {
        int n = arr.length;

        for(int i = 1; i < n; ++i) {
            double key = arr[i];

            int j;
            for(j = i - 1; j >= 0 && arr[j] < key; --j) {
                arr[j + 1] = arr[j];
            }

            arr[j + 1] = key;
        }

    }
}

