package com.funtower.entity;
import java.io.Serializable;

    public class GuarantyBaseInfo implements Serializable{
    private static final long serialVersionUID = 1L;

    private String guarantyNo;
    private String guarantyName;
    private String collateralTypeCd;
    private String guarantorPartyId;
    private String customerNum;
    private String currencyCd;
    private java.math.BigDecimal bookValue;
    private java.math.BigDecimal bookNetValue;
    private java.math.BigDecimal marketValue;
    private String evalValueCurrCd;
    private java.math.BigDecimal evalValue;
    private String bankAssessedCurrCd;
    private java.math.BigDecimal bankAssessedValue;
    private String collateralStatusCd;
    private String collateralDispose;
    private String acquireWayCd;
    private String commonAssetsInd;
    private String commonOwnerName;
    private String effectiveWayCd;
    private String collateralSetupInd;
    private java.math.BigDecimal setGuarantyAmt;
    private String rentedLicensedInd;
    private String renterName;
    private String leaseExpirationDate;
    private String otherNote;
    private String submittingDate;
    private String nationalityCd;
    private String provinceCd;
    private String cityCd;
    private String districtCd;
    private String streetAddress;
    private String merchandiseType;
    private String rightCertTypeCd;
    private String rightCertificationNum;
    private java.math.BigDecimal setGuarantyAmtInBank;
    private java.math.BigDecimal setGuarantyAmtOutBank;
    private String collateralCatalogCd;
    private String collateralKeeper;
    private String storeDate;
    private String keepBranch;
    private String dataCreatUserNum;
    private String dataCreatorOrgCd;
    private String lastUpdateUserNum;
    private String lastUpdateOrgCd;
    private String takeoverInd;
    private String allPledgeInd;
    private String forbidCirculateInd;
    private String nationalisationInd;
    private String propertyDisputedInd;
    private String invalidInd;
    private String blemishInd;
    private String blemishInfo;
    private String handoverDate;
    private String keepSpecialReq;
    private String creditorPriority;
    private java.math.BigDecimal preCreditorAmt;
    private String belongOrgCd;
    private String collateralInfoStatusCd;
    private String collateralCreateDate;
    private String evalTypeCd;
    private String indCertiFull;
    private String certiNotFullCause;
    private String sysUpdateTime;
    private java.math.BigDecimal monthRenk;
    private String customerName;
    private String isConfirmed;
    private String isTmpSave;
    private String manageUser;
    private String isAddProcess;
    private String belongStriplineNo;
    private String manageOrgCd;
    private String certiPlanCompletedDate;
    private String guarantyTypeCd;
    private String isBelongMainApplicant;
    private String systemSign;
    private String loanUser;
    private java.math.BigDecimal guarantyPledgeRate;
    private java.math.BigDecimal highestGuarantyValue;
    private java.math.BigDecimal guarantyDiscountRate;
    private String certType;
    private String certCode;
    private String isShare;
    private String shareGuarantyNo;
    private String underwriter1;
    private String underwriter2;
    private String limitsIegalvalidity;
    private String limitsInsurance;
    private String limitsValuevolatility;
    private String limitsSeizureconvenience;
    private String limitsCashability;
    private String limitsBorrower;
    private String managerPhone;
    private String isRelation;
    private String oldGuarantyNo;
    private String dataSource;
    public GuarantyBaseInfo() {
    }
    public String getGuarantyNo() {
        return GuarantyNo;
    }

    public void setGuarantyNo(String guarantyNo) {
        this.guarantyNo = guarantyNo;
    }
    public String getGuarantyName() {
        return GuarantyName;
    }

    public void setGuarantyName(String guarantyName) {
        this.guarantyName = guarantyName;
    }
    public String getCollateralTypeCd() {
        return CollateralTypeCd;
    }

    public void setCollateralTypeCd(String collateralTypeCd) {
        this.collateralTypeCd = collateralTypeCd;
    }
    public String getGuarantorPartyId() {
        return GuarantorPartyId;
    }

    public void setGuarantorPartyId(String guarantorPartyId) {
        this.guarantorPartyId = guarantorPartyId;
    }
    public String getCustomerNum() {
        return CustomerNum;
    }

    public void setCustomerNum(String customerNum) {
        this.customerNum = customerNum;
    }
    public String getCurrencyCd() {
        return CurrencyCd;
    }

    public void setCurrencyCd(String currencyCd) {
        this.currencyCd = currencyCd;
    }
    public java.math.BigDecimal getBookValue() {
        return BookValue;
    }

    public void setBookValue(java.math.BigDecimal bookValue) {
        this.bookValue = bookValue;
    }
    public java.math.BigDecimal getBookNetValue() {
        return BookNetValue;
    }

    public void setBookNetValue(java.math.BigDecimal bookNetValue) {
        this.bookNetValue = bookNetValue;
    }
    public java.math.BigDecimal getMarketValue() {
        return MarketValue;
    }

    public void setMarketValue(java.math.BigDecimal marketValue) {
        this.marketValue = marketValue;
    }
    public String getEvalValueCurrCd() {
        return EvalValueCurrCd;
    }

    public void setEvalValueCurrCd(String evalValueCurrCd) {
        this.evalValueCurrCd = evalValueCurrCd;
    }
    public java.math.BigDecimal getEvalValue() {
        return EvalValue;
    }

    public void setEvalValue(java.math.BigDecimal evalValue) {
        this.evalValue = evalValue;
    }
    public String getBankAssessedCurrCd() {
        return BankAssessedCurrCd;
    }

    public void setBankAssessedCurrCd(String bankAssessedCurrCd) {
        this.bankAssessedCurrCd = bankAssessedCurrCd;
    }
    public java.math.BigDecimal getBankAssessedValue() {
        return BankAssessedValue;
    }

    public void setBankAssessedValue(java.math.BigDecimal bankAssessedValue) {
        this.bankAssessedValue = bankAssessedValue;
    }
    public String getCollateralStatusCd() {
        return CollateralStatusCd;
    }

    public void setCollateralStatusCd(String collateralStatusCd) {
        this.collateralStatusCd = collateralStatusCd;
    }
    public String getCollateralDispose() {
        return CollateralDispose;
    }

    public void setCollateralDispose(String collateralDispose) {
        this.collateralDispose = collateralDispose;
    }
    public String getAcquireWayCd() {
        return AcquireWayCd;
    }

    public void setAcquireWayCd(String acquireWayCd) {
        this.acquireWayCd = acquireWayCd;
    }
    public String getCommonAssetsInd() {
        return CommonAssetsInd;
    }

    public void setCommonAssetsInd(String commonAssetsInd) {
        this.commonAssetsInd = commonAssetsInd;
    }
    public String getCommonOwnerName() {
        return CommonOwnerName;
    }

    public void setCommonOwnerName(String commonOwnerName) {
        this.commonOwnerName = commonOwnerName;
    }
    public String getEffectiveWayCd() {
        return EffectiveWayCd;
    }

    public void setEffectiveWayCd(String effectiveWayCd) {
        this.effectiveWayCd = effectiveWayCd;
    }
    public String getCollateralSetupInd() {
        return CollateralSetupInd;
    }

    public void setCollateralSetupInd(String collateralSetupInd) {
        this.collateralSetupInd = collateralSetupInd;
    }
    public java.math.BigDecimal getSetGuarantyAmt() {
        return SetGuarantyAmt;
    }

    public void setSetGuarantyAmt(java.math.BigDecimal setGuarantyAmt) {
        this.setGuarantyAmt = setGuarantyAmt;
    }
    public String getRentedLicensedInd() {
        return RentedLicensedInd;
    }

    public void setRentedLicensedInd(String rentedLicensedInd) {
        this.rentedLicensedInd = rentedLicensedInd;
    }
    public String getRenterName() {
        return RenterName;
    }

    public void setRenterName(String renterName) {
        this.renterName = renterName;
    }
    public String getLeaseExpirationDate() {
        return LeaseExpirationDate;
    }

    public void setLeaseExpirationDate(String leaseExpirationDate) {
        this.leaseExpirationDate = leaseExpirationDate;
    }
    public String getOtherNote() {
        return OtherNote;
    }

    public void setOtherNote(String otherNote) {
        this.otherNote = otherNote;
    }
    public String getSubmittingDate() {
        return SubmittingDate;
    }

    public void setSubmittingDate(String submittingDate) {
        this.submittingDate = submittingDate;
    }
    public String getNationalityCd() {
        return NationalityCd;
    }

    public void setNationalityCd(String nationalityCd) {
        this.nationalityCd = nationalityCd;
    }
    public String getProvinceCd() {
        return ProvinceCd;
    }

    public void setProvinceCd(String provinceCd) {
        this.provinceCd = provinceCd;
    }
    public String getCityCd() {
        return CityCd;
    }

    public void setCityCd(String cityCd) {
        this.cityCd = cityCd;
    }
    public String getDistrictCd() {
        return DistrictCd;
    }

    public void setDistrictCd(String districtCd) {
        this.districtCd = districtCd;
    }
    public String getStreetAddress() {
        return StreetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }
    public String getMerchandiseType() {
        return MerchandiseType;
    }

    public void setMerchandiseType(String merchandiseType) {
        this.merchandiseType = merchandiseType;
    }
    public String getRightCertTypeCd() {
        return RightCertTypeCd;
    }

    public void setRightCertTypeCd(String rightCertTypeCd) {
        this.rightCertTypeCd = rightCertTypeCd;
    }
    public String getRightCertificationNum() {
        return RightCertificationNum;
    }

    public void setRightCertificationNum(String rightCertificationNum) {
        this.rightCertificationNum = rightCertificationNum;
    }
    public java.math.BigDecimal getSetGuarantyAmtInBank() {
        return SetGuarantyAmtInBank;
    }

    public void setSetGuarantyAmtInBank(java.math.BigDecimal setGuarantyAmtInBank) {
        this.setGuarantyAmtInBank = setGuarantyAmtInBank;
    }
    public java.math.BigDecimal getSetGuarantyAmtOutBank() {
        return SetGuarantyAmtOutBank;
    }

    public void setSetGuarantyAmtOutBank(java.math.BigDecimal setGuarantyAmtOutBank) {
        this.setGuarantyAmtOutBank = setGuarantyAmtOutBank;
    }
    public String getCollateralCatalogCd() {
        return CollateralCatalogCd;
    }

    public void setCollateralCatalogCd(String collateralCatalogCd) {
        this.collateralCatalogCd = collateralCatalogCd;
    }
    public String getCollateralKeeper() {
        return CollateralKeeper;
    }

    public void setCollateralKeeper(String collateralKeeper) {
        this.collateralKeeper = collateralKeeper;
    }
    public String getStoreDate() {
        return StoreDate;
    }

    public void setStoreDate(String storeDate) {
        this.storeDate = storeDate;
    }
    public String getKeepBranch() {
        return KeepBranch;
    }

    public void setKeepBranch(String keepBranch) {
        this.keepBranch = keepBranch;
    }
    public String getDataCreatUserNum() {
        return DataCreatUserNum;
    }

    public void setDataCreatUserNum(String dataCreatUserNum) {
        this.dataCreatUserNum = dataCreatUserNum;
    }
    public String getDataCreatorOrgCd() {
        return DataCreatorOrgCd;
    }

    public void setDataCreatorOrgCd(String dataCreatorOrgCd) {
        this.dataCreatorOrgCd = dataCreatorOrgCd;
    }
    public String getLastUpdateUserNum() {
        return LastUpdateUserNum;
    }

    public void setLastUpdateUserNum(String lastUpdateUserNum) {
        this.lastUpdateUserNum = lastUpdateUserNum;
    }
    public String getLastUpdateOrgCd() {
        return LastUpdateOrgCd;
    }

    public void setLastUpdateOrgCd(String lastUpdateOrgCd) {
        this.lastUpdateOrgCd = lastUpdateOrgCd;
    }
    public String getTakeoverInd() {
        return TakeoverInd;
    }

    public void setTakeoverInd(String takeoverInd) {
        this.takeoverInd = takeoverInd;
    }
    public String getAllPledgeInd() {
        return AllPledgeInd;
    }

    public void setAllPledgeInd(String allPledgeInd) {
        this.allPledgeInd = allPledgeInd;
    }
    public String getForbidCirculateInd() {
        return ForbidCirculateInd;
    }

    public void setForbidCirculateInd(String forbidCirculateInd) {
        this.forbidCirculateInd = forbidCirculateInd;
    }
    public String getNationalisationInd() {
        return NationalisationInd;
    }

    public void setNationalisationInd(String nationalisationInd) {
        this.nationalisationInd = nationalisationInd;
    }
    public String getPropertyDisputedInd() {
        return PropertyDisputedInd;
    }

    public void setPropertyDisputedInd(String propertyDisputedInd) {
        this.propertyDisputedInd = propertyDisputedInd;
    }
    public String getInvalidInd() {
        return InvalidInd;
    }

    public void setInvalidInd(String invalidInd) {
        this.invalidInd = invalidInd;
    }
    public String getBlemishInd() {
        return BlemishInd;
    }

    public void setBlemishInd(String blemishInd) {
        this.blemishInd = blemishInd;
    }
    public String getBlemishInfo() {
        return BlemishInfo;
    }

    public void setBlemishInfo(String blemishInfo) {
        this.blemishInfo = blemishInfo;
    }
    public String getHandoverDate() {
        return HandoverDate;
    }

    public void setHandoverDate(String handoverDate) {
        this.handoverDate = handoverDate;
    }
    public String getKeepSpecialReq() {
        return KeepSpecialReq;
    }

    public void setKeepSpecialReq(String keepSpecialReq) {
        this.keepSpecialReq = keepSpecialReq;
    }
    public String getCreditorPriority() {
        return CreditorPriority;
    }

    public void setCreditorPriority(String creditorPriority) {
        this.creditorPriority = creditorPriority;
    }
    public java.math.BigDecimal getPreCreditorAmt() {
        return PreCreditorAmt;
    }

    public void setPreCreditorAmt(java.math.BigDecimal preCreditorAmt) {
        this.preCreditorAmt = preCreditorAmt;
    }
    public String getBelongOrgCd() {
        return BelongOrgCd;
    }

    public void setBelongOrgCd(String belongOrgCd) {
        this.belongOrgCd = belongOrgCd;
    }
    public String getCollateralInfoStatusCd() {
        return CollateralInfoStatusCd;
    }

    public void setCollateralInfoStatusCd(String collateralInfoStatusCd) {
        this.collateralInfoStatusCd = collateralInfoStatusCd;
    }
    public String getCollateralCreateDate() {
        return CollateralCreateDate;
    }

    public void setCollateralCreateDate(String collateralCreateDate) {
        this.collateralCreateDate = collateralCreateDate;
    }
    public String getEvalTypeCd() {
        return EvalTypeCd;
    }

    public void setEvalTypeCd(String evalTypeCd) {
        this.evalTypeCd = evalTypeCd;
    }
    public String getIndCertiFull() {
        return IndCertiFull;
    }

    public void setIndCertiFull(String indCertiFull) {
        this.indCertiFull = indCertiFull;
    }
    public String getCertiNotFullCause() {
        return CertiNotFullCause;
    }

    public void setCertiNotFullCause(String certiNotFullCause) {
        this.certiNotFullCause = certiNotFullCause;
    }
    public String getSysUpdateTime() {
        return SysUpdateTime;
    }

    public void setSysUpdateTime(String sysUpdateTime) {
        this.sysUpdateTime = sysUpdateTime;
    }
    public java.math.BigDecimal getMonthRenk() {
        return MonthRenk;
    }

    public void setMonthRenk(java.math.BigDecimal monthRenk) {
        this.monthRenk = monthRenk;
    }
    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getIsConfirmed() {
        return IsConfirmed;
    }

    public void setIsConfirmed(String isConfirmed) {
        this.isConfirmed = isConfirmed;
    }
    public String getIsTmpSave() {
        return IsTmpSave;
    }

    public void setIsTmpSave(String isTmpSave) {
        this.isTmpSave = isTmpSave;
    }
    public String getManageUser() {
        return ManageUser;
    }

    public void setManageUser(String manageUser) {
        this.manageUser = manageUser;
    }
    public String getIsAddProcess() {
        return IsAddProcess;
    }

    public void setIsAddProcess(String isAddProcess) {
        this.isAddProcess = isAddProcess;
    }
    public String getBelongStriplineNo() {
        return BelongStriplineNo;
    }

    public void setBelongStriplineNo(String belongStriplineNo) {
        this.belongStriplineNo = belongStriplineNo;
    }
    public String getManageOrgCd() {
        return ManageOrgCd;
    }

    public void setManageOrgCd(String manageOrgCd) {
        this.manageOrgCd = manageOrgCd;
    }
    public String getCertiPlanCompletedDate() {
        return CertiPlanCompletedDate;
    }

    public void setCertiPlanCompletedDate(String certiPlanCompletedDate) {
        this.certiPlanCompletedDate = certiPlanCompletedDate;
    }
    public String getGuarantyTypeCd() {
        return GuarantyTypeCd;
    }

    public void setGuarantyTypeCd(String guarantyTypeCd) {
        this.guarantyTypeCd = guarantyTypeCd;
    }
    public String getIsBelongMainApplicant() {
        return IsBelongMainApplicant;
    }

    public void setIsBelongMainApplicant(String isBelongMainApplicant) {
        this.isBelongMainApplicant = isBelongMainApplicant;
    }
    public String getSystemSign() {
        return SystemSign;
    }

    public void setSystemSign(String systemSign) {
        this.systemSign = systemSign;
    }
    public String getLoanUser() {
        return LoanUser;
    }

    public void setLoanUser(String loanUser) {
        this.loanUser = loanUser;
    }
    public java.math.BigDecimal getGuarantyPledgeRate() {
        return GuarantyPledgeRate;
    }

    public void setGuarantyPledgeRate(java.math.BigDecimal guarantyPledgeRate) {
        this.guarantyPledgeRate = guarantyPledgeRate;
    }
    public java.math.BigDecimal getHighestGuarantyValue() {
        return HighestGuarantyValue;
    }

    public void setHighestGuarantyValue(java.math.BigDecimal highestGuarantyValue) {
        this.highestGuarantyValue = highestGuarantyValue;
    }
    public java.math.BigDecimal getGuarantyDiscountRate() {
        return GuarantyDiscountRate;
    }

    public void setGuarantyDiscountRate(java.math.BigDecimal guarantyDiscountRate) {
        this.guarantyDiscountRate = guarantyDiscountRate;
    }
    public String getCertType() {
        return CertType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }
    public String getCertCode() {
        return CertCode;
    }

    public void setCertCode(String certCode) {
        this.certCode = certCode;
    }
    public String getIsShare() {
        return IsShare;
    }

    public void setIsShare(String isShare) {
        this.isShare = isShare;
    }
    public String getShareGuarantyNo() {
        return ShareGuarantyNo;
    }

    public void setShareGuarantyNo(String shareGuarantyNo) {
        this.shareGuarantyNo = shareGuarantyNo;
    }
    public String getUnderwriter1() {
        return Underwriter1;
    }

    public void setUnderwriter1(String underwriter1) {
        this.underwriter1 = underwriter1;
    }
    public String getUnderwriter2() {
        return Underwriter2;
    }

    public void setUnderwriter2(String underwriter2) {
        this.underwriter2 = underwriter2;
    }
    public String getLimitsIegalvalidity() {
        return LimitsIegalvalidity;
    }

    public void setLimitsIegalvalidity(String limitsIegalvalidity) {
        this.limitsIegalvalidity = limitsIegalvalidity;
    }
    public String getLimitsInsurance() {
        return LimitsInsurance;
    }

    public void setLimitsInsurance(String limitsInsurance) {
        this.limitsInsurance = limitsInsurance;
    }
    public String getLimitsValuevolatility() {
        return LimitsValuevolatility;
    }

    public void setLimitsValuevolatility(String limitsValuevolatility) {
        this.limitsValuevolatility = limitsValuevolatility;
    }
    public String getLimitsSeizureconvenience() {
        return LimitsSeizureconvenience;
    }

    public void setLimitsSeizureconvenience(String limitsSeizureconvenience) {
        this.limitsSeizureconvenience = limitsSeizureconvenience;
    }
    public String getLimitsCashability() {
        return LimitsCashability;
    }

    public void setLimitsCashability(String limitsCashability) {
        this.limitsCashability = limitsCashability;
    }
    public String getLimitsBorrower() {
        return LimitsBorrower;
    }

    public void setLimitsBorrower(String limitsBorrower) {
        this.limitsBorrower = limitsBorrower;
    }
    public String getManagerPhone() {
        return ManagerPhone;
    }

    public void setManagerPhone(String managerPhone) {
        this.managerPhone = managerPhone;
    }
    public String getIsRelation() {
        return IsRelation;
    }

    public void setIsRelation(String isRelation) {
        this.isRelation = isRelation;
    }
    public String getOldGuarantyNo() {
        return OldGuarantyNo;
    }

    public void setOldGuarantyNo(String oldGuarantyNo) {
        this.oldGuarantyNo = oldGuarantyNo;
    }
    public String getDataSource() {
        return DataSource;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }
    }