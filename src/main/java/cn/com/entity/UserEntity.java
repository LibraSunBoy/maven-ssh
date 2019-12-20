package cn.com.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * <pre>
 * Filename      :  UserEntity
 * Package       :  cn.com.entity
 * Company       :  上海想星商务服务有限公司
 * Create Date   :  2019年12月2019/12/20日
 * </pre>
 *
 * @author : yangdong.jia
 */
@Entity
@Table(name = "user", schema = "book")
public class UserEntity {
    private int id;
    private String account;
    private String pwd;
    private String role;
    private Timestamp createDate;
    private Integer status;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "account", nullable = true, length = 255)
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Basic
    @Column(name = "pwd", nullable = true, length = 255)
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Basic
    @Column(name = "role", nullable = true, length = 255)
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Basic
    @Column(name = "create_date", nullable = true)
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "status", nullable = true)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return id == that.id &&
                Objects.equals(account, that.account) &&
                Objects.equals(pwd, that.pwd) &&
                Objects.equals(role, that.role) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, account, pwd, role, createDate, status);
    }
}
