package scopedata;

import java.io.Serializable;

public class Company implements Serializable{
	private String id;
	private String company;
	private String addrid;
	private String year;
	private String listedid;
	private String business;
	private String industryid;
	private String pdf;
	public Company(String _id ,String _company , String _addrid ,
			String _year ,String _listedid ,String _business ,
			String _industryid ,String _pdf) {
		id 			= _id;
		company 	= _company;
		addrid 		= _addrid;
		year 		= _year;
		listedid 	= _listedid;
		business 	= _business;
		industryid 	= _industryid;
		pdf 		= _pdf;
	}

	public String getId()		 { return id; }
	public String getPass()		 { return company; }
	public String getAddrid()	 { return addrid; }
	public String getYear()		 { return year; }
	public String getIistedid()	 { return listedid; }
	public String getBusiness()  { return business; }
	public String getIndustryid(){ return industryid; }
	public String getPdf()	{ return pdf;	}
}