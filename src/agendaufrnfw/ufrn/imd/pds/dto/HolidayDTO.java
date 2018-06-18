package agendaufrnfw.ufrn.imd.pds.dto;

import agendaufrnfw.ufrn.imd.pds.util.DateUtil;
import agendaufrnfw.ufrn.imd.pds.dto.DTO;

/**
 * Created by root on 24/04/18.
 */

public class HolidayDTO extends DTO {
	
    private long date;
    private String description;

    public HolidayDTO() {
        super();
    }

    @Override
    public HolidayDTO toObject(String s) {
        return null;
    }

    @Override
    public HolidayDTO[] toArrayObject(String s) {
        return null;
    }

    public HolidayDTO(long date, String description) {
        super();
        this.date = date;
        this.description = description;
    }


    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        String str = String.format("%s \n Data: %s \n", description, DateUtil.format(date));
        return str;
    }
}
