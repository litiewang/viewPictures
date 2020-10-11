package xyz.lyxself.pictures.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection="t_oneword")
public class MoOneword {
    @Id
    String _id;
    String danci;
    String lwdanci;
    String ciyi;
    String UK;
    String US;
    String xzwcs;
    String ybgqs;
    String xzjxs;
    String fushu;
    String gaokao;
    String kaoyan;
    String liuji;
    String siji;
    String liju;
    String lijufanyi;
    String zhangwo;
    String readdc;
    String cipin;
    String gkcipin;
    String ljcipin;
    String sjcipin;
    String xuhao;
    String wdreaddc;
    String zhuji;
    String shucibj;
    String jinyicibx;
    String tonggenci;
    String tgc;
    String tgci;
    String cizu;
    String tonggen;
    String tongyici;
    String zhentiliju;
    String kygpc2000sc;
    Integer kygpc2000xh;
    String kygpc3000xh;
    String kygpc600xh;
    
    String kydgzimuxh;
    String kygpc2000;
    String kygpc3000;
    String kygpc600;
    String kygpc600sc;
    String undefined;
    String  kygpc3000sc;
    
    String  kydgzimusc;
    String   kydgcipinsc;
    String   kydgcipinxh;
}
