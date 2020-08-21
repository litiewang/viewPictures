package xyz.lyxself.pictures;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.test.context.junit4.SpringRunner;
import xyz.lyxself.pictures.entity.*;

import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Utils {
  
  
  @Autowired
  xyz.lyxself.pictures.dao.ChangkaodyDao ChangkaodyDao;
  @Autowired
  xyz.lyxself.pictures.dao.HuiyuanDao HuiyuanDao;
  @Autowired
  xyz.lyxself.pictures.dao.JihuomaDao JihuomaDao;
  @Autowired
  xyz.lyxself.pictures.dao.JinyicibianxiDao JinyicibianxiDao;
  @Autowired
  xyz.lyxself.pictures.dao.LiuyanDao LiuyanDao;
  @Autowired
  xyz.lyxself.pictures.dao.LurudataDao LurudataDao;
  @Autowired
  xyz.lyxself.pictures.dao.ShouyeliuyanDao ShouyeliuyanDao;
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
  
  
  @Test
  public void saveDB() {
    Class[] classes = {Changkaody.class, Huiyuan.class, Jihuoma.class, Jinyicibianxi.class, Liuyan.class,Lurudata.class,Shouyeliuyan.class,Shouyexq.class,Tuijiancd.class,Userlog.class,Userword.class,Wenzhanglist.class,Wenzhangxq.class,Yindao.class,Ztliju.class,Ztlijuyuanwen.class     };
    JpaRepository[] jpaRepositories ={ChangkaodyDao,HuiyuanDao,JihuomaDao,JinyicibianxiDao,LiuyanDao,LurudataDao,ShouyeliuyanDao,ShouyexqDao,TuijiancdDao,UserlogDao,UserwordDao,WenzhanglistDao,WenzhangxqDao,YindaoDao,ZtlijuDao,ZtlijuyuanwenDao};
   
    String originPath= "G:/weixin/basedata/json/";
    File originFile = new File(originPath);
    File[] files = originFile.listFiles();
    
    if(files.length>0){
      for(int i=0;i<files.length;i++){
        File file = files[i];
        String jsonPath =	originPath+ file.getName();
        SaveDB saveDB =new SaveDB();
        saveDB.gson(jpaRepositories[i],classes[i],jsonPath);
      }
    }
    
  }
}
