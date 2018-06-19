package agendaufrnfw.ufrn.imd.pds.dto;

import com.google.gson.Gson;

import agendaufrnfw.ufrn.imd.pds.model.calendar.Holiday;

/**
 * Created by root on 24/04/18.
 */

public class HolidayDTO extends DTO {	
 
    @Override
    public Holiday toObject(String s) {
    	Gson gson = new Gson();
        return gson.fromJson(s, Holiday.class);
    }

    @Override
    public Holiday[] toArrayObject(String s) {
    	Gson gson = new Gson();
        return gson.fromJson(s, Holiday[].class);
    }

}
