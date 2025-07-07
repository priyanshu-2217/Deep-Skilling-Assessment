package Week_3.SpringData_JDA.src.main.java.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "stock")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "st_code")
    private String code;

    @Column(name = "st_date")
    @Temporal(TemporalType.DATE)
    private Date date;

    @Column(name = "st_open")
    private Float open;

    @Column(name = "st_close")
    private Float close;

    @Column(name = "st_volume")
    private Integer volume;

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public Date getDate() {
        return date;
    }

    public Float getOpen() {
        return open;
    }

    public Float getClose() {
        return close;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setOpen(Float open) {
        this.open = open;
    }

    public void setClose(Float close) {
        this.close = close;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Stock [id=" + id + ", code=" + code + ", date=" + date + ", open=" + open +
                ", close=" + close + ", volume=" + volume + "]";
    }
}
