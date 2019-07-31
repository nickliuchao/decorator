package com.test.promotion.price;

/**
 * 促销类型
 * @author admin
 *
 */
public class SupportPromotions implements Cloneable{

	private int id;//该商品促销的ID
	private PromotionType promotionType;//促销类型 1\优惠券 2\红包
	private int priority; //优先级
	private UserCoupon userCoupon; //用户领取该商品的优惠券
	private UserRedPacket userRedPacket; //用户领取该商品的红包
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public PromotionType getPromotionType() {
		return promotionType;
	}
	public void setPromotionType(PromotionType promotionType) {
		this.promotionType = promotionType;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	public UserCoupon getUserCoupon() {
		return userCoupon;
	}
	public void setUserCoupon(UserCoupon userCoupon) {
		this.userCoupon = userCoupon;
	}
	public UserRedPacket getUserRedPacket() {
		return userRedPacket;
	}
	public void setUserRedPacket(UserRedPacket userRedPacket) {
		this.userRedPacket = userRedPacket;
	}
	//重写clone方法
    public SupportPromotions clone(){
    	SupportPromotions supportPromotions = null;
        try{
        	supportPromotions = (SupportPromotions)super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return supportPromotions;
    }
}
