import com.alibaba.fastjson.JSON;

import java.util.Map;

public class demo2 {
    public static void main(String[] args) {
        String s = "";
        Map map = JSON.parseObject(s, Map.class);
        System.out.println("map = " + map);
        s = "dev";
    }
}
