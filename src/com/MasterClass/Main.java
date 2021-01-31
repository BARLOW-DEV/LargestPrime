package com.MasterClass;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(7));
    }

    public static int getLargestPrime(int number) {
        boolean isLargestPrime = false;
        int largestFactor = number - 1;
        if (number <= 1) {
            return -1;
        } else {
            while (largestFactor > 1) {
                if(number % largestFactor == 0) {
                    boolean isFactorOfFactor = false;
                    int factorOfFactor = largestFactor - 1;
                    while (!isFactorOfFactor) {
                        if (largestFactor % factorOfFactor == 0) {
                            if (factorOfFactor == 1) {
                                isLargestPrime = true;
                                break;
                            }
                            isLargestPrime = false;
                            break;
                        } else {
                            factorOfFactor--;
                        }
                    }
                }
                if (isLargestPrime) {
                    break;
                } else {
                    largestFactor--;
                }
            }
            if (largestFactor + 1 == 2) {
                largestFactor = number;
            }

        }
        return largestFactor;
    }
}
