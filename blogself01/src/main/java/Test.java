import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: HuYu
 * Date: 2021-04-07
 * Time: 20:04
 */
public class Test {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        //{"succ":1,"msg":"msg"}
        HashMap<String,Object> map = new HashMap<>();
        map.put("succ",1);
        map.put("msg","操作成功！");
        String str = mapper.writeValueAsString(map);
        System.out.println(str);

    }
}
