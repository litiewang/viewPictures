package xyz.lyxself.pictures.service.Impl;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.lyxself.pictures.dao.LiuyanDao;
import xyz.lyxself.pictures.entity.Liuyan;
import xyz.lyxself.pictures.service.LiuyanService;

import java.net.URLEncoder;
@Service
public class LiuyanServiceImpl implements LiuyanService {
  
  @Autowired
  LiuyanDao dao;
  @SneakyThrows
  @Override
  public Liuyan save(Liuyan liuyan) {
    
    String logdate = liuyan.getLogdate();
    if(logdate.indexOf("\":\"")!=-1){
      logdate =  logdate.substring(logdate.indexOf("\":\"")+3,logdate.length()-3);
      
      liuyan.setLogdate(logdate);
    }
      liuyan.setLiuyan(URLEncoder.encode(liuyan.getLiuyan(), "utf-8"));
    return dao.save(liuyan);
  }
  
}
