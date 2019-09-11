package myjavatest;

import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.apache.commons.lang.StringUtils;

public class java {
	public static void main(String[] args) {
		try {
			
			
			
			
			//wanghidd
			Map<String, String> sortParams = new HashMap<String, String>();
			sortParams.put("version", "1.1");
			sortParams.put("lang", "zh-cn");
			sortParams.put("plugins", "plus123");
			sortParams.put("appid", "12345");
			sortParams.put("trade_order_id", "3467474747585865");
			sortParams.put("payment", "alipay");
			sortParams.put("total_fee", "100");
			sortParams.put("is_app", "N");
			sortParams.put("title", "applexs");
			sortParams.put("description", "描述");
			sortParams.put("time", new Date().getTime()/1000+"");
			sortParams.put("notify_url", "http://www.baidu.com/");
			sortParams.put("return_url", "http://www.baidu.com/");
			sortParams.put("callback_url", "http://www.baidu.com/");
			sortParams.put("nonce_str", "2222253363636");
			//sortParams.put("hash", createSign(sortParams,"xxxxxxxxxxxxxxxxxxxxxxxxxxx"));
			System.out.println(createSign(sortParams,"xxxxxxxxxxxxxxxxxxxxxxxxxxx"));
			System.out.println("sortParams" +sortParams);

			


		} catch (Exception e) {
			e.printStackTrace();
		}
	}


		
	public static String createSign(Map<String, String> params, String privateKey) {
		 StringBuilder sb = new StringBuilder();
	        // 将参数以参数名的字典升序排序
	        Map<String, String> sortParams = new TreeMap<String, String>(params);
	        // 遍历排序的字典,并拼接"key=value"格式
	        for (Map.Entry<String, String> entry : sortParams.entrySet()) {
	            String key = entry.getKey();
	            String value =  entry.getValue().trim();
	            if (StringUtils.isNotEmpty(value))
	                sb.append("&").append(key).append("=").append(value);
	        }
	        String stringA = sb.toString().replaceFirst("&","");
	        String stringSignTemp = stringA + privateKey;
	        return stringSignTemp;
	}





}
