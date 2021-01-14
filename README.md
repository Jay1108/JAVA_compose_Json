# org.json是Java常用的Json解析工具

## 1. JSONStringer
>>使用方式：
>>>a. object()：開始一個json物件，即為"{"

>>>b. enObject()：結束一個json物件，即為"}"

>>>c. array()：開始一個json物件，即為"\["

>>>d. endArray()：結束一個json物件，即為"\]"

>>>e. key()組成參數key值，通常與value()成對，即為"key : value"

>>優點：
>>>1.能夠快速建構json的架構

>>>2.正序組成json，較貼近一般閱讀方式

>>缺點：

>>>1.程式碼較為冗長


## 2.JSONObject & JSONArray
>>使用方式：
>>>a. 使用put()新增or修改值(value類型可以為Boolean,JSONArray,JSONObject,Number,String)

>>>b. 使用get()或opt()取出對應key值的value(註：使用get()須注意無對應key值會拋Exception)

>>優點：
>>>1.程式較精簡，組成方式較直觀

>>>2.存取json內容較方便

>>缺點：
>>>1.宣告較多物件，較占用效能

>>>2.JSONObject為無序鑑值存放，故無法排序json內容
