package dateFormats;

public class dateFormatsmain {
    private String ShortDate;
    private String LongDate;
    private String Type;

public dateFormatsmain(String ShortDate, String LongDate, 
            String Type){
        this.ShortDate=ShortDate;
        this.LongDate=LongDate;
        this.Type=Type;
}
public String getShortDate(){
        return ShortDate;
    }
    
    public void setShortDate(String ShortDate){
        this.ShortDate=ShortDate;
   }
   public String getLongDate (){
        return LongDate;
    }
    
    public void setLongDate(String LongDate){
        this.LongDate=LongDate;
    }
public String getType(){
        return Type;
    }
    
    public void setType(String Type){
        this.Type=Type;
    }

}