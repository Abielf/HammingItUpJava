package main.zipcode;

public class Hamming {
    String first;
    String second;
    public Hamming(String s, String s1) {
        first=s;
        second=s1;
        if (first.length() != second.length()) throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
    }

    public int getHammingDistance(){
        int variance = 0;
        /*int smaller;
        if(first.length()>second.length()){
        variance=first.length()-second.length();
        smaller=second.length();
        }else{variance=second.length()-first.length();
            smaller=first.length();}*/

        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                variance++;
            }
        }return variance;
    }}
