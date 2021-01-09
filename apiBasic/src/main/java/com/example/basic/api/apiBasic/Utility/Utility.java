package com.example.basic.api.apiBasic.Utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utility {

    public String dateToFormat(String dateToFormat) throws ParseException {
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateToFormat);
        String formatedDate =new SimpleDateFormat("dd-MM-yyyy").format(date);
        return formatedDate;
    }

}
