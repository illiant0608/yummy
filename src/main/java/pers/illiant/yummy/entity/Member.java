package pers.illiant.yummy.entity;

import java.io.Serializable;

public class Member implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.member_id
     *
     * @mbg.generated
     */
    private Integer memberId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.member_name
     *
     * @mbg.generated
     */
    private String memberName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.member_password
     *
     * @mbg.generated
     */
    private String memberPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.email
     *
     * @mbg.generated
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.phoneNumber
     *
     * @mbg.generated
     */
    private String phoneNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.default_address
     *
     * @mbg.generated
     */
    private int defaultAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.level
     *
     * @mbg.generated
     */
    private Integer level;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.active
     *
     * @mbg.generated
     */
    private Boolean active;


    private Double balance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table member
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.member_id
     *
     * @return the value of member.member_id
     *
     * @mbg.generated
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.member_id
     *
     * @param memberId the value for member.member_id
     *
     * @mbg.generated
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.member_name
     *
     * @return the value of member.member_name
     *
     * @mbg.generated
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.member_name
     *
     * @param memberName the value for member.member_name
     *
     * @mbg.generated
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName == null ? null : memberName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.member_password
     *
     * @return the value of member.member_password
     *
     * @mbg.generated
     */
    public String getMemberPassword() {
        return memberPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.member_password
     *
     * @param memberPassword the value for member.member_password
     *
     * @mbg.generated
     */
    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword == null ? null : memberPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.email
     *
     * @return the value of member.email
     *
     * @mbg.generated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.email
     *
     * @param email the value for member.email
     *
     * @mbg.generated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.phoneNumber
     *
     * @return the value of member.phoneNumber
     *
     * @mbg.generated
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.phoneNumber
     *
     * @param phoneNumber the value for member.phoneNumber
     *
     * @mbg.generated
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.default_address
     *
     * @return the value of member.default_address
     *
     * @mbg.generated
     */
    public int getDefaultAddress() {
        return defaultAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.default_address
     *
     * @param defaultAddress the value for member.default_address
     *
     * @mbg.generated
     */
    public void setDefaultAddress(int defaultAddress) {
        this.defaultAddress = defaultAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.level
     *
     * @return the value of member.level
     *
     * @mbg.generated
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.level
     *
     * @param level the value for member.level
     *
     * @mbg.generated
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.active
     *
     * @return the value of member.active
     *
     * @mbg.generated
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.active
     *
     * @param active the value for member.active
     *
     * @mbg.generated
     */
    public void setActive(Boolean active) {
        this.active = active;
    }


    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbg.generated
     */


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", memberId=").append(memberId);
        sb.append(", memberName=").append(memberName);
        sb.append(", memberPassword=").append(memberPassword);
        sb.append(", email=").append(email);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", defaultAddress=").append(defaultAddress);
        sb.append(", level=").append(level);
        sb.append(", active=").append(active);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}