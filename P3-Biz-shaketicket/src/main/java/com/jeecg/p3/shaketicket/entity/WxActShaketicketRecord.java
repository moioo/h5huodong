package com.jeecg.p3.shaketicket.entity;

import java.util.Date;
import java.math.BigDecimal;
import org.jeecgframework.p3.core.utils.persistence.Entity;

import com.jeecg.p3.shaketicket.annotation.Excel;

/**
 * 描述：</b>WxActShaketicketRecord:抽奖记录表<br>
 * @author pituo
 * @since：2015年12月23日 13时55分34秒 星期三 
 * @version:1.0
 */
public class WxActShaketicketRecord implements Entity<String> {
	private static final long serialVersionUID = 1L;
	
	private String openid;
	/**
		return awardId;
	}
	public void setAwardId(String awardId) {
		this.awardId = awardId;
	}
	public String getDrawStatus() {
		return drawStatus;
	}
	public void setDrawStatus(String drawStatus) {
		this.drawStatus = drawStatus;
	}
	
	/**
	 *奖品名称
	 */
	private String awardsName;
	public String getAwardsName() {
		return awardsName;
	}
	public void setAwardsName(String awardsName) {
		this.awardsName = awardsName;
	}
	/**
	 *卡券id
	 */
	private String cardId;
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	
	/**
	 * 券码
	 */
	private String cardPsd;
	public String getCardPsd() {
		return cardPsd;
	}
	public void setCardPsd(String cardPsd) {
		this.cardPsd = cardPsd;
	}
	/**
	 * 手机号
	 */
	private String mobile;
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	private String isCard;
	public String getIsCard() {
		return isCard;
	}
	public void setIsCard(String isCard) {
		this.isCard = isCard;
	}
	
	//update begin author:huangqingquan for:查询图片和姓名地址。
	private String img;
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	private String relName;
	private String address;
	public String getRelName() {
		return relName;
	}
	public void setRelName(String relName) {
		this.relName = relName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	//update end author:huangqingquan for:查询图片和姓名地址。
}
