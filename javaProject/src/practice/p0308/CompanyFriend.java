package practice.p0308;

public class CompanyFriend extends Friend{
	
	String companyInfo;
	
	public CompanyFriend(String name, String number, String companyInfo) {
		super(name, number);
		this.companyInfo = companyInfo;
	}

	@Override
	public String toString() {
		return "CompanyFriend [companyInfo=" + companyInfo + ", name=" + super.getName() + ", number=" + super.getNumber() + "]";
	}
	

}
