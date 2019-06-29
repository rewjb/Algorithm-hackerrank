/**
 * 문제
 * 12시간이라는 AP.PM 형태의 시간이 주어진다. 이것을 군대시간인 24시간으로 변환해야 한다.
 *
 * 예시)
 * 07:05:45 PM => 19:05:45
 * */

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Time_Conversion {

    static String timeConversion(String s) {
        /*
         * Write your code here.
         */

        if (s.contains("AM")){
            String split[] = s.replace("AM","").split(":");

            if (Integer.parseInt(split[0]) >= 12) {
                    int hour =  Integer.parseInt(split[0]) - 12 ;
                    if(hour < 10){
                        return "0"+hour+":"+split[1]+":"+split[2];
                    }else{
                        return hour+":"+split[1]+":"+split[2];
                    }
            }
            return  s.replace("AM","");
        }else{
            String split[] = s.replace("PM","").split(":");
            if(Integer.parseInt(split[0]) >= 12){
                return s.replace("PM","");
            }else{
                int hour = Integer.parseInt(split[0]) +12;
                return hour+":"+split[1]+":"+split[2];
            }



        }
    }


    public static void main(String[] args) throws IOException {

       String result =  timeConversion("12:45:54PM");
       System.out.println(result);

    }
}
