package group10.bookShop.entities;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;
import org.springframework.format.annotation.NumberFormat;

@Entity
@Table(name="sach")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Sach {
	
	@Id
	@Column(name = "Masach", nullable = false)  // mapping đến cột id trong table dattabase
	protected Integer masach;
	
	@NotEmpty   // không được bỏ trống
	@Size(max=100)  // nhập không quá 50 kí tự
	@Column(name = "Tensach", nullable = false)
	protected String tensach;
	
	@NotEmpty   // không được bỏ trống
	@Size(max=70)  // nhập không quá 50 kí tự
	@Column(name = "Tacgia", nullable = false)
	protected String tacgia;
	
	@NotEmpty   // không được bỏ trống
	@Column(name = "Theloai", nullable = false)
	protected String theloai;
	
	@NotNull
	@Column(name = "Giaca", nullable = false)
	protected Double giaca;
	
	@Column(name = "Mota", nullable = false)
	protected String mota;
	
	@Column(name = "Luocxem")
	protected Integer luocxem;
	
//	@NotEmpty   // không được bỏ trống
	@Column(name = "Hinhanh", nullable = false)
	protected String hinhanh;
	
	@NotNull   // không được bỏ trống
	@Column(name = "Tonkho", nullable = false)
	@NumberFormat
	protected int tonkho;
	
	@NotNull  // không được bỏ trống
	@Column(name = "Soluongdaban", nullable = false)
	@NumberFormat
	protected int soluongdaban;
	
	@Column(name = "Ngayxuatban")
	protected LocalDateTime ngayxuatban;

	public Sach() {
		int uniqueId = (int) (System.currentTimeMillis() & 0xfffffff);
		this.masach = uniqueId;
	}

	public Sach(Integer masach, @NotEmpty @Size(max = 100) String tensach, @NotEmpty @Size(max = 70) String tacgia,
			@NotEmpty @Size(max = 50) String theloai, @NotNull Double giaca, String mota, int luocxem,
			@NotEmpty String hinhanh, @NotNull int tonkho, @NotNull int soluongdaban, LocalDateTime ngayxuatban) {
		this.masach = masach;
		this.tensach = tensach;
		this.tacgia = tacgia;
		this.theloai = theloai;
		this.giaca = giaca;
		this.mota = mota;
		this.luocxem = luocxem;
		this.hinhanh = hinhanh;
		this.tonkho = tonkho;
		this.soluongdaban = soluongdaban;
		this.ngayxuatban = ngayxuatban;
	}
	public Integer getMasach() {
		return masach;
	}

	public void setMasach(Integer masach) {
		this.masach = masach;
	}

	public String getTensach() {
		return tensach;
	}

	public void setTensach(String tensach) {
		this.tensach = tensach;
	}

	public String getTacgia() {
		return tacgia;
	}

	public void setTacgia(String tacgia) {
		this.tacgia = tacgia;
	}

	public String getTheloai() {
		return theloai;
	}

	public void setTheloai(String theloai) {
		this.theloai = theloai;
	}

	public Double getGiaca() {
		return giaca;
	}

	public void setGiaca(Double giaca) {
		this.giaca = giaca;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public Integer getLuocxem() {
		return luocxem;
	}

	public void setLuocxem(int luocxem) {
		this.luocxem = luocxem;
	}

	public String getHinhanh() {
		return hinhanh;
	}

	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}

	public int getTonkho() {
		return tonkho;
	}

	public void setTonkho(int tonkho) {
		this.tonkho = tonkho;
	}

	public int getSoluongdaban() {
		return soluongdaban;
	}

	public void setSoluongdaban(int soluongdaban) {
		this.soluongdaban = soluongdaban;
	}

	public LocalDateTime getNgayxuatban() {
		return ngayxuatban;
	}

	public void setNgayxuatban(LocalDateTime ngayxuatban) {
		this.ngayxuatban = ngayxuatban;
	}
}
