package xyz.lyxself.pictures.service.Impl;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.lyxself.pictures.dao.ShouyeliuyanDao;
import xyz.lyxself.pictures.entity.Shouyeliuyan;
import xyz.lyxself.pictures.service.ShouyeliuyanService;

import java.net.URLEncoder;

@Service
public class ShouyeliuyanServiceImpl implements ShouyeliuyanService {
  
  @Autowired
  ShouyeliuyanDao dao;
  @SneakyThrows
  @Override
  public Shouyeliuyan save(Shouyeliuyan shouyeliuyan) {
    String logdate = shouyeliuyan.getLogdate();
    if(logdate!=null&&logdate.indexOf("\":\"")!=-1){
      logdate =  logdate.substring(logdate.indexOf("\":\"")+3,logdate.length()-3);
  
      shouyeliuyan.setLogdate(logdate);
    }
    String liuyan = shouyeliuyan.getLiuyan();
    if(liuyan!=null){
      
      shouyeliuyan.setLiuyan(URLEncoder.encode(liuyan, "utf-8"));
    }
    String huifu = shouyeliuyan.getHuifu();
    if(huifu!=null){
      shouyeliuyan.setHuifu(URLEncoder.encode(huifu, "utf-8"));
    }
    String nickname = shouyeliuyan.getNickname();
    if(nickname!=null){
      shouyeliuyan.setNickname(URLEncoder.encode(nickname, "utf-8"));
    }
  
    return dao.save(shouyeliuyan);
  }
}
