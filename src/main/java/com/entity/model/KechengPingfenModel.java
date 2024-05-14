package com.entity.model;

import com.entity.KechengPingfenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 课程评价
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class KechengPingfenModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 学生
     */
    private Integer xueshengId;


    /**
     * 课程
     */
    private Integer kechengId;


    /**
     * 评分
     */
    private Double kechengPingfenPingfen;


    /**
     * 评价内容
     */
    private String kechengPingfenContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：学生
	 */
    public Integer getXueshengId() {
        return xueshengId;
    }


    /**
	 * 设置：学生
	 */
    public void setXueshengId(Integer xueshengId) {
        this.xueshengId = xueshengId;
    }
    /**
	 * 获取：课程
	 */
    public Integer getKechengId() {
        return kechengId;
    }


    /**
	 * 设置：课程
	 */
    public void setKechengId(Integer kechengId) {
        this.kechengId = kechengId;
    }
    /**
	 * 获取：评分
	 */
    public Double getKechengPingfenPingfen() {
        return kechengPingfenPingfen;
    }


    /**
	 * 设置：评分
	 */
    public void setKechengPingfenPingfen(Double kechengPingfenPingfen) {
        this.kechengPingfenPingfen = kechengPingfenPingfen;
    }
    /**
	 * 获取：评价内容
	 */
    public String getKechengPingfenContent() {
        return kechengPingfenContent;
    }


    /**
	 * 设置：评价内容
	 */
    public void setKechengPingfenContent(String kechengPingfenContent) {
        this.kechengPingfenContent = kechengPingfenContent;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
