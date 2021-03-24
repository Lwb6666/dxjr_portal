package com.dxjr.portal.tzjinterface.entity;

import java.io.Serializable;

/**
 * Created by architect of touzhijia on 2016/2/22.
 */
public class Message implements Serializable {
	
	/**
	 * 序列化ID
	 */
	private static final long serialVersionUID = -4951034411907440358L;
	
	// 加密ServiceData的数据
	private String data;
	// 时间戳
    private Long timestamp;
    // 随机字符串
    private String nonce;
    // 签名
    private String signature;
    
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public String getSignature() {
        return signature;
    }
    
	public String getNonce() {
		return nonce;
	}

	public void setNonce(String nonce) {
		this.nonce = nonce;
	}

    public String getData() {
        return data;
    }
}
