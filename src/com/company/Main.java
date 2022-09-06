package com.company;
import java.util.*;

public class Main {
    static List<List<Integer>> pascal(int numrows){
        if(numrows==0){
            return new ArrayList<>();
        }
       List<List<Integer>> result=new ArrayList<>();
        for(int i=1;i<=numrows;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<i;j++){
                if(j==0 || j==i-1){
                    row.add(1);
                }
                else{
                    row.add(result.get(i-2).get(j)+result.get(i-2).get(j-1));
                }
            }
            result.add(row);

        }
            return result;


    }

    public static void main(String[] args) {
	int numrows=5;
        System.out.println(pascal(5));
    }
}
