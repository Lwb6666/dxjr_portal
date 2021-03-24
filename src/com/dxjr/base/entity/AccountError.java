package com.dxjr.base.entity;

import java.math.BigDecimal;
import java.util.Date;

public class AccountError {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account_error.id
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account_error.user_id
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account_error.total
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    private BigDecimal total;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account_error.p2p_netvalue
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    private BigDecimal p2pNetvalue;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account_error.p2p_use_money
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    private BigDecimal p2pUseMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account_error.p2p_no_use_money
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    private BigDecimal p2pNoUseMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account_error.p2p_collection
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    private BigDecimal p2pCollection;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account_error.p2p_FIRST_BORROW_USE_MONEY
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    private BigDecimal p2pFirstBorrowUseMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account_error.p2p_VERSION
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    private Integer p2pVersion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account_error.p2p_DRAW_MONEY
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    private BigDecimal p2pDrawMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account_error.p2p_NO_DRAW_MONEY
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    private BigDecimal p2pNoDrawMoney;
    
    
    private BigDecimal p2peUseMoney;//平台存管可用金额
    
    private BigDecimal p2peNoUseMoney;//平台存管冻结金额
    
    private BigDecimal p2peCollection;//平台存管待收金额

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account_error.zs_e_use_money
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    private BigDecimal zsEUseMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account_error.zs_e_freeze_money
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    private BigDecimal zsEFreezeMoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account_error.zs_withdrawAmount
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    private BigDecimal zsWithdrawamount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account_error.STATUS
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account_error.dispose_user
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    private Integer disposeUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account_error.dispose_time
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    private Date disposeTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account_error.dispose_remark
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    private String disposeRemark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account_error.ADDTIME
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    private Date addtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account_error.ADDIP
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    private String addip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account_error.PLATFORM
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    private Integer platform;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_account_error.Scene
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    private String scene;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account_error.id
     *
     * @return the value of t_account_error.id
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account_error.id
     *
     * @param id the value for t_account_error.id
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account_error.user_id
     *
     * @return the value of t_account_error.user_id
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account_error.user_id
     *
     * @param userId the value for t_account_error.user_id
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account_error.total
     *
     * @return the value of t_account_error.total
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account_error.total
     *
     * @param total the value for t_account_error.total
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account_error.p2p_netvalue
     *
     * @return the value of t_account_error.p2p_netvalue
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public BigDecimal getP2pNetvalue() {
        return p2pNetvalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account_error.p2p_netvalue
     *
     * @param p2pNetvalue the value for t_account_error.p2p_netvalue
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public void setP2pNetvalue(BigDecimal p2pNetvalue) {
        this.p2pNetvalue = p2pNetvalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account_error.p2p_use_money
     *
     * @return the value of t_account_error.p2p_use_money
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public BigDecimal getP2pUseMoney() {
        return p2pUseMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account_error.p2p_use_money
     *
     * @param p2pUseMoney the value for t_account_error.p2p_use_money
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public void setP2pUseMoney(BigDecimal p2pUseMoney) {
        this.p2pUseMoney = p2pUseMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account_error.p2p_no_use_money
     *
     * @return the value of t_account_error.p2p_no_use_money
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public BigDecimal getP2pNoUseMoney() {
        return p2pNoUseMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account_error.p2p_no_use_money
     *
     * @param p2pNoUseMoney the value for t_account_error.p2p_no_use_money
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public void setP2pNoUseMoney(BigDecimal p2pNoUseMoney) {
        this.p2pNoUseMoney = p2pNoUseMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account_error.p2p_collection
     *
     * @return the value of t_account_error.p2p_collection
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public BigDecimal getP2pCollection() {
        return p2pCollection;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account_error.p2p_collection
     *
     * @param p2pCollection the value for t_account_error.p2p_collection
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public void setP2pCollection(BigDecimal p2pCollection) {
        this.p2pCollection = p2pCollection;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account_error.p2p_FIRST_BORROW_USE_MONEY
     *
     * @return the value of t_account_error.p2p_FIRST_BORROW_USE_MONEY
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public BigDecimal getP2pFirstBorrowUseMoney() {
        return p2pFirstBorrowUseMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account_error.p2p_FIRST_BORROW_USE_MONEY
     *
     * @param p2pFirstBorrowUseMoney the value for t_account_error.p2p_FIRST_BORROW_USE_MONEY
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public void setP2pFirstBorrowUseMoney(BigDecimal p2pFirstBorrowUseMoney) {
        this.p2pFirstBorrowUseMoney = p2pFirstBorrowUseMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account_error.p2p_VERSION
     *
     * @return the value of t_account_error.p2p_VERSION
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public Integer getP2pVersion() {
        return p2pVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account_error.p2p_VERSION
     *
     * @param p2pVersion the value for t_account_error.p2p_VERSION
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public void setP2pVersion(Integer p2pVersion) {
        this.p2pVersion = p2pVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account_error.p2p_DRAW_MONEY
     *
     * @return the value of t_account_error.p2p_DRAW_MONEY
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public BigDecimal getP2pDrawMoney() {
        return p2pDrawMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account_error.p2p_DRAW_MONEY
     *
     * @param p2pDrawMoney the value for t_account_error.p2p_DRAW_MONEY
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public void setP2pDrawMoney(BigDecimal p2pDrawMoney) {
        this.p2pDrawMoney = p2pDrawMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account_error.p2p_NO_DRAW_MONEY
     *
     * @return the value of t_account_error.p2p_NO_DRAW_MONEY
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public BigDecimal getP2pNoDrawMoney() {
        return p2pNoDrawMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account_error.p2p_NO_DRAW_MONEY
     *
     * @param p2pNoDrawMoney the value for t_account_error.p2p_NO_DRAW_MONEY
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public void setP2pNoDrawMoney(BigDecimal p2pNoDrawMoney) {
        this.p2pNoDrawMoney = p2pNoDrawMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account_error.zs_e_use_money
     *
     * @return the value of t_account_error.zs_e_use_money
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public BigDecimal getZsEUseMoney() {
        return zsEUseMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account_error.zs_e_use_money
     *
     * @param zsEUseMoney the value for t_account_error.zs_e_use_money
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public void setZsEUseMoney(BigDecimal zsEUseMoney) {
        this.zsEUseMoney = zsEUseMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account_error.zs_e_freeze_money
     *
     * @return the value of t_account_error.zs_e_freeze_money
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public BigDecimal getZsEFreezeMoney() {
        return zsEFreezeMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account_error.zs_e_freeze_money
     *
     * @param zsEFreezeMoney the value for t_account_error.zs_e_freeze_money
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public void setZsEFreezeMoney(BigDecimal zsEFreezeMoney) {
        this.zsEFreezeMoney = zsEFreezeMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account_error.zs_withdrawAmount
     *
     * @return the value of t_account_error.zs_withdrawAmount
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public BigDecimal getZsWithdrawamount() {
        return zsWithdrawamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account_error.zs_withdrawAmount
     *
     * @param zsWithdrawamount the value for t_account_error.zs_withdrawAmount
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public void setZsWithdrawamount(BigDecimal zsWithdrawamount) {
        this.zsWithdrawamount = zsWithdrawamount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account_error.STATUS
     *
     * @return the value of t_account_error.STATUS
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account_error.STATUS
     *
     * @param status the value for t_account_error.STATUS
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account_error.dispose_user
     *
     * @return the value of t_account_error.dispose_user
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public Integer getDisposeUser() {
        return disposeUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account_error.dispose_user
     *
     * @param disposeUser the value for t_account_error.dispose_user
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public void setDisposeUser(Integer disposeUser) {
        this.disposeUser = disposeUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account_error.dispose_time
     *
     * @return the value of t_account_error.dispose_time
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public Date getDisposeTime() {
        return disposeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account_error.dispose_time
     *
     * @param disposeTime the value for t_account_error.dispose_time
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public void setDisposeTime(Date disposeTime) {
        this.disposeTime = disposeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account_error.dispose_remark
     *
     * @return the value of t_account_error.dispose_remark
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public String getDisposeRemark() {
        return disposeRemark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account_error.dispose_remark
     *
     * @param disposeRemark the value for t_account_error.dispose_remark
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public void setDisposeRemark(String disposeRemark) {
        this.disposeRemark = disposeRemark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account_error.ADDTIME
     *
     * @return the value of t_account_error.ADDTIME
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public Date getAddtime() {
        return addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account_error.ADDTIME
     *
     * @param addtime the value for t_account_error.ADDTIME
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account_error.ADDIP
     *
     * @return the value of t_account_error.ADDIP
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public String getAddip() {
        return addip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account_error.ADDIP
     *
     * @param addip the value for t_account_error.ADDIP
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public void setAddip(String addip) {
        this.addip = addip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account_error.PLATFORM
     *
     * @return the value of t_account_error.PLATFORM
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public Integer getPlatform() {
        return platform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account_error.PLATFORM
     *
     * @param platform the value for t_account_error.PLATFORM
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public void setPlatform(Integer platform) {
        this.platform = platform;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_account_error.Scene
     *
     * @return the value of t_account_error.Scene
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public String getScene() {
        return scene;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_account_error.Scene
     *
     * @param scene the value for t_account_error.Scene
     *
     * @mbggenerated Fri May 20 09:37:40 CST 2016
     */
    public void setScene(String scene) {
        this.scene = scene;
    }

	public BigDecimal getP2peUseMoney() {
		return p2peUseMoney;
	}

	public void setP2peUseMoney(BigDecimal p2peUseMoney) {
		this.p2peUseMoney = p2peUseMoney;
	}

	public BigDecimal getP2peNoUseMoney() {
		return p2peNoUseMoney;
	}

	public void setP2peNoUseMoney(BigDecimal p2peNoUseMoney) {
		this.p2peNoUseMoney = p2peNoUseMoney;
	}

	public BigDecimal getP2peCollection() {
		return p2peCollection;
	}

	public void setP2peCollection(BigDecimal p2peCollection) {
		this.p2peCollection = p2peCollection;
	}
    
    
    
}