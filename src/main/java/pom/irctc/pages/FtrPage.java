package pom.irctc.pages;

import wrappers.GenericWrappers;

public class FtrPage extends GenericWrappers{

	public FtrPage lastWindow() {
		switchToLastWindow();
		return this;
	}
	
	
	
	public FtrPage clickOnSignUp() {
		
		clickByXpath(prop.getProperty("FtrPage.Signup.xpath"));
		return this;
	}
	
	public FtrPage enterUserId(String data) {
		enterByXpath(prop.getProperty("FtrPage.Userid.xpath"), data);
		return this;
	}
	
	public FtrPage enterPassword(String data) {
		enterByXpath(prop.getProperty("FtrPage.Password.xpath"), data);
		return this;
	}
	
	public FtrPage enterConfirmPassword(String data) {
		enterByXpath(prop.getProperty("FtrPage.Confirmpassword.xpath"), data);
		return this;
	}
	
	public FtrPage selectSecurityQuestion(String secq) {
		//selectIndexByXpath(prop.getProperty("FtrPage.SecQue.xpath"), secq);
		selectVisibleTextByXpath(prop.getProperty("FtrPage.SecQue.xpath"), secq);
		return this;
	}
	
	public FtrPage enterSecurityAns(String data) {
		enterByXpath(prop.getProperty("FtrPage.SecAns.xpath"), data);
		return this;
	}
  public FtrPage clickOnDateOfBirth() {
		
		clickByXpath(prop.getProperty("FtrPage.Dob.xpath"));
		return this;
	}

  public FtrPage SelectMonth(String value) {
		
		selectValueByXpath(prop.getProperty("FtrPage.Month.xpath"), value);
		return this;
	}
	
  public FtrPage SelectYear(String value) {
		
		selectValueByXpath(prop.getProperty("FtrPage.Year.xpath"), value);
		return this;
	}
  public FtrPage clickOnDate(String date) {
		clickByXpath(prop.getProperty("FtrPage.Date.xpath"), date);
		//clickByXpath("//a[text()='"+date+"']");
		return this;
	}
  public FtrPage clickOnGender(String data) {
		clickByXpath(prop.getProperty("FtrPage.Gender.xpath"), data);
		//clickByXpath("//input[@value='"+data+"']");
		return this;
	}
    
     public FtrPage clickOnMaritalStatus(String data) {
    	 clickByXpath(prop.getProperty("FtrPage.Marital.xpath"), data);
    	// clickByXpath("//input[@value='"+data+"']");
    	 return this;
     }
         
     public FtrPage enterEmail(String data) {
    	 enterByXpath(prop.getProperty("FtrPage.Email.xpath"), data);
    	 return this;
     }

     public FtrPage selectOccupation(String value) {
    	 selectValueByXpath(prop.getProperty("FtrPage.Occupation.xpath"), value);
    	 return this;
     }

        public FtrPage enterFirstName(String data) {
        	enterByXpath(prop.getProperty("FtrPage.FirstName.xpath"), data);
        	return this;
        }
          
        public FtrPage enterMiddleName(String data) {
        	enterByXpath(prop.getProperty("FtrPage.MiddleName.xpath"), data);
        	return this;
        }
        
        public FtrPage enterLastName(String data) {
        	enterByXpath(prop.getProperty("FtrPage.LastName.xpath"), data);
        	return this;
        }
	
        
        public FtrPage selectNationality(String value) {
       	 selectValueByXpath(prop.getProperty("FtrPage.Nation.xpath"), value);
       	 return this;
        }
        
        public FtrPage enterFlat(String data) {
        	enterByXpath(prop.getProperty("FtrPage.Flat.xpath"), data);
        	return this;
        }
        
        public FtrPage enterStreet(String data) {
        	enterByXpath(prop.getProperty("FtrPage.Street.xpath"), data);
        	return this;
        }
        
        
        public FtrPage enterArea(String data) {
        	enterByXpath(prop.getProperty("FtrPage.Area.xpath"), data);
        	return this;
        }
        public FtrPage selectCountry(String value) {
          	 selectValueByXpath(prop.getProperty("FtrPage.Country.xpath"), value);
          	 return this;
           }
        
        
        public FtrPage enterMobile(String data) {
        	enterByXpath(prop.getProperty("FtrPage.Mobile.xpath"), data);
        	return this;
        }
        
        public FtrPage enterPinCode(String data) {
        	enterByXpath(prop.getProperty("FtrPage.Pincode.xpath"), data);
        	return this;
        }
        
        public FtrPage selectCity(String value) {
        	waitProperty(3000);
        	selectVisibleTextByXpath(prop.getProperty("FtrPage.City.xpath"), value);
         	 //selectValueByXpath(prop.getProperty("FtrPage.City.xpath"), value);
         	 return this;
          }
       
        public FtrPage selectState(String value) {
        	waitProperty(5000);
        	selectVisibleTextByXpath(prop.getProperty("FtrPage.State.xpath"), value);
         	 //selectValueByXpath(prop.getProperty("FtrPage.State.xpath"), value);
         	 return this;
          }
        
        public FtrPage selectPostOffice(String value) {
        	waitProperty(5000);
         	 selectValueByXpath(prop.getProperty("FtrPage.Post.xpath"), value);
         	 return this;
          }
        
        public FtrPage clickOnCopyResidentialAdd() {
        	
        	clickByXpath(prop.getProperty("FtrPage.Add.xpath"));
        	return this;
        }
        
        public FtrPage enterOfficeFlat(String data) {
        	enterByXpath(prop.getProperty("FtrPage.OffFlat.xpath"), data);
        	return this;
        }
        
        public FtrPage enterOfficeStreet(String data) {
        	enterByXpath(prop.getProperty("FtrPage.OffStreet.xpath"), data);
        	return this;
        }
        
        
        public FtrPage enterOfficeArea(String data) {
        	enterByXpath(prop.getProperty("FtrPage.OffArea.xpath"), data);
        	return this;
        }
        public FtrPage selectOfficeCountry(String value) {
          	 selectValueByXpath(prop.getProperty("FtrPage.OffCountry.xpath"), value);
          	 return this;
           }
        
        
        public FtrPage enterOfficeMobile(String data) {
        	enterByXpath(prop.getProperty("FtrPage.OffMobile.xpath"), data);
        	return this;
        }
        
        public FtrPage enterOfficePinCode(String data) {
        	enterByXpath(prop.getProperty("FtrPage.OffPin.xpath"), data);
        	return this;
        }
        
        public FtrPage selectOfficeCity(String value) {
         	 selectValueByXpath(prop.getProperty("FtrPage.OffCity.xpath"), value);
         	 return this;
          }
       
        public FtrPage selectOfficeState(String value) {
        	selectVisibleTextByXpath(prop.getProperty("FtrPage.OffState.xpath"), value);
         	// selectValueByXpath(prop.getProperty("FtrPage.OffState.xpath"), value);
         	 return this;
          }
        
        public FtrPage selectOffPostOffice(String value) {
        	selectVisibleTextByXpath(prop.getProperty("FtrPage.OffPost.xpath"), value);
         	// selectValueByXpath(prop.getProperty("FtrPage.OffPost.xpath"), value);
         	 return this;
          }
        
        public FtrPage pageDown() {
    		scrollDown();
    		return this;
    	}
        
        
        
        
        
        
        
}
