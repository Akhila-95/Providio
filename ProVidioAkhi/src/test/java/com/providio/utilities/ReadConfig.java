package com.providio.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import com.github.javafaker.Faker;



public class ReadConfig {

	Properties pro;
	Faker faker = new Faker();
	
	public ReadConfig() {
		
	   File src = new File("./Configurations/config.properties");
	   
	   try {
		   FileInputStream fis = new FileInputStream(src);
		   pro = new Properties();
		   pro.load(fis);
	   } catch (Exception e) {
		   System.out.println("Exception is "+e.getMessage());
	   }
	}
	
	public String getApplicationURL() {
		String url = pro.getProperty("baseURL");
		return url;
	}
	
	public String getUsername() {
		String username = pro.getProperty("name");
		return username;
	}
	public String getPassword() {
		String password = pro.getProperty("password");
		return password;
	}
	public String getFName() {
		 String fname = faker.name().firstName();
		 return fname;
	}
	public String getLName() {	
		String lname = faker.name().lastName();
		return lname;
	}
	
	public String getAddress() {		
		String address = faker.address().fullAddress();
		return address;
	}
	public String getCity() {
		String cityname = faker.address().city();
		return cityname;
	}
	public String getzipcode() {
		
		
		String zipcode = faker.address().zipCode();
		return zipcode;
	}
	public String getphone() {
		
		String phonenumber = "5555551234";
		return phonenumber;
	}
	
	//edo=
	
	public String getepconformMail() {
		String epconfirmEmail = pro.getProperty("name");
		return epconfirmEmail;
	}
	public String getepconformpassword() {
		String eppassword = pro.getProperty("password");
		return eppassword;
	}
	public String getepFName() {
		 String epfname = faker.name().firstName();
		 return epfname;
	}
	public String getepLName() {	
		String eplname = faker.name().lastName();
		return eplname;
	}
	
	
	//passwordChangepage
	public String getepcurrentPassword() {
		String epcurrentPassword = pro.getProperty("password");
		return epcurrentPassword;
	}
	public String getepnewPassword() {
		String epnewPassword = pro.getProperty("password");
		return epnewPassword;
	}
	public String getepnewPasswordConfirm() {
		String epnewPasswordConfirm = pro.getProperty("password");
		return epnewPasswordConfirm;
	}
	
	//pdp page/write a review
	
		public String  getWriteAReview() {
			String writeAReviewString= pro.getProperty("headline");
			return writeAReviewString;
		}
		public  String getComments() {
			String comments=pro.getProperty("comment");
			return comments;
		}
		public String getNickName(){
			String nickname = pro.getProperty("nickname");
			return nickname;
		}
		public String getLocation() {
			String loc=pro.getProperty("location");
			return loc;
		}
		
		//pdp page/fina a store/zipcode
		
		public String getZipcodeInStore() {
			String zipcodeInStore=pro.getProperty("zipcodeStore");
			return zipcodeInStore;
		}

		
		//search bar
		public String searchSomething() {
			String typing=pro.getProperty("searchBar");
			return typing;
		}
		
		//footer mail
		public String getFooterMail() {
			String footerMail= pro.getProperty("footerMail");
			return footerMail;
		}
		//guest login details
		
		public String getGuestMail() {
			String guestMail = pro.getProperty("mail");
			return guestMail;
		}
		 public String getGuestPassword() {
			 String guestPassword =pro.getProperty("password");
			 return guestPassword;
		}
		 public String  getReEnterMail() {
			String reEnterEmail =pro.getProperty("reEnterMail");
			return reEnterEmail;
		}
}
