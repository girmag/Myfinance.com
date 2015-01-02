/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author gduresso
 */
@Entity
@Table(name = "myfinance")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Myfinance.findAll", query = "SELECT m FROM Myfinance m"),
    @NamedQuery(name = "Myfinance.findByCcNumbeer", query = "SELECT m FROM Myfinance m WHERE m.ccNumbeer = :ccNumbeer"),
    @NamedQuery(name = "Myfinance.findByTransactionId", query = "SELECT m FROM Myfinance m WHERE m.transactionId = :transactionId"),
    @NamedQuery(name = "Myfinance.findByVendorId", query = "SELECT m FROM Myfinance m WHERE m.vendorId = :vendorId"),
    @NamedQuery(name = "Myfinance.findByTotalAmount", query = "SELECT m FROM Myfinance m WHERE m.totalAmount = :totalAmount"),
    @NamedQuery(name = "Myfinance.findByProfit", query = "SELECT m FROM Myfinance m WHERE m.profit = :profit"),
    @NamedQuery(name = "Myfinance.findByProfitToMycompany", query = "SELECT m FROM Myfinance m WHERE m.profitToMycompany = :profitToMycompany"),
    @NamedQuery(name = "Myfinance.findByAmountToVendor", query = "SELECT m FROM Myfinance m WHERE m.amountToVendor = :amountToVendor"),
    @NamedQuery(name = "Myfinance.findByDateOfTransaction", query = "SELECT m FROM Myfinance m WHERE m.dateOfTransaction = :dateOfTransaction")})
public class Myfinance implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "ccNumbeer")
    private BigInteger ccNumbeer;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "transactionId")
    private Long transactionId;
    @Column(name = "vendorId")
    private BigInteger vendorId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "totalAmount")
    private Float totalAmount;
    @Column(name = "Profit")
    private Float profit;
    @Column(name = "profitToMycompany")
    private Float profitToMycompany;
    @Column(name = "amountToVendor")
    private Float amountToVendor;
    @Column(name = "dateOfTransaction")
    @Temporal(TemporalType.DATE)
    private Date dateOfTransaction;

    public Myfinance() {
    }

    public Myfinance(Long transactionId) {
        this.transactionId = transactionId;
    }

    public BigInteger getCcNumbeer() {
        return ccNumbeer;
    }

    public void setCcNumbeer(BigInteger ccNumbeer) {
        this.ccNumbeer = ccNumbeer;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public BigInteger getVendorId() {
        return vendorId;
    }

    public void setVendorId(BigInteger vendorId) {
        this.vendorId = vendorId;
    }

    public Float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Float getProfit() {
        return profit;
    }

    public void setProfit(Float profit) {
        this.profit = profit;
    }

    public Float getProfitToMycompany() {
        return profitToMycompany;
    }

    public void setProfitToMycompany(Float profitToMycompany) {
        this.profitToMycompany = profitToMycompany;
    }

    public Float getAmountToVendor() {
        return amountToVendor;
    }

    public void setAmountToVendor(Float amountToVendor) {
        this.amountToVendor = amountToVendor;
    }

    public Date getDateOfTransaction() {
        return dateOfTransaction;
    }

    public void setDateOfTransaction(Date dateOfTransaction) {
        this.dateOfTransaction = dateOfTransaction;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transactionId != null ? transactionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Myfinance)) {
            return false;
        }
        Myfinance other = (Myfinance) object;
        if ((this.transactionId == null && other.transactionId != null) || (this.transactionId != null && !this.transactionId.equals(other.transactionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Myfinance[ transactionId=" + transactionId + " ]";
    }
    
}
