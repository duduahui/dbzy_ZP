package com.irs.util;

import com.actionsoft.bpms.api.OpenApiClient;
import java.util.HashMap;
import java.util.Map;

/**
 * @author dudu
 * @create 2020-03-06 9:44
 */
public class TurnBPM {
        private static String apiServer = "http://172.16.177.41:8088/openapi";
        private static String accessKey = "small#1";
        private static String secret = "wzq20200306";

        public static void say(String deptid) {
            try {
                String apiMethod = "demo.say";
                Map<String, Object> args = new HashMap<String, Object>();
                args.put("str1", deptid);
                OpenApiClient client = new OpenApiClient(apiServer, accessKey, secret,
                        OpenApiClient.FORMAT_JSON);
                String r = client.exec(apiMethod, args);
                System.out.println(r);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public static void calc() {
            try {
                String apiMethod = "demo.calc";
                Map<String, Object> args = new HashMap<String, Object>();
                args.put("num1",5);
                args.put("num2",6);
                OpenApiClient client = new OpenApiClient(apiServer, accessKey, secret,
                        OpenApiClient.FORMAT_JSON);
                String r = client.exec(apiMethod, args);
                System.out.println(r);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        public int get(String str){

            String[] uid_value = str.split(",");
            say(uid_value[0]);
            return 0;
        }
//        public static void main(String args[]){
//            say("");
//            calc();
//        }

}
