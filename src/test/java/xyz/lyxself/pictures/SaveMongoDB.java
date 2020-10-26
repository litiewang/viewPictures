package xyz.lyxself.pictures;

import com.alibaba.fastjson.*;
import lombok.SneakyThrows;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StringUtils;
import xyz.lyxself.pictures.entity.MoOneword;
import xyz.lyxself.pictures.entity.MoOnewordAdd;

import javax.annotation.Resource;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SaveMongoDB {
  
  
  @Resource
  private MongoTemplate mongoTemplate;
  @Test
  public void saveMongoDB() {
    String originPath = "G:/weixin/basedata/json/";
    File originFile = new File(originPath);
    File[] files = originFile.listFiles();
  
    if (files.length > 0) {
      for (int i = 17; i < files.length; i++) {
        File file1 = files[i];
        String jsonPath = originPath + file1.getName();
        File file = new File(jsonPath);
        InputStreamReader isr=null;
        BufferedReader bufferedReader=null;
        try{
          isr=new InputStreamReader(new FileInputStream(file), "utf-8");
          bufferedReader = new BufferedReader(isr);
          JSONReader reader=new JSONReader(bufferedReader);
           save(reader);
          break;
        }catch(UnsupportedEncodingException e) {
          e.printStackTrace();
        } catch(
            FileNotFoundException e)
      
        {
          e.printStackTrace();
        } finally
      
        {
          try {
            if (null != isr) {
              isr.close();
            }
            if (null != bufferedReader) {
              bufferedReader.close();
            }
          } catch (Exception e2) {
          }
        }
      
      }
    
    }
    
  }
  private void save(JSONReader reader){
    reader.startArray();
    while(reader.hasNext()) {
      String str = reader.readString();
      JSONObject jsonObject = JSON.parseObject(str);
      MoOneword moOneword= jsonObject.toJavaObject(MoOneword.class);
      JSONObject zhangwoJson = setDate(JSON.parseObject(moOneword.getZhangwo().replace("$date","date")));
     
      moOneword.setZhangwoJson(zhangwoToInt(zhangwoJson));
      JSONObject readdcJson = setDate(JSON.parseObject(moOneword.getReaddc().replace("$date","date")));
      moOneword.setReaddcJson(readdcToInt(readdcJson));
      
      mongoTemplate.save(moOneword);
      
      MoOnewordAdd moOnewordAdd= jsonObject.toJavaObject(MoOnewordAdd.class);
      JSONObject wdreaddJson = setDate(JSON.parseObject(moOnewordAdd.getWdreaddc().replace("$date","date")));
      moOnewordAdd.setWdreaddcJson(wdreaddJson);
      mongoTemplate.save(moOnewordAdd);
      
    }
  }
 private JSONObject zhangwoToInt(JSONObject zhangwoJson){
   for (Map.Entry entry : zhangwoJson.entrySet()) {
     JSONObject zhangwoItem = (JSONObject)entry.getValue();
  
     String fuxi =zhangwoItem.getString("fuxi");
  
     String renshi =zhangwoItem.getString("renshi");
     String jiyizhouqi =zhangwoItem.getString("jiyizhouqi");
     String zongrenshi =zhangwoItem.getString("zongrenshi");
     if(fuxi!=null)
       zhangwoItem.put("fuxi", zhangwoToInt(fuxi));
     if(renshi!=null)
       zhangwoItem.put("renshi", zhangwoToInt(renshi));
     if(jiyizhouqi!=null)
       zhangwoItem.put("jiyizhouqi", zhangwoToInt(jiyizhouqi));
     if(zongrenshi!=null)
       zhangwoItem.put("zongrenshi", zhangwoToInt(zongrenshi));
      
   }
   return zhangwoJson;
 }
  
  private JSONObject readdcToInt(JSONObject readdcJson){
    for (Map.Entry entry : readdcJson.entrySet()) {
      JSONObject zhangwoItem = (JSONObject)entry.getValue();
      
      String xuhao =zhangwoItem.getString("xuhao");
      
      String duanluo =zhangwoItem.getString("duanluo");
      if(xuhao!=null)
      zhangwoItem.put("xuhao", zhangwoToInt(xuhao));
      if(duanluo!=null)
      zhangwoItem.put("duanluo", zhangwoToInt(duanluo));
      
      
    }
    return readdcJson;
  }
 private Integer zhangwoToInt(String str){
    if(str==null)
      return 0;
   return Double.valueOf(str).intValue();
  
 }
  private JSONObject setDate(JSONObject json) {
    JSONObject jsonObjectemtp;
    try{
    
   
    for (String key:json.keySet()) {
      
      JSONObject jsonObject =json.getJSONObject(key);
      jsonObjectemtp =jsonObject;
      JSONObject timeJson =  jsonObject.getJSONObject("time");
      Date date1 =  getDate(timeJson);
      if(date1!=null)
      jsonObject.put("time",date1);
      JSONObject xiacijiJson =  jsonObject.getJSONObject("xiaciji");
      Date date2 =  getDate(xiacijiJson);
      if(date2!=null)
      jsonObject.put("xiaciji",date2);
      json.put(key,jsonObject);
    }
    }catch (JSONException e){
  e.printStackTrace();
  
    }
  return json;
  }
  
  @SneakyThrows
  private Date getDate(JSONObject timeJson) {
    Date date2 = null;
    if(timeJson!=null) {
      String date =  timeJson.getString("date");
      if(StringUtils.isEmpty(date)){
        return null;
      }
      SimpleDateFormat SDF = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.S'Z'");
      Date dateTime = SDF.parse(date);
      SimpleDateFormat Time3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
      String starttime = Time3.format(dateTime);
      SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
     
      try {
        date2 = format.parse(starttime);
      } catch (Exception ex) {
        ex.printStackTrace();
      }
      Calendar cal = Calendar.getInstance();
      cal.setTime(date2);
      cal.add(Calendar.HOUR, 8);// 24小时制
      date2 = cal.getTime();
      
    }
    return date2;
  }
  
}
