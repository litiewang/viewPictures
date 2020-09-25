package xyz.lyxself.pictures.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author jellf
 * @since 2020-08-23
 */
@Data
@Entity
@Table(name = "t_kthyxq") //映射的表名称)
public class Kthyxq implements Serializable {
  
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) // 组件生成策略
  @Column(name = "mid" ,length = 32)// @Column 绑定数据库中的列
      Integer mid;
  @Column(name = "oid")
  String oid;
  
  private String tupian;
  
  private String zhengwen;
  private String fuzhi;
  
  private String fuzhi1;
  private String fuzhi2;
  
}
