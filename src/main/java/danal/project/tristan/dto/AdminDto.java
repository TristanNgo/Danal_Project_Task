package danal.project.tristan.dto;

import java.util.Date;

public class AdminDto {

	
	private String fAdminId;
	private String fAdminPw;
    private String fName;
    private String fStatus;
    private String fLevel;
    private Date fRegDt;  
    private Date fModiDt;
	public String getfAdminId() {
		return fAdminId;
	}
	public void setfAdminId(String fAdminId) {
		this.fAdminId = fAdminId;
	}
	public String getfAdminPw() {
		return fAdminPw;
	}
	public void setfAdminPw(String fAdminPw) {
		this.fAdminPw = fAdminPw;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getfStatus() {
		return fStatus;
	}
	public void setfStatus(String fStatus) {
		this.fStatus = fStatus;
	}
	public String getfLevel() {
		return fLevel;
	}
	public void setfLevel(String fLevel) {
		this.fLevel = fLevel;
	}
	public Date getfRegDt() {
		return fRegDt;
	}
	public void setfRegDt(Date fRegDt) {
		this.fRegDt = fRegDt;
	}
	public Date getfModiDt() {
		return fModiDt;
	}
	public void setfModiDt(Date fModiDt) {
		this.fModiDt = fModiDt;
	}
	public AdminDto(String fAdminId, String fAdminPw, String fName, String fStatus, String fLevel, Date fRegDt,
			Date fModiDt) {
		super();
		this.fAdminId = fAdminId;
		this.fAdminPw = fAdminPw;
		this.fName = fName;
		this.fStatus = fStatus;
		this.fLevel = fLevel;
		this.fRegDt = fRegDt;
		this.fModiDt = fModiDt;
	}
	public AdminDto() {
		
	}
    
    
}
