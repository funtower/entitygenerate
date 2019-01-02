package com.funtower.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class GuarantyBaseInfo implements Serializable{
    private static final long serialVersionUID = 1L;

    /** 押品编号 */
    private String guarantyNo;

    /** 押品名称 */
    private String guarantyName;

    /** 参见代码表“担保品类型代码” */
    private String collateralTypeCd;

    /** 引用“参与人.参与人ID”。标识担保人。 */
    private String guarantorPartyId;

    /** 客户编号 */
    private String customerNum;

    /** 参见代码表“币种代码” */
    private String currencyCd;

    /** 押品原值 */
    private java.math.BigDecimal bookValue;

    /** null */
    private java.math.BigDecimal bookNetValue;

    /** null */
    private java.math.BigDecimal marketValue;

    /** null */
    private String evalValueCurrCd;

    /** 外部评估价值 */
    private java.math.BigDecimal evalValue;

    /** null */
    private String bankAssessedCurrCd;

    /** 我行确认价值（元） */
    private java.math.BigDecimal bankAssessedValue;

    /** 参见代码表“抵质押物状态代码”（现用于补录：补录状态1-待补录2-已补录） */
    private String collateralStatusCd;

    /** 参见“抵质押物处置”复选指示器（现用于补录：补录数据没有主权证-1） */
    private String collateralDispose;

    /** 参见复选指示器代码表“抵质押物取得途径” */
    private String acquireWayCd;

    /** 是否有共有人 */
    private String commonAssetsInd;

    /** 押品共有人名称 */
    private String commonOwnerName;

    /** 参见代码表“担保权设定生效方式代码” */
    private String effectiveWayCd;

    /** 他行是否已设定抵押 */
    private String collateralSetupInd;

    /** （默认人民币） */
    private java.math.BigDecimal setGuarantyAmt;

    /** 是否租赁或已设定他人使用 */
    private String rentedLicensedInd;

    /** null */
    private String renterName;

    /** 租赁到期日期 */
    private String leaseExpirationDate;

    /** 其他说明 */
    private String otherNote;

    /** 呈报日期 */
    private String submittingDate;

    /** 国家 */
    private String nationalityCd;

    /** 参见“行政区域代码” */
    private String provinceCd;

    /** 参见“行政区域代码” */
    private String cityCd;

    /** 参见“行政区域代码” */
    private String districtCd;

    /** 座落地址 */
    private String streetAddress;

    /** null */
    private String merchandiseType;

    /** null */
    private String rightCertTypeCd;

    /** null */
    private String rightCertificationNum;

    /** null */
    private java.math.BigDecimal setGuarantyAmtInBank;

    /** 他行已设定担保额 */
    private java.math.BigDecimal setGuarantyAmtOutBank;

    /** 抵质押物分类,标准代码 */
    private String collateralCatalogCd;

    /** null */
    private String collateralKeeper;

    /** null */
    private String storeDate;

    /** null */
    private String keepBranch;

    /** null */
    private String dataCreatUserNum;

    /** null */
    private String dataCreatorOrgCd;

    /** null */
    private String lastUpdateUserNum;

    /** null */
    private String lastUpdateOrgCd;

    /** 是否可转让 */
    private String takeoverInd;

    /** null */
    private String allPledgeInd;

    /** null */
    private String forbidCirculateInd;

    /** null */
    private String nationalisationInd;

    /** 所有权是否有争议 */
    private String propertyDisputedInd;

    /** 是否被查封、监管、扣押 */
    private String invalidInd;

    /** 是否存在瑕疵 */
    private String blemishInd;

    /** 瑕疵情况 */
    private String blemishInfo;

    /** 移交占有时间 */
    private String handoverDate;

    /** 保管特殊要求 */
    private String keepSpecialReq;

    /** 见“抵质押品优先受偿权代码” */
    private String creditorPriority;

    /** 次顺位债权时使用 */
    private java.math.BigDecimal preCreditorAmt;

    /** 见“机构代码” */
    private String belongOrgCd;

    /** 见“押品信息状态代码” */
    private String collateralInfoStatusCd;

    /** 创建日期 */
    private String collateralCreateDate;

    /** 参见代码表“抵质押物评估类型代码” */
    private String evalTypeCd;

    /** 权证是否完整 */
    private String indCertiFull;

    /** 权证不完事的原因 */
    private String certiNotFullCause;

    /** 系统更新时间 */
    private String sysUpdateTime;

    /** 月租金 */
    private java.math.BigDecimal monthRenk;

    /** 客户名称：抵质押人 */
    private String customerName;

    /** 是否为我行认可押品 */
    private String isConfirmed;

    /** 是否暂存 */
    private String isTmpSave;

    /** 登记人 */
    private String manageUser;

    /** 是否走追加流程（0-不走追加流程，1-走追加流程） */
    private String isAddProcess;

    /** 押品所属条线编号 */
    private String belongStriplineNo;

    /** 登记人所属机构 */
    private String manageOrgCd;

    /** 权证预计办妥日期 */
    private String certiPlanCompletedDate;

    /** 押品性质 */
    private String guarantyTypeCd;

    /** 是否属于主申请人 */
    private String isBelongMainApplicant;

    /** 系统标识（对公信贷系统0，个贷系统1） */
    private String systemSign;

    /** 借款人 */
    private String loanUser;

    /** 押品抵质押率：区别业务抵质押率（我行确认价/nvl(外部评估,1)） */
    private java.math.BigDecimal guarantyPledgeRate;

    /** 最高抵质押金额（元） */
    private java.math.BigDecimal highestGuarantyValue;

    /** 抵质押折扣率 */
    private java.math.BigDecimal guarantyDiscountRate;

    /** 抵质押人证件类型 */
    private String certType;

    /** 抵质押人证件号码 */
    private String certCode;

    /** 是否共享权证押品 */
    private String isShare;

    /** 共享权证押品编号 */
    private String shareGuarantyNo;

    /** 核保人1 */
    private String underwriter1;

    /** 核保人2 */
    private String underwriter2;

    /** 抵质押物法律有效性 */
    private String limitsIegalvalidity;

    /** 抵质押物保险情况 */
    private String limitsInsurance;

    /** 抵质押物价值波动性 */
    private String limitsValuevolatility;

    /** 抵质押物查封便利性 */
    private String limitsSeizureconvenience;

    /** 抵质押物变现能力 */
    private String limitsCashability;

    /** 抵质押物与借款人相关性 */
    private String limitsBorrower;

    /** 客户经理联系电话 */
    private String managerPhone;

    /** 关联续贷业务标识 */
    private String isRelation;

    /** 关联续贷押品编号 */
    private String oldGuarantyNo;

    /** 数据来源 */
    private String dataSource;


    public GuarantyBaseInfo() {

    }

    public String getGuarantyNo() {
        return guarantyNo;
    }

    public void setGuarantyNo(String guarantyNo) {
        this.guarantyNo = guarantyNo;
    }

    public String getGuarantyName() {
        return guarantyName;
    }

    public void setGuarantyName(String guarantyName) {
        this.guarantyName = guarantyName;
    }

    public String getCollateralTypeCd() {
        return collateralTypeCd;
    }

    public void setCollateralTypeCd(String collateralTypeCd) {
        this.collateralTypeCd = collateralTypeCd;
    }

    public String getGuarantorPartyId() {
        return guarantorPartyId;
    }

    public void setGuarantorPartyId(String guarantorPartyId) {
        this.guarantorPartyId = guarantorPartyId;
    }

    public String getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(String customerNum) {
        this.customerNum = customerNum;
    }

    public String getCurrencyCd() {
        return currencyCd;
    }

    public void setCurrencyCd(String currencyCd) {
        this.currencyCd = currencyCd;
    }

    public java.math.BigDecimal getBookValue() {
        return bookValue;
    }

    public void setBookValue(java.math.BigDecimal bookValue) {
        this.bookValue = bookValue;
    }

    public java.math.BigDecimal getBookNetValue() {
        return bookNetValue;
    }

    public void setBookNetValue(java.math.BigDecimal bookNetValue) {
        this.bookNetValue = bookNetValue;
    }

    public java.math.BigDecimal getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(java.math.BigDecimal marketValue) {
        this.marketValue = marketValue;
    }

    public String getEvalValueCurrCd() {
        return evalValueCurrCd;
    }

    public void setEvalValueCurrCd(String evalValueCurrCd) {
        this.evalValueCurrCd = evalValueCurrCd;
    }

    public java.math.BigDecimal getEvalValue() {
        return evalValue;
    }

    public void setEvalValue(java.math.BigDecimal evalValue) {
        this.evalValue = evalValue;
    }

    public String getBankAssessedCurrCd() {
        return bankAssessedCurrCd;
    }

    public void setBankAssessedCurrCd(String bankAssessedCurrCd) {
        this.bankAssessedCurrCd = bankAssessedCurrCd;
    }

    public java.math.BigDecimal getBankAssessedValue() {
        return bankAssessedValue;
    }

    public void setBankAssessedValue(java.math.BigDecimal bankAssessedValue) {
        this.bankAssessedValue = bankAssessedValue;
    }

    public String getCollateralStatusCd() {
        return collateralStatusCd;
    }

    public void setCollateralStatusCd(String collateralStatusCd) {
        this.collateralStatusCd = collateralStatusCd;
    }

    public String getCollateralDispose() {
        return collateralDispose;
    }

    public void setCollateralDispose(String collateralDispose) {
        this.collateralDispose = collateralDispose;
    }

    public String getAcquireWayCd() {
        return acquireWayCd;
    }

    public void setAcquireWayCd(String acquireWayCd) {
        this.acquireWayCd = acquireWayCd;
    }

    public String getCommonAssetsInd() {
        return commonAssetsInd;
    }

    public void setCommonAssetsInd(String commonAssetsInd) {
        this.commonAssetsInd = commonAssetsInd;
    }

    public String getCommonOwnerName() {
        return commonOwnerName;
    }

    public void setCommonOwnerName(String commonOwnerName) {
        this.commonOwnerName = commonOwnerName;
    }

    public String getEffectiveWayCd() {
        return effectiveWayCd;
    }

    public void setEffectiveWayCd(String effectiveWayCd) {
        this.effectiveWayCd = effectiveWayCd;
    }

    public String getCollateralSetupInd() {
        return collateralSetupInd;
    }

    public void setCollateralSetupInd(String collateralSetupInd) {
        this.collateralSetupInd = collateralSetupInd;
    }

    public java.math.BigDecimal getSetGuarantyAmt() {
        return setGuarantyAmt;
    }

    public void setSetGuarantyAmt(java.math.BigDecimal setGuarantyAmt) {
        this.setGuarantyAmt = setGuarantyAmt;
    }

    public String getRentedLicensedInd() {
        return rentedLicensedInd;
    }

    public void setRentedLicensedInd(String rentedLicensedInd) {
        this.rentedLicensedInd = rentedLicensedInd;
    }

    public String getRenterName() {
        return renterName;
    }

    public void setRenterName(String renterName) {
        this.renterName = renterName;
    }

    public String getLeaseExpirationDate() {
        return leaseExpirationDate;
    }

    public void setLeaseExpirationDate(String leaseExpirationDate) {
        this.leaseExpirationDate = leaseExpirationDate;
    }

    public String getOtherNote() {
        return otherNote;
    }

    public void setOtherNote(String otherNote) {
        this.otherNote = otherNote;
    }

    public String getSubmittingDate() {
        return submittingDate;
    }

    public void setSubmittingDate(String submittingDate) {
        this.submittingDate = submittingDate;
    }

    public String getNationalityCd() {
        return nationalityCd;
    }

    public void setNationalityCd(String nationalityCd) {
        this.nationalityCd = nationalityCd;
    }

    public String getProvinceCd() {
        return provinceCd;
    }

    public void setProvinceCd(String provinceCd) {
        this.provinceCd = provinceCd;
    }

    public String getCityCd() {
        return cityCd;
    }

    public void setCityCd(String cityCd) {
        this.cityCd = cityCd;
    }

    public String getDistrictCd() {
        return districtCd;
    }

    public void setDistrictCd(String districtCd) {
        this.districtCd = districtCd;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getMerchandiseType() {
        return merchandiseType;
    }

    public void setMerchandiseType(String merchandiseType) {
        this.merchandiseType = merchandiseType;
    }

    public String getRightCertTypeCd() {
        return rightCertTypeCd;
    }

    public void setRightCertTypeCd(String rightCertTypeCd) {
        this.rightCertTypeCd = rightCertTypeCd;
    }

    public String getRightCertificationNum() {
        return rightCertificationNum;
    }

    public void setRightCertificationNum(String rightCertificationNum) {
        this.rightCertificationNum = rightCertificationNum;
    }

    public java.math.BigDecimal getSetGuarantyAmtInBank() {
        return setGuarantyAmtInBank;
    }

    public void setSetGuarantyAmtInBank(java.math.BigDecimal setGuarantyAmtInBank) {
        this.setGuarantyAmtInBank = setGuarantyAmtInBank;
    }

    public java.math.BigDecimal getSetGuarantyAmtOutBank() {
        return setGuarantyAmtOutBank;
    }

    public void setSetGuarantyAmtOutBank(java.math.BigDecimal setGuarantyAmtOutBank) {
        this.setGuarantyAmtOutBank = setGuarantyAmtOutBank;
    }

    public String getCollateralCatalogCd() {
        return collateralCatalogCd;
    }

    public void setCollateralCatalogCd(String collateralCatalogCd) {
        this.collateralCatalogCd = collateralCatalogCd;
    }

    public String getCollateralKeeper() {
        return collateralKeeper;
    }

    public void setCollateralKeeper(String collateralKeeper) {
        this.collateralKeeper = collateralKeeper;
    }

    public String getStoreDate() {
        return storeDate;
    }

    public void setStoreDate(String storeDate) {
        this.storeDate = storeDate;
    }

    public String getKeepBranch() {
        return keepBranch;
    }

    public void setKeepBranch(String keepBranch) {
        this.keepBranch = keepBranch;
    }

    public String getDataCreatUserNum() {
        return dataCreatUserNum;
    }

    public void setDataCreatUserNum(String dataCreatUserNum) {
        this.dataCreatUserNum = dataCreatUserNum;
    }

    public String getDataCreatorOrgCd() {
        return dataCreatorOrgCd;
    }

    public void setDataCreatorOrgCd(String dataCreatorOrgCd) {
        this.dataCreatorOrgCd = dataCreatorOrgCd;
    }

    public String getLastUpdateUserNum() {
        return lastUpdateUserNum;
    }

    public void setLastUpdateUserNum(String lastUpdateUserNum) {
        this.lastUpdateUserNum = lastUpdateUserNum;
    }

    public String getLastUpdateOrgCd() {
        return lastUpdateOrgCd;
    }

    public void setLastUpdateOrgCd(String lastUpdateOrgCd) {
        this.lastUpdateOrgCd = lastUpdateOrgCd;
    }

    public String getTakeoverInd() {
        return takeoverInd;
    }

    public void setTakeoverInd(String takeoverInd) {
        this.takeoverInd = takeoverInd;
    }

    public String getAllPledgeInd() {
        return allPledgeInd;
    }

    public void setAllPledgeInd(String allPledgeInd) {
        this.allPledgeInd = allPledgeInd;
    }

    public String getForbidCirculateInd() {
        return forbidCirculateInd;
    }

    public void setForbidCirculateInd(String forbidCirculateInd) {
        this.forbidCirculateInd = forbidCirculateInd;
    }

    public String getNationalisationInd() {
        return nationalisationInd;
    }

    public void setNationalisationInd(String nationalisationInd) {
        this.nationalisationInd = nationalisationInd;
    }

    public String getPropertyDisputedInd() {
        return propertyDisputedInd;
    }

    public void setPropertyDisputedInd(String propertyDisputedInd) {
        this.propertyDisputedInd = propertyDisputedInd;
    }

    public String getInvalidInd() {
        return invalidInd;
    }

    public void setInvalidInd(String invalidInd) {
        this.invalidInd = invalidInd;
    }

    public String getBlemishInd() {
        return blemishInd;
    }

    public void setBlemishInd(String blemishInd) {
        this.blemishInd = blemishInd;
    }

    public String getBlemishInfo() {
        return blemishInfo;
    }

    public void setBlemishInfo(String blemishInfo) {
        this.blemishInfo = blemishInfo;
    }

    public String getHandoverDate() {
        return handoverDate;
    }

    public void setHandoverDate(String handoverDate) {
        this.handoverDate = handoverDate;
    }

    public String getKeepSpecialReq() {
        return keepSpecialReq;
    }

    public void setKeepSpecialReq(String keepSpecialReq) {
        this.keepSpecialReq = keepSpecialReq;
    }

    public String getCreditorPriority() {
        return creditorPriority;
    }

    public void setCreditorPriority(String creditorPriority) {
        this.creditorPriority = creditorPriority;
    }

    public java.math.BigDecimal getPreCreditorAmt() {
        return preCreditorAmt;
    }

    public void setPreCreditorAmt(java.math.BigDecimal preCreditorAmt) {
        this.preCreditorAmt = preCreditorAmt;
    }

    public String getBelongOrgCd() {
        return belongOrgCd;
    }

    public void setBelongOrgCd(String belongOrgCd) {
        this.belongOrgCd = belongOrgCd;
    }

    public String getCollateralInfoStatusCd() {
        return collateralInfoStatusCd;
    }

    public void setCollateralInfoStatusCd(String collateralInfoStatusCd) {
        this.collateralInfoStatusCd = collateralInfoStatusCd;
    }

    public String getCollateralCreateDate() {
        return collateralCreateDate;
    }

    public void setCollateralCreateDate(String collateralCreateDate) {
        this.collateralCreateDate = collateralCreateDate;
    }

    public String getEvalTypeCd() {
        return evalTypeCd;
    }

    public void setEvalTypeCd(String evalTypeCd) {
        this.evalTypeCd = evalTypeCd;
    }

    public String getIndCertiFull() {
        return indCertiFull;
    }

    public void setIndCertiFull(String indCertiFull) {
        this.indCertiFull = indCertiFull;
    }

    public String getCertiNotFullCause() {
        return certiNotFullCause;
    }

    public void setCertiNotFullCause(String certiNotFullCause) {
        this.certiNotFullCause = certiNotFullCause;
    }

    public String getSysUpdateTime() {
        return sysUpdateTime;
    }

    public void setSysUpdateTime(String sysUpdateTime) {
        this.sysUpdateTime = sysUpdateTime;
    }

    public java.math.BigDecimal getMonthRenk() {
        return monthRenk;
    }

    public void setMonthRenk(java.math.BigDecimal monthRenk) {
        this.monthRenk = monthRenk;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getIsConfirmed() {
        return isConfirmed;
    }

    public void setIsConfirmed(String isConfirmed) {
        this.isConfirmed = isConfirmed;
    }

    public String getIsTmpSave() {
        return isTmpSave;
    }

    public void setIsTmpSave(String isTmpSave) {
        this.isTmpSave = isTmpSave;
    }

    public String getManageUser() {
        return manageUser;
    }

    public void setManageUser(String manageUser) {
        this.manageUser = manageUser;
    }

    public String getIsAddProcess() {
        return isAddProcess;
    }

    public void setIsAddProcess(String isAddProcess) {
        this.isAddProcess = isAddProcess;
    }

    public String getBelongStriplineNo() {
        return belongStriplineNo;
    }

    public void setBelongStriplineNo(String belongStriplineNo) {
        this.belongStriplineNo = belongStriplineNo;
    }

    public String getManageOrgCd() {
        return manageOrgCd;
    }

    public void setManageOrgCd(String manageOrgCd) {
        this.manageOrgCd = manageOrgCd;
    }

    public String getCertiPlanCompletedDate() {
        return certiPlanCompletedDate;
    }

    public void setCertiPlanCompletedDate(String certiPlanCompletedDate) {
        this.certiPlanCompletedDate = certiPlanCompletedDate;
    }

    public String getGuarantyTypeCd() {
        return guarantyTypeCd;
    }

    public void setGuarantyTypeCd(String guarantyTypeCd) {
        this.guarantyTypeCd = guarantyTypeCd;
    }

    public String getIsBelongMainApplicant() {
        return isBelongMainApplicant;
    }

    public void setIsBelongMainApplicant(String isBelongMainApplicant) {
        this.isBelongMainApplicant = isBelongMainApplicant;
    }

    public String getSystemSign() {
        return systemSign;
    }

    public void setSystemSign(String systemSign) {
        this.systemSign = systemSign;
    }

    public String getLoanUser() {
        return loanUser;
    }

    public void setLoanUser(String loanUser) {
        this.loanUser = loanUser;
    }

    public java.math.BigDecimal getGuarantyPledgeRate() {
        return guarantyPledgeRate;
    }

    public void setGuarantyPledgeRate(java.math.BigDecimal guarantyPledgeRate) {
        this.guarantyPledgeRate = guarantyPledgeRate;
    }

    public java.math.BigDecimal getHighestGuarantyValue() {
        return highestGuarantyValue;
    }

    public void setHighestGuarantyValue(java.math.BigDecimal highestGuarantyValue) {
        this.highestGuarantyValue = highestGuarantyValue;
    }

    public java.math.BigDecimal getGuarantyDiscountRate() {
        return guarantyDiscountRate;
    }

    public void setGuarantyDiscountRate(java.math.BigDecimal guarantyDiscountRate) {
        this.guarantyDiscountRate = guarantyDiscountRate;
    }

    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public String getCertCode() {
        return certCode;
    }

    public void setCertCode(String certCode) {
        this.certCode = certCode;
    }

    public String getIsShare() {
        return isShare;
    }

    public void setIsShare(String isShare) {
        this.isShare = isShare;
    }

    public String getShareGuarantyNo() {
        return shareGuarantyNo;
    }

    public void setShareGuarantyNo(String shareGuarantyNo) {
        this.shareGuarantyNo = shareGuarantyNo;
    }

    public String getUnderwriter1() {
        return underwriter1;
    }

    public void setUnderwriter1(String underwriter1) {
        this.underwriter1 = underwriter1;
    }

    public String getUnderwriter2() {
        return underwriter2;
    }

    public void setUnderwriter2(String underwriter2) {
        this.underwriter2 = underwriter2;
    }

    public String getLimitsIegalvalidity() {
        return limitsIegalvalidity;
    }

    public void setLimitsIegalvalidity(String limitsIegalvalidity) {
        this.limitsIegalvalidity = limitsIegalvalidity;
    }

    public String getLimitsInsurance() {
        return limitsInsurance;
    }

    public void setLimitsInsurance(String limitsInsurance) {
        this.limitsInsurance = limitsInsurance;
    }

    public String getLimitsValuevolatility() {
        return limitsValuevolatility;
    }

    public void setLimitsValuevolatility(String limitsValuevolatility) {
        this.limitsValuevolatility = limitsValuevolatility;
    }

    public String getLimitsSeizureconvenience() {
        return limitsSeizureconvenience;
    }

    public void setLimitsSeizureconvenience(String limitsSeizureconvenience) {
        this.limitsSeizureconvenience = limitsSeizureconvenience;
    }

    public String getLimitsCashability() {
        return limitsCashability;
    }

    public void setLimitsCashability(String limitsCashability) {
        this.limitsCashability = limitsCashability;
    }

    public String getLimitsBorrower() {
        return limitsBorrower;
    }

    public void setLimitsBorrower(String limitsBorrower) {
        this.limitsBorrower = limitsBorrower;
    }

    public String getManagerPhone() {
        return managerPhone;
    }

    public void setManagerPhone(String managerPhone) {
        this.managerPhone = managerPhone;
    }

    public String getIsRelation() {
        return isRelation;
    }

    public void setIsRelation(String isRelation) {
        this.isRelation = isRelation;
    }

    public String getOldGuarantyNo() {
        return oldGuarantyNo;
    }

    public void setOldGuarantyNo(String oldGuarantyNo) {
        this.oldGuarantyNo = oldGuarantyNo;
    }

    public String getDataSource() {
        return dataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((guarantyNo == null) ? 0 : guarantyNo.hashCode());
        result = prime * result + ((guarantyName == null) ? 0 : guarantyName.hashCode());
        result = prime * result + ((collateralTypeCd == null) ? 0 : collateralTypeCd.hashCode());
        result = prime * result + ((guarantorPartyId == null) ? 0 : guarantorPartyId.hashCode());
        result = prime * result + ((customerNum == null) ? 0 : customerNum.hashCode());
        result = prime * result + ((currencyCd == null) ? 0 : currencyCd.hashCode());
        result = prime * result + ((bookValue == null) ? 0 : bookValue.hashCode());
        result = prime * result + ((bookNetValue == null) ? 0 : bookNetValue.hashCode());
        result = prime * result + ((marketValue == null) ? 0 : marketValue.hashCode());
        result = prime * result + ((evalValueCurrCd == null) ? 0 : evalValueCurrCd.hashCode());
        result = prime * result + ((evalValue == null) ? 0 : evalValue.hashCode());
        result = prime * result + ((bankAssessedCurrCd == null) ? 0 : bankAssessedCurrCd.hashCode());
        result = prime * result + ((bankAssessedValue == null) ? 0 : bankAssessedValue.hashCode());
        result = prime * result + ((collateralStatusCd == null) ? 0 : collateralStatusCd.hashCode());
        result = prime * result + ((collateralDispose == null) ? 0 : collateralDispose.hashCode());
        result = prime * result + ((acquireWayCd == null) ? 0 : acquireWayCd.hashCode());
        result = prime * result + ((commonAssetsInd == null) ? 0 : commonAssetsInd.hashCode());
        result = prime * result + ((commonOwnerName == null) ? 0 : commonOwnerName.hashCode());
        result = prime * result + ((effectiveWayCd == null) ? 0 : effectiveWayCd.hashCode());
        result = prime * result + ((collateralSetupInd == null) ? 0 : collateralSetupInd.hashCode());
        result = prime * result + ((setGuarantyAmt == null) ? 0 : setGuarantyAmt.hashCode());
        result = prime * result + ((rentedLicensedInd == null) ? 0 : rentedLicensedInd.hashCode());
        result = prime * result + ((renterName == null) ? 0 : renterName.hashCode());
        result = prime * result + ((leaseExpirationDate == null) ? 0 : leaseExpirationDate.hashCode());
        result = prime * result + ((otherNote == null) ? 0 : otherNote.hashCode());
        result = prime * result + ((submittingDate == null) ? 0 : submittingDate.hashCode());
        result = prime * result + ((nationalityCd == null) ? 0 : nationalityCd.hashCode());
        result = prime * result + ((provinceCd == null) ? 0 : provinceCd.hashCode());
        result = prime * result + ((cityCd == null) ? 0 : cityCd.hashCode());
        result = prime * result + ((districtCd == null) ? 0 : districtCd.hashCode());
        result = prime * result + ((streetAddress == null) ? 0 : streetAddress.hashCode());
        result = prime * result + ((merchandiseType == null) ? 0 : merchandiseType.hashCode());
        result = prime * result + ((rightCertTypeCd == null) ? 0 : rightCertTypeCd.hashCode());
        result = prime * result + ((rightCertificationNum == null) ? 0 : rightCertificationNum.hashCode());
        result = prime * result + ((setGuarantyAmtInBank == null) ? 0 : setGuarantyAmtInBank.hashCode());
        result = prime * result + ((setGuarantyAmtOutBank == null) ? 0 : setGuarantyAmtOutBank.hashCode());
        result = prime * result + ((collateralCatalogCd == null) ? 0 : collateralCatalogCd.hashCode());
        result = prime * result + ((collateralKeeper == null) ? 0 : collateralKeeper.hashCode());
        result = prime * result + ((storeDate == null) ? 0 : storeDate.hashCode());
        result = prime * result + ((keepBranch == null) ? 0 : keepBranch.hashCode());
        result = prime * result + ((dataCreatUserNum == null) ? 0 : dataCreatUserNum.hashCode());
        result = prime * result + ((dataCreatorOrgCd == null) ? 0 : dataCreatorOrgCd.hashCode());
        result = prime * result + ((lastUpdateUserNum == null) ? 0 : lastUpdateUserNum.hashCode());
        result = prime * result + ((lastUpdateOrgCd == null) ? 0 : lastUpdateOrgCd.hashCode());
        result = prime * result + ((takeoverInd == null) ? 0 : takeoverInd.hashCode());
        result = prime * result + ((allPledgeInd == null) ? 0 : allPledgeInd.hashCode());
        result = prime * result + ((forbidCirculateInd == null) ? 0 : forbidCirculateInd.hashCode());
        result = prime * result + ((nationalisationInd == null) ? 0 : nationalisationInd.hashCode());
        result = prime * result + ((propertyDisputedInd == null) ? 0 : propertyDisputedInd.hashCode());
        result = prime * result + ((invalidInd == null) ? 0 : invalidInd.hashCode());
        result = prime * result + ((blemishInd == null) ? 0 : blemishInd.hashCode());
        result = prime * result + ((blemishInfo == null) ? 0 : blemishInfo.hashCode());
        result = prime * result + ((handoverDate == null) ? 0 : handoverDate.hashCode());
        result = prime * result + ((keepSpecialReq == null) ? 0 : keepSpecialReq.hashCode());
        result = prime * result + ((creditorPriority == null) ? 0 : creditorPriority.hashCode());
        result = prime * result + ((preCreditorAmt == null) ? 0 : preCreditorAmt.hashCode());
        result = prime * result + ((belongOrgCd == null) ? 0 : belongOrgCd.hashCode());
        result = prime * result + ((collateralInfoStatusCd == null) ? 0 : collateralInfoStatusCd.hashCode());
        result = prime * result + ((collateralCreateDate == null) ? 0 : collateralCreateDate.hashCode());
        result = prime * result + ((evalTypeCd == null) ? 0 : evalTypeCd.hashCode());
        result = prime * result + ((indCertiFull == null) ? 0 : indCertiFull.hashCode());
        result = prime * result + ((certiNotFullCause == null) ? 0 : certiNotFullCause.hashCode());
        result = prime * result + ((sysUpdateTime == null) ? 0 : sysUpdateTime.hashCode());
        result = prime * result + ((monthRenk == null) ? 0 : monthRenk.hashCode());
        result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
        result = prime * result + ((isConfirmed == null) ? 0 : isConfirmed.hashCode());
        result = prime * result + ((isTmpSave == null) ? 0 : isTmpSave.hashCode());
        result = prime * result + ((manageUser == null) ? 0 : manageUser.hashCode());
        result = prime * result + ((isAddProcess == null) ? 0 : isAddProcess.hashCode());
        result = prime * result + ((belongStriplineNo == null) ? 0 : belongStriplineNo.hashCode());
        result = prime * result + ((manageOrgCd == null) ? 0 : manageOrgCd.hashCode());
        result = prime * result + ((certiPlanCompletedDate == null) ? 0 : certiPlanCompletedDate.hashCode());
        result = prime * result + ((guarantyTypeCd == null) ? 0 : guarantyTypeCd.hashCode());
        result = prime * result + ((isBelongMainApplicant == null) ? 0 : isBelongMainApplicant.hashCode());
        result = prime * result + ((systemSign == null) ? 0 : systemSign.hashCode());
        result = prime * result + ((loanUser == null) ? 0 : loanUser.hashCode());
        result = prime * result + ((guarantyPledgeRate == null) ? 0 : guarantyPledgeRate.hashCode());
        result = prime * result + ((highestGuarantyValue == null) ? 0 : highestGuarantyValue.hashCode());
        result = prime * result + ((guarantyDiscountRate == null) ? 0 : guarantyDiscountRate.hashCode());
        result = prime * result + ((certType == null) ? 0 : certType.hashCode());
        result = prime * result + ((certCode == null) ? 0 : certCode.hashCode());
        result = prime * result + ((isShare == null) ? 0 : isShare.hashCode());
        result = prime * result + ((shareGuarantyNo == null) ? 0 : shareGuarantyNo.hashCode());
        result = prime * result + ((underwriter1 == null) ? 0 : underwriter1.hashCode());
        result = prime * result + ((underwriter2 == null) ? 0 : underwriter2.hashCode());
        result = prime * result + ((limitsIegalvalidity == null) ? 0 : limitsIegalvalidity.hashCode());
        result = prime * result + ((limitsInsurance == null) ? 0 : limitsInsurance.hashCode());
        result = prime * result + ((limitsValuevolatility == null) ? 0 : limitsValuevolatility.hashCode());
        result = prime * result + ((limitsSeizureconvenience == null) ? 0 : limitsSeizureconvenience.hashCode());
        result = prime * result + ((limitsCashability == null) ? 0 : limitsCashability.hashCode());
        result = prime * result + ((limitsBorrower == null) ? 0 : limitsBorrower.hashCode());
        result = prime * result + ((managerPhone == null) ? 0 : managerPhone.hashCode());
        result = prime * result + ((isRelation == null) ? 0 : isRelation.hashCode());
        result = prime * result + ((oldGuarantyNo == null) ? 0 : oldGuarantyNo.hashCode());
        result = prime * result + ((dataSource == null) ? 0 : dataSource.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())            return false;        GuarantyBaseInfo other = (GuarantyBaseInfo)obj;        if (guarantyNo == null) {
            if (other.guarantyNo != null)
                return false;
        } else if (!guarantyNo.equals(other.guarantyNo))
            return false;
        if (guarantyName == null) {
            if (other.guarantyName != null)
                return false;
        } else if (!guarantyName.equals(other.guarantyName))
            return false;
        if (collateralTypeCd == null) {
            if (other.collateralTypeCd != null)
                return false;
        } else if (!collateralTypeCd.equals(other.collateralTypeCd))
            return false;
        if (guarantorPartyId == null) {
            if (other.guarantorPartyId != null)
                return false;
        } else if (!guarantorPartyId.equals(other.guarantorPartyId))
            return false;
        if (customerNum == null) {
            if (other.customerNum != null)
                return false;
        } else if (!customerNum.equals(other.customerNum))
            return false;
        if (currencyCd == null) {
            if (other.currencyCd != null)
                return false;
        } else if (!currencyCd.equals(other.currencyCd))
            return false;
        if (bookValue == null) {
            if (other.bookValue != null)
                return false;
        } else if (!bookValue.equals(other.bookValue))
            return false;
        if (bookNetValue == null) {
            if (other.bookNetValue != null)
                return false;
        } else if (!bookNetValue.equals(other.bookNetValue))
            return false;
        if (marketValue == null) {
            if (other.marketValue != null)
                return false;
        } else if (!marketValue.equals(other.marketValue))
            return false;
        if (evalValueCurrCd == null) {
            if (other.evalValueCurrCd != null)
                return false;
        } else if (!evalValueCurrCd.equals(other.evalValueCurrCd))
            return false;
        if (evalValue == null) {
            if (other.evalValue != null)
                return false;
        } else if (!evalValue.equals(other.evalValue))
            return false;
        if (bankAssessedCurrCd == null) {
            if (other.bankAssessedCurrCd != null)
                return false;
        } else if (!bankAssessedCurrCd.equals(other.bankAssessedCurrCd))
            return false;
        if (bankAssessedValue == null) {
            if (other.bankAssessedValue != null)
                return false;
        } else if (!bankAssessedValue.equals(other.bankAssessedValue))
            return false;
        if (collateralStatusCd == null) {
            if (other.collateralStatusCd != null)
                return false;
        } else if (!collateralStatusCd.equals(other.collateralStatusCd))
            return false;
        if (collateralDispose == null) {
            if (other.collateralDispose != null)
                return false;
        } else if (!collateralDispose.equals(other.collateralDispose))
            return false;
        if (acquireWayCd == null) {
            if (other.acquireWayCd != null)
                return false;
        } else if (!acquireWayCd.equals(other.acquireWayCd))
            return false;
        if (commonAssetsInd == null) {
            if (other.commonAssetsInd != null)
                return false;
        } else if (!commonAssetsInd.equals(other.commonAssetsInd))
            return false;
        if (commonOwnerName == null) {
            if (other.commonOwnerName != null)
                return false;
        } else if (!commonOwnerName.equals(other.commonOwnerName))
            return false;
        if (effectiveWayCd == null) {
            if (other.effectiveWayCd != null)
                return false;
        } else if (!effectiveWayCd.equals(other.effectiveWayCd))
            return false;
        if (collateralSetupInd == null) {
            if (other.collateralSetupInd != null)
                return false;
        } else if (!collateralSetupInd.equals(other.collateralSetupInd))
            return false;
        if (setGuarantyAmt == null) {
            if (other.setGuarantyAmt != null)
                return false;
        } else if (!setGuarantyAmt.equals(other.setGuarantyAmt))
            return false;
        if (rentedLicensedInd == null) {
            if (other.rentedLicensedInd != null)
                return false;
        } else if (!rentedLicensedInd.equals(other.rentedLicensedInd))
            return false;
        if (renterName == null) {
            if (other.renterName != null)
                return false;
        } else if (!renterName.equals(other.renterName))
            return false;
        if (leaseExpirationDate == null) {
            if (other.leaseExpirationDate != null)
                return false;
        } else if (!leaseExpirationDate.equals(other.leaseExpirationDate))
            return false;
        if (otherNote == null) {
            if (other.otherNote != null)
                return false;
        } else if (!otherNote.equals(other.otherNote))
            return false;
        if (submittingDate == null) {
            if (other.submittingDate != null)
                return false;
        } else if (!submittingDate.equals(other.submittingDate))
            return false;
        if (nationalityCd == null) {
            if (other.nationalityCd != null)
                return false;
        } else if (!nationalityCd.equals(other.nationalityCd))
            return false;
        if (provinceCd == null) {
            if (other.provinceCd != null)
                return false;
        } else if (!provinceCd.equals(other.provinceCd))
            return false;
        if (cityCd == null) {
            if (other.cityCd != null)
                return false;
        } else if (!cityCd.equals(other.cityCd))
            return false;
        if (districtCd == null) {
            if (other.districtCd != null)
                return false;
        } else if (!districtCd.equals(other.districtCd))
            return false;
        if (streetAddress == null) {
            if (other.streetAddress != null)
                return false;
        } else if (!streetAddress.equals(other.streetAddress))
            return false;
        if (merchandiseType == null) {
            if (other.merchandiseType != null)
                return false;
        } else if (!merchandiseType.equals(other.merchandiseType))
            return false;
        if (rightCertTypeCd == null) {
            if (other.rightCertTypeCd != null)
                return false;
        } else if (!rightCertTypeCd.equals(other.rightCertTypeCd))
            return false;
        if (rightCertificationNum == null) {
            if (other.rightCertificationNum != null)
                return false;
        } else if (!rightCertificationNum.equals(other.rightCertificationNum))
            return false;
        if (setGuarantyAmtInBank == null) {
            if (other.setGuarantyAmtInBank != null)
                return false;
        } else if (!setGuarantyAmtInBank.equals(other.setGuarantyAmtInBank))
            return false;
        if (setGuarantyAmtOutBank == null) {
            if (other.setGuarantyAmtOutBank != null)
                return false;
        } else if (!setGuarantyAmtOutBank.equals(other.setGuarantyAmtOutBank))
            return false;
        if (collateralCatalogCd == null) {
            if (other.collateralCatalogCd != null)
                return false;
        } else if (!collateralCatalogCd.equals(other.collateralCatalogCd))
            return false;
        if (collateralKeeper == null) {
            if (other.collateralKeeper != null)
                return false;
        } else if (!collateralKeeper.equals(other.collateralKeeper))
            return false;
        if (storeDate == null) {
            if (other.storeDate != null)
                return false;
        } else if (!storeDate.equals(other.storeDate))
            return false;
        if (keepBranch == null) {
            if (other.keepBranch != null)
                return false;
        } else if (!keepBranch.equals(other.keepBranch))
            return false;
        if (dataCreatUserNum == null) {
            if (other.dataCreatUserNum != null)
                return false;
        } else if (!dataCreatUserNum.equals(other.dataCreatUserNum))
            return false;
        if (dataCreatorOrgCd == null) {
            if (other.dataCreatorOrgCd != null)
                return false;
        } else if (!dataCreatorOrgCd.equals(other.dataCreatorOrgCd))
            return false;
        if (lastUpdateUserNum == null) {
            if (other.lastUpdateUserNum != null)
                return false;
        } else if (!lastUpdateUserNum.equals(other.lastUpdateUserNum))
            return false;
        if (lastUpdateOrgCd == null) {
            if (other.lastUpdateOrgCd != null)
                return false;
        } else if (!lastUpdateOrgCd.equals(other.lastUpdateOrgCd))
            return false;
        if (takeoverInd == null) {
            if (other.takeoverInd != null)
                return false;
        } else if (!takeoverInd.equals(other.takeoverInd))
            return false;
        if (allPledgeInd == null) {
            if (other.allPledgeInd != null)
                return false;
        } else if (!allPledgeInd.equals(other.allPledgeInd))
            return false;
        if (forbidCirculateInd == null) {
            if (other.forbidCirculateInd != null)
                return false;
        } else if (!forbidCirculateInd.equals(other.forbidCirculateInd))
            return false;
        if (nationalisationInd == null) {
            if (other.nationalisationInd != null)
                return false;
        } else if (!nationalisationInd.equals(other.nationalisationInd))
            return false;
        if (propertyDisputedInd == null) {
            if (other.propertyDisputedInd != null)
                return false;
        } else if (!propertyDisputedInd.equals(other.propertyDisputedInd))
            return false;
        if (invalidInd == null) {
            if (other.invalidInd != null)
                return false;
        } else if (!invalidInd.equals(other.invalidInd))
            return false;
        if (blemishInd == null) {
            if (other.blemishInd != null)
                return false;
        } else if (!blemishInd.equals(other.blemishInd))
            return false;
        if (blemishInfo == null) {
            if (other.blemishInfo != null)
                return false;
        } else if (!blemishInfo.equals(other.blemishInfo))
            return false;
        if (handoverDate == null) {
            if (other.handoverDate != null)
                return false;
        } else if (!handoverDate.equals(other.handoverDate))
            return false;
        if (keepSpecialReq == null) {
            if (other.keepSpecialReq != null)
                return false;
        } else if (!keepSpecialReq.equals(other.keepSpecialReq))
            return false;
        if (creditorPriority == null) {
            if (other.creditorPriority != null)
                return false;
        } else if (!creditorPriority.equals(other.creditorPriority))
            return false;
        if (preCreditorAmt == null) {
            if (other.preCreditorAmt != null)
                return false;
        } else if (!preCreditorAmt.equals(other.preCreditorAmt))
            return false;
        if (belongOrgCd == null) {
            if (other.belongOrgCd != null)
                return false;
        } else if (!belongOrgCd.equals(other.belongOrgCd))
            return false;
        if (collateralInfoStatusCd == null) {
            if (other.collateralInfoStatusCd != null)
                return false;
        } else if (!collateralInfoStatusCd.equals(other.collateralInfoStatusCd))
            return false;
        if (collateralCreateDate == null) {
            if (other.collateralCreateDate != null)
                return false;
        } else if (!collateralCreateDate.equals(other.collateralCreateDate))
            return false;
        if (evalTypeCd == null) {
            if (other.evalTypeCd != null)
                return false;
        } else if (!evalTypeCd.equals(other.evalTypeCd))
            return false;
        if (indCertiFull == null) {
            if (other.indCertiFull != null)
                return false;
        } else if (!indCertiFull.equals(other.indCertiFull))
            return false;
        if (certiNotFullCause == null) {
            if (other.certiNotFullCause != null)
                return false;
        } else if (!certiNotFullCause.equals(other.certiNotFullCause))
            return false;
        if (sysUpdateTime == null) {
            if (other.sysUpdateTime != null)
                return false;
        } else if (!sysUpdateTime.equals(other.sysUpdateTime))
            return false;
        if (monthRenk == null) {
            if (other.monthRenk != null)
                return false;
        } else if (!monthRenk.equals(other.monthRenk))
            return false;
        if (customerName == null) {
            if (other.customerName != null)
                return false;
        } else if (!customerName.equals(other.customerName))
            return false;
        if (isConfirmed == null) {
            if (other.isConfirmed != null)
                return false;
        } else if (!isConfirmed.equals(other.isConfirmed))
            return false;
        if (isTmpSave == null) {
            if (other.isTmpSave != null)
                return false;
        } else if (!isTmpSave.equals(other.isTmpSave))
            return false;
        if (manageUser == null) {
            if (other.manageUser != null)
                return false;
        } else if (!manageUser.equals(other.manageUser))
            return false;
        if (isAddProcess == null) {
            if (other.isAddProcess != null)
                return false;
        } else if (!isAddProcess.equals(other.isAddProcess))
            return false;
        if (belongStriplineNo == null) {
            if (other.belongStriplineNo != null)
                return false;
        } else if (!belongStriplineNo.equals(other.belongStriplineNo))
            return false;
        if (manageOrgCd == null) {
            if (other.manageOrgCd != null)
                return false;
        } else if (!manageOrgCd.equals(other.manageOrgCd))
            return false;
        if (certiPlanCompletedDate == null) {
            if (other.certiPlanCompletedDate != null)
                return false;
        } else if (!certiPlanCompletedDate.equals(other.certiPlanCompletedDate))
            return false;
        if (guarantyTypeCd == null) {
            if (other.guarantyTypeCd != null)
                return false;
        } else if (!guarantyTypeCd.equals(other.guarantyTypeCd))
            return false;
        if (isBelongMainApplicant == null) {
            if (other.isBelongMainApplicant != null)
                return false;
        } else if (!isBelongMainApplicant.equals(other.isBelongMainApplicant))
            return false;
        if (systemSign == null) {
            if (other.systemSign != null)
                return false;
        } else if (!systemSign.equals(other.systemSign))
            return false;
        if (loanUser == null) {
            if (other.loanUser != null)
                return false;
        } else if (!loanUser.equals(other.loanUser))
            return false;
        if (guarantyPledgeRate == null) {
            if (other.guarantyPledgeRate != null)
                return false;
        } else if (!guarantyPledgeRate.equals(other.guarantyPledgeRate))
            return false;
        if (highestGuarantyValue == null) {
            if (other.highestGuarantyValue != null)
                return false;
        } else if (!highestGuarantyValue.equals(other.highestGuarantyValue))
            return false;
        if (guarantyDiscountRate == null) {
            if (other.guarantyDiscountRate != null)
                return false;
        } else if (!guarantyDiscountRate.equals(other.guarantyDiscountRate))
            return false;
        if (certType == null) {
            if (other.certType != null)
                return false;
        } else if (!certType.equals(other.certType))
            return false;
        if (certCode == null) {
            if (other.certCode != null)
                return false;
        } else if (!certCode.equals(other.certCode))
            return false;
        if (isShare == null) {
            if (other.isShare != null)
                return false;
        } else if (!isShare.equals(other.isShare))
            return false;
        if (shareGuarantyNo == null) {
            if (other.shareGuarantyNo != null)
                return false;
        } else if (!shareGuarantyNo.equals(other.shareGuarantyNo))
            return false;
        if (underwriter1 == null) {
            if (other.underwriter1 != null)
                return false;
        } else if (!underwriter1.equals(other.underwriter1))
            return false;
        if (underwriter2 == null) {
            if (other.underwriter2 != null)
                return false;
        } else if (!underwriter2.equals(other.underwriter2))
            return false;
        if (limitsIegalvalidity == null) {
            if (other.limitsIegalvalidity != null)
                return false;
        } else if (!limitsIegalvalidity.equals(other.limitsIegalvalidity))
            return false;
        if (limitsInsurance == null) {
            if (other.limitsInsurance != null)
                return false;
        } else if (!limitsInsurance.equals(other.limitsInsurance))
            return false;
        if (limitsValuevolatility == null) {
            if (other.limitsValuevolatility != null)
                return false;
        } else if (!limitsValuevolatility.equals(other.limitsValuevolatility))
            return false;
        if (limitsSeizureconvenience == null) {
            if (other.limitsSeizureconvenience != null)
                return false;
        } else if (!limitsSeizureconvenience.equals(other.limitsSeizureconvenience))
            return false;
        if (limitsCashability == null) {
            if (other.limitsCashability != null)
                return false;
        } else if (!limitsCashability.equals(other.limitsCashability))
            return false;
        if (limitsBorrower == null) {
            if (other.limitsBorrower != null)
                return false;
        } else if (!limitsBorrower.equals(other.limitsBorrower))
            return false;
        if (managerPhone == null) {
            if (other.managerPhone != null)
                return false;
        } else if (!managerPhone.equals(other.managerPhone))
            return false;
        if (isRelation == null) {
            if (other.isRelation != null)
                return false;
        } else if (!isRelation.equals(other.isRelation))
            return false;
        if (oldGuarantyNo == null) {
            if (other.oldGuarantyNo != null)
                return false;
        } else if (!oldGuarantyNo.equals(other.oldGuarantyNo))
            return false;
        if (dataSource == null) {
            if (other.dataSource != null)
                return false;
        } else if (!dataSource.equals(other.dataSource))
            return false;
        return true;
    }

    @Override    public String toString() {        return "GuarantyBaseInfo["+"guarantyNo="+guarantyNo,                +"guarantyName="+guarantyName,+"collateralTypeCd="+collateralTypeCd,+"guarantorPartyId="+guarantorPartyId,                +"customerNum="+customerNum,+"currencyCd="+currencyCd,+"bookValue="+bookValue,                +"bookNetValue="+bookNetValue,+"marketValue="+marketValue,+"evalValueCurrCd="+evalValueCurrCd,                +"evalValue="+evalValue,+"bankAssessedCurrCd="+bankAssessedCurrCd,                +"bankAssessedValue="+bankAssessedValue,+"collateralStatusCd="+collateralStatusCd,                +"collateralDispose="+collateralDispose,+"acquireWayCd="+acquireWayCd,                +"commonAssetsInd="+commonAssetsInd,+"commonOwnerName="+commonOwnerName,+"effectiveWayCd="+effectiveWayCd,                +"collateralSetupInd="+collateralSetupInd,+"setGuarantyAmt="+setGuarantyAmt,                +"rentedLicensedInd="+rentedLicensedInd,+"renterName="+renterName,                +"leaseExpirationDate="+leaseExpirationDate,+"otherNote="+otherNote,+"submittingDate="+submittingDate,                +"nationalityCd="+nationalityCd,+"provinceCd="+provinceCd,+"cityCd="+cityCd,                +"districtCd="+districtCd,+"streetAddress="+streetAddress,+"merchandiseType="+merchandiseType,                +"rightCertTypeCd="+rightCertTypeCd,+"rightCertificationNum="+rightCertificationNum,                +"setGuarantyAmtInBank="+setGuarantyAmtInBank,+"setGuarantyAmtOutBank="+setGuarantyAmtOutBank,                +"collateralCatalogCd="+collateralCatalogCd,+"collateralKeeper="+collateralKeeper,                +"storeDate="+storeDate,+"keepBranch="+keepBranch,                +"dataCreatUserNum="+dataCreatUserNum,+"dataCreatorOrgCd="+dataCreatorOrgCd,+"lastUpdateUserNum="+lastUpdateUserNum,                +"lastUpdateOrgCd="+lastUpdateOrgCd,+"takeoverInd="+takeoverInd,                +"allPledgeInd="+allPledgeInd,+"forbidCirculateInd="+forbidCirculateInd,                +"nationalisationInd="+nationalisationInd,+"propertyDisputedInd="+propertyDisputedInd,                +"invalidInd="+invalidInd,+"blemishInd="+blemishInd,+"blemishInfo="+blemishInfo,                +"handoverDate="+handoverDate,+"keepSpecialReq="+keepSpecialReq,+"creditorPriority="+creditorPriority,                +"preCreditorAmt="+preCreditorAmt,+"belongOrgCd="+belongOrgCd,                +"collateralInfoStatusCd="+collateralInfoStatusCd,+"collateralCreateDate="+collateralCreateDate,                +"evalTypeCd="+evalTypeCd,+"indCertiFull="+indCertiFull,+"certiNotFullCause="+certiNotFullCause,                +"sysUpdateTime="+sysUpdateTime,+"monthRenk="+monthRenk,                +"customerName="+customerName,+"isConfirmed="+isConfirmed,+"isTmpSave="+isTmpSave,                +"manageUser="+manageUser,+"isAddProcess="+isAddProcess,+"belongStriplineNo="+belongStriplineNo,                +"manageOrgCd="+manageOrgCd,+"certiPlanCompletedDate="+certiPlanCompletedDate,                +"guarantyTypeCd="+guarantyTypeCd,+"isBelongMainApplicant="+isBelongMainApplicant,                +"systemSign="+systemSign,+"loanUser="+loanUser,+"guarantyPledgeRate="+guarantyPledgeRate,                +"highestGuarantyValue="+highestGuarantyValue,+"guarantyDiscountRate="+guarantyDiscountRate,                +"certType="+certType,+"certCode="+certCode,+"isShare="+isShare,                +"shareGuarantyNo="+shareGuarantyNo,+"underwriter1="+underwriter1,+"underwriter2="+underwriter2,                +"limitsIegalvalidity="+limitsIegalvalidity,+"limitsInsurance="+limitsInsurance,                +"limitsValuevolatility="+limitsValuevolatility,+"limitsSeizureconvenience="+limitsSeizureconvenience,                +"limitsCashability="+limitsCashability,+"limitsBorrower="+limitsBorrower,                +"managerPhone="+managerPhone,+"isRelation="+isRelation,+"oldGuarantyNo="+oldGuarantyNo,                +"dataSource="+dataSource,                +"]";    }
}