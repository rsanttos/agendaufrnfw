package agendaufrnfw.ufrn.imd.pds.dto;

import com.google.gson.Gson;

import agendaufrnfw.ufrn.imd.pds.model.calendar.Loan;

public class LoanDTO extends DTO {

    @Override
    public Loan toObject(String json) {
        Gson gson = new Gson();

        if (json.startsWith("[")) {
            System.out.println(json.charAt(json.length() - 1));
            Loan[] loanArray = toArrayObject(json);
            if (loanArray != null && loanArray.length == 1) {
                return loanArray[0];
            } else {
                return null;
            }
        } else {
            return gson.fromJson(json, Loan.class);
        }
    }

    @Override
    public Loan[] toArrayObject(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, Loan[].class);
    }

}