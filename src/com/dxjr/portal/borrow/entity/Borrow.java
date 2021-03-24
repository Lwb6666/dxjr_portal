package com.dxjr.portal.borrow.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Borrow {
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.ID
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private Integer id;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.USER_ID
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private Integer userId;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.NAME
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private String name;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.STATUS
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private Integer status;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.APPRSTATUS
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private Integer apprstatus;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.ORDER
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private Integer order;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.BORROWTYPE
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private Integer borrowtype;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.REPAYMENT_ACCOUNT
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private BigDecimal repaymentAccount;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.MONTHLY_REPAYMENT
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private BigDecimal monthlyRepayment;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.REPAYMENT_YESACCOUNT
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private BigDecimal repaymentYesaccount;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.REPAYMENT_YESINTEREST
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private BigDecimal repaymentYesinterest;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.SUCCESS_TIME
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private String successTime;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.END_TIME
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private String endTime;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.USE
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private String use;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.TIME_LIMIT
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private Integer timeLimit;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.STYLE
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private Integer style;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.ACCOUNT
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private BigDecimal account;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.ACCOUNT_YES
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private BigDecimal accountYes;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.TENDER_TIMES
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private Integer tenderTimes;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.APR
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private BigDecimal apr;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.LOWEST_ACCOUNT
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private BigDecimal lowestAccount;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.MOST_ACCOUNT
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private BigDecimal mostAccount;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.VALID_TIME
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private Integer validTime;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.AWARD
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private Integer award;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.FUNDS
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private BigDecimal funds;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.CONTENT
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private String content;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.SENDMESSAGE
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private Integer sendmessage;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.ADDTIME
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private Date addtime;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.ADDIP
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private String addip;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.CANCEL_USER
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private Integer cancelUser;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.CANCEL_TIME
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private String cancelTime;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.CANCEL_REMARK
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private String cancelRemark;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.UUID
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private String uuid;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.CONTRACT_NO
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private String contractNo;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.BID_PASSWORD
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private String bidPassword;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.IS_AUTOTENDER
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private Integer isAutotender;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.REMARK
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private String remark;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.PLEDGE_TYPE
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private Integer pledgeType;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.TIMING_BORROW_TIME
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private String timingBorrowTime;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to
	 * the database column rocky_borrow.PUBLISH_TIME
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	private String publishTime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column rocky_borrow.ID
	 * 
	 * @return the value of rocky_borrow.ID
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */

	/** 进度 */
	private BigDecimal schedule;

	private String scheduleStr;

	private String accountStr;

	private String statusStr;

	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column rocky_borrow.ID
	 * 
	 * @param id
	 *            the value for rocky_borrow.ID
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column rocky_borrow.USER_ID
	 * 
	 * @return the value of rocky_borrow.USER_ID
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column rocky_borrow.USER_ID
	 * 
	 * @param userId
	 *            the value for rocky_borrow.USER_ID
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column rocky_borrow.NAME
	 * 
	 * @return the value of rocky_borrow.NAME
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column rocky_borrow.NAME
	 * 
	 * @param name
	 *            the value for rocky_borrow.NAME
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column rocky_borrow.STATUS
	 * 
	 * @return the value of rocky_borrow.STATUS
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column rocky_borrow.STATUS
	 * 
	 * @param status
	 *            the value for rocky_borrow.STATUS
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column rocky_borrow.APPRSTATUS
	 * 
	 * @return the value of rocky_borrow.APPRSTATUS
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public Integer getApprstatus() {
		return apprstatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column rocky_borrow.APPRSTATUS
	 * 
	 * @param apprstatus
	 *            the value for rocky_borrow.APPRSTATUS
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public void setApprstatus(Integer apprstatus) {
		this.apprstatus = apprstatus;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column rocky_borrow.ORDER
	 * 
	 * @return the value of rocky_borrow.ORDER
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public Integer getOrder() {
		return order;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column rocky_borrow.ORDER
	 * 
	 * @param order
	 *            the value for rocky_borrow.ORDER
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public void setOrder(Integer order) {
		this.order = order;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column rocky_borrow.BORROWTYPE
	 * 
	 * @return the value of rocky_borrow.BORROWTYPE
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public Integer getBorrowtype() {
		return borrowtype;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column rocky_borrow.BORROWTYPE
	 * 
	 * @param borrowtype
	 *            the value for rocky_borrow.BORROWTYPE
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public void setBorrowtype(Integer borrowtype) {
		this.borrowtype = borrowtype;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column rocky_borrow.REPAYMENT_ACCOUNT
	 * 
	 * @return the value of rocky_borrow.REPAYMENT_ACCOUNT
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public BigDecimal getRepaymentAccount() {
		return repaymentAccount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column rocky_borrow.REPAYMENT_ACCOUNT
	 * 
	 * @param repaymentAccount
	 *            the value for rocky_borrow.REPAYMENT_ACCOUNT
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public void setRepaymentAccount(BigDecimal repaymentAccount) {
		this.repaymentAccount = repaymentAccount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column rocky_borrow.MONTHLY_REPAYMENT
	 * 
	 * @return the value of rocky_borrow.MONTHLY_REPAYMENT
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public BigDecimal getMonthlyRepayment() {
		return monthlyRepayment;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column rocky_borrow.MONTHLY_REPAYMENT
	 * 
	 * @param monthlyRepayment
	 *            the value for rocky_borrow.MONTHLY_REPAYMENT
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public void setMonthlyRepayment(BigDecimal monthlyRepayment) {
		this.monthlyRepayment = monthlyRepayment;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column rocky_borrow.REPAYMENT_YESACCOUNT
	 * 
	 * @return the value of rocky_borrow.REPAYMENT_YESACCOUNT
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public BigDecimal getRepaymentYesaccount() {
		return repaymentYesaccount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column rocky_borrow.REPAYMENT_YESACCOUNT
	 * 
	 * @param repaymentYesaccount
	 *            the value for rocky_borrow.REPAYMENT_YESACCOUNT
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public void setRepaymentYesaccount(BigDecimal repaymentYesaccount) {
		this.repaymentYesaccount = repaymentYesaccount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column rocky_borrow.REPAYMENT_YESINTEREST
	 * 
	 * @return the value of rocky_borrow.REPAYMENT_YESINTEREST
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public BigDecimal getRepaymentYesinterest() {
		return repaymentYesinterest;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column rocky_borrow.REPAYMENT_YESINTEREST
	 * 
	 * @param repaymentYesinterest
	 *            the value for rocky_borrow.REPAYMENT_YESINTEREST
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public void setRepaymentYesinterest(BigDecimal repaymentYesinterest) {
		this.repaymentYesinterest = repaymentYesinterest;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column rocky_borrow.USE
	 * 
	 * @return the value of rocky_borrow.USE
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public String getUse() {
		return use;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column rocky_borrow.USE
	 * 
	 * @param use
	 *            the value for rocky_borrow.USE
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public void setUse(String use) {
		this.use = use;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column rocky_borrow.TIME_LIMIT
	 * 
	 * @return the value of rocky_borrow.TIME_LIMIT
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public Integer getTimeLimit() {
		return timeLimit;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column rocky_borrow.TIME_LIMIT
	 * 
	 * @param timeLimit
	 *            the value for rocky_borrow.TIME_LIMIT
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public void setTimeLimit(Integer timeLimit) {
		this.timeLimit = timeLimit;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column rocky_borrow.STYLE
	 * 
	 * @return the value of rocky_borrow.STYLE
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public Integer getStyle() {
		return style;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column rocky_borrow.STYLE
	 * 
	 * @param style
	 *            the value for rocky_borrow.STYLE
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public void setStyle(Integer style) {
		this.style = style;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column rocky_borrow.ACCOUNT
	 * 
	 * @return the value of rocky_borrow.ACCOUNT
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public BigDecimal getAccount() {
		return account;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column rocky_borrow.ACCOUNT
	 * 
	 * @param account
	 *            the value for rocky_borrow.ACCOUNT
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public void setAccount(BigDecimal account) {
		this.account = account;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column rocky_borrow.ACCOUNT_YES
	 * 
	 * @return the value of rocky_borrow.ACCOUNT_YES
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public BigDecimal getAccountYes() {
		return accountYes;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column rocky_borrow.ACCOUNT_YES
	 * 
	 * @param accountYes
	 *            the value for rocky_borrow.ACCOUNT_YES
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public void setAccountYes(BigDecimal accountYes) {
		this.accountYes = accountYes;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column rocky_borrow.TENDER_TIMES
	 * 
	 * @return the value of rocky_borrow.TENDER_TIMES
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public Integer getTenderTimes() {
		return tenderTimes;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column rocky_borrow.TENDER_TIMES
	 * 
	 * @param tenderTimes
	 *            the value for rocky_borrow.TENDER_TIMES
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public void setTenderTimes(Integer tenderTimes) {
		this.tenderTimes = tenderTimes;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column rocky_borrow.APR
	 * 
	 * @return the value of rocky_borrow.APR
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public BigDecimal getApr() {
		return apr;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column rocky_borrow.APR
	 * 
	 * @param apr
	 *            the value for rocky_borrow.APR
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public void setApr(BigDecimal apr) {
		this.apr = apr;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column rocky_borrow.LOWEST_ACCOUNT
	 * 
	 * @return the value of rocky_borrow.LOWEST_ACCOUNT
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public BigDecimal getLowestAccount() {
		return lowestAccount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column rocky_borrow.LOWEST_ACCOUNT
	 * 
	 * @param lowestAccount
	 *            the value for rocky_borrow.LOWEST_ACCOUNT
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public void setLowestAccount(BigDecimal lowestAccount) {
		this.lowestAccount = lowestAccount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column rocky_borrow.MOST_ACCOUNT
	 * 
	 * @return the value of rocky_borrow.MOST_ACCOUNT
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public BigDecimal getMostAccount() {
		return mostAccount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column rocky_borrow.MOST_ACCOUNT
	 * 
	 * @param mostAccount
	 *            the value for rocky_borrow.MOST_ACCOUNT
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public void setMostAccount(BigDecimal mostAccount) {
		this.mostAccount = mostAccount;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column rocky_borrow.VALID_TIME
	 * 
	 * @return the value of rocky_borrow.VALID_TIME
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public Integer getValidTime() {
		return validTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column rocky_borrow.VALID_TIME
	 * 
	 * @param validTime
	 *            the value for rocky_borrow.VALID_TIME
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public void setValidTime(Integer validTime) {
		this.validTime = validTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column rocky_borrow.AWARD
	 * 
	 * @return the value of rocky_borrow.AWARD
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public Integer getAward() {
		return award;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column rocky_borrow.AWARD
	 * 
	 * @param award
	 *            the value for rocky_borrow.AWARD
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public void setAward(Integer award) {
		this.award = award;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column rocky_borrow.FUNDS
	 * 
	 * @return the value of rocky_borrow.FUNDS
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public BigDecimal getFunds() {
		return funds;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column rocky_borrow.FUNDS
	 * 
	 * @param funds
	 *            the value for rocky_borrow.FUNDS
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public void setFunds(BigDecimal funds) {
		this.funds = funds;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column rocky_borrow.CONTENT
	 * 
	 * @return the value of rocky_borrow.CONTENT
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public String getContent() {
		return content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column rocky_borrow.CONTENT
	 * 
	 * @param content
	 *            the value for rocky_borrow.CONTENT
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column rocky_borrow.SENDMESSAGE
	 * 
	 * @return the value of rocky_borrow.SENDMESSAGE
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public Integer getSendmessage() {
		return sendmessage;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column rocky_borrow.SENDMESSAGE
	 * 
	 * @param sendmessage
	 *            the value for rocky_borrow.SENDMESSAGE
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public void setSendmessage(Integer sendmessage) {
		this.sendmessage = sendmessage;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column rocky_borrow.ADDIP
	 * 
	 * @return the value of rocky_borrow.ADDIP
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public String getAddip() {
		return addip;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column rocky_borrow.ADDIP
	 * 
	 * @param addip
	 *            the value for rocky_borrow.ADDIP
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public void setAddip(String addip) {
		this.addip = addip;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column rocky_borrow.CANCEL_USER
	 * 
	 * @return the value of rocky_borrow.CANCEL_USER
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public Integer getCancelUser() {
		return cancelUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column rocky_borrow.CANCEL_USER
	 * 
	 * @param cancelUser
	 *            the value for rocky_borrow.CANCEL_USER
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public void setCancelUser(Integer cancelUser) {
		this.cancelUser = cancelUser;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column rocky_borrow.CANCEL_TIME
	 * 
	 * @return the value of rocky_borrow.CANCEL_TIME
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public String getCancelTime() {
		return cancelTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column rocky_borrow.CANCEL_TIME
	 * 
	 * @param cancelTime
	 *            the value for rocky_borrow.CANCEL_TIME
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public void setCancelTime(String cancelTime) {
		this.cancelTime = cancelTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column rocky_borrow.CANCEL_REMARK
	 * 
	 * @return the value of rocky_borrow.CANCEL_REMARK
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public String getCancelRemark() {
		return cancelRemark;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column rocky_borrow.CANCEL_REMARK
	 * 
	 * @param cancelRemark
	 *            the value for rocky_borrow.CANCEL_REMARK
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public void setCancelRemark(String cancelRemark) {
		this.cancelRemark = cancelRemark;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column rocky_borrow.UUID
	 * 
	 * @return the value of rocky_borrow.UUID
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public String getUuid() {
		return uuid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column rocky_borrow.UUID
	 * 
	 * @param uuid
	 *            the value for rocky_borrow.UUID
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column rocky_borrow.CONTRACT_NO
	 * 
	 * @return the value of rocky_borrow.CONTRACT_NO
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public String getContractNo() {
		return contractNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column rocky_borrow.CONTRACT_NO
	 * 
	 * @param contractNo
	 *            the value for rocky_borrow.CONTRACT_NO
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column rocky_borrow.BID_PASSWORD
	 * 
	 * @return the value of rocky_borrow.BID_PASSWORD
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public String getBidPassword() {
		return bidPassword;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column rocky_borrow.BID_PASSWORD
	 * 
	 * @param bidPassword
	 *            the value for rocky_borrow.BID_PASSWORD
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public void setBidPassword(String bidPassword) {
		this.bidPassword = bidPassword;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column rocky_borrow.IS_AUTOTENDER
	 * 
	 * @return the value of rocky_borrow.IS_AUTOTENDER
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public Integer getIsAutotender() {
		return isAutotender;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column rocky_borrow.IS_AUTOTENDER
	 * 
	 * @param isAutotender
	 *            the value for rocky_borrow.IS_AUTOTENDER
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public void setIsAutotender(Integer isAutotender) {
		this.isAutotender = isAutotender;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column rocky_borrow.REMARK
	 * 
	 * @return the value of rocky_borrow.REMARK
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column rocky_borrow.REMARK
	 * 
	 * @param remark
	 *            the value for rocky_borrow.REMARK
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column rocky_borrow.PLEDGE_TYPE
	 * 
	 * @return the value of rocky_borrow.PLEDGE_TYPE
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public Integer getPledgeType() {
		return pledgeType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column rocky_borrow.PLEDGE_TYPE
	 * 
	 * @param pledgeType
	 *            the value for rocky_borrow.PLEDGE_TYPE
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public void setPledgeType(Integer pledgeType) {
		this.pledgeType = pledgeType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column rocky_borrow.TIMING_BORROW_TIME
	 * 
	 * @return the value of rocky_borrow.TIMING_BORROW_TIME
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public String getTimingBorrowTime() {
		return timingBorrowTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column rocky_borrow.TIMING_BORROW_TIME
	 * 
	 * @param timingBorrowTime
	 *            the value for rocky_borrow.TIMING_BORROW_TIME
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public void setTimingBorrowTime(String timingBorrowTime) {
		this.timingBorrowTime = timingBorrowTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the
	 * value of the database column rocky_borrow.PUBLISH_TIME
	 * 
	 * @return the value of rocky_borrow.PUBLISH_TIME
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public String getPublishTime() {
		return publishTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the
	 * value of the database column rocky_borrow.PUBLISH_TIME
	 * 
	 * @param publishTime
	 *            the value for rocky_borrow.PUBLISH_TIME
	 * 
	 * @mbggenerated Tue Apr 22 17:10:29 CST 2014
	 */
	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}

	public String getSuccessTime() {
		return successTime;
	}

	public void setSuccessTime(String successTime) {
		this.successTime = successTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Date getAddtime() {
		return addtime;
	}

	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	@Override
	public String toString() {
		return "Borrow [id=" + id + ", userId=" + userId + ", name=" + name
				+ ", status=" + status + ", apprstatus=" + apprstatus
				+ ", order=" + order + ", borrowtype=" + borrowtype
				+ ", repaymentAccount=" + repaymentAccount
				+ ", monthlyRepayment=" + monthlyRepayment
				+ ", repaymentYesaccount=" + repaymentYesaccount
				+ ", repaymentYesinterest=" + repaymentYesinterest
				+ ", successTime=" + successTime + ", endTime=" + endTime
				+ ", use=" + use + ", timeLimit=" + timeLimit + ", style="
				+ style + ", account=" + account + ", accountYes=" + accountYes
				+ ", tenderTimes=" + tenderTimes + ", apr=" + apr
				+ ", lowestAccount=" + lowestAccount + ", mostAccount="
				+ mostAccount + ", validTime=" + validTime + ", award=" + award
				+ ", funds=" + funds + ", content=" + content
				+ ", sendmessage=" + sendmessage + ", addtime=" + addtime
				+ ", addip=" + addip + ", cancelUser=" + cancelUser
				+ ", cancelTime=" + cancelTime + ", cancelRemark="
				+ cancelRemark + ", uuid=" + uuid + ", contractNo="
				+ contractNo + ", bidPassword=" + bidPassword
				+ ", isAutotender=" + isAutotender + ", remark=" + remark
				+ ", pledgeType=" + pledgeType + ", timingBorrowTime="
				+ timingBorrowTime + ", publishTime=" + publishTime + "]";
	}

	public BigDecimal getSchedule() {
		return schedule;
	}

	public void setSchedule(BigDecimal schedule) {
		this.schedule = schedule;
	}

	public String getScheduleStr() {
		return scheduleStr;
	}

	public void setScheduleStr(String scheduleStr) {
		this.scheduleStr = scheduleStr;
	}

	public String getAccountStr() {
		return accountStr;
	}

	public void setAccountStr(String accountStr) {
		this.accountStr = accountStr;
	}

	public String getStatusStr() {
		return statusStr;
	}

	public void setStatusStr(String statusStr) {
		this.statusStr = statusStr;
	}

}