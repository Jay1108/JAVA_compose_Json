import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONStringer;

public class composeJsonData{
    
    public static void main(String[] args){
        /**
         * JSONStringer 
         */
        JSONStringer jsonStringer = new JSONStringer();
        //object代表json中的"json物件開始字符({)"
        jsonStringer.object();
        //組成"key + value"資料類型
        jsonStringer.key("responeCode").value("200");
        jsonStringer.key("responeDesc").value("OK");
        //組成"key + 物件"資料類型
        jsonStringer.key("content").object();
        //array代表json中的"json陣列開始字符([)"
        jsonStringer.key("list").array();
        jsonStringer.object();
        jsonStringer.key("keyA").value("valueA");
        //endObject代表json中的"json物件結束字符(})"
        jsonStringer.endObject();
        //endArray代表json中的"json陣列結束字符(])"
        jsonStringer.endArray();
        jsonStringer.endObject().endObject();
        System.out.println(jsonStringer.toString());
        
        /**
         * JSONObject
         */
        //JSONObject為json物件；JSONArray為json陣列
        JSONObject jsonObj = new JSONObject();
        JSONObject content = new JSONObject();
        JSONObject value = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        //使用put塞入key與value
        value.put("keyA", "valueA");
        //陣列內只可裝入json物件
        jsonArray.put(value);
        //json物件的value可直接塞入json陣列
        content.put("list", jsonArray);
        jsonObj.put("responeCode", "200");
        jsonObj.put("responeDesc", "OK");
        jsonObj.put("content", content);
        System.out.println("\n" + jsonObj.toString());
    }
}
