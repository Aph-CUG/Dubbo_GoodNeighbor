package com.an.dataobject;

import java.util.Date;

public class PromoDO {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column promo.id
     *
     * @mbg.generated Sun Nov 18 23:18:35 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column promo.promo_name
     *
     * @mbg.generated Sun Nov 18 23:18:35 CST 2018
     */
    private String promoName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column promo.start_date
     *
     * @mbg.generated Sun Nov 18 23:18:35 CST 2018
     */
    private Date startDate;

    private Date endDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column promo.item_id
     *
     * @mbg.generated Sun Nov 18 23:18:35 CST 2018
     */
    private Integer itemId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column promo.promo_item_price
     *
     * @mbg.generated Sun Nov 18 23:18:35 CST 2018
     */
    private Double promoItemPrice;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column promo.id
     *
     * @return the value of promo.id
     *
     * @mbg.generated Sun Nov 18 23:18:35 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column promo.id
     *
     * @param id the value for promo.id
     *
     * @mbg.generated Sun Nov 18 23:18:35 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column promo.promo_name
     *
     * @return the value of promo.promo_name
     *
     * @mbg.generated Sun Nov 18 23:18:35 CST 2018
     */
    public String getPromoName() {
        return promoName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column promo.promo_name
     *
     * @param promoName the value for promo.promo_name
     *
     * @mbg.generated Sun Nov 18 23:18:35 CST 2018
     */
    public void setPromoName(String promoName) {
        this.promoName = promoName == null ? null : promoName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column promo.start_date
     *
     * @return the value of promo.start_date
     *
     * @mbg.generated Sun Nov 18 23:18:35 CST 2018
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column promo.start_date
     *
     * @param startDate the value for promo.start_date
     *
     * @mbg.generated Sun Nov 18 23:18:35 CST 2018
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column promo.item_id
     *
     * @return the value of promo.item_id
     *
     * @mbg.generated Sun Nov 18 23:18:35 CST 2018
     */
    public Integer getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column promo.item_id
     *
     * @param itemId the value for promo.item_id
     *
     * @mbg.generated Sun Nov 18 23:18:35 CST 2018
     */
    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column promo.promo_item_price
     *
     * @return the value of promo.promo_item_price
     *
     * @mbg.generated Sun Nov 18 23:18:35 CST 2018
     */
    public Double getPromoItemPrice() {
        return promoItemPrice;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column promo.promo_item_price
     *
     * @param promoItemPrice the value for promo.promo_item_price
     *
     * @mbg.generated Sun Nov 18 23:18:35 CST 2018
     */

    public void setPromoItemPrice(Double promoItemPrice) {
        this.promoItemPrice = promoItemPrice;
    }
}