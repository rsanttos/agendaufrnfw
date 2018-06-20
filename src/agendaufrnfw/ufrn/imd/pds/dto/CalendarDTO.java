package agendaufrnfw.ufrn.imd.pds.dto;


import java.util.Calendar;

import com.google.gson.Gson;

import agendaufrnfw.ufrn.imd.pds.model.calendar.CalendarUFRN;

/**
 * Created by root on 24/04/18.
 */

public class CalendarDTO extends DTO {

    public CalendarDTO() {
        super();
    }

    @Override
    public CalendarUFRN[] toArrayObject(String s) {
        Gson gson = new Gson();
        return gson.fromJson(s, CalendarUFRN[].class);
    }

    @Override
    public CalendarUFRN toObject(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, CalendarUFRN.class);
    }
}
