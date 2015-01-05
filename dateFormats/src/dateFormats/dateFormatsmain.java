package dateFormats;
public class dateFormatsmain {
    private int day;
    private int month;
    private int year;
    private String Type;
    private boolean shortDate;
    private boolean longDate;
    private String txtShortDate;
    private String txtLongDate;
    private String ShortDateb;
    private String LongDateb;
    

public dateFormatsmain(int day,int month,int year,boolean shortDate,boolean longDate,String txtShortDate,String txtLongDate,String ShortDateb, String LongDateb, 
            String Type){
        this.day=day;
        this.month=month;
        this.year=year;
        this.Type=Type;  
        this.shortDate=shortDate;
        this.longDate=longDate;
        this.txtShortDate=txtShortDate;
        this.txtLongDate=txtLongDate;
        this.ShortDateb=ShortDateb;
        this.LongDateb=LongDateb;   
}

    dateFormatsmain(int day, int month, int year, String Type, boolean longDate, boolean shortDate, String txtShortDate, String txtLongDate, String longDateb, String shortDateb) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

public int getday(){
    return day;
}
public void setday(int day){
    this.day=day;
}

public int getmonth(){
    return month;
}
public void setmonth(int day){
    this.month=month;
}
public boolean getshortDate(){
    return shortDate;
}
public void setshortDateb (boolean shortDateb){
    this.shortDate=shortDateb;
}
public String gettxtShortDate(){
    return txtShortDate;
}
public void settxtShortDate (String txtShortDate){
    this.txtShortDate=txtShortDate;
}
public String gettxtLongDate(){
    return txtLongDate;
}
public void settxtLongDate (String txtLongDate){
    this.txtLongDate=txtLongDate;
}
public String getShortDate(){
        return ShortDateb;
    }
    
    public void setShortDate(String ShortDate){
        this.ShortDateb=ShortDate;
   }
    
    
   public String getLongDate (){
        return LongDateb;
    }
    
    public void setLongDate(String LongDate){
        this.LongDateb=LongDate;
    }
public String getType(){
        return Type;
    }
    
    public void setType(String Type){
        this.Type=Type;
       
    }
    public String longMonth (){
       String longM = null ;
       switch (month){
           case 1:
               this.month=1;
               longM = "january";
               break;
           case 2:
               this.month=2;
               longM = "february";
               break;
           case 3:
               this.month=3;
               longM = "march";
               break;
           case 4:
               this.month=4;
               longM = "april";
               break;
           case 5:
               this.month=5;
               longM = "may";
               break;
           case 6:
               this.month=6;
               longM = "june";
               break;
           case 7:
               this.month=7;
               longM = "july";
               break;
           case 8:
               this.month=8;
               longM = "august";
               break;
           case 9:
               this.month=9;
               longM = "september";
               break;
           case 10:
               this.month=10;
               longM = "october";
               break;
           case 11:
               this.month=11;
               longM = "novemver";
               break;
           case 12:
               this.month=12;
               longM = "december";
               break;
           default: longM=" ";
               
       }
        return longM;
   }
   
   public String zeroM(){
       String zeroM= null ;
       if((this.month>=1)&&(this.month<=9))
           zeroM ="0"+this.month;
       else zeroM=""+this.month;
       return zeroM;
       
   }
   public String zeroD(){
       String zeroD= null;
      if((this.day>=1)&&(this.day<=9))
          zeroD="0"+this.day;
      else zeroD=""+this.day;
      return zeroD;
   }
   
   
   public String getShortDates12(){
       String shortDates12;
       shortDates12=" ";
       return shortDates12;
   }
   
   
   public String getShortDates1(){
       String shortDates1;
       shortDates1=zeroM()+"/"+zeroD()+"/"+year;
       return shortDates1;
   }
   
 
   public String getShortDates2(){
       String shortDates2;
       shortDates2=year+"-"+zeroM()+"-"+zeroD();
       return shortDates2;
   }
   
  public String getDateForm(){
        String dateForm = null;
        switch (txtShortDate) {
            case "MM/dd/yy":
                dateForm=getShortDates1();
                break;
            case "yyyy-MM-dd":
                dateForm=getShortDates2();
                break;
        }
        return dateForm;
  }
  
  
  public String getLongDateForm(){
      String longDateForm = null;
      if (txtLongDate=="MMMM dd,yyyy")
          longDateForm=getLongDates();
      else if(txtLongDate=="yyyy mmmm-dd")
          longDateForm=getLongDatess();
      return longDateForm;
  }
        
        
   public String getLongDates12(){
        String longDates12;
        longDates12=" ";
        return longDates12;}
   
   
   
   public String getLongDates(){
        String longDates;
        longDates=longMonth()+" "+zeroD()+","+year;
        return longDates;
    }
   
   public String getLongDatess(){
       String longDatess;
       longDatess=year+" "+longMonth()+"-"+zeroD();
       return longDatess;
   }
}