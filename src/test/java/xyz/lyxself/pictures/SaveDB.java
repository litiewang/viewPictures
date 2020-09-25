package xyz.lyxself.pictures;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONReader;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xyz.lyxself.pictures.dao.LiuyanDao;
import xyz.lyxself.pictures.dao.OnewordDao;
import xyz.lyxself.pictures.entity.*;
import xyz.lyxself.pictures.service.LiuyanService;
import xyz.lyxself.pictures.service.ShouyeliuyanService;

import java.io.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SaveDB {
  
  @Autowired
  xyz.lyxself.pictures.dao.ChangkaodyDao ChangkaodyDao;
  @Autowired
  xyz.lyxself.pictures.dao.HuiyuanDao HuiyuanDao;
  @Autowired
  xyz.lyxself.pictures.dao.JihuomaDao JihuomaDao;
  @Autowired
  xyz.lyxself.pictures.dao.JinyicibianxiDao JinyicibianxiDao;
  @Autowired
  LiuyanService liuyanService;
  @Autowired
  xyz.lyxself.pictures.dao.LurudataDao LurudataDao;
  @Autowired
  LiuyanDao LiuyanDao;
  @Autowired
  ShouyeliuyanService ShouyeliuyanDao;
  @Autowired
  xyz.lyxself.pictures.dao.ShouyexqDao ShouyexqDao;
  @Autowired
  xyz.lyxself.pictures.dao.TuijiancdDao TuijiancdDao;
  @Autowired
  xyz.lyxself.pictures.dao.UserlogDao UserlogDao;
  @Autowired
  xyz.lyxself.pictures.dao.UserwordDao UserwordDao;
  @Autowired
  xyz.lyxself.pictures.dao.WenzhanglistDao WenzhanglistDao;
  @Autowired
  xyz.lyxself.pictures.dao.WenzhangxqDao WenzhangxqDao;
  @Autowired
  xyz.lyxself.pictures.dao.YindaoDao YindaoDao;
  @Autowired
  xyz.lyxself.pictures.dao.ZtlijuDao ZtlijuDao;
  @Autowired
  xyz.lyxself.pictures.dao.ZtlijuyuanwenDao ZtlijuyuanwenDao;
  @Autowired
  xyz.lyxself.pictures.dao.KthyxqDao KthyxqDao;
  
  @Autowired
  OnewordDao dao;
  Class[] classes = {Changkaody.class, Huiyuan.class, Jihuoma.class, Jinyicibianxi.class, Kthyxq.class,Liuyan.class, Lurudata.class, Shouyeliuyan.class, Shouyexq.class, Tuijiancd.class, Userlog.class, Userword.class, Wenzhanglist.class, Wenzhangxq.class, Yindao.class, Ztliju.class, Ztlijuyuanwen.class};
  
  @Test
  public void saveDB() {
    
    String originPath = "G:/weixin/basedata/json/";
    File originFile = new File(originPath);
    File[] files = originFile.listFiles();
    
    if (files.length > 0) {
      for (int i = 7; i < files.length; i++) {
        File file1 = files[i];
        String jsonPath = originPath + file1.getName();
        File file = new File(jsonPath);
        InputStreamReader isr=null;
        BufferedReader bufferedReader=null;
        try{
          isr=new InputStreamReader(new FileInputStream(file), "utf-8");
          bufferedReader = new BufferedReader(isr);
    
          JSONReader reader=new JSONReader(bufferedReader);
  
          save(i,reader);
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
  private void update(Integer i, JSONReader reader){
  
  }
  private void save(Integer i, JSONReader reader) {
    reader.startArray();
    while(reader.hasNext()) {
      String str = 	reader.readString();
      JSONObject jsonObject = JSON.parseObject(str);
      switch (i) {
        case 0:
       
           ChangkaodyDao.save(jsonObject.toJavaObject(Changkaody.class));
          break;
        case 1:
       
            HuiyuanDao.save(jsonObject.toJavaObject(Huiyuan.class));
      
          break;
        case 2:
      
          
            JihuomaDao.save(jsonObject.toJavaObject(Jihuoma.class));
      
          break;
        case 3:
      
          
            JinyicibianxiDao.save(jsonObject.toJavaObject(Jinyicibianxi.class));
          break;
        case 4:
  
          KthyxqDao.save(jsonObject.toJavaObject(Kthyxq.class));
          break;
        case 5:
  
          LiuyanDao.save(jsonObject.toJavaObject(Liuyan.class));
          break;
        case 6:
      
          
            LurudataDao.save(jsonObject.toJavaObject(Lurudata.class));
          break;
        case 7:
      
          
            ShouyeliuyanDao.save(jsonObject.toJavaObject(Shouyeliuyan.class));
          break;
        case 8:
      
          
            ShouyexqDao.save(jsonObject.toJavaObject(Shouyexq.class));
          break;
        case 9:
      
          
            TuijiancdDao.save(jsonObject.toJavaObject(Tuijiancd.class));
          break;
        case 10:
  
          Userlog userlog = jsonObject.toJavaObject(Userlog.class);
          String userlogLogdate = userlog.getLogdate();
          if(userlogLogdate!=null&&userlogLogdate.indexOf("\":\"")!=-1){
            userlogLogdate =  userlogLogdate.substring(userlogLogdate.indexOf("\":\"")+3,userlogLogdate.length()-3);
            userlog.setLogdate(userlogLogdate);
          }
            UserlogDao.save(userlog);
          break;
        case 11:
  
          Userword userword = jsonObject.toJavaObject(Userword.class);
          String logdate = userword.getTime();
          if(logdate!=null&&logdate.indexOf("\":\"")!=-1){
            logdate =  logdate.substring(logdate.indexOf("\":\"")+3,logdate.length()-3);
  
            userword.setTime(logdate);
          }
            UserwordDao.save(userword);
         
          break;
        case 12:
      
          
            WenzhanglistDao.save(jsonObject.toJavaObject(Wenzhanglist.class));
        
          break;
        case 13:
      
          
            WenzhangxqDao.save(jsonObject.toJavaObject(Wenzhangxq.class));
          break;
        case 14:
          
            YindaoDao.save(jsonObject.toJavaObject(Yindao.class));
        
          break;
        case 15:
      
          
            ZtlijuDao.save(jsonObject.toJavaObject(Ztliju.class));
          
          break;
        case 16:
      
          
            ZtlijuyuanwenDao.save(jsonObject.toJavaObject(Ztlijuyuanwen.class));
          
          break;
        case 17:
          dao.save(jsonObject.toJavaObject(Oneword.class));
    
          break;
      }
    
    }
  
    
    reader.endArray();
  }
  
}
