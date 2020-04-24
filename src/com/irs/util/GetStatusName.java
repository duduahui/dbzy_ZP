package com.irs.util;

import java.util.Calendar;

/**
 * @author dudu
 * @create 2020-04-09 9:50
 */


public class GetStatusName {

    public String evaluate(String status){

        String val ="";
        if(status == null || "".equals(status) ){
            val = "状态值有误";
        }
        switch (status){
            case "1":  val= "待定";
                break;
            case "2":  val = "匹配";
                break;
            case "3":  val = "不匹配";
                break;
            case "4":  val = "人才储备";
                break;
            case "5":  val = "面试中";
                break;
            case "6":  val = "一面结束";
                break;
            case "7":  val = "二面中";
                break;
            case "8":  val = "二面结束";
                break;
            case "9":  val = "三面中";
                break;
            case "10":  val = "三面结束";
                break;
            case "11":  val = "四面中";
                break;
            case "12":  val = "四面结束";
                break;
            case "13":  val = "五面中";
                break;
            case "14":  val = "五面结束";
                break;
            case "200":  val = "已录用";
                break;
            case "500":  val = "未录用";
                break;
        }
        return val;
    }

}