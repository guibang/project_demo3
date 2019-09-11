import com.alibaba.fastjson.JSONObject;

import java.net.URI;
import java.net.URISyntaxException;

public class demo1 {
    public static void main(String[] args) {
////        String s1 = "%7B%22appName%22%3A%22%22%2C%22userId%22%3A%22904793244%22%2C%22channelld%22%3A%22%22%2C%22endTime%22%3A%22%22%2C%22goodsId%22%3A%22%22%2C%22goodsType%22%3A%22%22%2C%22orderStatus%22%3A%22SUCCESS%22%2C%22pageNum%22%3A1%2C%22pageNum%22%3A1%2C%22pageSize%22%3A5%2C%22serviceCodes%22%3A%5B%5D%2C%22sort%22%3A%22%22%2C%22startTime%22%3A%22%22%2C%22userToken%22%3A%22%22%7D";
////        String s2 = "%7B%22appName%22%3A%22%22%2C%22userId%22%3A%22904793244%22%2C%22channelld%22%3A%22%22%2C%22endTime%22%3A%22%22%2C%22goodsId%22%3A%22%22%2C%22goodsType%22%3A%22%22%2C%22orderStatus%22%3A%22SUCCESS%22%2C%22pageNum%22%3A1%2C%22pageNum%22%3A1%2C%22pageSize%22%3A5%2C%22serviceCodes%22%3A%5B%5D%2C%22sort%22%3A%22%22%2C%22startTime%22%3A%22%22%2C%22userToken%22%3A%22%22%7D";
//        String s = "http://127.0.0.1:8080/open/video/order/query?a=3&b=4";
////        URI uri = null;
////        try {
////            uri = new URI(s);
////        } catch (URISyntaxException e) {
////            e.printStackTrace();
////        }
////        URI ip = getIP(uri);
////        String[] ip_port = ip.toString().split("//");
////        String[] split = s.split(ip_port[1]);
////        System.out.println(split[1]);
//        String ip_port = getIP(s);
//        System.out.println("ip_port = " + ip_port);


        String s = "http://127.0.0.1:8080/open/video/order/query?a=3&b=4";
        String ip = getIP(s);
        System.out.println("ip = " + ip);
    }

    public static String getIP(String s) {
        URI uri = null;
        try {
            uri = new URI(s);
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        URI effectiveURI = null;

        try {
            effectiveURI = new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), null, null, null);
        } catch (Throwable var4) {
            effectiveURI = null;
        }
        String[] arr = effectiveURI.toString().split("//");
        String[] url = s.split(arr[1]);
        String[] address = url[1].split("\\?");
        return address[0];
    }


}




