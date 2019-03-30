package com.adorgroup.babycar.mqtt.face;

import com.adorgroup.babycar.mqtt.util.JacksonUtil;
import com.adorgroup.framework.common.http.utils.HttpClientUtil;

import java.util.HashMap;
import java.util.Map;

public class FaceSearch {

    /**
     * 重要提示代码中所需工具类
     * FileUtil,Base64Util,HttpUtil,GsonUtils请从
     * https://ai.baidu.com/file/658A35ABAB2D404FBF903F64D47C1F72
     * https://ai.baidu.com/file/C8D81F3301E24D2892968F09AE1AD6E2
     * https://ai.baidu.com/file/544D677F5D4E4F17B4122FBD60DB82B3
     * https://ai.baidu.com/file/470B3ACCA3FE43788B5A963BF0B625F3
     * 下载
     */
    public static String search() {
        // 请求url
        String url = "https://aip.baidubce.com/rest/2.0/face/v3/search";
        try {
            Map<String, Object> map = new HashMap<>();
            map.put("image", Base64Util.encode(FileUtil.readFileByBytes("E:/r.jpg")));
           // map.put("liveness_control", "NORMAL");
            map.put("group_id_list", "ador_cd");
            map.put("image_type", "BASE64");
          //  map.put("quality_control", "LOW");

            String param = JacksonUtil.toJson(map);

            // 注意这里仅为了简化编码每一次请求都去获取access_token，线上环境access_token有过期时间， 客户端可自行缓存，过期后重新获取。
            String accessToken = AuthService.getAuth();

            HttpClientUtil util  = HttpClientUtil.getInstance();
            String result = util.postJson(url+"?access_token="+accessToken,param);
            System.out.println(result);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
