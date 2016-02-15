package us.eiyou.fire;

import java.util.ArrayList;

/**
 * Created by Au on 2016/1/29.
 */
public class Utils {
    public static boolean had(String put,String[] c){
        for (String s1:c){
            if(put.contains(s1)){
                return true;
            }
        }
        return false;
    }
    public static boolean eqal(String put,String[] c){
        for(String s1:c){
            if(put.equals(s1)){
                return true;
            }
        }
        return false;
    }

    public static ArrayList<String> havedArrayList(String[] zong,String puted){
        ArrayList<String> arrayList=new ArrayList<>();
        for (String z:zong){
            if(z.contains(puted)){
                arrayList.add(z);
            }
        }
        return arrayList;
    }

    public static void main(String[] args) {
        String s="sssss";
        System.out.println(s.contains("ssssssssss"));
    }

}
