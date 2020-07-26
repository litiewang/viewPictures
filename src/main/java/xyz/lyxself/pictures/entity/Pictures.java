package xyz.lyxself.pictures.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity // 注明此Java类是实体类
@Data // 自动生成getter和setter
@Table(name = "tb_pictures") // 数据库中表的名称
public class Pictures {
	@Id // 数据库组件
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 组件生成策略
	//@Column  绑定数据库中的列
	@Column(name = "mid")
	private Long mid;
	@Column(name = "photo")
	private String photo;
	@Column(name = "alabel")
	private String alabel;
}
