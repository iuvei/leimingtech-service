
package com.leimingtech.service.module.trade.common;

/**
 * 退款退货相关状态类型
 * @author liukai
 */
public final class RefundReturnState {
	
	/**
	 * 退款退货申请类型:退款
	 */
	public final static int TYPE_REFUND = 1;
	
	/**
	 * 退款退货申请类型:退货
	 */
	public final static int TYPE_RETURN = 2;
	
	/**
	 * 卖家处理状态:待审核
	 */
	public final static int SELLER_STATE_PENDING_AUDIT = 1;
	
	/**
	 * 卖家处理状态:同意
	 */
	public final static int SELLER_STATE_AGREE = 2;
	
	/**
	 * 卖家处理状态:不同意
	 */
	public final static int SELLER_STATE_DISAGREE = 3;
	
	/**
	 * 退款申请状态:未申请
	 */
	public final static int REFUND_STATE_PROCESSING = 1;
	
	/**
	 * 退款申请状态:待管理员处理
	 */
	public final static int REFUND_STATE_PENDING = 2;
	
	/**
	 * 退款申请状态:已完成
	 */
	public final static int REFUND_STATE_FINISH = 3;
	
	/**
	 * 退货类型:需要退货
	 */
	public final static int RETURN_TYPE_NEED = 2;
	
	/**
	 * 订单锁定类型:需要锁定
	 */
	public final static int ORDER_LOCK_NEED = 2;
	
	/**
	 * 物流状态:待发货
	 */
	public final static int GOODS_STATE_UNSHIP = 1;
	
	/**
	 * 物流状态:待收货
	 */
	public final static int GOODS_STATE_NOT_RECEIVING = 2;
	
	/**
	 * 物流状态:已收货
	 */
	public final static int GOODS_STATE_RECEIVED = 4;
}
