package com.irs.controller.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.irs.pojo.OpenIdJson;
import com.irs.util.HttpUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
@RequestMapping("wx")
public class WxLoginController {

    //wxe776ca37a3484089
    //9c65af58187fcdb9f9a362bdf8be7f1e
    private String appID = "wx001b75446ce37fa8";
    private String appSecret = "f856a396fe99cda4134c888ea534645a";
//    private String appID = "wxe776ca37a3484089";
//    private String appSecret = "9c65af58187fcdb9f9a362bdf8be7f1e";

    @RequestMapping("/login")
    @ResponseBody
    public String userLogin(@RequestParam("code") String code) throws IOException {
        String result = "";
        try {//请求微信服务器，用code换取openid。
            result = HttpUtil.doGet(
                    "https://api.weixin.qq.com/sns/jscode2session?appid="
                            + this.appID + "&secret=" +this.appSecret + "&js_code=" +code +"&grant_type=authorization_code", null); }
        catch(Exception e){
            e.printStackTrace();
        }
        ObjectMapper mapper = new ObjectMapper();
        OpenIdJson openIdJson = mapper.readValue(result, OpenIdJson.class);
        System.out.println("Openid====="+openIdJson.getOpenid());
        System.out.println("Session_key====="+openIdJson.getSession_key());
        System.out.println(result.toString());
        return result;
    }
}